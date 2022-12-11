public class Function_BinarySearch {

    public static int BinSearch (int numbers[], int key) {
        int start= 0;
        int end = numbers.length-1;
        

        while(start <= end) {
            int mid = ((start+end)/2);

            //Comparison
            if(key == numbers[mid]) {
                return mid;
            } else if (key > numbers[mid] ) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main (String args[]) {
        int numbers[] = {1,2,3,4,5,6,7,8,9}; //Array elements should be ina sorted manner
        int key = 8;

        System.out.println("The index is : "+ BinSearch (numbers,key));
    }

}
