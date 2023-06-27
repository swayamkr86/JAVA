class WithoutStaticMethod{
    int sum(int a,int b){
       return a+b;
   }

public static void main(String[] args) {
        
       WithoutStaticMethod obj = new WithoutStaticMethod();
       int c = obj.sum(5,4);
       System.out.println(c);
   }
}
