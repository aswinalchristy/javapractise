public class CommentLine {
    
     void CommentEasy() {
      System.out.println("Eamlak Rossario");//name
      System.out.println("SVCT");//college
   }

    void CommentMed() {
        /*printing the name standard and school name */
      System.out.println("Eamlak Rossario");
      System.out.println("1st Standard");
      System.out.println("DVM");
   }

    void CommentHard() {
      byte a= 12;
      byte b = 8;
      int area = a * b;//area formula
      int peri = 2 * (a + b);//perimeter formula
      System.out.println("area = " + area);//area output
      System.out.println("perimeter = " + peri);//perimeter output
   }

   public static void main(String[] var0) {
      CommentLine ps = new CommentLine();
      ps.CommentHard();
   }
}

