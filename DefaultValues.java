public class DefaultValues {

// Primitive Datatype

byte a;
short b;
int c;
long d;


float e;
double f;

boolean g;
char ch;

//Non-Primitive Datatype

String s;


public static void main(String[]args){

DefaultValues df = new DefaultValues();

System.out.println("Primitive Datatypes************!!");
System.out.println("Byte a: "+df.a);
System.out.println("Short b: "+df.b);
System.out.println("Int c: "+df.c);
System.out.println("Long d: "+df.d);

System.out.println("Float e: "+df.e);
System.out.println("Double f: "+df.f);
System.out.println("Boolean g: "+df.g);
System.out.println("Char ch: "+df.ch);//

System.out.println("Default value of char: " + df.ch);//

System.out.println("Non-Primitive Datatypes************!!");
System.out.println("Byte s: "+df.s);
System.out.println("Default Value !!");//
}
}