package oop01.syntax;

public class CardVO {
String kind; //카드의 무늬
int number; //카드의 숫자
static int width = 150;//카드의 너비
static int height = 300; // 카드의 높이
public CardVO(int number, String kind) {
	
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
