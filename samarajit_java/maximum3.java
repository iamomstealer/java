import java.util.Scanner;
class maximum3
{
 public static void main(String args[])
 {
 int a,b,c;
 Scanner k=new Scanner(System.in);
 System.out.println("enter a");
 a=k.nextInt();
 System.out.println("enter b");
 b=k.nextInt();
 System.out.println("enter c");
 c=k.nextInt();
 if(a>b&&a>c)
 {
 System.out.println("a is maximum");
 }
 else if(b>c)
 {
 System.out.println("b is maximum");
 }
 else
 {
 System.out.println("c is maximum");
 }
 }
}
