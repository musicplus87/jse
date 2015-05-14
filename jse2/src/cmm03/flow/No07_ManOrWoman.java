package cmm03.flow;

import java.util.Scanner;

public class No07_ManOrWoman {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("주민번호 입력 (ex.123456-12345678) :");
	String ssn = scanner.nextLine();
	
	
	char ch = ssn.charAt(7);
	
	switch(ch){
	
	case '1': case '4' :System.out.println("남자"); break;
	case '2': case '5' :System.out.println("여자"); break;
	case '3': case '6' :System.out.println("외국인"); break;
	
	default:System.out.println("틀렸습니다.");
	   break;
	
	}
}
}

