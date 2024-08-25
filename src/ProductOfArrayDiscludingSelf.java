/**
 * Leetcode: 238
 */
public class ProductOfArrayDiscludingSelf {
    public static int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] prefix = new int[len];
        int[] postfix = new int[len];

        int[] res = new int[len];

        prefix[0] = nums[0];
        postfix[len-1] = nums[len-1];

        for(int i=1; i<len; i++){
            prefix[i] = prefix[i-1] * nums[i];
        }

        for(int j=len-2; j>=0; j--){
            postfix[j] = postfix[j+1] * nums[j];
        }

        for(int k=0; k<len; k++){
            if(k==0)
                res[k]= postfix[k+1];
            else if(k==len-1)
                res[k]= prefix[k-1];
            else
                res[k] = postfix[k+1] * prefix[k-1];
        }
        return res;
    }



    public static void main(String[] args) {
        productExceptSelf(new int[]{1,2,3,4});
    }
}
