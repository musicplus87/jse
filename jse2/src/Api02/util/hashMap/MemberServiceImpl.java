package Api02.util.hashMap;

import java.util.HashMap;
import java.util.Map;
/*
 * ��ü������ 4�� Ư¡�� ����ȭ, ���, �߻�ȭ, �پ缺 ��
 * �߻�ȭ+�پ缺 �� �����ϴ� implements �Դϴ�.
 * �������̽� ���� ����� Ŭ���� �� ������ implements Ű���� �ڵ���
 * �������̽��� �Է��Ͻð� ����, Ŭ������ ������(����)ǥ�ð�
 * �ߴ� ��, ���콺�� ��ð�, add unimplement�� Ŭ���ϼ���.
 * �׷� �ڵ� �������̵��� �˴ϴ�.
 */

public class MemberServiceImpl implements MemberService{
	Map<String,Object>map = new HashMap<String,Object>();
	MemberVO vo = new MemberVO();

	@Override
	public void join(String id, String password, String name, int age,
			String addr) {
		/* 
		 * 1.vo��ü�� �����ؼ�
		 * -DB�� ���� ����Ǵ� ������ ǥ���� ���̴�.
		 */
		
		vo.setId(id);
		vo.setPassword(password);
		vo.setName(name);
		vo.setAge(age);
		vo.setAddr(addr);
		/*
		 * 2.�ν��Ͻ� �������� �����Ͽ� ����ϰ� �˻���
		 * �÷����� �غ��Ѵ�.
		 */
	
		/*
		 * vo.getId()�� ������ ������ �� �޼ҵ��� vo.setId()����
		 * ������ �ν��Ͻ� ���� String id�� ���� �����ϸ�
		 * �ٶ󺸰� �ֱ� �����̴�.
		 * vo.getId()�� "id"��� ���ͷ�
		 */
		map.put("id", vo.getId());
		map.put("password", vo.getPassword());
		/*
		 * 1.ù��° ���� ����
		 * map.put(vo.getId(),vo.getPassword());
		 * �̰� �����ڰ� ���� �ϴ� ������ �ڵ�
		 */
		map.put("name", vo.getName());
		/*
		 * 2. �ι�° ���� ����
		 * map.put("age",vo.getAge());
		 * valueOf()�� api.lang.string.ValueOfDemo ����
		 */
		map.put("age", String.valueOf(vo.getAge()));
		map.put("addr", vo.getAddr());
	}

	@Override
	public void login(String id, String password) {
		System.out.println("�ʿ� ��� ID:"+map.get("id"));
		/*
		 * join()�� ���������� map�� �����ߴ���..
		 * join()�� �� ���� ������ �� �ְ�, login()��
		 * �� ���� �� �� ��� �Ʒ� map.get("id")����
		 * ����� �� ������.
		 * �׷���, �� Ŭ������ �޼ҵ��� �� ���� �ٶ� �� �ֵ���
		 * �ʵ忡 �������ش�.
		 */
		System.out.println("�ʿ� ��� ID :"+map.get("id"));
		if(!map.containsKey("id")){
			System.out.println("�Է��Ͻ� ID�� �������� �ʽ��ϴ�."
					+"�ٽ� �Է��ϼ���.");
		}else{
			/*
			 * 3. ����° �������� NullpointerException
			 * map.get(KEY)���� KEY�� ���� ������
			 * Ÿ�԰� ��ġ�ؾ� �ϴµ�.. ���� �ʵ忡 ����� ����
			 * <String,Object> �̹Ƿ�
			 * password�� String ���� �Ǿ�� �մϴ�.
			 * �׷��� "password"�� �ؾ� �մϴ�. 
			 */
			if(!(map.get("password").equals("password"))){
				System.out.println("����� �ٸ��ϴ�."
						+"�ٽ� �Է��ϼ���");
			}else{
				System.out.println("ȯ���մϴ�..."
						+vo.getAddr()+"�� ��ô�"
						+vo.getAge()+"�� �ǽô�"
						+vo.getName()+"�� ȯ���մϴ�.");
			}
		}
		
	}
	
	

}
