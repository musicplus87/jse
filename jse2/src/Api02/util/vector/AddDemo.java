package Api02.util.vector;

import java.util.Vector;
/*
 * java.util.Vector
 * -�÷��� �����ӿ����� ���� ���� ���Ǵ� �÷��� Ŭ����
 * -��ü�� ������ �� ������, �⺻������Ÿ���� ���� �Ұ���
 * -�迭�� ������ �޸� ���� ���� �� �ִ� ����
 * -Thread�� �������� �÷��� Ŭ����
 * -���� ũ�� ������ ����
 */

public class AddDemo {
	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>();
		String admin = new String("admin");
		Boolean gender = new Boolean(false);
		
		vec.add(new String("password"));
		vec.add(String.valueOf(23));
		vec.add(String.valueOf(gender));
		vec.add(admin);
		
		System.out.println("���Ϳ� ��� ���� ���");
		/*
		 * for loop ���� limit �κ��� ���ø�
		 * �迭���� ���� length()�� �ƴ϶�
		 * size()�� �� �Ϳ� ����!!!
		 */
		/*
		 * �迭�� �ε����� 0���� �����ϴ� ��ó��
		 * ���͵� �ε����� 0���� �����մϴ�.
		 * 
		 */
		for(int i=0;i<vec.size();i++){
			System.out.println("���Ϳ� ����ִ�"
					+(i+1)+"��° ��Ҵ�"
					+vec.elementAt(i)
					+"�Դϴ�.");
		}
		/*
		 * ��½�Ű�� �޼ҵ嵵 elementAt()
		 * �ΰͿ� ����!!
		 * �迭�� �ٸ��ϴ�.
		 */
	}

}
