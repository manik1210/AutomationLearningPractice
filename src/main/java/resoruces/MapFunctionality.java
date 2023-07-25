package resoruces;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;


public class MapFunctionality {
    public static void main(String[] args) {

        //HashMap Demonstration
        Map<Integer,String> map= new HashMap<>();
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            map.put(sc.nextInt(),sc.next());
        }
        System.out.println(map);

        //HashTable
        Map<Integer,String> hashTable = new Hashtable<>();
        for (int i=0;i<n;i++) {
            hashTable.put(sc.nextInt(),sc.next());
        }
        System.out.println(hashTable);
        for(Map.Entry<Integer ,String> entry  : hashTable.entrySet()){
            if(entry.getKey()==3){
                System.out.println("Matching set"+hashTable.values());
            }

        }


    }
}
