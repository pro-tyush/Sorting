package Heap;

import java.util.ArrayList;
import java.util.Scanner;

public class MinHeap {
    ArrayList<Integer> arr=null;
    MinHeap()
    {
        arr=new ArrayList<>();
    }

    public void insert(int val)
    {
        arr.add(val);
        int last=arr.size()-1;
        int pi=(arr.size()-1)/2;
        while (last>0)
        {
            if(arr.get(pi)>arr.get(last))
            {
                int temp=arr.get(pi);
                arr.set(pi,arr.get(last));
                arr.set(last,temp);
            }
            last=pi;
            pi=(last-1)/2;
        }
        System.out.println(arr);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        MinHeap m=new MinHeap();
        while (n>0)
        {
            m.insert(scan.nextInt());
            n--;
        }

    }
}
