package api01.lang.object;

//import java.lang.*;
//java.lang.*�� ���� �������� �ʾƵ� ����Ʈ�� ������ �ִ�.
public class ToStringDemo {
	public static void main(String[] args) {
		Card card1 = new Card("heart", 7);
		Card card2 = new Card("spade", 2);
		System.out.println(card1.toString());
		System.out.println(card2.toString());
		
	}

}
class Card{
	String kind;
	int number;
	public Card(){
		this("",0); //�����ε��� �ϰڴٴ� �ǻ�ǥ��
		//��Ŭ������ �ڵ����� �����ε��� ��.
	}
	public Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
		
	}
	//toString �� ���� �������� ����.
	//ALT+SHIFT+S����Ű:toString �������̵�
	@Override
	public String toString() {
		return "ī�� [����=" + kind + ", ����=" + number + "]";
	}
	
}