package api01.lang.object;

public class EqualsDemo {
	public static void main(String[] args) {
		Temp t1 = new Temp(10);
		Temp t2 = new Temp(10);
		//���������� �ݵ�� �ʱ�ȭ�� �ؾ��Ѵ�.
		//Ư������ �ʿ����� ���� ���� ����Ʈ ���� �Ҵ��Ѵ�.
		
		String result = "";
		/*
		 * ���׿�����
		 * ���ϰ� = (���ǽ�)?"���� ���":"������ ���";
		 */
		result = t1.equals(t2) ? "t1 �� t2 �� ����":"t1 �� t2 �� �ٸ�";
		System.out.println("�����ڸ� ���� ������ �������� ���� �� : " + result);
		
		t2 = t1; //�������� t2 ���ٰ� t1�� ���� �Ҵ��϶�.
		result = t1.equals(t2) ? "t1 �� t2 �� ����":"t1 �� t2 �� �ٸ�";
		System.out.println("������������ �ٸ� ������������" + "�Ҵ�� �������� ���� ��: " + result);
	}

}
class Temp{
	int num;
	public Temp(int num){
		this.num = num;
	}
}
