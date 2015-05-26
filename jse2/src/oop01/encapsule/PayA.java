package oop01.encapsule;

public class PayA {
	String name;
	int salary;// 급여
	double tax = 0.1;// 세금 0.1
	int income;// 실급여 = 급여 - 급여*세율
	int taxVal;
	
	public void setTaxVal(int salary){
		System.out.println("세금계산 :" + (int)salary);
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
