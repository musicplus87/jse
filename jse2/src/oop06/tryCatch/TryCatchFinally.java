package oop06.tryCatch;
/*
 * finally
 * ���� �߻� ���ο� �������
 * �ݵ�� ����Ǵ� ����
 */

public class TryCatchFinally {
	public static void main(String[] args) {
	  //try{}catch(){}finally{}
		try{
			System.out.println("try ���� �޼ҵ� ������...");
		}catch(Exception ex){
			ex.printStackTrace();
			System.out.println("TryCatchFinally Ŭ�������� �����߻�!!");
		}finally{
			System.out.println("finally ���� ����");
		}
	}

}
