package concurrency;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.LongAdder;

public class ConColl {

	public static void main(String[] args) {
		ConcurrentHashMap<String, LongAdder> map = new ConcurrentHashMap<>();
		map.putIfAbsent("a", new LongAdder()).increment();
	}
	
}
