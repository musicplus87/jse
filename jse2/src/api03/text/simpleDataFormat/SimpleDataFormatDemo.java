package api03.text.simpleDataFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDataFormatDemo {
	public static void main(String[] args) {
		/*
		 * ��Ŭ���� ������ ����
		 * java.util.Date�� java.sql.Date�� �ִµ�
		 * java.util.Date �� ���Ѵ�.
		 */
		Date today = new Date();
		/*
		 * Ÿ���� ���� ������ ������ ����
		 * �Ʒ��� ���� �� ���� Ÿ�Լ����
		 * �ټ��� ���� ���� ���°� �����ϴ�.
		 * ��, ��ó�� �����ϴ� ���� ��õ�Ѵ�.
		 */
		SimpleDateFormat date01,date02,date03,date04;
		date01 = new SimpleDateFormat("yyyy-mm-dd");
		date02 = new SimpleDateFormat("yy�� MM�� dd�� E����");
		//MM�� ���� ���ϰ�, mm�� ���� ����
		date03 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		//���� a �� ������ ����ð��� �������� ������ ����
		date04 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
		
		System.out.println(date01.format(today));
		System.out.println(date02.format(today));
		System.out.println(date03.format(today));
		System.out.println(date04.format(today));
	}

}
