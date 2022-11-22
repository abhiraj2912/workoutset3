import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    static int alen;
    static int [] arr;

    static boolean search(int a) throws IndexOutOfBoundsException{
        boolean IsFound=false;
        for(int i=0;i<alen;i++) {
            if(arr[i] == a){
                IsFound= true;
                break;
            }
        }
        return IsFound;
    }
    static void sort(int [] arr) throws IndexOutOfBoundsException{
        int temp =0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++)
                if(arr[i]<arr[j]) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        System.out.println("The Sorted Array");
        for (int i = 0; i < alen; i++)
            System.out.println(arr[i]);
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        alen= sc.nextInt();
        try {
            arr = new int[alen];
            System.out.println("Enter the elements");
            for (int i = 0; i < alen; i++)
                arr[i] = sc.nextInt();
            System.out.println("Enter the number to search");
            int x = sc.nextInt();

            if (search(x)) {
                System.out.println("Found");
            } else {
                System.out.println("Not Found");
            }


            sort(arr);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }

}
