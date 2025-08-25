package TwoSum.LogicOnn;

public class TwoSumOnn {
	
	public static void main(String[] args) {
		int nums[] = {2, 1, 0, 6, 4};
		int target = 9;
		
		int[] result = findTwoNums(nums, target);
		
		if (result!= null) {
			System.out.println("pair found at indices " + result[0] + " and " + result[1]);
		}
		else {
			System.out.println("No pair found");
		}
		
	}

	private static int[] findTwoNums(int[] nums, int target) {
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i]+nums[j]==target) {
					return new int[] {i, j};
				}
			}
		}
		return null;
	}

}
