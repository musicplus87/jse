package Api02.util.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class KeySetDemo {
	public static void main(String[] args) {
		Map map = new HashMap();
		/*
		 * �ʿ��� �����͸� �߰��ϴ� ���
		 */
		//new Integer(98)�� ����Ÿ���� �ƴ� ��ü98��
		
		map.put("�迬��", new Integer(98));
		map.put("�ƻ�� ����", new Integer(60));
		map.put("��Ʈ��", new Integer(30));
		
		/*
		 * �ʿ��� �����͸� �о���̴� ���
		 */
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()){
			//it.next()�� �ڵ��ϸ� ������
			//�߻��ϴµ� Entry�� ĳ���� �ϸ� �ȴ�.
			Map.Entry e = (Entry) it.next();
			System.out.println("������:"+e.getKey()
					+", ����:"+e.getValue());
		}
	}

}
