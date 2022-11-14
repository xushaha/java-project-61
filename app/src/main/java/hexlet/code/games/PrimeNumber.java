package hexlet.code.games;
import hexlet.code.Engine;

public class PrimeNumber {

    public static void gamePrimeNumber() {

        int correctCount = 0;

        while (correctCount < 3) {

            int questionPrimeNumber = (int) (Math.random() * 98 + 2);
            System.out.println("Question: " + questionPrimeNumber);

            String primeNumberUserAnswer = Engine.getUserAnswerString();
            System.out.println("Your answer: " + primeNumberUserAnswer);
            boolean primeNumberCorrAnswer = Engine.isPrimeNumber(questionPrimeNumber);
            String primeNumberAnswer = (primeNumberCorrAnswer) ? "yes" : "no";


            if (primeNumberAnswer.equals(primeNumberUserAnswer)) {
                System.out.println("Correct!");
                correctCount++;
                if (correctCount == 3) {
                    Engine.gameResultWin();
                }
            } else {
                System.out.println("'" + primeNumberUserAnswer + "' is wrong answer ;(. Correct answer was '"
                        + primeNumberAnswer + "'.");
                Engine.gameResultLoss();
                break;
            }
        }



    }
}