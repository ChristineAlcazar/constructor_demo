
public class constructor_demo {
    int [] arr;
    constructor_demo(int[] arr) {
     this.arr = arr;
    bubbleSort(arr);
    }
    public int getTheLargest(){
        int arrLength = arr.length - 1;
        return arr[arrLength];
    }
    public int getMedian(){
        int arrLength = arr.length -1;
        return arr[arrLength / 2];
    }
    public void bubbleSort(int []arr){
        int i;
        for (i = 0; i < arr.length - 1; ++i) {
            for (int j = 0; j < arr.length - i - 1; ++j) {
                if (arr[j] > arr[j + 1]) {
                    int hold = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = hold;
                }
            }
        }
        this.arr = arr;
    }
}
