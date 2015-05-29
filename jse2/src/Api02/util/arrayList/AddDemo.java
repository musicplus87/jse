package Api02.util.arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 * java.util.ArrayList�� �޼ҵ���
 * add()�� ������ add()�� �����ϴ�.
 */
public class AddDemo {
	public static void main(String[] args) {
		/*
		 * Vector�� ���������� String���.�ӵ��� ����.����ȭ ����
		 * ArrayList�� ���������� StringBuffer ���. ����ȭ �������� ����
		 */
		ArrayList<String>lists= new ArrayList<String>();
		
		//�׸� �߰�
		lists.add("����");
		lists.add("�λ�");
		lists.add("�뱸");
		
		/*���1:iterator()�̿�*/
		//��Ŭ���� ���� �߿��� java.util.Iterator����
		Iterator<String>it1= lists.iterator();
		/*
		 * Iterator�� �����ϰ� ���� whi �� �ڵ��ϸ�
		 * 3���� ��Ŭ���� ������ �����µ� ���߿���
		 * ..with iterator�� �����Ѵ�.
		 */
		while (it1.hasNext()) {
			//String string = (String) it1.next();
			System.out.printf("%s", it1.next());
			//�� ���� �� printf �� �Ϳ� ����!!!
			//printf�� �������� ����� �ֿܼ� ����ϰڴٴ� �ǹ�
			//%s�� String���� �ǹ��ϸ�, ���� ������
			//it1.next()�� ���ϰ��� �����ִ� ������ �Ѵ�.
			//���⼭ %s�� s�� String�� �ǹ�
			//���� ���ڸ� �������Ѵٸ� %d�̸� �̶� d�� decimal�̶�
			//�Ͽ� 10������ ���Ѵ�.
			
			
		}
		System.out.println();
		/*
		 * ���2:listIterator()�̿�
		 */
		ListIterator<String>it2=lists.listIterator();
		while(it2.hasNext()){
			System.out.printf("%s", it2.next());
		}
		System.out.println();
		/*
		 * ��� 3:previous()�̿�
		 */
		while(it2.hasNext()){
			System.out.printf("%s", it2.previous());
		}
		//���� ��Ҹ� �� ���� �Է�
		//�ٸ� ArrayList�� �� ���� �ű�ų� ��������
		//ArrayList�� ����Ѵ�.
		List<String>lists2 = new ArrayList<String>();
		lists2.addAll(lists); //����,�λ�,�뱸�� �Ű� ��Ҵ�.
		
		/*
		 * ��� 4.Ȯ�� for�� ���
		 * �� ���� ��¹����� �ξ� ��������
		 * �ڵ带 �� �� ����.
		 */
		for(String s:lists2){
			System.out.printf("%s",s);
		}
		System.out.println();
		//�˻� ����� ���� ������ �߰�
		lists2.add("����");
		lists2.add("����");
		lists2.add("��õ");
		
		/*
		 * ��� 5. �˻��ؼ� ���
		 */
		Iterator<String>it3=lists2.iterator();
		String str;
		while (it3.hasNext()) {
			str = it3.next();
			/*
			 * ArrayList�� ����߿���"��"�ڷ�
			 * �����ϴ� ���� �ִٸ�..
			 */
			if(str.startsWith("��")){
				System.out.printf("%s", str);
				
			}
			
			
		}
		System.out.println();
		//ArrayList�� ������ �ڷ��� �Է��� �����ϴ�
		lists2.add("����");
		lists2.add("����");
		lists2.add("����");
		
		Iterator<String> it4 = lists2.iterator();
		while(it4.hasNext()){
			System.out.printf("%s", it4.next());
		}
		System.out.println();
			
			}
	}


