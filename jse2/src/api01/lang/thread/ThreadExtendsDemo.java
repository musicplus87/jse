package api01.lang.thread;

public class ThreadExtendsDemo {
	public static void main(String[] args) {
		//��ü�� thr �������� ������ ��.
		ThreadExtends thr = new ThreadExtends();
		//���ݱ��� ���ٷδ�
		//Ŭ���� ��ü�� �����ϸ� �� ��������.�޼ҵ� ������
		//ȣ���ߴµ�..������� thr.run()�ϴ� �� �ƴ϶�
		//thr.start()��� �ؾ� �Ѵ�.
		
		thr.start();
	}

}
class ThreadExtends extends Thread{
	@Override
	public void run() {
		for(int i=0;i<5;i++){
			/*
			 * Ŭ���� �����ڿ��� this(), this.**
			 * �� �ڱ� Ŭ���� ������ �����ڹ� �ν��Ͻ� ������
			 * ���ϴ� ��ó��
			 * super(), super.**��
			 * ��ӹ��� �θ�Ŭ������ ������ �� �ν��Ͻ� ������ ���Ѵ�.
			 */
			System.out.println(super.getName());
		}
	}
}
