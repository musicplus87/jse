package cmm03.flow;

public class No02_IfElse02Demo {
public static void main(String[] args) {
	int kor = 90, eng = 85, math = 60, sum = 0;
	double avg = 0.0;
	String msg = "message";
	
	sum = kor + eng + math;
	avg = sum/3;
	
	if(avg == 100){
		msg = "���ʽ�����";
	}else if(avg > 70){
		msg = "���� �հ��Դϴ�.";
	}else{
		msg = "������� ������";
	}
System.out.println("���� = " + kor);
System.out.println("���� = " + eng);
System.out.println("���� = " + math);
System.out.println("��� = " + avg);
System.out.println("������ ������ = " + msg + " �Դϴ�.");
}
}
