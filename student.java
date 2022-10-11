class Student{
String name;
String clgname;
String branch;
int dateofbrith;
int rollno;

void studing(){
System.out.println(name+" "+clgname+" "+branch+" "+dateofbrith+" "+rollno+ " is  studing in jnnce");
}
public static void main(String args[]){
student shambhu=new student();
shambhu.name="Shambhu";
shambhu.clgname="JNNCE";
shambhu.branch="ECE";
shambhu.dateofbrith=29;
shambhu.rollno=17;
shambhu.studing();

}
}

