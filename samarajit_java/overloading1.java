class overloading1
{
 void sum(int a,int b)
 {
 System.out.println(a+b);
 }
 void sum(double x,double y)
 {
 System.out.println(x+y);
 }
 public static void main(String args[])
 {
 overloading1 k=new overloading1();
 k.sum(11,20);
 k.sum(4.2,9.6);
 }
}
