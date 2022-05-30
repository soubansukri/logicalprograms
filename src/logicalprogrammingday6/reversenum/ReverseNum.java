package logicalprogrammingday6.reversenum;

public class ReverseNum {
	public static void main(String args[])
	   {
	      int num=886788678;
	      int reverseNum =0;
	      while( num != 0 )
	      {
	          reverseNum = reverseNum * 10;
	          reverseNum = reverseNum + num%10;
	          num = num/10;
	      }

	      System.out.println("Reverse of specified number is: "+reverseNum);
	   }
}
