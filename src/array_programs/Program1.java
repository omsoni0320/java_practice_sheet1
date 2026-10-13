package array_programs;
import java.util.Scanner;
public class Program1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int total = 0;
        for(int i=0 ; i<arr.length; i++){
            arr[i] = sc.nextInt();
            total+= arr[i];
        }
        double avg = (double)total/n;
        System.out.println("Total: "+total);
        System.out.println("Average: "+avg);
    }
}
