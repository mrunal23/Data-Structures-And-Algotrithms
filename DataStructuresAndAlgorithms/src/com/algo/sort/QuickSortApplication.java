/**
 * 
 */
package com.algo.sort;

/**
 * @author mrule
 *
 */
public class QuickSortApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {8,2,3,7,5,1,6};
		QuickSort(nums, 0, nums.length-1);
		for(int i : nums){
			System.out.print(i + "\t");
		}
	}

	public static int partition(int[] nums,int left,int right){
		
		int pivot = nums[(left + right) / 2];
		
		int leftIndex = left;
		int rightIndex = right;
		
		
		while(leftIndex <= rightIndex){
			while(nums[leftIndex]<pivot)				
				leftIndex++;
			
			while(nums[rightIndex]>pivot)				
				rightIndex--;
			
			if(leftIndex<=rightIndex){
				int temp = nums[leftIndex];
				nums[leftIndex] = nums[rightIndex];
				nums[rightIndex] = temp;
				leftIndex++;
				rightIndex--;
			}
		}
			
		return leftIndex;
	}
	
	public static void QuickSort(int[] nums,int left,int right){
		int partition = partition(nums,left,right);
		if(left<partition-1)
			QuickSort(nums, left, partition-1);
		if(right>partition)
			QuickSort(nums, partition, right);
	}
}
