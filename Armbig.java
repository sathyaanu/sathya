import java.util.*;
public class Armbig
{
public static void main(String[] args)
{
Scanner r=new Scanner(System.in);
int p=r.nextInt();
int r1,sum=0,n;
while(n!=0)
{
r1=p%10;
sum+=r1*r1*r1;
n=p/10;
}
if(p==sum)
{
System.out.println(sum);
}
else
{
System.out.println("Not armstrong");
}
}
}
