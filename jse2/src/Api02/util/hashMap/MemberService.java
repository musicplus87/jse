package Api02.util.hashMap;

public interface MemberService {
	/*
	 * ȸ�������� ����ϴ� ����
	 * ȸ�����Խ� ID, ���, �̸�, ����, �ּҸ� ����
	 */
	public void join(String id, String password, String name,
			int age, String addr);
	/*
	 * �α����� ����ϴ� ����
	 * �α��ν� ID�� ����� �Է¹޾� ������
	 */
	public void login(String id, String password);

}
