package api01.lang.string;
/*
 * toString()
 * String �ν��Ͻ��� ����Ǿ� �ִ� ���ڿ��� ����
 */
public class ToStringDemo {
	public static void main(String[] args) {
		double d = 858.8d;//���� �ִ� d�� �������� �ǹ�
		String s = Double.toString(d);
		
		System.out.println("s�� ����:"+s);
		int dot = s.indexOf('.');
		System.out.println("�Ҽ��� ���ڸ� �ڸ��� : " + dot);
		System.out.println("�Ҽ��� ���ڸ� �ڸ��� :"+(s.length() - dot - 1));
	}
}
