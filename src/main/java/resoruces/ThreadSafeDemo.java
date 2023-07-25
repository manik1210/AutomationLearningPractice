package resoruces;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class ThreadSafeDemo {
    public static void main(String[] args) {
        ThreadSafe threadSafe=new ThreadSafe();
        Map<Integer,String> map= new Hashtable<>();
        map.put(1,"Mani");
        map.put(2,"Raj");
        map.put(3,"MSD");
        map.put(4,"Robin");



        Thread thread1= new Thread(() ->{
            for(Map.Entry<Integer,String> entry: map.entrySet()){
                if(entry.getKey()==1){
                    System.out.println(entry.getValue());
                }
            }
            map.put(8,"Gpm");
            for(int i=0;i<1000;i++){
                threadSafe.increment();
            }
        });
        Thread thread2= new Thread(() ->{
            for(Map.Entry<Integer,String> entry: map.entrySet()){
                if(entry.getKey()==3){
                    System.out.println(entry.getValue());
                }
            }
            map.put(7,"Ramesh");

            for(int i=0;i<1000;i++){
                threadSafe.increment();
            }
        });
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(threadSafe.getCount());

    }
}
