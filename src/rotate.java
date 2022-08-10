import java.util.Arrays;

public class rotate {
    public static void rotate(int[] nums, int k) {
        int mod=nums.length;
        int[] num=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            int j=(i+k)%mod;
            num[j]=nums[i];
        }
        for (int i =0;i<nums.length;i++){
            nums[i]=num[i];
        }
    }
    public static void reverse(int[] nums,int start,int end){
        int k=(end-start+1)/2;
        for(int i=start;i<start+k;i++){
            int temp=nums[i];
            nums[i]=nums[end];
            nums[end]=temp;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(nums));
        reverse(nums,0,4);
        System.out.println(Arrays.toString(nums));
    }
}
