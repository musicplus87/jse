package nwk01.awt;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Toolkit;

public class TextFieldDemo {
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
        
        TextField txtId = new TextField(10);//10���ڱ��� �Է°����� â�� ����
        TextField txtPwd = new TextField(10);
        txtPwd.setEchoChar('*');//��й�ȣ�� *�� �������� �Ѵ�.
	
	
		/*
		 * [2]������� ������Ʈ���� �����Ѵ�.
		 */
        frame.setLayout(new FlowLayout());
        // FlowLayout�� ���η� (�¿��� ���) ���Ľ�Ų��.
        //frame.setLayout(null); //null �̸� x, y��ǥ�� ���ĵȴ�.
		frame.add(labId);
		frame.add(txtId);
		frame.add(labPwd);
		frame.add(txtPwd);
		
		/*
		 * [3]������Ʈ�� ȭ�鿡 ����
		 */
		frame.setLocation(dim.width/2-150, dim.height/2-100);
		frame.addWindowListener(new EventHandler());
		frame.setVisible(true);
		
	}

}
