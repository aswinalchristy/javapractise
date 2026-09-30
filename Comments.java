//easy
class Comments{
    void CommentEasy(){
        //my name 
        System.out.println("Eamlak Rossario");
        //my college
        System.out.println("SVCT");

    }
//medium
    void CommentMed(){
        /*assigning values */
        /*name*/ 
        System.out.println("Eamlak Rossario");
        /* standard*/
        System.out.println("1st Standard");
        /*school name */
        System.out.println("DVM");
    }
//hard
    void CommentHard(){
        int length=12;//declare length
        int width=8;//declare width
        int area=length*width;//formula for calculating area of rectangle
        int perimeter=(2*(length+width));//formula for calculating perimeter of the rectangle
        System.out.println("area = " +area);//printing the caculated result
        System.out.println("perimeter = " +perimeter);//printing the calculated result

    }
    
    public static void main(String[] args){
        Comments ps=new Comments();
        ps.CommentEasy();

    }

}

