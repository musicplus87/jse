package oop01.encapsule;

class CoffeeA {
	public CoffeeA() {
		System.out.println("���� �ִ�.");

	}
	public CoffeeA(int money) {
		System.out.println(money +"��");

	}
	public CoffeeA(int money, boolean exist) {
		System.out.println("���Ű��ɿ��� :" + (exist == true?"Ŀ����������":"Ŀ�Ǿ���"));

	}
}

public class CoffeeAMain {
	public static void main(String[] args) {
		CoffeeA coffeeA = new CoffeeA();
		CoffeeA coffeeAA = new CoffeeA(500);
		CoffeeA coffeeAAA = new CoffeeA(500, true);
	}
}
