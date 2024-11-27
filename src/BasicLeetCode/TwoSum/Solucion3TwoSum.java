package BasicLeetCode.TwoSum;

public class Solucion3TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15}; // Ejemplo de datos
        int target = 9; // Ejemplo de target
        int[] result = twoSum(nums, target);
        System.out.println(result[0] + "," + result[1]);
    }

    public static int[] twoSum(int[] nums, int sum) {
        int[] pair = new int[2];
        for (int i=0; i < nums.length - 1; i++) {
            pair[0] = i;
            int ret = bs(nums, sum-nums[i], i+1 , nums.length - 1);
            if (ret != -1) {
                pair[1] = ret;
                break;
            }
        }
        return pair;
    }

    private static int bs(int[] nums, int targetNum, int startIdxInclusive, int endIdxInclusive) {
        if (endIdxInclusive < startIdxInclusive) {
            return -1;
        } else if (endIdxInclusive == startIdxInclusive) {
            if (nums[endIdxInclusive] == targetNum) {
                return endIdxInclusive;
            } else {
                return -1;
            }
        } else if (nums[endIdxInclusive] == targetNum) {
            return endIdxInclusive;
        } else if (nums[startIdxInclusive] == targetNum) {
            return startIdxInclusive;
        }

        int midIdx = (startIdxInclusive + (endIdxInclusive - startIdxInclusive) / 2);

        if (nums[midIdx] < targetNum) {
            return bs(nums, targetNum, midIdx + 1, endIdxInclusive);
        } else if (nums[midIdx] > targetNum) {
            return bs(nums, targetNum, startIdxInclusive, midIdx - 1);
        } else {
            return midIdx;
        }
    }
}

