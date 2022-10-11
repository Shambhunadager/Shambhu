class VariableAdd{
float a;
double b;
public static void main(String args[]){
char c;
c='1';
System.out.println("c: "+c); //10
VariableAdd test=new VariableAdd();
test.a=234.5f;
System.out.println(test.a);
System.out.println("test.a: "+test.a); //10
test.b=12.3;
System.out.println("test.b: "+test.b); //30

VariableAdd test1=new VariableAdd();
test1.a=20;
test1.b=50;
System.out.println(test1.a);
System.out.println("test1.a: "+test1.a);//20
System.out.println("test1.b: "+test1.b);//50
}
}