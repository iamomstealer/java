class multi3 implements Runnable
{
 public void run()
 {
 System.out.println("therad is running");
 }
 public static void main(String args[])
 {
 multi3 m1=new multi3();
 Thread t1=new Thread(m1);
 t1.start();
 }
}
