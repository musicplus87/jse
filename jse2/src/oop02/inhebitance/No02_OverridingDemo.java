package oop02.inhebitance;

/*
 * Method Overriding
 * -��Ӱ��迡�� Super�� ����� �޼ҵ带 Sub���� �ٽ� ������ ���
 * -�̷� ��� Super�� �޼ҵ�� ���õȴ�.
 * -���� �޼ҵ尡 Super �� Sub���� ��� ����Ǿ�����,
 * -������ �ٸ� �� �ִ�.
 * 
 */
/*
 * �������̵��� ����
 * -Ŭ������ �������� ������ �� �ִ�.
 * -��, Super�� Sub������ �޼ҵ��, �Ķ���Ͱ���, �Ķ���͵�����Ÿ���� ���ƾ� ��.
 * -Super�� ���� �޼ҵ带 ����� �ֳ� ���� �̸��� �޼ҵ尡 Sub�� �����Ѵٸ�
 * Sub�� �ִ� �޼ҵ带 �켱 ����ؾ� ��.
 * -Super�� �޼ҵ� ����� �����ϸ鼭, ��Ȳ�� ���� Sub�� ������ �����
 * ����ϰ� ���� �� ����Ͽ� �������� �ٽɿ����̴�.
 * -Super�� �޼ҵ带 ĸ��ȭ �Ѵٰ� �� �� �ִ�.
 */
class Parents {
	void show() {
		System.out.println("Parents�� show()�� ����..");
	}
}

class Child extends Parents {
	void show() {
		System.out.println("Child�� show()�� ����..");
	}
}

public class No02_OverridingDemo {
	public static void main(String[] args) {
		Parents p = new Parents();
		p.show();

		Child c = new Child();
		c.show();
	}
}
