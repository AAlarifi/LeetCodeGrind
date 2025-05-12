import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashNum = new HashSet<>();
        for (int x : nums){
            if (hashNum.contains(x)) {
                return true;
            }
            hashNum.add(x);
        }
        return false;
    }
}