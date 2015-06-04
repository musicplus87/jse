package nwk02.swing;

import java.util.Arrays;

/*
 * VO:Value object ��� ��������
 * �����͸� ó���ϴ� Ŭ������ ���̻�� ���忡�� ���ȴ�.
 */
public class LottoVO {
	int[] lotto = new int[6];
	
	public void setLotto() {
		//�ζ� ��� 6���� �ʱ�ȭ
		for(int i=0;i<lotto.length;i++){
			lotto[i] = 0;
		}
		//�ζ� ��ȣ ����
		for(int i=0;i<lotto.length;i++){
			int randomNum = (int)(Math.random()*45+1);
			//45�� ����Ʈ ~���� ��� �ǹ�, 1�� begin ~����
			//�ᱹ �� ������ 1���� 45���� �������� ���ڸ� �߻����Ѽ� ��ƶ�.
			//�̹� ��ϵ� ��ȣ������ ���� üũ
			boolean exist = false;
			
			//��ϵ� ��ȣ Ȯ��
			for(int j=0;j<lotto.length;j++){
				if(randomNum == lotto[j]){
					exist = true;
					break; //��ϵ� ��ȣ�̸� Ȯ�� ����
				}
			}
			if(exist){ //exist �� ó������ false���ٰ�, �� �ڸ������� true�� �Ѿ��
				//��ϵ� ��ȣ�̸� �ٽ� ���
				i--;
				continue;
			}else{
				//��ϵ� ��ȣ�� �ƴϸ�
				lotto[i] = randomNum;
			}
		}
		Arrays.sort(lotto); //�Ķ���ͷ� ������ �迭�� �������� 1.2.3.���� �����ض�.		
	}
	

	public int[] getLotto() {
		return lotto;
	}



	
	/*
	 * �������̵� �� �����ε�
	 * �������̵� : ������..�Ȱ��� �̸��� �޼ҵ尡 �����ϴ� ���� �ƴ϶� @Overrid
	 * �±װ� �ְ� �θ�Ŭ������ ������ �̸��� �޼ҵ尡 �ִ� ��.
	 * 
	 * �����ε� : �ߺ�����..�Ȱ��� �̸��� �޼ҵ尡 �Ķ�����ǰ����� Ÿ�Ը� �ٸ��ٸ�
	 * ���� Ŭ������ �������� �� �� �ִ� ��.
	 */
	
	

}
