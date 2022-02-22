public class RemoveDuplicate {
    public static void main(String[] args) {
        RemoveDuplicate r= new RemoveDuplicate();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4,4,7};
        int result=r.removeDuplicates(nums);
        System.out.println(result);
    }
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[i]!=nums[j])
            {
                nums[++i]=nums[j];

            }
        }
        return ++i;
    }
    }

