import java.util.Scanner;

class Fibonacci {
    public static void main(String args[]) {
        int a = 0, b = 1, c, no;
        Scanner k = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        no = k.nextInt();

        System.out.println("Fibonacci series up to " + no + ":");
        System.out.print(a + " " + b + " ");
        
        c = a + b;
        
        while (c <= no) {
            System.out.print(c + " ");
            a = b;
            b = c;
            c = a + b;
        }
        
        k.close(); 
    }
}
