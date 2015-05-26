package oop07.nestedClass;
/*
 * ����Ŭ���� ù��° ����
 /*
 * ����Ŭ���� �� ����° ����.
 * -Local ���� Ŭ���������� �ܺ� Ŭ������ ����� �����ϴµ� �־
 * -������ ������. �켱 �ܺ� Ŭ������ ��������� ������ �� �� �ִ�.
 * -������ �޼��� ���� �ִ� ���������� ������ �� ����.
 */

 
public class InnerClassInstance {
	int a = 10;
	private int b = 100;
	static int c = 200;
	public class Inner{
		public void printData(){
			System.out.println("������� a: "+a);
			System.out.println("��� c : "+c);
			/*
			System.out.println("�������� b"+b);
			�̷��� �ڵ��ϸ� b���� ������ �� ���ٴ�
			�����޼����� ���.
			*/
			 
			System.out.println("�������� : "+c);
		}
	}
}
