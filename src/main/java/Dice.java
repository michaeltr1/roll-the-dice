public class Dice {
    //Lets generate some numbers
    public int roll() {
        int minValue = 1;
        int maxValue = 6;
//equation they told us to use
        int randomNumber = (int) (Math.random() * (maxValue - minValue + 1)) + minValue;

        return randomNumber;
    }

    public static void main(String[] args) {
        //Create dice objects
        Dice dice = new Dice();
        //Variables for both rolls
        int roll1;
        int roll2;

        //Counter for sums of answer
        int twoCounter = 0;
        int fourCounter = 0;
        int sixCounter = 0;
        int sevenCounter = 0;

        for (int i = 1; i <= 100; i++) {
            roll1 = dice.roll();
            roll2 = dice.roll();

            int sum = roll1 + roll2;

            System.out.println("Roll " + i + ": " + roll1 + " - " + roll2 + " Sum: " + sum);

            if (sum == 2) {
                twoCounter++;
            }
            if (sum == 4) {
                fourCounter++;
            }
            if (sum == 6) {
                sixCounter++;
            }
            if (sum == 7) {
                sevenCounter++;
            }
        }

        System.out.println("Number of 2s: " + twoCounter);
        System.out.println("Number of 4s: " + fourCounter);
        System.out.println("Number of 6s: " + sixCounter);
        System.out.println("Number of 7s: " + sevenCounter);
    }
}