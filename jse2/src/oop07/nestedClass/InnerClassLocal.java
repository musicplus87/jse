package oop07.nestedClass;

public class InnerClassLocal {
	int a = 100;
	public void innerTest(int k){
		int b = 200;
		final int c = k;
		class Inner{
			public void getData(){
				System.out.println("멤버변수 a:"+a);
				System.out.println("상수 c :"+c);
			}
		}
		Inner inn = new Inner();
		inn.getData();
	}
}
