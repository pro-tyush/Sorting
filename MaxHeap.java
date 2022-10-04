package Heap;


import java.util.ArrayList;
import java.util.Scanner;

public class MaxHeap {
    ArrayList<Integer> arr=null;
    MaxHeap()
    {
        arr=new ArrayList<>();
    }

    public void insert(int val)
    {
        arr.add(val);
        int last=arr.size()-1;
        int pi=arr.size()/2;
        while (last>0)
        {
            if(arr.get(pi)<arr.get(last))
            {
                int temp=arr.get(pi);
                arr.set(pi,arr.get(last));
                arr.set(last,temp);
            }
            last=pi;
            pi=last/2;
        }
        System.out.println(arr);
    }
    public int remove()
    {
        if(arr.size()==0)
        {
            return -1;
        }
        int val=arr.get(0);
        int value=arr.remove(arr.size()-1);
        arr.set(0,value);
        int pi=0,li=2*pi+1,ri=2*pi+2;
        while (li<arr.size())
        {
            int pp=pi;
            if(arr.get(li)>arr.get(pp))
            {
                pp=li;
            }

            if(ri<arr.size()&&arr.get(pp)<arr.get(ri))
            {
                pp=ri;
            }

            if(pp!=pi)
            {
                int temp=arr.get(pi);
                arr.set(pi,arr.get(pp));
                arr.set(pp,temp);
            }else
            {
                break;
            }
            System.out.println(arr+" "+pi+" "+pp);
            pi=pp;
            li=2*pi+1;
            ri=2*pi+2;
        }

        return val;
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        MaxHeap m=new MaxHeap();
        while (n>0)
        {
            m.insert(scan.nextInt());
            n--;
        }
        System.out.println(m.remove());
        System.out.println(m.remove());
        System.out.println(m.remove());
    }
}
