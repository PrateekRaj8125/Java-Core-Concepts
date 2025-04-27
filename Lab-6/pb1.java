import java.util.*;
public class pb1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=4;
        int[] arr=new int[n];
        System.out.print("\nEnter 4 numbers in array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        try {
            System.out.print("Element at index "+n+":"+arr[n]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception in thread \"main\"");
            System.out.println("java.lang.ArrayIndexOutOfBoundsException:"+n);
        }
    }
}
