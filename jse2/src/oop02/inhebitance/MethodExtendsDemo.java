package oop02.inhebitance;
/*
 * Date:5/22
 * Author:
 * Desc:�޼ҵ� ��ӿ� ���� ����
 */
/*
 Car
 ��
 |
 Hcar <- new(instantiate):�ν��Ͻ� ���� ���䵵
 */

class Car2{
	String name = "�ڵ���";
	public String gear(){
		return "�������";
	}
}
class Hcar2 extends Car2{
	String brand = "����";
	public String autoGear(){
		return "������";
	}
}
public class MethodExtendsDemo {
	public static void main(String[] args) {
		Hcar2 h = new Hcar2();
		System.out.println(h.gear());
		System.out.println(h.autoGear());
		
		Car2 c = new Car2();
		System.out.println(h.gear());
	    //System.out.println(h.autoGear());
		//��ӽ� �θ�� �ڽ��� �޼ҵ带 ȣ���� �� ����.
		//����, �ڽĸ� �θ��� �޼ҵ带 ȣ���� �� �ִ�.
	}
}
