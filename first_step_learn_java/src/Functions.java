public class Functions {
    public static void main(String[] args) {

//        double getAverageValue(int [] array)
//        void printArrayToConsole(int[] array)
//        void printCurrentTimeToConsole()
//        double sum (double a, double b)

        int[] array = {1, 2, 5, 8, 13, 21};
        printArrayToConsole(array);
        double sum = 0.0;
        sum = sumDouble(1.0, 3.9);
        System.out.println(sum);

    }

    static double sumDouble(double a, double b) {
        double sum = a + b;
        return sum;
    }

    static void printArrayToConsole(int[] arrayToPrint) {
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.println(arrayToPrint[i]);
        }
    }
}
