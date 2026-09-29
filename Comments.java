//easy
class Comments{
    void CommentEasy(){
        //my name 
        System.out.println("Eamlak Rossario");
        //my college
        System.out.println("SVCT");

    }
    void CommentMed(){
        /*assigning values */
        /*name*/ 
        System.out.println("Eamlak Rossario");
        /* standard*/
        System.out.println("1st Standard");
        /*school name */
        System.out.println("DVM");
    }
    void CommentHard(){
        int length=12;
        int width=8;
        int area=length*width;
        int perimeter=(2*(length+width));
        System.out.println("area = " +area);
        System.out.println("perimeter = " +perimeter);

    }
    
    public static void main(String[] args){
        Comments ps=new Comments();
        ps.CommentEasy();

    }

}

//medium
