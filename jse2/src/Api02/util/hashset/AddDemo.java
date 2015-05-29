package Api02.util.hashset;

import java.util.HashSet;
import java.util.Set;
/*
 * java.util.HashSet
 * -Set �������̽��� ������ ���� ��ǥ���� �÷���
 * -�ߺ��� ��Ҹ� �������� ����
 * -�ػ����� �̿��ؼ� ������
 * -���� ���Ǵ� �޼ҵ�
 * boolean add(Object o)
 * void clear()//��� ��� ����
 * Object clone()//�����Ͽ� ��ȯ
 * boolean contains(Object o)//���� �����ϴ��� �˻�
 * int size()//��ҵ��� ������ ��ȯ
 */

/*
 * java.util.HashSet�� �޼ҵ���
 * add()�� ��ü�� �߰��ϴ� ����� ����.
 * ��ü�� �߰��� �� HashSet�� �̹� ������ �ִ� ��ü���
 * �ߺ����� �����ϰ� �������� �ʴ´�.
 * �׸��� false�� �����Ѵ�.
 */
public class AddDemo {
	public static void main(String[] args) {
		Object[] arr = {"1", new Integer(2), "2","2","3","3","3","4"};
		//��Ŭ���� ���� �߿��� java.util.Set�� ����
		Set set = new HashSet();
		for(int i=0;i<arr.length;i++){
			set.add(arr[i]);
		}
		System.out.println("HashSet ������ ��� :"+set);
		/*
		 * [3, 2, 2, 1, 4]�� ��µǴµ�
		 * �̰ɷ� ���� new Integer(2)�� "2"��
		 * ���� �ٸ� ��ü�̹Ƿ� �ߺ����� �������� �ʴ´ٴ� ����
		 * �� �� �ִ�.
		 */
	}

}
