package api01.lang.thread;

public class RunnableDemo {
	public static void main(String[] args) {
		//�������̽�Ÿ�� �������� = new �������̽��� ������Ŭ������();
		Runnable r = new RunnableImpl();
		/*
		 * ������ Thread(Runnable target)
		 */
		Thread thr = new Thread(r);
		thr.start();
		
	}

}
class RunnableImpl implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<5;i++){
			System.out.println(
					Thread.currentThread().getName());
			/*
			 * ����� �ƴϱ� ������ super�� ����� �� ����.
			 */
		}
		
	}
	
}
