public class SearchInArray {
    public static void main(String[] args){
        int[] array_one = {11,23,342,44,5,20,45};
        int[] array_two = {112,324,43534,123,55,24,242,64432};

        printMaxValue(array_two);
    }

    static void printMaxValue (int[] array) {
        int max = array[0];
        int maxIndex = 0;
        int comparisions = 0;
        int replacements = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i]>max){
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
}
