package lbd;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TakingClock {
	
	private int interval;
	private boolean beep;
	
	public TakingClock(int interval, boolean beep){
		this.interval = interval;
		this.beep = beep;
	}
	
	public void start() {
		
	}
	
	public class TimePrinter implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("At the tone, the time is " + new Date());
			if(beep) Toolkit.getDefaultToolkit().beep();
		}
		
	}

}
