import java.util.Arrays;

public class BreakChain {
	
	public static void main(String[] args) {
		int[] chain = {2,-1,4,1,3,3,2,1,3,1,2,3,2,1,2,-1,1,2,3};
		int minimumEffort = solution2(chain);
		System.out.println("Minimum Effort Required to break the chain is "+minimumEffort);
		
	}
	
	/* This is the best solution to problem , with least complexity and memory requirements */
	public static int solution2(int[] chain) {

		int minimumWeight = 0;
		int weight1 = 0;
		int weight2 = 0;
		int minWeight = 0;

		for (int i = 1; i < chain.length - 2; i++) {
			weight1 = chain[i];
			minWeight = chain[i + 2];
			
			for (int j = i + 2; j < chain.length - 1; j++) {
				
				weight2 = chain[j];
				if (weight2 < minWeight)
					minWeight = weight2;

			
			}
			if (minimumWeight > (weight1 + minWeight)||i==1) {
				minimumWeight = weight1 + minWeight;
			}

		}

		return minimumWeight;
	}
	

}
//012345678
