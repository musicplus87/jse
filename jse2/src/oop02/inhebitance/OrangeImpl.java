package oop02.inhebitance;

public class OrangeImpl implements FruitInterface{

	@Override
	public void display(String s) {
		System.out.println(s + "�������Դϴ�.");
		
	}
	public int getCount(){
		return 100;
	}

}
