class overloading
{
 void sum(int a,int b)
 {
 System.out.println(a+b);
 }
 void sum(int x,int y, int z)
 {
 System.out.println(x+y+z);
 }
 public static void main(String args[])
 {
 overloading k=new overloading();
 k.sum(3,8);
 k.sum(4,9,6);
 }
}