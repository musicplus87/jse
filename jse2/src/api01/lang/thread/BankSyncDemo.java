package api01.lang.thread;

public class BankSyncDemo {
	public static void main(String[] args) {
		//����� ���� Ÿ���� �迭�� �����ϴ� ����� �Ʒ��� ����.
		Customer[] customers = new Customer[3];
		Account hong = new Account("ȫ�浿");
		Account kim = new Account("��浿");
		Account moon = new Account("���浿");
		customers[0] = new Customer(hong, "������", 100);
		customers[0].start();
		customers[1] = new Customer(hong, "������", 20);
		customers[1].start();
		customers[2] = new Customer(hong, "������", 1000);
		customers[2].start();
		customers[0] = new Customer(hong, "������", 1000);
		customers[0].start();
		
	}

}
class Account{
	String name;
	int total;
	/*
	 * �ڵ�����:�����ڸ� ������ų ����
	 * ������ �ʵ带 ���� �� �ٷ� CTRL+Space Enter
	 */
	/*
	 * ������ �����ε��� �Ϸ��� �Ҷ���
	 * �ڵ����� ��Ų �����ڿ��� this("")�̷�������
	 * String �̸�"", int �� 0, ��ü�� null�� �ָ� �ȴ�.
	 */
	public Account(){}
	public Account(String name) {
		this.name = name;
	}
	/*�Ķ���Ͱ� int money : �����
	 * �Ķ���Ͱ� Stirng location : ����
	 */
	public void deposit(int money, String location){
		total += money;
		try{
		Thread.sleep(1000);
		System.out.println(
				"["+location+"]"+money+" �� �Ա��� /"
				+"�Ѿ� :"+total+" ��");
		}catch(Exception ex){
			ex.printStackTrace();
			
					
		}
		
	}
}
class Customer extends Thread{
	Account accout;// ��������� ��ü�� �ʵ��� �ν��Ͻ� ������ ������.
	int money;

	public Customer(Account object, String str, int money){
		super(str); //super �� ����Ϸ��� ���� ���� ȣ���ؾ���.
		//this.accout = object; �ص� ������ ���� ������ ������..
		this.accout = object;
		this.money = money;
		
	}
	@Override
	public void run(){
		//this.getName()�� �����尡 �̹� ������ �޼ҵ带
		//������ ���ڴٴ� ��.
		accout.deposit(money, this.getName());
	}
}