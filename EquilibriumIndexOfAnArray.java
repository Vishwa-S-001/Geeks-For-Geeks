import java.util.*;
class Gfg
{
    public static void main(String[] args) {
        int[] a= {0,1,2,3};
        int sum1=0,sum2=0;
        for(int i: a) sum1+=i;
        boolean flag=false;
        for(int i=0;i<a.length;i++)
        {
            sum1-=a[i];
            if(sum1==sum2)
            {
                flag=true;
                System.out.println("The equilibrium index is : "+i);
                break;
            }
            sum2+=a[i];
        }
        if(!flag) System.out.println("There is no equilibrium point in an array (-1)");
    }
}