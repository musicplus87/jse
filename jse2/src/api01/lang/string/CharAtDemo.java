package api01.lang.string;
/*
 * java.lang.String
 * charAt():������ ��ġ�� �ִ� ���ڸ� ������. index�� 0���� ����
 * indexOf():�־��� ���ڰ� �����ϴ��� Ȯ���Ͽ� ��ġ�� �˷���. ������ -1 ��ȯ
 */
public class CharAtDemo {
	public static void main(String[] args) {
		String ssn = "800101-6555555";
		/*
		 * ssn.indexOf("-")+1
		 * �ֹε�Ϲ�ȣ���� "-"�� ��ġ��(index)�����ϴµ�
		 * "-"(<-----������ ��) ���� ���ڸ� �����ϵ��� �ϱ����� +1�� �ش�.
		 */
		char isMan = ssn.charAt(ssn.indexOf("-")+1);
		/*
		char isMan = ssn.charAt(7);
		���Ͱ��� ǥ���ص� �����ϴ�.
		�ε��� ��ġ���� 0���� �����Ѵٴ� ����
		�Ķ���� ���ڰ��� �ε������� �ǹ��Ѵٴ� ����
		����ϸ� ��.
		*/
		
		switch (isMan) {
		/*
		 * switch(���ǽ�) �� ����
		 * case ���� ���� ���ǽ��� ������ �ִ� value(��)�� �ǹ��Ѵ�.
		 * ������ ���� isMan�� 1�̶��...�ϸ鼭 ����ȴ�.
		 */
		case '1':case '3':System.out.println("����");break;
		case '2':case '4':System.out.println("����");break;
		default:System.out.println("�߸��� ���Դϴ�.");break;
		}
	}

}
