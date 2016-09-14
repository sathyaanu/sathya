import java.util.*;
class Was
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int count=0;
int j=0;
for(int i=2;i<=n;i++)
{
if(n%i==0)
{
count++;
}
if(count==2)
{
j++;
}
}
System.out.println(j);
}
