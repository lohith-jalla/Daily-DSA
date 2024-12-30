import java.util.*;

public class SecondMaxElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int max=a[0];
        int Smax=a[0];
        for(int i:a){
            if(i>max) {
                Smax=max;
                max=i;
            }
            if(i<max && i>Smax) {
                Smax=i;
            }
        }
        System.out.println("The Second Largest Element is: "+Smax);
    }
}
