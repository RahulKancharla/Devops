public class Index {
    public static void main( String[] args)
    {

        int[] nums={1,1,2,4,5,6,4};
        int val=1;
        int a=removeElement(nums,val);
        System.out.println(a);
    }
    public static int removeElement(int[] nums, int val) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==val)
            {
                nums[i]= 0;
                count++;
            }
        }
        return count;
    }
}
