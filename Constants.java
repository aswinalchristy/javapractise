public class Constants {
//easy
    void easy(){
        final double PI = 3.14;
        int radius=5;
        double circle=PI*radius*radius;
        System.out.println("The area of the circle is : " +circle);
    }

//medium
    void med(){
        final int week=7;
        final int hours=24;
        int tot=week*hours;
        System.out.println("The total number of hours in one week : "+tot);
    }

//hard
    void hard(){
        final double units_price = 8.5;
        final double tax= 0.05;
        final int units=150;
        double basic=units*units_price;
        double Taxamt=basic*tax;
        double bill=basic+Taxamt;
        System.out.println("basic bill : "+basic);
        System.out.println("tax : "+Taxamt);
        System.out.println("final bill : "+bill);

    }

    public static void main(String[] args){
        Constants ps=new Constants();
        ps.hard();
    }
}
