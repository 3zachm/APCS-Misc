public class Insertion {
    public static void main(String[] args) {
        int[] og = new int[8];
        for (int i = 0; i < og.length; i++) {
            og[i] = (int)((Math.random()*100) + 1);
        }
        
        System.out.println(printArr(og));
        int[] sort = sort(og);
        //System.out.println(printArr(sort));
    }

    public static int[] sort(int[] arr) {
        int n; // "temporary" variable
        for (int i = 1; i < arr.length; i++) { // iterates through list forwards
            for (int j = i; j > 0; j--) { // iterates through list backwards until 0
                if(arr[j] < arr[j - 1]){ // if the number is less than what's below it--
                    n = arr[j]; // set temp variable equal to current number
                    arr[j] = arr[j - 1]; // set the current index to the one that was below it
                    arr[j - 1] = n; // set the 'below' index to the temp variable
                }
            }
            System.out.println(printArr(arr));
        }
        return arr;
    }

    public static String printArr(int[] array) {
        String rtn = "";
        for (int x : array) {
            rtn += x + " ";
        }
        return rtn;
    }
}
