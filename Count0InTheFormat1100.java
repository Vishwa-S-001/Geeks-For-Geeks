import java.util.Scanner;
public class Count0InTheFormat1100 {
    private static int count(int[] a)
    {
        if(a[a.length-1]==1) return 0;
        if(a[0]==0) return a.length;
        int count=0;
        for(int i : a)
        {
            if(i==0) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        
        int[] a= {1,1,1,1,0,0,0,0,0,0,0};
        int r=count(a);
        System.out.println("The no. of zeroes in the array is: "+r);
    }
}
