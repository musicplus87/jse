package oop02.inhebitance;
/*
 * Date:5/22
 * Author:
 * Desc:������� ��ӿ� ���� ����
 */
/*
 * �θ�Ŭ���� ���� �ڽ�Ŭ����
 *  */
class Car{
	String name = "�ڵ���";
}
class Hcar extends Car {
	String brand = "����";
}
class Dcar extends Car {
	String brand = "���";
}
public class MemberVarExtendsDemo {
	public static void main(String[] args) {
		Hcar h = new Hcar();
		System.out.print(h.brand+"\t");
		System.out.println();
		
		Dcar d = new Dcar();
		System.out.print(d.brand+"\t");
		System.out.println(d.name);
	}
}
