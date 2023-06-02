package mypkg;

public class HelloJava {
	public void method1() {
		System.out.println("You are in method1");
	}
	public int method2() {
		System.out.println("You are in method2");
		return 0;
	}
	public String method3() {
		System.out.println("You are in method3");
		return "";
	}
	public static void main(String[] args) {
		HelloJava h=new HelloJava();
		h.method1();
		h.method2();
		h.method3();
	}

}


}
