package api04.io.reader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
	public static void main(String[] args) {
		//InputStreamReader isr = new InputStreamReader(System.in);
		//System.in�� System�� �ϵ���� ��ġ�� �ǹ��ϰ�
		//.in �� �ϵ���� ��ġ�� ���� Ű���带 �ǹ��Ѵ�.
		//BufferedReader in = new BufferedReader(isr);
		//��� �ڵ��� ������ �Ķ���ͷ� ��ġ isr�� BufferedReader��
		//���� ��ó�� ��������..���������δ� isr�� buffer�����
		//�߰��� ���̴�.
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("������ �Է��ϼ���");
		String str = "";
		try{
			str = in.readLine();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		System.out.println("�Է¹��� ���� :" + str);
	}

}
