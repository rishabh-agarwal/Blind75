import java.util.HashSet;
import java.util.Set;

public class DuplicateInteger {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int i: nums){
            if(!set.add(i))
                return true;
        }
        return false;
    }
}
