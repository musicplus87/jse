package Api02.util.stringTokenize;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
	public static void main(String[] args) {
		StringTokenizer tok = new StringTokenizer("Hello Java");
		while (tok.hasMoreTokens()) {
			String token = tok.nextToken();
			System.out.println("\t" +token); //   \t�� ��Ű�� ��Ÿ��.
		}
	
	}

}
