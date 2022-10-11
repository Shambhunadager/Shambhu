class Flower{
String name;
String colour;
int noofpetals;

void sheddingfragance(){

System.out.println(colour+" "+name+"is sheddingfragrance......!");
}
void blooming(){

System.out.println(colour+" "+name+" is blooming.....!");
}
public static void main(String args[]){

flower rose=new flower();

rose.name="rose";
rose.colour="red";
rose.noofpetals=12;
rose.blooming();
rose.sheddingfragance();
}
}
