package api01.lang.string;
/*
 * java.lang.String �� �ִ� �޼ҵ� ��
 * toUpperCase() : �빮�ڷ� �ٲٱ�
 * trim() : ������ ��� �����ϴ� ��
 * valueOf() : �ٸ� Ÿ���� ��� ���ڿ��� ����
 */
public class ValueOfDemo {
	public static void main(String[] args) {
		String str = "Hello Java   ";
		String result = "";
		result = str.toUpperCase();
	// toUpperCase() : �빮�ڷ� �ٲٱ�
		System.out.println("toUpperCase() �� ��� :"+ result);
		//DB�� ���� ��ҹ��ڸ� �����ϴ� DB�� �ִµ�
		//�̷� ��� ��ҹ��ڸ� �������� �ʰ� �ڹٴܿ��� DB������
		//DB�� ���� ������ ��� �ɰ��� ������ �߻���Ų��.
		//�׶� ����ϴ� �޼ҵ��̴�.
		result = str.toLowerCase();
		System.out.println("toUpperCase() �� ��� :"+ result);
		
		result = str.trim();
		System.out.println("trim()�� ���:"+result);
		int num;
		num = str.trim().indexOf("J");
		System.out.println("trim() �� ����� ���");
		num = str.indexOf("J");
		System.out.println("trim() �� ������� ���� ���"+num);
		System.out.println("===valueOf �޼ҵ� ���===");
		/*
		 * valueOf() �� ���ڿ��� �����ϱ� ������
		 * Wrapper Ŭ������ ��üĳ������ ������ �����Ѵ�.
		 */
		String str2 = "Hello Java";
		result = String.valueOf(str2.length());
		System.out.println(result);
	}

}
