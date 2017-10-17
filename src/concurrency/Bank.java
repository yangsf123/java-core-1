package concurrency;

import java.util.Arrays;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Bank {

	private final double[] accounts;

	private Condition sufficientFunds;
	
	private ReentrantLock lock = new ReentrantLock();

	public Bank(int n, double initialBalance) {
		accounts = new double[n];
		Arrays.fill(accounts, initialBalance);
		sufficientFunds = lock.newCondition();
	}

	public void transfer(int from, int to, double amount) {
		lock.lock();
		try {
			while(accounts[from] < amount) {
				sufficientFunds.await();
			}
			System.out.print(Thread.currentThread());
			accounts[from] -= amount;
			System.out.printf("%10.2f from %d to %d", amount, from, to);
			accounts[to] += amount;
			System.out.printf(" Total Balance: %10.2f%n", getTotalBalance());
			sufficientFunds.signalAll();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}finally {
			lock.unlock();
		}
	}

	public double getTotalBalance() {
		lock.lock();
		try {
			double sum = 0;
			for(double a : accounts) {
				sum += a;
			}
			return sum;
		} finally {
			lock.unlock();
		}
		
	}

	public int size() {
		return accounts.length;
	}

}
