public class SearchInArray {
    public static void main(String[] args) {

        int[] array_one = {11, 23, 342, 44, 5, 20, 45};
        int[] array_two = {1, 5, 13, 20, 55, 66, 242, 64432};
        printMaxValue(array_one);
        int key = 20;
        int position = binarySearch(array_two, key);
        System.out.println(key + " position is " + position);
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

}
