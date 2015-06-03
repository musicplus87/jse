package api04.io.file;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.File;

public class FileInfoDemo {
	public static void main(String[] args) {
		System.out.println("���� �̸��� ��������");
		String name ="";//���������� �ʱ�ȭ �ʼ�
		//File API�� ����ϰ��� ���� �Ծ��ٸ�
		//�ƹ��ǽɾ��� try catch���� ����.
		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			name = in.readLine();//��ĳ�� ó�� �� �ܾ �ƴ� �� ������ �о� ���̱� ����
			//��ĳ�ʺ��� �� ���� ���ڸ� �о� �������� BufferedReader ����� ������.
		}catch(Exception ex){
			ex.printStackTrace();
			System.out.println("FileInfoDemo ���� ������!!");
		}
		//import ����Ű : CTRL+SHIFT+o
		File file = new File(name);
		if(file.exists()){
			System.out.println("�����̸� :"+file.getName());
			System.out.println("���ϰ�� :"+file.getPath());
			System.out.println("���Ⱑ�ɿ��� :"+file.canWrite());
			System.out.println("�бⰡ�ɿ��� :"+file.canRead());
			System.out.println("���� ���� :"+file.length()+"byte");
		}else{
			System.out.println("�ش� ������ �������� ����.");
		}
	}

}
