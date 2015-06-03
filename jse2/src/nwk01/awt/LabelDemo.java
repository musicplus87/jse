package nwk01.awt;

import java.awt.Dimension;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;

public class LabelDemo {
	public static void main(String[] args) {
		/*
		 * [1]������Ʈ�� �����. ������ ��ü�� �����Ѵ�.
		 */
		Frame frame = new Frame("�޸���");
		frame.setSize(500, 300);//(�ʺ�,����)
		Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dim = toolkit.getScreenSize();
        
        Label labId = new Label("ID");
        labId.setBounds(50, 50, 30, 10);// (50,50��ġ��ǥ..30,10�ʺ� ����)
        Label labPwd = new Label("Password :");
        labId.setBounds(50, 65, 100, 10);
		
	
	
		/*
		 * [2]������� ������Ʈ���� �����Ѵ�.
		 */
        //  frame.setLayout(new FlowLayout());
        // FlowLayout�� ���η� (�¿��� ���) ���Ľ�Ų��.
        
		frame.setLayout(null); //null �̸� x, y��ǥ�� ���ĵȴ�.
		frame.add(labId);
		frame.add(labPwd);
		
		/*
		 * [3]������Ʈ�� ȭ�鿡 ����
		 */
		frame.setLocation(dim.width/2-150, dim.height/2-100);
		frame.setVisible(true);
		
		/*
		 * �ѱ۱��� �ַ��(�ذ�å)
		 * ������Ʈ�� ��Ŭ��
		 * >�� �� properties Ŭ��
		 * >run/debug setting Ŭ��
		 * ���� Ŭ������ ����Ŭ��
		 * >arguments �� Ŭ��
		 * >VM arguments �� ������
		 * -Dfile.encoding=MS949 �Է�
		 * ������ �����
		 */
	}


	}


