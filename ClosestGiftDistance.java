/**
problem :-
      You are on your way to find the gifts. All the gifts lie in your path in a straight line at prime
numbers and your house is at 0.
Given your current position find the closest gift to your position, and calculate the distance
between your current position and gift and tell the distance.
*/



import java.util.Scanner;

 public class ClosestGiftDistance{

   /**
      @purpose :- to get the nearest before and after prime no. of a given number.
      @return :- nearest prime no. based on distance of up and down prime no.
   */
   static int nearestPrime(int n){

     int upPrime, dnPrime, i;

     if(n < 2){
       return 2;
     }
     upPrime = n;

     while(true){
         i=isPrime(upPrime);
         if(i==0)
         break;
         upPrime++;
       }`
     dnPrime = n-1;
     while(true){
         i=isPrime(dnPrime);
         if(i==0)
         break;
         dnPrime--;
      }

     if((n - dnPrime) < (upPrime - n))
     return dnPrime;
     else
     return upPrime;
  }

  /**
    validate given no. is prime or not
  */
  static int isPrime(int num){

        int primeFlag = 0;
        try{
          if(num==2){
          primeFlag = 0;
          }else{
              for(int i = 2; i<num/2; ++i)
              {
                  if(num%i == 0)
                  {
                      ++primeFlag;
                      break;
                  }
              }
          }
        }catch(Exception e){
          System.err.println("Exception is isPrime " + e);
        }
        return primeFlag;
    }

   static void calculateDistance(int givenNum, int nearestPrime){

      int distance = Math.abs(givenNum - nearestPrime);
      System.out.println("nearest gift distance "+ distance);
   }

   static void findClosestGiftDistance(){

     Scanner in = new Scanner(System.in);
     System.out.println("Enter number");
     try{
       int num = in.nextInt();
       if(num < 0){
         throw new Exception();
       }
       calculateDistance(num, nearestPrime(num));
     }catch(Exception e){
       System.out.println(" Enter Only positive number ");
       findClosestGiftDistance();
     }
   }
   public static void main(String[] args){

       findClosestGiftDistance();
   }
 }
