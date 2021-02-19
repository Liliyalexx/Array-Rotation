
class RotateArray { 
	
public void rotate(int[] nums, int k) {
    		if(k > nums.length) 
       			k=k%nums.length;
 		int[] result = new int[nums.length];
 		for(int i=0; i < k; i++){
        			result[i] = nums[nums.length-k+i];
 		}
 		int j=0;
    		for(int i=k; i<nums.length; i++){
        			result[i] = nums[j];
j++;
    		}
 		System.arraycopy( result, 0, nums, 0, nums.length );
}
} 
public class Main
{
	public static void main(String[] args) {
		RotateArray r = new RotateArray();
        		int arr[] = { 1, 2, 3, 4, 5, 6, 7 }; 
        		r.rotate(arr, 5); 
        		for(int i=0;i<arr.length;i++){
            			System.out.print(arr[i]+" ");
        		}
	}
}
class Solution {
	  public void rotate(int[] nums, int k) {
	    k %= nums.length;
	    reverse(nums, 0, nums.length - 1);
	    reverse(nums, 0, k - 1);
	    reverse(nums, k, nums.length - 1);
	  }
	  public void reverse(int[] nums, int start, int end) {
	    while (start < end) {
	      int temp = nums[start];
	      nums[start] = nums[end];
	      nums[end] = temp;
	      start++;
	      end--;
	    }
	  }
	}

