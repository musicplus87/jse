package api01.lang.object;

public class EqualsDemo2 {
	public static void main(String[] args) {
		Person p1 = new Person("800101-1555555");
		Person p2 = new Person("800101-1555555");
		String result = "";
		result = (p1 == p2) ? "p1�� p2�� ���� ���" : "p1�� p2�� �ٸ� ���";
		System.out.println("(p1 == p2)�����:"+result);
		/*
		 * (p1 == p2)�����:p1�� p2�� �ٸ� ���
		 * ����� ���� == ��
		 * �ؽ��ڵ� �ּҰ��� ���Ѵ�
		 */
		result = (p1.equals(p2)) ? "p1�� p2�� ���� ���" : "p1�� p2�� �ٸ� ���";
		System.out.println("(p1.equals(p2))�����:"+result);
		/*
		 * (p1.equals(p2))�����:p1�� p2�� ���� ���
		 * ����� ���� equals()��
		 * ���� ���ͷ����� ���Ѵ�
		 */
		
	}

}
class Person{
	private String ssn;//�ֹι�ȣ
	public Person(String ssn){
		this.ssn = ssn;
	}
	//getter setter ����� ����Ű ALT+SHIFT+S
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Person){
			return ssn == ((Person)obj).ssn;
		}else{
			return false;
		}
		
	}
	
	// equals overriding hot-key
	// generate hashcode() and equals()�� �����Ѵ�.
	
}