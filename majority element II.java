class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int num1 = Integer.MAX_VALUE, num2 = Integer.MAX_VALUE, count1 = 0, count2 = 0, len = nums.length;

	for (int n : nums) {

		if (n == num1) count1++;

		else if (n == num2) count2++;

		else if (count1 == 0) {
			num1 = n;
			count1 = 1;
} else if (count2 == 0) {
			num2 = n;
			count2 = 1;

		} else {
			count1--;
			count2--;
		}
	}
	count1 = 0;
	count2 = 0;
        for (int n : nums) {
		if (n == num1) count1++;
		if (n == num2) count2++;
	}

	List<Integer> result = new ArrayList<>();

	if (count1 > len / 3)
		result.add(num1);
	if (count2 > len / 3)
		result.add(num2);
        return result;
    }
    
}
