package nwk01.awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Toolkit;

public class ButtonDemo {
	public static void main(String[] args) {
		/*
		 * [1]������Ʈ�� �����. ������ ��ü�� �����Ѵ�.
		 */
		Frame frame = new Frame("�޸���");
		frame.setSize(500, 300);//(�ʺ�,����)
		Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dim = toolkit.getScreenSize();
		
	
		
		Button bthOk = new Button("Ȯ ��");
		bthOk.setSize(100, 50);
		bthOk.setBackground(Color.BLUE);
		bthOk.setLocation(100, 75);//(x��ǥ, y��ǥ)
		/*
		 * [2]������� ������Ʈ���� �����Ѵ�.
		 */
		frame.setLayout(null);
		frame.add(bthOk);
		
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
