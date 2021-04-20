package leetcode.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {
	 public static int[] twoSum(int[] nums, int target) {
		 int[] sum = new int[2];
		 Map<Integer, Integer> map = new HashMap<>();
		 for(int n = 0; n < nums.length; n++) {
			 int diff = target - nums[n];
			 if(map.containsKey(diff)) {
				 sum[0] = map.get(diff);
				 sum[1] = n;
			 } else {
				 if(!map.containsKey(nums[n]))
				   map.put(nums[n], n); 
			 }
		 }
		 return sum;  
	 }
	 
	 public static void main(String[] args) {
		int[] nums = {2,7,11,15};
		int target = 9;
		System.out.println(Arrays.toString(twoSum(nums, target)));
	}
}
