package api01.lang.object;
/*
 * �ؽ�(hashing)����� ���Ǵ� �ؽ��Լ�(hash function)�� ������ ��.
 * �ؽ� �ٷ��� �����͸� �����ϰ� �˻��ϴµ� ���Ǵ� ������ �������.
 * ��)Ʈ������ �ؽ��±� #���ɻ��� �̷��� �±׸� �޾Ƴ�����
 * "���ɻ���" �̶�� Ű����� �˻��ϸ� ��ġ�ϴ� �ؽ��±׸�
 * ������ �׸���� ���ϵ�.
 */
public class HashCodeDemo {
	public static void main(String[] args) {
		String abc = new String("abc");
		String abc2 = "abc";
		
		System.out.println("abc �� �ؽ��ڵ� :" + abc.hashCode());
		System.out.println("abc2 �� �ؽ��ڵ� : " + abc2.hashCode());
	}
}
