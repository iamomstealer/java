import java.util.Scanner;
class palindrome
{
 public static void main(String args[])
 {
 int no,rev=0,r,temp;
 Scanner k=new Scanner(System.in);
 System.out.println("enter no");
 no=k.nextInt();
 temp=no;
 while(no>0)
 {
 r=no%10;
 no=no/10;

 rev=(rev*10)+r;
 }
 if(temp==rev)
 {
 System.out.println("number is palindrome");
 }
 else
 {
 System.out.println("number is not palindrome");
 }
 }
}
