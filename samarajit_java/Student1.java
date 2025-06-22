import java.util.Scanner;
public class Student1 {
 private String Roll_no;
 private String name;
 private String Clg_name;
 private String phone;
 private double percentage;
 public Student1(String Roll_no, String name, String Clg_name, String
phone, double percentage) {
 this.Roll_no = Roll_no;
 this.name = name;
 this.Clg_name = Clg_name;
 this.phone = phone;
 this.percentage = percentage;
 }
 public String getRno() {
 return Roll_no;
 }
 public String getName() {
return name;
 }
 public String getClg_nm() {
 return Clg_name;
 }
 public String getPhone() {
 return phone;
 }
 public double getPercentage() {
 return percentage;
 }
 public void printDetails() {
 System.out.println("Roll No: " + Roll_no);
 System.out.println("Name: " + name);
 System.out.println("College Name: " + Clg_name);
 System.out.println("Phone No: " + phone);
 System.out.println("Percentage: " + percentage);
 }
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter the number of students: ");
 int n = scanner.nextInt();
 scanner.nextLine(); // Consume the newline character
 Student1[] students = new Student1[n];
 for (int i = 0; i < n; i++) {

System.out.println("\nEnter details for Student1 " + (i + 1) + ":");
 System.out.print("Enter Roll No:: ");
 String Roll_no = scanner.nextLine();
 System.out.print("Enter Name: ");
 String name = scanner.nextLine();
 System.out.print("Enter College Name : ");
 String Clg_name = scanner.nextLine();
 System.out.print("Enter Phone: ");
 String phone = scanner.nextLine();
 System.out.print("Enter Percentage: ");
 double percentage = scanner.nextDouble();
 scanner.nextLine(); // Consume the newline character
 students[i] = new Student1(Roll_no, name, Clg_name, phone,
percentage);
 }
 System.out.println("\n--- Student Details ---");
 for (int i = 0; i < n; i++) {
 System.out.println("\nStudent1 " + (i + 1) + ":");
 students[i].printDetails();
 System.out.println("---");
 }
 scanner.close();
}
}