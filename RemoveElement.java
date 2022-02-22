/*
* Problem 27 RemoveElement
* link: https://leetcode.com/problems/remove-element/
*  */

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
       int i;
       for(int j=0;j<nums.length;j++)
       {
           //if the array[i] equal to val skip the index 
           if(nums[j]!=val)
               nums[i++]=nums[j];
        }
        return i;
    }



}
