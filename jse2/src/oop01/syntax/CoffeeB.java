package oop01.syntax;

public class CoffeeB {
	public CoffeeB() {
		System.out.println("���� �ִ�.");

	}
	public CoffeeB(int money) {
		this();
		System.out.println(money +"��");

	}
	public CoffeeB(int money, boolean exist) {
		this(money);
		System.out.println("���Ű��ɿ��� :" + (exist == true?"Ŀ����������":"Ŀ�Ǿ���"));

	}

}
