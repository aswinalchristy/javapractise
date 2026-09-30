//easy
// public class InsStaVar {
//         int age;
//         String name;

//         static String college="SVCT";

//         public static void main(String[] args){
//             InsStaVar student1=new InsStaVar();
//             student1.name="Ravi";
//             student1.age=18;

//             InsStaVar student2=new InsStaVar();
//             student2.name="Ravi";
//             student2.age=19;

//             System.out.println("Name : "+student1.name);
//             System.out.println("age : "+student1.age);
//             System.out.println("college : "+student1.college);
//             System.out.println("Name : "+student2.name);
//             System.out.println("age : "+student2.age);
//             System.out.println("college : "+student2.college);

//     }

// }

//medium
// public class InsStaVar {
//     String name;
//     double salary;

//     static String company = "TechCorp";

//     public static void main(String[] args) {
//         InsStaVar emp1 = new InsStaVar();
//         emp1.name = "Alice";
//         emp1.salary = 55000.00;

//         InsStaVar emp2 = new InsStaVar();
//         emp2.name = "Bob";
//         emp2.salary = 62000.00;

//         InsStaVar emp3 = new InsStaVar();
//         emp3.name = "Charlie";
//         emp3.salary = 48000.00;

//         System.out.println("Name: " + emp1.name + " | Salary: $" + emp1.salary + " | Company: " + company);
//         System.out.println("Name: " + emp2.name + " | Salary: $" + emp2.salary + " | Company: " + company);
//         System.out.println("Name: " + emp3.name + " | Salary: $" + emp3.salary + " | Company: " + company);
//     }
// }

//hard
public class InsStaVar {
    String accountHolder;
    double balance;

    static String bankName = "State Bank";

    public static void main(String[] args) {
        InsStaVar acc1 = new InsStaVar();
        acc1.accountHolder = "aswi";
        acc1.balance = 1000.00;

        InsStaVar acc2 = new InsStaVar();
        acc2.accountHolder = "raji";
        acc2.balance = 2500.00;

        InsStaVar acc3 = new InsStaVar();
        acc3.accountHolder = "boomi";
        acc3.balance = 5000.00;

        // Perform Deposit & Withdrawal directly
        acc1.balance = acc1.balance + 500.00;
        acc2.balance = acc2.balance - 300.00;
        acc3.balance = acc3.balance + 1000.00;

        // Display details
        System.out.println("Bank: " + bankName + " | Holder: " + acc1.accountHolder + " | Balance: $" + acc1.balance);
        System.out.println("Bank: " + bankName + " | Holder: " + acc2.accountHolder + " | Balance: $" + acc2.balance);
        System.out.println("Bank: " + bankName + " | Holder: " + acc3.accountHolder + " | Balance: $" + acc3.balance);
    }
}