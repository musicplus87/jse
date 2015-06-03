package api04.io.file;

import java.io.File;

/*
 * java.io.File �� �޼ҵ���
 * isFile():�ش� ������ �����ϴ��� ���� üũ
 * isDirectory():�ش� ������ �����ϴ��� ���� üũ
 */
/*
 * ����vs���丮
 * -> ���� ���� �ǹ��̴�. �׷��� �ణ�� �ǹ��� ���̴� �ִ�.
 * ���丮:cmd���(�������)���� ��� ���н� ���
 * ����:GUI ���(������3.5����)���콺�� �����ϸ鼭 �̹��� ������ �� ��Ī.
 */
public class IsDirectoryDemo {
	public static void main(String[] args) {
		// String directory = "c:/temp.txt"; �̶��ϸ�
		// ������ directory �ϰ� �Ҵ��� ���ϰ�θ� �� ����̴�
		String directory = "c:/temp";
		File file = new File(directory);
		// ���丮 �˻�
		if (file.isDirectory()) {
			System.out.println("�˻� ���丮:" + directory);
			System.out.println("���丮 ���� ���");
			String[] str = file.list();
			for (int i = 0; i < str.length; i++) {
				File file2 = new File(directory + "/" + str[i]);
				if (file2.isDirectory()) {
					System.out.println(str[i] + "���丮");
				} else {
					System.out.println(str[i] + "����");
				}
			}
		}

	}
}
