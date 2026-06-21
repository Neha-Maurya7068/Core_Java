class VariableStatic {

//Global***********

 static int a = 10;
 public static void main(String[]args){

//Local Variable****

  int a= 20;
  int b = 30;
  
System.out.println("Local:" +a);
System.out.println("Static:" +VariableStatic.a); //10
System.out.println(b);//

}
}
