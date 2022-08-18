public class containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        if (nums.length==1 || nums==null){
            return false;
        }
        for (int i=0;i< nums.length;i++){
            int k=nums[i];
            for (int g=i+1;g< nums.length;g++){
                if (nums[g]==k)return true;
            }
        }
        return false;
    }


}
