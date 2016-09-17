import java.util.*;
public class  Oddnumbig
{
public static void main(String[] args)
{
Scanner t=new Scanner(System.in);
int g=t.nextInt();
int n=t.nextInt();
int r;
if((g%2)!=0)
{
for(r=g;r<=n;r+=2)
{
System.out.println(r);
}
}
}
}
