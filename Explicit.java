public class Explicit {
//easy
    void easy(){
        double number = 25.75;
        double number1 = (int)25.75;
        System.out.println(number);
        System.out.println(number1);

    }

//medium
    void med(){
        double price = 99.99;
        double quantity = 3.0;
        double total=price+quantity;
        double tot=(int)total;
        System.out.println(total);
        System.out.println(tot);
    }


//hard
    void hard(){
        double totalMarks = 456.75;
        double subjects = 5.0;
        double average=totalMarks/subjects;
        double avg=(int)average;
        System.out.println(totalMarks);
        System.out.println(average);
        System.out.println(avg);

    }
    public static void main(String[] args){
        Explicit ps=new Explicit();
        ps.hard();

    }
}
