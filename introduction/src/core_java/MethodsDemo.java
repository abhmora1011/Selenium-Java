package core_java;

public class MethodsDemo {

	public static void main(String[] args) {
		
		MethodsDemo obj = new MethodsDemo();
		String name = getData();
		System.out.println(name);
		
		MethodsDemo2 obj2 = new MethodsDemo2();
		
		obj2.getData();
		

	}
	
	public static String getData() {
		System.out.println("Hello World");
		return "Abraham Ora";
	}
	
	public static String getData2() {
		System.out.println("Hello World");
		return "Abraham Ora";
	}
	
}
