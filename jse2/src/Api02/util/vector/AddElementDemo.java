package Api02.util.vector;

import java.util.Vector;
/*
 * java.util.Vector��
 * �޼ҵ��� addElement()��
 * add()�� ���� �����մϴ�.
 * ȥ���ϼŵ� �����մϴٸ�..
 * removeElement()���� ����� ���
 * ���� �� �޼ҵ带 ���� �� �ݴϴ�.
 */
public class AddElementDemo {
	public static void main(String[] args) {
		String[] heros = {"iron", "thor", "hulk", "hawk"};
		Vector<String>avengers = new Vector<String>();
		/*
		 * ���Ϳ� �迭�� ��Ҹ� ���� addElement(�迭);
		 */
		for(int i=0;i<heros.length;i++){
			avengers.addElement(heros[i]);
		}
		/*
		 * �丣�� �����ϴ� �� üũ contains() �޼ҵ带 ���
		 */
		String thor = "thor";
		if(avengers.contains(thor)){
			int idx = avengers.indexOf(thor);
			System.out.println("�丣�� "+idx+1+"��°�� �ֽ��ϴ�.");
		}else{
			System.out.println("�丣�� �����ϴ�.");
		}
		/*ù��° ��Ҹ� ���� removeElementAt()*/
		avengers.removeElementAt(0);
		
		System.out.println("���� �� ��Ҹ� �ε��� ��ȯ");
		
		for(int j=0;j<avengers.size();j++){
			System.out.println("�������"+(j+1)+
					"��° �����"+avengers.elementAt(j)+"�Դϴ�.");
		}
		
		/* ����� ���� ��ҿ� �Ҵ�� �ε����� ���� ���� �� �� �ִµ�,
		 * �̰��� ���Ͱ� ��ҿ� �Ҵ��ϴ� �ε����� �������� �̷�����
		 * ������ ��Ÿ���ϴ�.
		 */
	}

}
