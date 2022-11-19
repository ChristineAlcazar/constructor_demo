public class Main {

    public static void main(String[] args) {
        int[] arr = {18,23,56,20,4,100,1};

        constructor_demo myObj = new constructor_demo(arr);
        int largest = myObj.getTheLargest();
        int median = myObj.getMedian();

        System.out.println("The largest value: "+ largest);
        System.out.println("The Median value: "+ median);
    }
}
