package oop01.encapsule;

public class PayA {
	String name;
	int salary;// �޿�
	double tax = 0.1;// ���� 0.1
	int income;// �Ǳ޿� = �޿� - �޿�*����
	int taxVal;
	
	public void setTaxVal(int salary){
		System.out.println("���ݰ�� :" + (int)salary);
		this.taxVal = (int) (salary*tax);
	}
	public void setIncome(int salary){
		this.income = (int) (salary-salary-taxVal);
	}
	public int getTaxVal(){
		return (int) taxVal;
	}
	public int getIncome(){
		return income;
	}
}
