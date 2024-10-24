import java.io.IOException;

public class Test1 {
    public static void main( String[] args) throws IOException
    {
        int x = 0;
   
       
         test(x);
    }
    
  
  public static void test(/*mv enter*/ int x /*mv exit*/) {
      int f;
      int g = 0;
      /*mv enter*/
      int y = 'c';     
      int z = y;
      int a = 0;
      
      z = y;
      
      if (x > y ) {
              a=y+z;
      } else {
          y = 123;
      }
  
      /*mv exit*/
      
      a=y+z;
      f = g;
  }
}
