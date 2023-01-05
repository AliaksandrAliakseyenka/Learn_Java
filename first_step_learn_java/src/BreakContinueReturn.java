public class BreakContinueReturn {
    public static void main(String[] args) {

        int[] array = {1, 2, 5, 8, 13, 21};

        for (int i = 0; i <= 5; i++) {
            System.out.println("Cycle #:" + i + " start");
            System.out.println(array[i]);
            if (array[i] == 8) {
                System.out.println("Find 8");
//                continue;
//                return;
//                break;
            }
            System.out.println("Cycle #:" + i + " finish");
        }

    }

}
