import java.util.*;
public class Primebig
{
public static void main(String[] args)
{
Scanner f=new Scanner(System.in);
int a=f.nextInt();
int count=0;
for(int i=2;i<=a;i++)
{
if(a%i==0)
{
count++)
}
}
if(count==2)
{
System.out.println("Prime",a);
}
else
{
System.out.println("not prime");
}
}
}
