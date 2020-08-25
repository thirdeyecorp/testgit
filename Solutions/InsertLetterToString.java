
public class InsertLetterToString {

	public static int solution(String s) {
		int acnt = 0;
		int maxins = 0;
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == 'a') {
				if (acnt == 2) {
					return -1;
				}
				acnt++;

			} else {
				if (acnt == 0)
					maxins += 2;
				else {
					if (acnt == 1)
						maxins++;
				}
				acnt = 0;
			}
		}

		if (s.charAt(s.length() - 1) != 'a') {
			maxins += 2;
		} else if (s.charAt(s.length() - 1) == 'a' && s.charAt(s.length() - 2) != 'a') {
			maxins++;
		}

		return maxins;
	}

	public static void main(String[] args) {
		String s1 = "aabab";
		String s2 = "dog";
		String s3 = "aa";
		String s4 = "baaa";
		String s5 = "aaba";

		String s6 = "x";// 4
		String s7 = "xa";// 3
		String s8 = "ax";// 3
		String s9 = "aax";// 2
		String s10 = "xaa";// 2
		String s11 = "xaxaa";// 3
		String s12 = "aaxax";// 3
		String s13 = "xxxxx";// 12
		String s14 = "xaxaxaa";// 4
		String s15 = "aaxaa";// 0
		String s16 = "xxaaxxaaa";// -1
		String s17 = "xxaaxxa";// 7

		System.out.println(solution(s1));
		System.out.println(solution(s2));
		System.out.println(solution(s3));
		System.out.println(solution(s4));
		System.out.println(solution(s5));
		System.out.println(solution(s6));
		System.out.println(solution(s7));
		System.out.println(solution(s8));
		System.out.println(solution(s9));
		System.out.println(solution(s10));
		System.out.println(solution(s11));
		System.out.println(solution(s12));
		System.out.println(solution(s13));
		System.out.println(solution(s14));
		System.out.println(solution(s15));
		System.out.println(solution(s16));
		System.out.println(solution(s17));
	}

}
