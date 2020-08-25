
public class AngryFrog {

	public static int solution(int startindex, int[] blocks) {
		int indexFrog1 = 0;
		int indexFrog2 = 0;

		for (int i = startindex; i < blocks.length - 1; i++) {
			if (blocks[i + 1] >= blocks[i]) {
				indexFrog1 = i + 1;
			} else {
				break;
			}
		}

		if (startindex > 0) {
			for (int i = startindex; i > 0; i--) {
				if (blocks[i - 1] >= blocks[i]) {
					indexFrog2 = i - 1;
				} else {
					break;
				}
			}
		} else {
			indexFrog2 = 0;
		}

		return (indexFrog1 - indexFrog2) + 1;

	}

	public static void main(String[] args) {
		int[] blocks = { 1, 5, 5, 2, 6 };
		int distance = solution(3, blocks);
		System.out.println(distance);

		int[] blocks1 = { 2, 6, 8, 5 };
		distance = solution(0, blocks1);
		System.out.println(distance);

		int[] blocks3 = { 1, 1 };
		distance = solution(0, blocks3);
		System.out.println(distance);
	}

}
