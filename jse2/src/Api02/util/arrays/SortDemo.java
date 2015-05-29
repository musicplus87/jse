package Api02.util.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;
import java.util.List;


/*
 * java.util.Arrays �� �޼ҵ���
 * sort()�� �������� ���Ŀ� Ưȭ�Ǿ���.
 */
public class SortDemo {
	public static void main(String[] args) {
		ArraysDemo ad = new ArraysDemo();
		ArraysDemo ad2 = new ArraysDemo();
		/*
		 * List �� �ڵ��ϸ� ��Ŭ������ import �϶�� �����ϴ�
		 * ��Ű���� ���ε� java.awt.List�� java.util.List�� ���Դϴ�.
		 * �׶� java.util.List�� �����ϼ���..
		 */
		List<Integer>list = new ArrayList<Integer>();
		List<Integer>list2 = new ArrayList<Integer>();
		int[]arr={8,0,6,4,2};
		list = ad.getAscSort1(arr);
		list2=ad2.getAscSort2(arr);
		System.out.println("���Ҿ˰������� ���:"+list.toString());
		System.out.println("Arrays.sort()�� ���:"+list2.toString());
	}
}
		
	

class ArraysDemo{
	//Integer�� int ���� Wrapper Class �Դϴ�.
	//�� �⺻���� int �� ��üȭ ��Ų�̴ϴ�.
	//���ʹ� �⺻���� ���� �� ���� ������ int ����
	//���� ��찡 ����� ��ó�� wraper class �� ����մϴ�.
	Vector<Integer> vec = new Vector<Integer>();
	
	public Vector<Integer> getAscSort1(int[]arr){
		/*
		 * �Ʒ� ������ �������� ���� �˰�����
		 * ���Ҿ˰����Դϴ�.
		 * ���� for������ begin ���۰���
		 * int j=i �� �Ϳ�
		 * ���� �ϼ���.
		 */
	
	int temp = 0;
		for(int i=0;i<arr.length; i++){
			for(int j=i;j<arr.length;j++){
				if(arr[i] > arr[j]){
					 temp = arr[i];
					 arr[i] = arr[j];
					 arr[j] = temp;
				}
		}
	}
		/*�Ʒ� for���� Ȯ��� for ���̶�� �մϴ�.
		 * �ε����� �������ϰ� ������ �ʰ�
		 * ��ü�� ó���ϴ� ���� ������ ���۰� limit �ε�������
		 * ������ �ʰ� �Ʒ� ó�� ó���մϴ�.
		 */
		for(int k: arr){
			vec.add(k);
		}
		return vec;
}


public Vector<Integer> getAscSort2(int[]arr){
	Arrays.sort(arr);
	/*
	 * �� �� ���Ҿ˰����� �� ���� sort() �� �����ع���.
	 */
	for(int k : arr){
		vec.add(k);
	}
	return vec;
}
}





