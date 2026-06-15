class AllVariable{
 //Global

static int a = 10;
       int b = 20;

  
 public static void main(String[]args){

//Local*******

 
  int c = 30;
  int a = 40;

 System.out.println("Statc A: "+AllVariable.a);

AllVariable ns = new AllVariable();

 System.out.println("Non-Static B: "+ns.b);

 System.out.println("Static A From Obj Ref.:"+ns.a);

 System.out.println("Local C: "+c);

 System.out.println("Local A: "+a);

}
}