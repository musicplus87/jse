package api01.lang.string;
/*
 * java.lang.String�� �ִ� �޼ҵ�
 * contain("a") : ���ڿ� �߿� a �� �ִ��� üũ
 */
public class ContainsDemo {
	public static void main(String[] args) {
		String str = "abcde";
		
		/*
		 * (str.contains("f") ? "f�� ����" : "f�� ����"
		 * �� ���׿����ڷ� (..)�κ��� ���̸� ���� ""��
		 * �����̸� ���� ""�� �����Ѵ�.
		 */
		System.out.println((str.contains("f")) ? "f�� ����" : "f�� ����");
	}

}
