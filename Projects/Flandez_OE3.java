import java.util.Scanner;
import java.util.Arrays;

public class Flandez_OE3 {

    public static void AscSort(int[] array){
        Arrays.sort(array);
        System.out.println("\nAll Array elements in Ascending order: ");
        for(int i = 0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }

    public static void main(String[] args){

        Scanner sn = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sn.nextInt();

        int arr[] = new int[size];

        for(int x=0; x<size; x++){
        System.out.print("Enter the array values [" + (x+1) + "]:");
        arr[x] = sn.nextInt();
        }

        int max = Arrays.stream(arr).max().getAsInt();
        System.out.print("\nThe Highest Element in the array is "+max);

        int min = Arrays.stream(arr).min().getAsInt();
        System.out.print("\nThe Lowest Element in the array is "+min);

        int sum = 0;

        System.out.print("\nAll Elements in the array: ");
        for(int x = 0; x < size; x++){
            System.out.print(arr[x]+" ");
            sum = sum+arr[x];
        }

        AscSort(arr);

        System.out.print("\nThe Sum of all the Elements of the array is: "+sum);
    }
    
}