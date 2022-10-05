import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minNum = 0;
        int maxNum = 100;
        Random random = new Random();
        int answerNum = random.nextInt(maxNum - minNum) + minNum;
        System.out.println(answerNum);
        while (true) {
            System.out.println("Please input a num (" + minNum + "-" + maxNum + ")");
            int guessNum = scanner.nextInt();
            if (answerNum == guessNum) {
                System.out.println("Yes! You are correct!");
                break;
            } else if (guessNum <= answerNum) {
                minNum = guessNum + 1;
            } else if (guessNum >= answerNum) {
                maxNum = guessNum - 1;
            }
        }
    }
}
