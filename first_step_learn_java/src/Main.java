public class Main {
    public static void main(String[] args) {

        int quizzesCompleted = 0;
        for (int i = 0; i < 5; i++) {
            quizzesCompleted++;
        }
        System.out.println(quizzesCompleted);

        int trainingsPassed1 = 0;
        while (trainingsPassed1 < 10) {
            if (trainingsPassed1 == 7) {
                break;
            }
            trainingsPassed1++;
        }
        System.out.println(trainingsPassed1);


        int trainingsPassed = 0;
        while (trainingsPassed < 10) {
            trainingsPassed++;
        }
        System.out.println(trainingsPassed);


        int a = 5;
        int b = a;
        System.out.println(a + b);

        byte byteValue = 127;
        System.out.println(byteValue);

        int sum = (a + b) + byteValue;
        System.out.println(sum);

        double c = 4.20;
        double t = 4.455;
        System.out.println(c + t);

        int[] array = {2, 3, 4, 5, 6};
        System.out.println(array[3]);
        System.out.println(array[0]);
        array[0] = 56;
        System.out.println(array[0]);

        char firstSymbol = 'h';
        String text = "Hello  Java";
        System.out.println(firstSymbol);
        System.out.println(text);

        int num_1 = 2;
        int num_2 = 6;
        System.out.println(num_1);
        System.out.println(num_2);

        if (num_1 > num_2) {
            System.out.println("num_1 > num2");
        } else {
            System.out.println("num1 < num2");
        }

        int monthNumbar = 5;
        switch (monthNumbar) {
            case 1:
                System.out.println("Jan");
            case 2:
                System.out.println("Feb");
            case 3:
                System.out.println("Mart");
            case 4:
                System.out.println("April");
            default:
                System.out.println("Can't find the month");


        }
    }
}