class parameter
{
 int value1;
 int value2;
 parameter(int v1,int v2)
 {
 value1=v1;
 value2=v2;
 }
 void display()
 {
 System.out.println("value1 is :"+value1);
 System.out.println("value2 is :"+value2);
 }
 public static void main(String args[])
 {
 parameter t=new parameter (10,20);
 t.display();
 }
}
