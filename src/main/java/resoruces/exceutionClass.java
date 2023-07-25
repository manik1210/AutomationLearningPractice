package resoruces;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class exceutionClass {
    public static void main(String[] args) {
        DifferenceBetweenArrayListandLinkedList db= new DifferenceBetweenArrayListandLinkedList();

        //To demostrate the Static Variable uses
        System.out.println(DifferenceBetweenArrayListandLinkedList.a);


        //To demonstrate the ArrayList Implementation
        List<Integer> al= new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Numbers ");
        int n = sc.nextInt();
        System.out.print("Enter the numbers in ArrayList :");
        for(int i=0;i<n;i++){
            al.add(sc.nextInt());
        }

        System.out.println("The Elements in the ArrayList :"+al);


        //LinkedList
        List<Integer> ll= new LinkedList<>();




    }
}
