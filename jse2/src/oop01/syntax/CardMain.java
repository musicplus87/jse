package oop01.syntax;

public class CardMain {
public static void main(String[] args) {
	System.out.println("ī���� ���� : " + CardVO.height );
	System.out.println("ī���� �ʺ� : " + CardVO.width);
	
	CardVO myCard = new CardVO(3, "heart");
	CardVO yourCard = new CardVO(7, "heart");
	
	
	/*yourCard �ν��Ͻ��� �����Ͻð�
	 * ���̴� heart �̰� ���ڴ� 7�� ���Դٰ�
	 * ������ ��..
	 * ���ӷ��� ���� ���� ī�尡 �¸��ϴ� �����Դϴ�.
	 */
	
	System.out.println("��� ī����" + "����" + "��" + yourCard.getNumber() + "�̰�"
			+"�� ī��" +  "����" + "��" + myCard.getNumber() + "�̹Ƿ�"
			+"����� �̰���ϴ�.");
}
}
