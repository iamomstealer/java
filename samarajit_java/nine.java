class nine
{
 void display()
 {
 System.out.println("welcome");
 }
}
class b extends nine
{
 void display1()
 {
 System.out.println("to");
 }
}
class multilevel extends b
{
 void display2()
 {
 System.out.println("India");
 }
 public static void main(String args[])
 {
 multilevel k=new multilevel();
 k.display();
 k.display1();
 k.display2();
 }
}
//run java mulyilevel
