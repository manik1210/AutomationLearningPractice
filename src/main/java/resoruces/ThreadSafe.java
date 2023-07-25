package resoruces;

import java.util.HashMap;
import java.util.Map;

public class ThreadSafe {
     static int count=0;




    public synchronized void increment(){
        count++;
    }
    public int getCount(){
        return count;
    }

}

