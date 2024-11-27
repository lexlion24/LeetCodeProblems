package BasicLeetCode.TwoSum;

import java.util.HashMap;
import java.util.Map;

public class Solucion2TwoSum {
     public static void main(String[] args) {
         int[] nums = {2, 7, 11, 15}; // Ejemplo de datos
         int target = 9; // Ejemplo de target
         int[] result = twoSum(nums, target);
         System.out.println(result[0]+"," +result[1]);

     }

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapa = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complemento = target - nums[i];
            if (mapa.containsKey(complemento)) {
                return new int[]{mapa.get(complemento), i};
            }
            mapa.put(nums[i], i);
        }
        return new int[0];
    }
}
