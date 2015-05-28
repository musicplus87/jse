package api01.lang.string;
/*
 * java.lang.String
 * ���ڿ� ���� class
 * - "==" �� ��ü�� reference value(hash code table)�� ��
 * -���ڿ� �񱳽ÿ��� �ݵ�� equals()�޼ҵ� �̿�
 * -new �� �̿��ϸ� heap ������ ���ο� �޸𸮸� �Ҵ��ϰ� hasgcode �� ����.
 */
public class EqualsDemo {
	public static void main(String[] args) {
		//�Ʒ��� ���� �����ϴ� ����� ���ͷ� ���� ����̶�� �Ѵ�.
		String str1 = "abc";
		String str2 = "abc";
		/*
		 * ���׿����� ��
		 * (���ǽ�) ? "��" : "����";
		 */
		String result1 = (str1 == str2) ?"str1 �� str2 �� ����" : "str1�� str2 �� �ٸ���";
		String result2 = (str1.equals(str2)) ?"str1 �� str2 �� ����" : "str1�� str2 �� �ٸ���";
		System.out.println("(str1 == str2)�� ��� :" + result1);
		System.out.println("(str1.equals(str2))�� ��� :" + result2);
		
		//�Ʒ��� ���� �����ϴ� ����� ������ ���� ����̶�� �Ѵ�.
		String str3 = new String("abc");
		String str4 = new String("abc");
		
		String result3 = (str3 == str4) ?"str3 �� str4 �� ����" : "str3�� str4 �� �ٸ���";
		String result4 = (str3.equals(str4)) ?"str3 �� str4 �� ����" : "str3�� str4 �� �ٸ���";
		System.out.println("(str3 == str4)�� ��� :" + result3);
		System.out.println("(str3.equals(str4))�� ��� :" + result4);
		
		/*
		 * result3�� ����� �ٸ� ����.
		 * -String Ŭ������ �����ڸ� �̿��ؼ� String �ν��Ͻ� ������ ��쿡��
		 * new �����ڿ� ���� �޸� �Ҵ��� �̷����� ������
		 * �׻� ���ο� String �ν��Ͻ��� �����ȴ�.
		 */
		/*
		 * ��� Ŭ��������(*.class)���� constant pool �̶�� ���Ǯ�� �־
		 * Ŭ���� ���� ���Ǵ� ��� ���ͷ��� ������� ����Ǿ� �ִ�.
		 * ����ϰ��� �ϴ� ���ڿ��� ���Ǯ�� �̹� �����ϴ� ��쿡��
		 * �� ���ڿ��� �ּҰ��� ��ȯ�Ѵ�.
		 */
	}
}
