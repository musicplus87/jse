package oop01.syntax;

public class AverageA {
	String name;
	int kor;
	int eng;
	int tot;//�հ�
	double avg;
	
	/*�̸� �����ϴ� ���*/
	public void setName(String name){
		this.name = name;
	}

	public static void main(String[] args) {
		/*�л� ��ü���� �� �޸� �Ҵ�*/
		AverageA hulk = new AverageA();
		AverageA iron = new AverageA();
		AverageA hawk = new AverageA();
		/*�̸� ����*/
		hulk.name = "��ũ";
		iron.name = "���̾�";
		hawk.name = "ȣũ";
		
		/*���� ����*/
		hulk.kor = 100;
		hulk.eng = 80;
		iron.kor = 50;
		iron.eng = 90;
		hawk.kor = 20;
		hawk.eng = 40;
		
		/*����, ��� ���*/
		hulk.tot = hulk.kor + hulk.eng;
		hulk.avg = hulk.tot/2;
		iron.tot = iron.kor + iron.eng;
		iron.avg = iron.tot/2;
		hawk.tot = hawk.kor + hawk.eng;
		hawk.avg = hawk.tot/2;
	
		/*���*/
		System.out.println("===" + iron.name +" �� ����ǥ===");
		System.out.println("���� :" + iron.kor);
		System.out.println("���� :" + iron.eng);
		System.out.println("�հ� :" + iron.tot);
		System.out.println("��� :" + iron.avg);
		System.out.println();
		System.out.println("===" + hulk.name +" �� ����ǥ===");
		System.out.println("���� :" + hulk.kor);
		System.out.println("���� :" + hulk.eng);
		System.out.println("�հ� :" + hulk.tot);
		System.out.println("��� :" + hulk.avg);
		System.out.println();
		System.out.println("===" + hawk.name +" �� ����ǥ===");
		System.out.println("���� :" + hawk.kor);
		System.out.println("���� :" + hawk.eng);
		System.out.println("�հ� :" + hawk.tot);
		System.out.println("��� :" + hawk.avg);
		System.out.println();
	}
	
}
