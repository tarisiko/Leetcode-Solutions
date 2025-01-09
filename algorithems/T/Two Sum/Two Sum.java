class Solution {
    final int MACHED_CODE = 0;
    final int UNMACHED_CODE = 1;;

    public int[] twoSum(int[] nums, int target) {
        int[] returnResult = new int[2];
        int sumResult = 0;

        int maxArrayindices = nums.length - 1;

        returnResult = sumEachNum(nums,target);
        return returnResult;
    }

    private static int[] sumEachNum(int[] array,int target){
        int[] result = new int[2];
        //nums = [2,7,11,15], target = 9
        int maxArrayindices = array.length -1 ;
        for(int i = 0; i < maxArrayindices; i++){
            for(int k = i + 1; k <= maxArrayindices; k++){
                int sumResult = array[i] + array[k];
                if(isSameTarget(sumResult,target)){
                    result[0] = i;
                    result[1] = k;
                    return result;
                }
            }
        }
        return result;
    }

    private static boolean isSameTarget(int sumValue,int targetnum){
        if (sumValue == targetnum) {
            return true;
        } else {
            return false;
        }
    }
}
