package api01.lang.math;

import java.util.Scanner;

/*
 * java.lang.Math �� �ִ�
 * random() �޼ҵ�� ����(������ ��)�� �߻���Ų��.
 */
public class RandomDemo {
	public static void main(String[] args) {
		int com = (int) (Math.random()*5)+1;//���� 5�� limit, ���� 1�� begin
		int myVal = 0;
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		while(true){
			System.out.println("1���� 3���� ������ ���ڸ� �Է��ϼ���.");
			i++;
			System.out.println(i+"��° �Է�:");
			myVal = scanner.nextInt();
			if(myVal == com){
				System.out.println("�ĳ��� :" + com);
				System.out.println("���� �����Դϴ�.");
				break;//while(true)�� �ָ� ���ѷ����� ����.
				//���ѷ������� break; �� �ɾ�� �Ѵ�.
			}
			if(i==3){
				System.out.println("����");
				break; //Ƚ���� 3ȸ�� �����Ͽ� ������ �����Ų��.
		}
	}

}
}
