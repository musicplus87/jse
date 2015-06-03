package nwk01.awt;

import java.awt.Dimension;

import java.awt.Frame;
import java.awt.Label;
import java.awt.Toolkit;

public class LabelDemo {
	public static void main(String[] args) {
		/*
		 * [1]컴포넌트를 만든다. 조립할 객체를 생성한다.
		 */
		Frame frame = new Frame("메모장");
		frame.setSize(500, 300);//(너비,높이)
		Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dim = toolkit.getScreenSize();
        
        Label labId = new Label("ID");
        labId.setBounds(50, 50, 30, 10);// (50,50위치좌표..30,10너비 높이)
        Label labPwd = new Label("Password :");
        labId.setBounds(50, 65, 100, 10);
		
	
	
		/*
		 * [2]만들어진 컴포넌트들을 조립한다.
		 */
        //  frame.setLayout(new FlowLayout());
        // FlowLayout은 가로로 (좌에서 우로) 정렬시킨다.
        
		frame.setLayout(null); //null 이면 x, y좌표로 정렬된다.
		frame.add(labId);
		frame.add(labPwd);
		
		/*
		 * [3]컴포넌트를 화면에 띄우기
		 */
		frame.setLocation(dim.width/2-150, dim.height/2-100);
		frame.setVisible(true);
		
		/*
		 * 한글깨짐 솔루션(해결책)
		 * 프로젝트명 우클릭
		 * >맨 및 properties 클릭
		 * >run/debug setting 클릭
		 * 현재 클래스명 더블클릭
		 * >arguments 탭 클릭
		 * >VM arguments 빈 공간에
		 * -Dfile.encoding=MS949 입력
		 * 저장후 재실행
		 */
	}


	}


