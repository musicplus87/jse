package nwk02.swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * UI(User Interface)�� ȭ���� �����ϴ� ��������
 * ����ڰ� ó�� �����ϴ� �κ��̶�� �ǹ��̴�.
 */
public class LottoUI extends JFrame implements ActionListener{
	LottoVO lotto; //lotto ������ �ִ� ���� �Ʒ� �޼ҵ���� �����ϱ�����
	//�ʵ忡 �ν��Ͻ� ������ �����Ͽ���.
	JButton btn;
	JPanel panelNorth, panelSouth;
	ImageIcon icon;
	List<JButton> btns; //List�� java.util.List�� ����
	
	public LottoUI() {
		init();
		}
	
	private void init() {// init() �� initialize ��� �ʱ�ȭ�� �ǹ̸� �����ִ�.
	    this.setTitle("�ζǻ�����");
	    lotto = new LottoVO(); //�ʵ忡 �ν��Ͻ������� ����Ǿ ��ü������ �����ϴ�.
	    btns = new ArrayList<JButton>();
	    panelNorth = new JPanel();
	    panelSouth = new JPanel();
	    btn = new JButton("������");
	    /*��ư�� �������̽��� ������ �ִ� ����� �Ҵ��Ѵ�.*/
	    btn.addActionListener(this);
	    panelNorth.add(btn);
	    add(panelNorth, BorderLayout.NORTH);
	    add(panelSouth, BorderLayout.SOUTH);
	    setBounds(300, 400, 1200, 300);
	    // 300, 400�� x,y��ǥ
	    //1200, 300dms �ȼ��� ������ �ϴ� ������
	    setVisible(true);
	    
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// �̺�Ʈ�� ó���ϴ� �ɷ��� ActionListener �������̽��κ���
		// �ο��޾Ҵ�.
		if(btns.size()==0){
			makeBtns();
		}
		lotto.setLotto();
		showLotto();
		
	}

	private void showLotto() {
		int[] arr = lotto.getLotto();//getter �� ��
		System.out.println("�迭ũ�� Ȯ�� :"+arr.length);
		for(int i=0;i<arr.length;i++){
			btns.get(i).setIcon(getIcon(arr[i]));
		}
	}

	private Icon getIcon(int i) {
		String imgPath = "src/images/"+Integer.toString(i)+".gif";
		return new ImageIcon(imgPath);
	}

	private void makeBtns() {
		//JButton tmp = new JButton() ��
		//�Ʒ� ������ �ٸ� ����
		//�ν��Ͻ� ��������(��ü) �� 1�� �����ϴ� �Ͱ�
		//6�� �����ϴ� �������̴�.
		JButton tmp = null;
		for(int i=0;i<6;i++){
			tmp = new JButton();
			btns.add(tmp);// ���ڰ� ���� ���� ��ư �������θ� ������� ����Ʈ��
			//�ε����� �Ҵ��ϴ� ��.
			panelSouth.add(tmp);// �Ʒ��� �гο� ��ư�� �����ϴ� ��
		}
		
	}

}
