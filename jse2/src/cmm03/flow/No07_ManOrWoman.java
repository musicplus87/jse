package cmm03.flow;

import java.util.Scanner;

public class No07_ManOrWoman {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("�ֹι�ȣ �Է� (ex.123456-12345678) :");
	String ssn = scanner.nextLine();
	
	
	char ch = ssn.charAt(7);
	
	switch(ch){
	
	case '1': case '4' :System.out.println("����"); break;
	case '2': case '5' :System.out.println("����"); break;
	case '3': case '6' :System.out.println("�ܱ���"); break;
	
	default:System.out.println("Ʋ�Ƚ��ϴ�.");
	   break;
	
	}
}
}

