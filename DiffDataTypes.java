public class DiffDataTypes {
//easy
    void DataEasy(){
        int age=18;
        float height=4.5f;
        double mark=90.50;
        boolean human=true;
        char initial='P';
        String name="Aswinal";
        System.out.println("name : " +name);
        System.out.println("initial " +initial);
        System.out.println("height " +height);
        System.out.println("human "+human);
        System.out.println("mark  "+mark);
        System.out.println("age " +age);

    }

//medium
    void DataMed(){
        String name="Rossario";
        int age=12;
        float hei=3.2f;
        double mark=90.45;
        char grade='A';
        boolean res=true;
         System.out.println("name : " +name);
        System.out.println("age " +age);
        System.out.println("height " +hei);
        System.out.println("mark " +mark);
        System.out.println("grade " +grade);
        if(res==true){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

    }

//hard
    void DataHard(){
        int employee_id=22;
        String name="Aswinal";
        int age=23;
        double salary=23000.00;
        int Experience=5;
        String Gender="Female";
        boolean is_perm=true;
        System.out.println("employee id " +employee_id);
        System.out.println("employee name " +name);
        System.out.println("employee age " +age);
        System.out.println("salary " +salary);
        System.out.println("experience " +Experience);
        System.out.println("gender " +Gender);
        System.out.println("is the employee permanent " +is_perm);

    }
    public static void main(String[] args){
        DiffDataTypes ps=new DiffDataTypes();
        ps.DataHard();

    }
}
