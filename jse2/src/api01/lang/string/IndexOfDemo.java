package api01.lang.string;

public class IndexOfDemo {
	public static void main(String[] args) {
	String str = "Hello Java world";
	/*
	 * indexOf("S") : s�� ���ڿ� ���ο����� ��ġ�� ����
	 * �ε����� 0���� �����ϰ�, ���鵵 1ĭ���� �����Ѵ�.
	 */

		System.out.println("�׽�Ʈ�� �ܾ� :" + str);
		int idx = str.indexOf('J');
		System.out.println(idx);
		
		idx =  str.indexOf("Java");
		System.out.println("Java �� ��ġ�� : " + idx);
		/*
		 * DB �� ����Ǵ� ID �� Password �� ���
		 * �뷮������ ���ڼ��� �����ϴ� ��찡 �ִµ�,
		 * ȸ�����Խ� ���ڼ� üũ�ؼ� ������ �� ���.
		 */
		idx = str.lastIndexOf('d');
		System.out.println("lastIndexOf() �� ����� :" + idx);
		
		idx = str.indexOf('J');
		String str2 = str.substring(idx);
		System.out.println("J���� ������ �߶󳻱�" + str2);
	}

}
