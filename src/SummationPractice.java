import java.util.List;
import java.util.ArrayList;

public class SummationPractice {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> numsList = new ArrayList<>();

        numsList.add(10);
        numsList.add(20);
        numsList.add(30);
        numsList.add(40);
        numsList.add(50);

        int sumListResult = numsListSum(numsList);

        System.out.println("summation of the nums list is " + sumListResult);

    }

    public static int numsListSum(ArrayList<Integer> numbers) {
        int sum = 0;

        for (int num : numbers) {
            sum += num;

        }
        return sum;
    }

}
