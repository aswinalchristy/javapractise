//easy
public class Implicit {
    void easy(){
        int a=500;
        double b=a;
        System.out.println(a);
        System.out.println(b);

    }

//medium
    void Med(){
        int len=20;
        int bred=15;
        int area=len*bred;
        double Area=area;
        System.out.println(area);
        System.out.println(Area);
    }

//hard
    void Hard(){
        int basicSalary = 25000;
        int bonus = 5000;
        int total=basicSalary+bonus;
        double tot=total;
        double bon=tot+(basicSalary * 0.05);
        System.out.println(tot);
        System.out.println(bon);

    }

    public static void main(String[] args){
        Implicit ps=new Implicit();
        ps.Hard();
    }
}

