package oop04.polymarphism;


public class OrangeImpl implements FruitInterface{

	@Override
	public void display(String s) {
		System.out.println(s + "오렌지입니다.");
		
	}
	public int getCount(){
		return 100;
	}

}
