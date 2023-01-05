
public class WhileFor {
    public static void main(String[] args) {

        int limit = 10;
        int startNum = 0;
        boolean statement = true;
        System.out.println("while: ");
        while (startNum < limit) {
            System.out.println(startNum);
//            startNum = startNum + 1;
            startNum++;
        }

//        do {
//            //
//        }while (statement);

        System.out.println("for: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("Print Array:");
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        for (int i = 0; i <= 100; i++) {
            System.out.println(array[i]);
        }

    }
}
