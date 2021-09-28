// ######  217. 存在重复元素
// 最易理解
public boolean containsDuplicate(int[] nums) {
       Set<Integer> reult = new HashSet<Integer>();
       for(int i:nums){
           reult.add(i);
       }
       return reult.size() !=nums.length ;
}

// 效率高
public boolean containsDuplicate(int[] nums) {
       Arrays.sort(nums);
       int n = nums.length;
       for (int i = 0; i < n - 1; i++) {
           if (nums[i] == nums[i + 1]) {
               return true;
           }
       }
       return false;
}

// 易理解
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int x : nums) {
            if (!set.add(x)) {
                return true;
            }
        }
        return false;
    }
}
