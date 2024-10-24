import sequencedjava.*;
import java.io.IOException;

public class Test1 {
 static TimeMap allTime = new TimeMap(new Temporal());

    public static void main( String[] args) throws IOException
    {
        int x = 0;
   
        
        test(allTime,x);
    }
    
      
  public static void test(TimeMap timeMap,int x) {
      
      SequencedInteger y = new SequencedInteger(timeMap,0);
      
      SequencedInteger z = new SequencedInteger(timeMap,0);
      
      SequencedInteger a = new SequencedInteger(timeMap,0);
      
      
      a.assign(allTime,z.add(allTime,y));
  }
}
