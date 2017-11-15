package test.lambdas;

import java8.lambdas.TimingUtils;

import java.util.Arrays;

public class TimingTests {
    public static void main(String[] args){
        for(int i = 3; i < 8; i++){
            int size = (int)Math.pow(10, i);
            System.out.printf("Sorting array of length %,d.%n", size);
            TimingUtils.timeOp(() -> sortArray(size));
        }
    }

    private static void sortArray(int length) {
        double[] nums = randomNums(length);
        Arrays.sort(nums);
    }

    private static double[] randomNums(int lenght){
        double[] nums = new double[lenght];
        for(int i = 0; i < lenght; i++){
            nums[i] = Math.random();
        }
        return nums;
    }
}
