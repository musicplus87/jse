package oop01.syntax;

public class Point {
	public int x = 0;
	public int y = 0;
	// ������
	
	public Point(int a, int b) {
		this.x = a;
		this.y = b;
		
	}
//getter setter ����Ű Alt + Shift + s
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}
