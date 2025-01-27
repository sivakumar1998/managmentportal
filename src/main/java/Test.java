
public class Test {
public static void main(String ...a) {
	// TODO Auto-generated method stub
	char c[]= {'s','i','v','a'};
System.out.println(new String(c));
	try {
	System.out.println("first");
//	dummy();
	System.out.println("second");
//		System.out.println("second");
}catch(Exception e) {
	System.out.println("catch");
}
finally {
	System.out.println("in finally");
}
}
public static void dummy() {
	throw new Error();
}
}
