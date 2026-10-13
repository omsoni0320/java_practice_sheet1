package array_programs;
import java.util.Scanner;
public class Program2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the arr:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count_even =0 ,count_odd =0;
        System.out.println("Enter the elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i] += sc.nextInt();
            if(arr[i]%2 == 0) count_even+=1;
            else count_odd+=1;
        }
        System.out.println("Even: "+count_even);
        System.out.println("Odd: "+count_odd);
    }
}