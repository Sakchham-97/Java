import java.util.Scanner;

abstract class Student {
    
    String name;
    int roll;
    float marks;

// Constructor
Student(String n, int r, float m) {

    name = n;
    roll = r;
    marks = m;
}

abstract void attendclass();

abstract void giveexam();

abstract void payfee();
    
float getMarks() {

    return marks;
}

void displayInfo() {

    System.out.println("\n----- Student Information -----");
    System.out.println("Student Name : " + name);
    System.out.println("Roll Number  : " + roll);
    System.out.println("Marks        : " + marks);
    System.out.println("Grade        : " + gradecalculator(marks));
}

char gradecalculator(float a) {

    if (a > 90)
        return 'A';
    else if (a > 80)
        return 'B';
    else if (a > 70)
        return 'C';
    else if (a > 60)
        return 'D';
    else
        return 'F';
}

void absent(int i) {
    System.out.println("Absent days: " + (365 - i));
}
}

// Interface
interface libraryhelper {
    void addBook(String book);

    void displaybook();
}

// Child class
class StudentCEIV extends Student implements libraryhelper {

    String[] books = new String[100];
    int count = 0;

StudentCEIV(String name, int roll, float marks) {
    super(name, roll, marks);
}

@Override
void attendclass() {
    System.out.println(name + " is attending class.");
}

@Override
void giveexam() {
    System.out.println(name + " is giving exam.");
}

@Override
void payfee() {
    System.out.println(name + " has paid fee.");
}

@Override
public void addBook(String book) {

    books[count] = book;
    count++;
}

@Override
public void displaybook() {

    System.out.println("\n----- Borrowed Books -----");

    if (count == 0) {
        System.out.println("No books borrowed.");
    } else {

        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + books[i]);
        }
    }
}
}

// Main class
class OOP_Final {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String choice;

    do {

        // Student data input
        System.out.println("\n===== Enter Student Details =====");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        System.out.print("Enter Marks: ");
        float marks = sc.nextFloat();
        sc.nextLine();

        // Create student object
        StudentCEIV s1 = new StudentCEIV(name, roll, marks);

        // Book input loop
        String bookChoice;

        do {

            System.out.print("Enter Book Name: ");
            String book = sc.nextLine();

            s1.addBook(book);

            System.out.print("Add another book? (yes/no): ");
            bookChoice = sc.nextLine();

        } while (bookChoice.equalsIgnoreCase("yes"));

        // Attendance
        System.out.print("Enter attended days: ");
        int days = sc.nextInt();
        sc.nextLine();

        // Display all information
        s1.displayInfo();

        System.out.println("\nMarks Obtained: " + s1.getMarks());

        s1.attendclass();
        s1.giveexam();
        s1.payfee();
        s1.absent(days);
        s1.displaybook();

        // Ask for another student
        System.out.print("\nDo you want to enter another student? (yes/no): ");
        choice = sc.nextLine();

    } while (choice.equalsIgnoreCase("yes"));

    System.out.println("\nProgram Ended.");

    sc.close();
}
}