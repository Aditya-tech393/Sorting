import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int []arr={2,1,4,3,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void bubble(int[]arr){
        boolean swapped;
        //run the steps N-1 times
        for (int i=0;i<arr.length;i++){
            swapped=false;
            // For each step, max item will come at the respective index
            for (int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
}
