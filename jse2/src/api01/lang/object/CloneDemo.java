package api01.lang.object;
import java.util.Arrays;

public class CloneDemo {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		int[] arr2 = arr.clone();
		System.out.println("for loop ���� �迭�� ���...Ȯ��");
		for(int i=0;i<arr2.length;i++){
			System.out.print(arr[i]+"\t");
		}
		System.out.println("==============");
		System.out.println("Arrays �� ���");
		System.out.println("arr �� ������ :" + Arrays.toString(arr));
		System.out.println("arr2 �� ������ :" + Arrays.toString(arr2));
		
	}

}
