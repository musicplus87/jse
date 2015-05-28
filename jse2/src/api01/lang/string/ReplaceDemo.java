package api01.lang.string;
/*
 * java.lang.String �� �޼ҵ���
 * replace("OLD", "NEW")�� OLD ���ڸ�
 * NEW ���ڷ� �ٲٴ� ������ �Ѵ�.
 */

public class ReplaceDemo {
	public static void main(String[] args) {
		System.out.println("Hello Java".replace("Java", "JSP"));
		/*
		 * Java ���� 5 �������� replace() �� ���ĺ� �� ���ڸ� �ٲٴ�
		 * ��ɸ� �־�����, ������ ����� replaceAll()�� �����Ѵ�.
		 * replaceAll() �� ���� ���ڼ��� �ٲٴµ� ���Ǿ�����,
		 * ���� replace() �� ���� ���ڼ��� �ٲٴ� ������� Ȯ��Ǿ�
		 * ����� �����̰� ����.
		 * �ٸ�, replaceAll()�� ����ǥ���ı����� �ٲٴ� �����
		 * �־ �ǵ����̸� replace() ���ٴ� replaceAll()�� ���� ���� �����Ѵ�.
		 */
		System.out.println("Hello JSP".replaceAll("JSP", "SPRING"));
		/*
		 * �޼ҵ� ü��:�޼ҵ带 ������ �����Ͽ� �պκ��� ����� ������ڸ���
		 * ���� ����� �����ϵ��� �ϴ� ��.
		 */
		System.out.println("Hello Java !!".replace("Java", "JSP").replace("!", ""));
		System.out.println("Hello Java !!".replace("Java", "JSP").replaceAll(".!", ""));
	}

}
