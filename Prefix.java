import java.util.*;
public class Prefix
{
public static void main(String ar[])throws Exception
{
Scanner sc=new Scanner(System.in);
int u,j;
u=sc.nextInt();
String a[]=new String[100];
for(int i=0;i<u;i++)
{
a[i]=sc.next();
}
String long,check;
if(a.length>0)
long=a[0];
for(int i=1;i<a.length;i++)
{
check=a[i];
for(j=0;j<Math.min(long.length(),a[i].length());j++)
{
if(long.charAt(j)!=check.charAt(j))
break;
}
long=a[i].subString(0,j);
}
System.out.println("longest prefix is:"+long);
}
}
