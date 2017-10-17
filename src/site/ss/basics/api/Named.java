package site.ss.basics.api;

public interface Named {
	
	default String getName() { return getClass().getName() + "_" + hashCode(); }

}
