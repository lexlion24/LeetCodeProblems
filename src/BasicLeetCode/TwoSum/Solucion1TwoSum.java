package BasicLeetCode.TwoSum;

public class Solucion1TwoSum {
     public static void main(String[] args) {
         int[] nums = {2, 7, 11, 15}; // Ejemplo de datos
         int target = 9; // Ejemplo de target
         int[] result = twoSum(nums, target);
         System.out.println(result[0]+"," +result[1]);
     }

    private static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i<nums.length -1; i++ ){
            for(int j = i + 1; j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[0];
    }
}
