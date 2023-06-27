class WithoutStaticMethod2{
    int multiply(int a,int b){
       return a*b;
   }
   double multiply(double a,double b){
        return  a*b;
   }

public static void main(String[] args) {

       WithoutStaticMethod2 obj = new WithoutStaticMethod2();
       int c = obj.multiply(5,4);
       double d = obj.multiply(5.1,4.2);
       System.out.println("Mutiply method : returns integer : " + c);
       System.out.println("Mutiply method : returns double : " +  d);

}
}
