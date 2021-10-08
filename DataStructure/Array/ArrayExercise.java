
// ######  1. 两数之和
// 最优解
public static int[] twoSum(int[] nums, int target) {
      HashMap<Integer, Integer> currentNums = new HashMap<>();
      for (int i = 0; i < nums.length; i++) {
          int i1 = target - nums[i];
          if (currentNums.containsKey(i1)) {
              Integer integer = currentNums.get(i1);
              return new int[]{integer, i};
          }
          currentNums.put(nums[i], i);
      }
      return new int[0];
}

// ######  53. 最大子序和
// 最优解
public int maxSubArrayA(int[] nums) {
      int res = nums[0];
      int sum = 0;
      for (int num : nums) {
          if (sum > 0)
              sum += num;
          else
              sum = num;
          res = Math.max(res, sum);
      }
      return res;
}

// ######  88. 合并两个有序数组
// 最优解
public void merge(int[] nums1, int m, int[] nums2, int n) {
for (int i = 0; i < nums2.length; i++) {
            nums1[m + i] = nums2[i];
        }
        Arrays.sort(nums1);
}


//自己理解，但数组过大 会超时
public static int maxSubArrayB(int[] nums) {
       if (nums == null || nums.length == 0) {
           return 0;
       }
       if (nums.length == 1) {
           return nums[0];
       }
       int maxNumSub = nums[0];
       for (int i = 0; i < nums.length; i++) {
           int currentSub = 0;
           for (int j = i; j < nums.length; j++) {
               currentSub += nums[j];
               maxNumSub = Math.max(maxNumSub, currentSub);
           }
       }
       return maxNumSub;
}


// ######  217. 存在重复元素
// 最易理解
public boolean containsDuplicateA(int[] nums) {
       Set<Integer> reult = new HashSet<Integer>();
       for(int i:nums){
           reult.add(i);
       }
       return reult.size() !=nums.length ;
}

// 效率高
public boolean containsDuplicateB(int[] nums) {
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
public boolean containsDuplicateC(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int x : nums) {
            if (!set.add(x)) {
                return true;
            }
        }
        return false;
}
