public class Sum {

    public static int sumNumericalDigit(int number) {
        int sum = 0;
        int i = 0;

        while (number / (Math.pow(10, i)) != 0) {
            i++;
        }

        for (int j = 0; j <= i; j++) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
