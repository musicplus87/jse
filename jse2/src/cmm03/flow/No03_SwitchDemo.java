package cmm03.flow;

import java.util.Scanner;

public class No03_SwitchDemo {
public static void main(String[] args) {
	System.out.println("��������� �Է��ϼ���");
	Scanner scanner = new Scanner(System.in);
	int avg = scanner.nextInt();
	String msg = "";
	char grade = 0;
	
	if(avg>=70){
		msg = "�հ��Դϴ�.";
	}else{
		msg = "���հ��Դϴ�.";
	}
	
	switch (avg/10) {
	case 10:grade = 'A'; break;
	case 9:grade = 'A'; break;
	case 8:grade = 'B'; break;
	case 7:grade = 'C'; break;
	case 6:grade = 'D'; break;
	case 5:grade = 'E'; break;
	default:grade = 'F'; break;
	}
	System.out.println("���ϴ� "
			+ msg + "�̸� ������ "
			+ grade +" �Դϴ�.");
}
}
