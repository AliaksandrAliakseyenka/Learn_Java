public class SearchInArray {
    public static void main(String[] args) {

        int[] array_one = {11, 23, 342, 44, 5, 20, 45};
        int[] array_two = {1, 5, 13, 20, 55, 66, 242, 64432};
        int[] array_no_sort = {23, 43, 55, 21442, 213, 2342, 6, 32, 42, 256, 24235, 654, 464, 2423423, 4341434, 567};
        int key = 20;

        System.out.println("printMaxValue: ");
        printMaxValue(array_one);

        System.out.println("binarySearch: ");
        binarySearch(array_two, key);

        System.out.println("bubbleSort: ");
        bubbleSort(array_no_sort);
    }

    static void printMaxValue(int[] array) {

        int max = array[0];
        int maxIndex = 0;
        int comparisions = 0;
        int replacements = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
                replacements++;
            }
            comparisions++;
        }
        System.out.println("Max element: " + max);
        System.out.println("Max element index: " + maxIndex);
        System.out.println("Comparisons: " + comparisions);
        System.out.println("Replacements: " + replacements);
    }

    static int binarySearch(int[] array, int key) {

        int position = 0;
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == key) {
                System.out.println("Key found");
                return middle;
            }
            if (array[middle] < key) {
                System.out.println("cut left half");
                left = middle + 1;
            }
            if (array[middle] > key) {
                System.out.println("Cut right half");
                right = middle - 1;
            }
        }
        return -1;
    }

    static void bubbleSort(int[] array) {
        int comparisonsDone = 0;
        int swapsDone = 0;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    System.out.println("Swap " + array[i] + " and " + array[i + 1]);
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapsDone++;
                    sorted = false;
                } else {
                    System.out.println("No need to change elements " + i + " and " + (i + 1));
                }
                comparisonsDone++;
            }
        }
        System.out.println("Array size = " + array.length);
        System.out.println("Comparisons done = " + comparisonsDone);
        System.out.println("Swaps done = " + swapsDone);
    }


}
