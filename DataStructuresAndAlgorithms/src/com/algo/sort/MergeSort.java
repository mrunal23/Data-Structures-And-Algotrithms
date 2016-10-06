/**
 * 
 */
package com.algo.sort;

/**
 * @author mrule
 *
 */
public class MergeSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {4,8,1,3,5,9,11,5,6};
		mergeSort(nums, 0, nums.length);
		for(int i:nums){
			System.out.print(i + "\t");
		}
	}
	
	public static void mergeSort(int nums[], int left, int right){
		if(left<right){
			int middle = (left+right)/2;
			mergeSort(nums,left,middle);
			mergeSort(nums,middle+1,right);
			merge(nums,left,middle,right);
		}
	}

	public static void merge(int[] nums, int left, int middle, int right){
		int[] temp = new int[right-left];
		
		int li=left;
		int ri=middle;
		
		int i=0;
		
		while(li<middle && ri<right){
		
			if(nums[li]<nums[ri])
				temp[i++]=nums[li++];
			if(nums[li]>=nums[ri])
				temp[i++]=nums[ri++];
		
		}
		
		while(li<middle){
			temp[i++]=nums[li++];
		}
		while(ri<right){
			temp[i++]=nums[ri++];
		}
		int lefti=left;
		for(int j=0;j<temp.length;j++){
			nums[lefti++]=temp[j];
		}
	}
	
}
