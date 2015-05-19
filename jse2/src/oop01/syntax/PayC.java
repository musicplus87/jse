package oop01.syntax;

public class PayC {
	String name;
	int salary;// 급여
	public static final double TAX=0.1; //세율 0.1
	int income;// 실급여 = 급여 - 급여*세율
	int taxVal;
	
	public void setTaxVal(int salary){
		/*System.out.println("세금계산 :" + (int)salary);*/
		this.taxVal = (int) (salary*TAX);
		
	}
	public void setIncome(int salary){
		/*System.out.println("급여"+salary);*/
		this.income = (int) (salary-salary*TAX);
	}
	public int getTaxVal(){
		return (int) taxVal;
	}
	public int getIncome(){
		return income;
	}
}



