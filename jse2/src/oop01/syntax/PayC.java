package oop01.syntax;

public class PayC {
	String name;
	int salary;// �޿�
	public static final double TAX=0.1; //���� 0.1
	int income;// �Ǳ޿� = �޿� - �޿�*����
	int taxVal;
	
	public void setTaxVal(int salary){
		/*System.out.println("���ݰ�� :" + (int)salary);*/
		this.taxVal = (int) (salary*TAX);
		
	}
	public void setIncome(int salary){
		/*System.out.println("�޿�"+salary);*/
		this.income = (int) (salary-salary*TAX);
	}
	public int getTaxVal(){
		return (int) taxVal;
	}
	public int getIncome(){
		return income;
	}
}



