package api01.lang.thread;

public class AtmUserThreadDemo {
	public static void main(String[] args) {
		Atm atm = new Atm();
		AtmUser hong = new AtmUser(atm, "ȫ�浿");
		AtmUser kim = new AtmUser(atm, "��浿");
		AtmUser moon = new AtmUser(atm, "���浿");
		
		hong.start();
		kim.start();
		moon.start();
	    //hong.start();
		//main()���ο����� �� ��ü�� �� �����常 ȣ���ؾ��Ѵ�.
		//���� �� ��ü�� �ι��̻��� �����带 ȣ���ϸ�
	    //java.lang.IllegalThreadStateException�� �߻��Ѵ�.
	    
		
	}

}
class AtmUser extends Thread{
	Atm atm;
	String name;
	public AtmUser(Atm atm, String name){
		super();
		this.atm = atm;
		this.name = name;
		
	}
	@Override
	public void run(){
		atm.inchul(name);
	}
}
class Atm{
	/*
	 * synchronized �� ����� ������ ���ڸ� ����ȭ�̳�
	 * ��� ��� ��ü�� �����忡 ���� �ɾ
	 * �������� �ʵ忡 ���� �������¿��� ���� ������ ���̾ƴ�
	 * �߸��� ������ ��Ÿ���� ���� �����ϴ� Ű����
	 */
	public synchronized void inchul(String name){
		System.out.println(name+"�Բ��� �����û��");
		for(int i=0;i<=100000000;i++){
			if(i==10000){
				System.out.println(name+"������..");
			}
		}
		System.out.println(name+"�� �����ؼ� ����");
	}
}
