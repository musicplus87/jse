package nwk01.awt;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Toolkit;

public class MenuDemo {
	public static void main(String[] args) {
		/*
		 * [1]������Ʈ�� �����. ������ ��ü�� �����Ѵ�.
		 */
		Frame frame = new Frame("�޸���");
		frame.setSize(500, 300);//(�ʺ�,����)
		Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dim = toolkit.getScreenSize();
        
        MenuBar menuBar = new MenuBar();
        Menu menuFile = new Menu("File");
        Menu menuEdit = new Menu("Edit");
        Menu menuView = new Menu("View");
        Menu menuHelp = new Menu("Help");
        
        MenuItem itemNew = new MenuItem("New");
        MenuItem itemOpen = new MenuItem("Open");
        //Menu��MenuItem �� ����
        //�ڽ��� ������ Menu �� ����
        //�ڽ��� ������ MenuItem�� ����.
        Menu subMenu = new Menu("Other");
        MenuItem itemExit = new MenuItem("Exit");
	
        MenuItem subMenuPrint = new MenuItem("Print");
        MenuItem subMenuPreview = new MenuItem("Preview");
        MenuItem subMenuSetup = new MenuItem("Setup");
        subMenu.add(subMenuPrint);
        subMenu.add(subMenuPreview);
        subMenu.add(subMenuSetup);
	
		/*
		 * [2]������� ������Ʈ���� �����Ѵ�.
		 */
     
        
		menuFile.add(itemNew);
		menuFile.add(itemOpen);
		menuFile.add(subMenu);
		menuFile.addSeparator();//������ ǥ��
		menuFile.add(itemExit);
		
		menuBar.add(menuFile);
		menuBar.add(menuEdit);
		menuBar.add(menuView);
		menuBar.add(menuHelp);
		
		frame.setMenuBar(menuBar);// add�� ������� �ʰ� setMenuBar��
		                          // ����ϸ� �ڵ����� ���� ���ʿ� �ڸ���´�.
		
		
		
		
		/*
		 * [3]������Ʈ�� ȭ�鿡 ����
		 */
		frame.setLocation(dim.width/2-150, dim.height/2-100);
		frame.addWindowListener(new EventHandler());
		frame.setVisible(true);
		
	}
	}


