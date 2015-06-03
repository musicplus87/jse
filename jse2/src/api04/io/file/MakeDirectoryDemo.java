package api04.io.file;

import java.io.File;

public class MakeDirectoryDemo {
	public static void main(String[] args) {
		File file = null;
		boolean isDirectory = false;
		
		try{
			//���ϴ� ��θ� �Ķ���ͷ� �Է���
			file = new File("C:"+File.separator+"Texts2");
			/*
			 *  /�� ���丮 ��θ� ���� �� �� ���Ǵµ�,
			 *  �����쿡���� \\ ����ϰ�
			 *  unix������ / ����ϱ⵵ �ϰ� �ؼ� ..
			 *  ȯ�濡 ���� ���α׷��� ������ �߻���Ű�� ����Ͽ�..
			 *  �����δ� File.separator �ϸ� ȯ�濡 ����
			 *  �������� �����ڸ� �ֹǷ� ���� ������ �߻����� �ʴ´�.
			 */
			
			if(!file.isDirectory()){
				//���� ����
				isDirectory = file.mkdir();
				
				//���� ���� �˷���
				System.out.println((isDirectory)?"������������ !!":"������������..");
			}else{
				System.out.println("�̹� �����մϴ�.");
			}
		}catch(Exception e){
			
			e.printStackTrace();
			System.out.println("MakeDirectoryDemo ���� �����߻�!!");
		}
	}

}
