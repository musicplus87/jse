package nwk01.awt;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.Toolkit;

public class TextAreaDemo {
	public static void main(String[] args) {
		/*
		 * [1]������Ʈ�� �����. ������ ��ü�� �����Ѵ�.
		 */
		Frame frame = new Frame("�޸���");
		frame.setSize(500, 300);//(�ʺ�,����)
		Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dim = toolkit.getScreenSize();
        
        TextArea area = new TextArea("�ȳ��ϼ���",10,50); //���� 10���� ���� 5��
        area.selectAll();//�Է��� ���� ��ü�� �����ؼ� ...
	
	
		/*
		 * [2]������� ������Ʈ���� �����Ѵ�.
		 */
     
        
		frame.setLayout(new FlowLayout()); 
		frame.add(area);
		
		
		/*
		 * [3]������Ʈ�� ȭ�鿡 ����
		 */
		frame.setLocation(dim.width/2-150, dim.height/2-100);
		frame.addWindowListener(new EventHandler());
		frame.setVisible(true);
		
	}

}
