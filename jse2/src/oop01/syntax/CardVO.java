package oop01.syntax;

public class CardVO {
	private String kind; // ī���� ����
	private int number; // ī���� ����
	static int width = 150;// ī���� �ʺ�
	static int height = 300; // ī���� ����

	public CardVO(int number, String kind) {
		this.kind = kind;
		this.number = number;

	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
