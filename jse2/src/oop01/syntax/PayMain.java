package oop01.syntax;

class Pay{
	/*
	 * �������, �ν��Ͻ�����+Ŭ��������, �ʵ��� �θ���.
	 */
	String name;//�̸�
	int salary;//�޿�
	int tax;//����, ������ 10%�� 0.1
	int income;//���� ���Ծ�
}

public class PayMain {
public static void main(String[] args) {
	Pay p1 = new Pay();
	Pay p2 = new Pay();
	Pay p3 = new Pay();
	
	p1.salary = 400;
	p1.name = "���̾�";
	p1.tax = (int)(p1.salary*0.1);
	p1.income = p1.salary - p1.tax;

	p2.salary = 800;
	p2.name = "��ũ";
	p2.tax = (int)(p2.salary*0.2);
	p2.income = p2.salary - p2.tax;
	
	p3.salary = 200;
	p3.name = "ȣũ";
	p3.tax = (int)(p3.salary*0.05);
	p3.income = p3.salary - p3.tax;

	System.out.println("==="+p1.name+"�� 5�� �޿�����===");
	System.out.println("���� :" + p1.salary);
	System.out.println("���� :" + p1.tax);
	System.out.println("�Ǽ��ɾ� :" + p1.income);
	
	System.out.println("==="+p2.name+"�� 5�� �޿�����===");
	System.out.println("���� :" + p2.salary);
	System.out.println("���� :" + p2.tax);
	System.out.println("�Ǽ��ɾ� :" + p2.income);
	
	System.out.println("==="+p3.name+"�� 5�� �޿�����===");
	System.out.println("���� :" + p3.salary);
	System.out.println("���� :" + p3.tax);
	System.out.println("�Ǽ��ɾ� :" + p3.income);
}
}

