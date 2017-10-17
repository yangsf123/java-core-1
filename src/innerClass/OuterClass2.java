//package innerClass;
//
//public class OuterClass2 {
//
//	public InnerClass getInnerClass(final int num, String str2) {
//		return new InnerClass() {
//			int number = num + 3;
//			public int getNumber() {
//				return number;
//			}
//		};
//	}
//	
//	public static void main(String[] args) {
//		
//		OuterClass out = new OuterClass();
//		InnerClass inner = out.getInnerClass(2,	"chenssy");
//		System.out.print(inner.getNumber());
//		
//	}
//	
//}
//
//interface InnerClass {
//	int getNumber();
//}