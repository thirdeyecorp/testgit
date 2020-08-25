
public class JohnCasino {

	public static int solution(int N, int K) {

		int minimumGames = 0;
		
		N = N - 1;
		
		minimumGames = 1;

		while (K > 0 && N > 1) {

			if (N % 2 > 0) {

				N = N / 2;

				K--;

			} else {

				N = N - 1;

			}

			minimumGames++;
		}

		return minimumGames + N - 1;
	}

	public static void main(String[] args) {

		System.out.println(solution(100, 3));
		System.out.println(solution(18, 2));
		System.out.println(solution(10, 10));
		System.out.println(solution(8, 0));
		System.out.println(solution(7, 0));
		System.out.println(solution(6, 0));
		System.out.println(solution(0, 0));
		System.out.println(solution(100, 4));
		System.out.println(solution(5, 1));
		System.out.println(solution(5, 2));		
		System.out.println(solution(10, 4));
		System.out.println(solution(10, 3));
		System.out.println(solution(10, 2));
		System.out.println(solution(10, 1));		
		System.out.println(solution(5, 0));

	}

}
