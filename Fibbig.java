import java.util.*;
public class Fibbig
{
public static void main(String[] args)
{
Scanner y=new Scanner(System.in);
int n=y.nextInt();
int n3;
int n1=-1;
int n2=1;
while(n3<=n)
{
n3=n1+n2;
System.out.println(n3);
n1=n2;
n2=n3;
}
}
}
