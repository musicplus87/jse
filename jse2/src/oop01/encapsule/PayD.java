package oop01.encapsule;

public class PayD {


public static void main(String[] args) {
	
	String hulk = "��ũ";
	int hulkSalary = 200;
	String iron = "���̾�";
	int ironSalary = 300;
	String thor = "�丣";
	int thorSalary = 500;
	
	PayC hulkPay = new PayC();
	hulkPay.setTaxVal(hulkSalary);
	hulkPay.setIncome(hulkSalary);
	System.out.println("=== "+hulk+"�� 5�� �޿����� ===");
	System.out.println("�޿� : "+hulkSalary);
	System.out.println("���� : "+hulkPay.getTaxVal());
	System.out.println("�Ǽ��ɾ� : "+hulkPay.getIncome());
	System.out.println();
	System.out.println("=== "+iron+"�� 5�� �޿����� ===");
	System.out.println("�޿� : "+iron);
	System.out.println("���� : ");
	System.out.println("�Ǽ��ɾ� : ");
	System.out.println();
	System.out.println("=== "+thor+"�� 5�� �޿����� ===");
	System.out.println("�޿� : "+thor);
	System.out.println("���� : ");
	System.out.println("�Ǽ��ɾ� : ");
	System.out.println();
	

}
}
