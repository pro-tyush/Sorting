package hashmaps;

import java.util.HashMap;
import java.util.Map;

public class CountFrequency {
    public static void main(String[] args) {
        int[]arr = {3,5,4,3,2,2,1};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }else{
                hm.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> e:hm.entrySet()){
            System.out.println("Occurence of "+e.getKey()+" = "+e.getValue());
        }
        for(Integer x:hm.keySet()){
            if(hm.get(x)<=1){
                System.out.println("Unique elements are = "+x);
            }
    }
}}
