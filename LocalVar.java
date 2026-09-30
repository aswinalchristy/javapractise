public class LocalVar {
//easy
    void calculate(){
        int a=10;
        int b=20;
        int sum=a+b;
        System.out.print("sum= " +sum);
    }

//medium
    void CalculateMark(){
        int english=80;
        int maths=70;
        int science=85;
        int total=english+maths+science;
        float avg=total/3f;
        System.out.println("total marks : " +total);
        System.out.println("average : " +avg);
    }
    
//hard
    void CalculateBill(){
        int  Item_1 = 500;
        int Item_2 = 750;
        int Item_3 = 250;
        int total = Item_1+Item_2+Item_3;
        float dis=total/10f;
        float final_amt =total-dis;
        System.out.println("Total : "+total);
        System.out.println("Discount : "+dis);
        System.out.println("Final Amount : "+final_amt);
    }

    public static void main(String[] args){
        LocalVar ps=new LocalVar();
        ps.CalculateBill();
    }
}
