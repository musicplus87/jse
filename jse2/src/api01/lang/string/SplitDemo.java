package api01.lang.string;
/*
 * java.lang.String �� �ִ� split() �޼ҵ��
 * �Ķ���Ϳ� ������ �����ڸ� �������� �� �� �ܾ �߶󳻾�
 * �迭��(ArrayList)�� ��� ����� �Ѵ�.
 */
public class SplitDemo {
	public static void main(String[] args) {
		String fruit = "apple,banana,cherry,orange";
		String[] fruits = fruit.split(",");
		for(int i=0;i<fruits.length;i++){
			System.out.println("\t"+fruits[i]);
		}
		
	}

}
