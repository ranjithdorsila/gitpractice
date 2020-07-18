import java.util.Scanner;

public class Swayamvar {

    public static void main(String[] args) {
 
    Scanner sc=new Scanner(System.in);
    
       int n=sc.nextInt();
       String p=sc.next();
       String m=sc.next();
       int prc=0;
       int pmc=0;
       int mrc=0;
       int mmc=0;
       for(int i=0;i<n;i++)
       {
    	   if(p.charAt(i)=='r')
    		   prc++;
    	   else
    		   pmc++;
    	   if(m.charAt(i)=='r')
    		   mrc++;
    	   else
    		   mmc++;
       }
       int sum=0;
        if(prc>mrc)
        	sum=sum+(prc-mrc);
        else
        	sum=sum+(mrc-prc);
        if(pmc>mmc)
        	sum=sum+(pmc-mmc);
        else
        	sum=sum+(mmc-pmc);
        System.out.println(sum);
    }

}