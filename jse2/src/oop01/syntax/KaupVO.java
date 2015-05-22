package oop01.syntax;

public class KaupVO {
	// ������� = �ʵ�
	private double height;// Ű
	private double weight;// ������
	private int idx;
	String msg;

	// ������
	public KaupVO(double height, double weight) {
		this.height = height;
		this.weight = weight;
	}

	// getter&setter
	// Alt + Shift + s
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(double height, double weight) {
		this.idx = (int)((weight/(height*height))*10000);
	}

	public String getMsg() {
		String msg ="";
		if(idx > 30){
			msg = "��";
		}else if(idx > 24){
			msg = "��ü��";
		}else if(idx > 20){
			msg ="����";
		}else if(idx > 15){
			msg = "��ü��";
		}else if(idx > 13){
			msg = "����";
		}else if(idx > 15){
			msg = "�������";
		}else if(idx > 15){
			msg = "�Ҹ���";
		}
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "ī�������� [height=" + height + ", weight=" + weight + ", idx="
				+ idx + ", msg=" + this.getMsg() + "]";
	}

}
