import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];

        for(int i=0; i<nums.length; i++){
            int secondVal = target - nums[i];
            if(map.containsKey(secondVal)){
                res[0] = i;
                res[1] = map.get(secondVal);
            }
            map.put(nums[i], i);
        }
        Arrays.sort(res);
        return res;
    }
}
