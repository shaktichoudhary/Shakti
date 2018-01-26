/**
Problem :-
        Given an array of numbers, arrange them in a way that yields the largest value. For example, if
the given numbers are {54, 546, 548, 60}, the arrangement 6054854654 gives the largest value.

*/



import java.util.*;
public class FormLargest{

  private static String largestNumber(int[] nums) {

      if(nums == null || nums.length < 1){
        return "Invalid Data";
      }
      // Get input integers as strings.
      String[] asStrs = new String[nums.length];
      for (int i = 0; i < nums.length; i++) {
          asStrs[i] = String.valueOf(nums[i]);
      }

      // Sorting using compareTo.
      Arrays.sort(asStrs, new Comparator<String>(){
      public int compare(String a, String b){
          return (b+a).compareTo(a+b);
      }
  });

      // If after  sorting, the largest number is `0`, the entire number is zero.
      if (asStrs[0].equals("0")) {
          return "0";
      }

      // Build largest number from sorted array.
      String largestNumberStr = new String();
      for (String numAsStr : asStrs) {
          largestNumberStr += numAsStr;
      }

      return largestNumberStr;
  }

  private static int[] getData(){

    Scanner in = new Scanner(System.in);
    System.out.println(" enter the no. of elements ");
    int[] a = null;
    try{
      int size = in.nextInt();
      a = new int[size];
      System.out.println(" enter the elements ");
      for(int i = 0; i < size; i++){
        a[i] = in.nextInt();
      }
      return a; // return the array with user input values
    }catch(Exception e){
      System.out.println(" please enter positive Integer value ");
    }
    return getData(); // handle the exception and reinitiate the process
  }

  public static void main(String[] arg){

    System.out.println("largestNumber "+largestNumber(getData()));
  }
}
