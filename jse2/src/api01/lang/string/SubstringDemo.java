package api01.lang.string;
/*
 * java.lang.String ����
 * substring(n)�� n ���� ������ �߶󳽴�.
 * substring(n, m)�� n ���� m ���� �߶󳽴�.
 * n <= x < m
 */
public class SubstringDemo {
	public static void main(String[] args) {
		String str = "Hello Java";
		System.out.println(str.substring(6));
		System.out.println(str.substring(6, 8));
	}

}
