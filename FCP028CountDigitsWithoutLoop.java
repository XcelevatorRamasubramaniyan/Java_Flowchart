import java.util.Scanner;
public class FCP028CountDigitsWithoutLoop{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int num=s.nextInt();

if(num>=1000000)
System.out.println(7);
else if(num>=100000)
System.out.println(6);
else if(num>=10000)
System.out.println(5);
else if(num>=1000)
System.out.println(4);
else if(num>=100)
System.out.println(3);
else if(num>=100)
System.out.println(2);
else 
System.out.println(1);
}}
