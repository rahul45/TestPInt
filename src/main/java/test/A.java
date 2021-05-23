package test;

public class A {
	private void say(){
		System.out.println("Hello A");
	}

	private void hello(){
		if(true){
			System.out.println("HelloP");
			return;
		}else{
			return;
		}
		//System.out.println("hello");
	}

	public static void main(String[] args) {
		A a = new A();

		a.hello();
	}
}
