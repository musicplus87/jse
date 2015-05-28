package api01.lang.wrapper;
/*
 * JDK1.5(=�ڹ�5����)����
 * ���Ե� ����ڽ�(autoboxing)�������
 * ��ȯ���� �⺻���� ���� wrapper class �� ��
 * ���̰� ����. �׷��� parseInt()�� valueOf()�����
 * �����ϴ�.
 */
public class ParseIntDemo {
	public static void main(String[] args) {
		//���ͷ����� �⺻������ ĳ���ý� ��ȯ ���
		int num1 = Integer.parseInt("200");
		int num2 = Integer.parseInt("200");
		int result = num1 + num2;
		System.out.println(result);
		
		//�⺻���� ���������� ����ȯ(����ȯ ��������)
		Integer num3 = result;
		System.out.println("�⺻���� ���������� ����ȯ �� ���: " + num3);
		int num4 = 2 + num3;
		System.out.println("�������� �⺻������ ������ : " +num4);
		
	}

}
