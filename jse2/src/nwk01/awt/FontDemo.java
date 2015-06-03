package nwk01.awt;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;

public class FontDemo {
	public static void main(String[] args) {
		/*
		 * [1]������Ʈ�� �����. ������ ��ü�� �����Ѵ�.
		 */
		Frame frame = new Frame("�޸���");
		frame.setSize(500, 300);//(�ʺ�,����)
		Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dim = toolkit.getScreenSize();
        
        Label labId = new Label("Good Bye,Fava..Hello JSP");
        labId.setBounds(50, 50, 30, 10); //(50,50��ġ ��ǥ..30, 10 �ʺ� ����)
		/*
		 * [2]������� ������Ʈ���� �����Ѵ�.
		 */
     
  
		
		frame.setLayout(null);// add�� ������� �ʰ� setMenuBar��
		 frame.add(labId);// ����ϸ� �ڵ����� ���� ���ʿ� �ڸ���´�.
		
		Font plain = new Font("Serif", Font.PLAIN, 20); //20�� ��Ʈ ������
		Font italic = new Font("Serif", Font.ITALIC, 20);
		Font bold = new Font("Serif", Font.BOLD, 20);
		Font boldItalic = new Font("Serif", Font.BOLD+Font.ITALIC, 20);
		
		labId.setFont(boldItalic);
		frame.setLayout(new FlowLayout());
		
		/*
		 * [3]������Ʈ�� ȭ�鿡 ����
		 */
		frame.setLocation(dim.width/2-150, dim.height/2-100);
		frame.setVisible(true);
		
	}

}
