package Api02.util.hashMap;

import java.util.Scanner;

public class MemberMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���");
		String name = scanner.next();
		System.out.println("���̸� �Է��ϼ���");
		int age = scanner.nextInt();
		System.out.println("ID�� �Է��ϼ���");
		String id = scanner.next();
		System.out.println("����� �Է��ϼ���");
		String password = scanner.next();
		System.out.println("�ּҸ� �Է��ϼ���");
		String addr = scanner.next();
		/*
		 * ������� Ưȭ�� MemberServiceImpl��
		 * ��ü�� �����Ѵ�. �ֳĸ� �Է¹��� ������
		 * DB�� �����ϰ�, �ʿ� ��Ƽ� ����ϱ� ���ؼ��̴�.
		 */
		MemberService service = new MemberServiceImpl();
		//��ü�� �����ϴ� ������ �� ��ü�� ���� ���(�޼ҵ�)��
		//ȣ���ϱ� ���ؼ��̴�.
		service.join(id, password, name, age, addr);
		System.out.println("ȸ�������� �Ǿ����ϴ�.");
		System.out.println("�α����� ���ּ���.");
		System.out.println("ID�� �Է����ּ���.");
		id = scanner.next();
		System.out.println("����� �Է����ּ���.");
		password = scanner.next();
		service.login(id, password);
		
		
	}

}
