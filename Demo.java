import java.util.Scanner;
class Demo{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
System.out.println("enter the number");
int a=scan.nextInt();
System.out.println(a);
System.out.println("enter a Real number");
float b=scan.nextFloat();
System.out.println(b);
System.out.println("enter a Boolean value");
boolean c=scan.nextBoolean();
System.out.println(c);
System.out.println("enter a String");
scan.nextLine();
String d=scan.nextLine();
System.out.println(d);
}
}