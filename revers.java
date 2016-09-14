import java.io.*;
import jav.util.*;
public class Reverse
{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String s1=new StringBuffer(s).reverse().toString();
System.out.println(s1);
String s2=s1.replace("a","");
s2=s2.replace("e","");
s2=s2.replace("i","");
s2=s2.replace("o","");
s2=s2.replace("u","");
System.out.println(s2);
}}
