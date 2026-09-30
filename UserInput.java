//easy
// import java.util.Scanner;

// public class UserInput {
//     public static void main(String[] args){

//         Scanner scanner=new Scanner(System.in);

//         System.out.println("Enter your Name  ");
//         String name=scanner.nextLine();

//         System.out.println("Enter your age  ");
//         int age=scanner.nextInt();

//         System.out.println("Name : "+name);
//         System.out.println("Age : "+age);
//         scanner.close();
//     }

// }

//medium
// import java.util.Scanner;

// public class UserInput {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         System.out.print("Enter Student Name: ");
//         String name = scanner.nextLine();

//         System.out.print("Enter Maths Mark: ");
//         int maths = scanner.nextInt();

//         System.out.print("Enter Science Mark: ");
//         int science = scanner.nextInt();

//         System.out.print("Enter English Mark: ");
//         int english = scanner.nextInt();

//         int total = maths + science + english;
//         double average = total / 3.0;

//         System.out.println("\nName: " + name);
//         System.out.println("Total Marks: " + total);
//         System.out.println("Average: " + average);

//         scanner.close();
//     }
// }


//hard
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = scanner.nextInt();

        System.out.print("Enter Maths Mark: ");
        int maths = scanner.nextInt();

        System.out.print("Enter Physics Mark: ");
        int physics = scanner.nextInt();

        System.out.print("Enter Chemistry Mark: ");
        int chemistry = scanner.nextInt();

        int total = maths + physics + chemistry;
        double average = total / 3.0;

        System.out.println("\n------ MARK SHEET ------\n");
        System.out.println("Name      : " + name);
        System.out.println("Roll No   : " + rollNo);
        System.out.println();
        System.out.println("Maths     : " + maths);
        System.out.println("Physics   : " + physics);
        System.out.println("Chemistry : " + chemistry);
        System.out.println();
        System.out.println("Total     : " + total);
        System.out.println("Average   : " + average);

        scanner.close();
    }
}
