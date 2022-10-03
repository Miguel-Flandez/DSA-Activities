import java.util.Scanner;
import java.util.Arrays;

public class Flandez_OE4{

    public static void pause() {
        System.out.println("\nPress enter to continue. . .");
        Scanner s = new Scanner(System.in);
        s.nextLine();
    }

    public static void main(String [] args){

        Scanner sn = new Scanner(System.in);

        do{
        System.out.print("\033[2J\033[H");
        System.out.print("\nEnter the size of the array: ");
        int size = sn.nextInt();

        int array[] = new int[size];

        for(int x=0; x<size; x++){
            System.out.print("\nEnter the array elements [" + (x+1) + "]:");
            array[x] = sn.nextInt();
            }
        
        int sum = 0;

        System.out.print("\nAll Elements in the array: ");
        for(int x = 0; x < size; x++){
            System.out.print(array[x]+" ");
            sum = sum+array[x];
            }

        int menu, ctr = 0;
            System.out.println("\n\nChoose sorting method");
            System.out.println("\n[1] Bubble Sort");
            System.out.println("[2] Insertion Sort");
            System.out.println("[0] Exit");
            menu = sn.nextInt();

            int counter = 0;

            switch(menu){
                case 1:{
                    int shrt = array.length;
                    int temp = 0;
            
                    for(int x = 0; x < shrt; x++){
                        for(int y = 1; y < (shrt-x); y++){
                            counter++;
                            if(array[y-1]>array[y]){
                                temp = array[y-1];
                                array[y-1] = array[y];
                                array[y] = temp;
                            }
                        }
                    }

                    System.out.print("\nSorted array list using bubble sort: ");
                    //bubbleSort(array, ctr);
                    for(int x = 0; x< array.length; x++){
                    System.out.print(" "+ array[x]);
                    }
                    System.out.print("\nNumber of iterations (bubble sort): "+counter);
                    pause();
                    break;
                }
                case 2:{
                    int shrt = array.length;

                    for(int x = 0; x<shrt; x++){
                        int k = array[x];
                        int y = x - 1;
            
                        while((y > -1) && (array[y]>k)){
                            counter++;
                            array[y+1] = array[y];
                            y--;
                        }
                        array[y + 1] = k;

                    }
                    System.out.print("\nSorted array list using insertion sort: ");
                    //insertionSort(array);
                    for(int x = 0; x< array.length; x++){
                        System.out.print(" "+ array[x]);
                    }
                    System.out.print("\nNumber of iterations (insertion sort): "+counter);
                    pause();
                    break;
                }
                case 0:{
                    System.out.print("Leaving Program . . .");
                    pause();
                    return;
                }
                default:{
                    System.out.println("Wrong input! ! !");
                    pause();
                }
            }
        }while(true);
    }
}