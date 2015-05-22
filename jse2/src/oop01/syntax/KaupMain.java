package oop01.syntax;

import java.util.Scanner;

public class KaupMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double height = 0;
		double weight = 0;
		KaupVO vo = new KaupVO(height, weight);
		System.out.println("키를 입력해 주세요.");
		height = scanner.nextDouble();
		vo.setHeight(height);
		System.out.println("몸무게를 입력해 주세요.");
		weight = scanner.nextDouble();
		vo.setWeight(weight);
		int idx = 0;
		vo.setIdx(height, weight);
		vo.getMsg();
		System.out.println(vo.toString());
		System.out.println("완료");
	}

}
