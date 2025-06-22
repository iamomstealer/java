class exception
{
 public static void main(String args[])
 {
 int a=10, b=5, c=5, x, y=0;
 try
 {
 x=a/(b-c);
 }
 catch (ArithmeticException e)
 {
 System.out.println("Divide by zero =>"+e);
 }
 finally
 {
 System.out.println("This is the finally block");
 y=a/(b+c);
 System.out.println("y is"+y);
 }
 }
}
