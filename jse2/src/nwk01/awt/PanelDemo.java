package nwk01.awt;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.Toolkit;

public class PanelDemo {
	public static void main(String[] args) {
		/*
		 * [1]������Ʈ�� �����. ������ ��ü�� �����Ѵ�.
		 */
		Frame frame = new Frame("�޸���");
		frame.setSize(500, 300);//(�ʺ�,����)
		Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dim = toolkit.getScreenSize();
		
		Panel panel = new Panel();
		panel.setBackground(Color.YELLOW);
		panel.setSize(100, 100);
		panel.setLocation(50, 50);
		
		Button bthOk = new Button("OK");
		/*
		 * [2]������� ������Ʈ���� �����Ѵ�.
		 */
		panel.add(bthOk);
		frame.add(panel);
		
		/*
		 * [3]������Ʈ�� ȭ�鿡 ����
		 */
		frame.setLocation(dim.width/2-150, dim.height/2-100);
		frame.setVisible(true);
	}

	}


