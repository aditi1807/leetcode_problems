//fibonacci using Dynamic Programming

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Fibonacci{
    static int[] arr;
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    arr=new int[5];
    Arrays.fill(arr,-1);
    arr[0]=0;
    arr[1]=1;
    System.out.println(fibonacci(n));
    
}
public static int fibonacci(int n){
        if(n==0)
        return arr[0];
        if(n==1)
        return arr[1];
        else{
            if(arr[n-1]==-1 && arr[n-2]==-1)
            {
                arr[n-1]=fibonacci(n-1);
                arr[n-2]=fibonacci(n-2);
            }
            else if(arr[n-1]==-1)
            arr[n-1]=fibonacci(n-1);
            else if(arr[n-2]==-1)
            arr[n-2]=fibonacci(n-2);
            else{

            }
            return arr[n-1]+arr[n-2];
        }
    }
}
