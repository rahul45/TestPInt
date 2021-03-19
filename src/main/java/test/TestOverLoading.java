package test;

public class TestOverLoading {
	
	public static void main(String[] args) {
		TestOverLoading loading = new TestOverLoading();
		loading.get(123.90);
		loading.get("Helllo");
	}
	public void get(Object o){
		System.out.println("Object:"+o);
	}
	public void get(String o){
		System.out.println("String:"+o);
	}
	public void get(Integer o){
		System.out.println("Integer:"+o);
	}
	
	
}
