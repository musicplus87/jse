package oop02.inhebitance;

class Aclass {
	void over(int i) {
		System.out.println("Aclass-over�޼ҵ带 ������ ��� :" + i * 10);
	}

	void noOver(int i) {
		System.out.println("Aclass-noOver�޼ҵ带 ������ ��� :" + i);
	}
}

class Bclass extends Aclass {
	void over(int i) {
		System.out.println("Aclass-over�޼ҵ带 ������ ��� :" + i * 500);

	}

	void noOver(String s) {
		System.out.println("Bclass-noOver�޼ҵ带 ������ ��� :" + s);
	}

	void onlyB() {
		System.out.println("Bclass-onlyB�޼ҵ带 ������ ��� ");
	}
}

public class ObjectCastingDemo {
	public static void main(String[] args) {

		// �Ϲ����� ��ü����
		Aclass a = new Aclass();
		Bclass b = new Bclass();

		// �θ�Ÿ�� ��ü = new �ڽ�Ÿ��();
		Aclass a2 = new Bclass();
		// �������̵��� �ڽ�Ŭ������ �޼ҵ带 ���� ȣ��
		a2.over(3);
		// �������̵��� ���� ������ �θ�޼ҵ带 �켱 ȣ��
		a2.noOver(6);
		// �θ�Ŭ���� Ÿ���� �ڽ�Ŭ������ ���� ����ȯ
		Bclass b2 = (Bclass) a2;
		b2.over(1);
		b2.noOver("BBB");
		b2.onlyB();
	}
}
	

