import java.util.*;
public class Reverbig
{
public static void main(String[] args)
{
Scanner r=new Scanner(System.in);
int p=r.nextInt();
int r1,sum=0,n;
while(n!=0)
{
r1=p%10;
sum=(sum*10)+r1;
n=p/10;
}
System.out.println(sum);
}
}
