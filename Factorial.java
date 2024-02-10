class Factorial{
   
 

   public static int findFactorialNumber(int factorialNumber){
   int fact = 1;
   for(int f = 1; f <= factorialNumber ; f++){
        fact = f*fact;
		System.out.println(fact);
   }
   return fact;
   }
}
