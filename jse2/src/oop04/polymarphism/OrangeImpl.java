package oop04.polymarphism;


public class OrangeImpl implements FruitInterface{

	@Override
	public void display(String s) {
		System.out.println(s + "�������Դϴ�.");
		
	}
	/*
	 * �Ʒ� �޼ҵ�� �����ڰ� ���Ƿ� �ۼ��� ���Դϴ�.
	 * �� ������ �� ������ �ƹ��� �����ڰ� ���Ƿ� �޼ҵ带
	 * �߰��Ͽ��� main()������ ����� �� �����Ƿ�
	 * ��Ű�� ���� ���� ���� �ʵ��� �����ϴ� ��ʷ� �Ͽ����ϴ�.
	 */
	public int getCount(){
		return 100;
	}

}
