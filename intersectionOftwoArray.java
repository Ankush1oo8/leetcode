import java.util.*;
public class intersectionOftwoArray {
    public int[] intersection(int[] nums1, int[] nums2){
       HashSet<Integer>map=new HashSet<>();
       ArrayList<Integer>ans=new ArrayList<>();

       for(int i=0;i<nums1.length;i++){
        map.add(nums1[i]);
       }
       for(int i=0;i<nums2.length;i++){
        if(map.contains(nums2[i])){
            ans.add(nums2[i]);
            map.remove(nums2[i]);
        }
       }
       int arr[]=new int[ans.size()];
     for(int i=0;i<ans.size();i++){
        arr[i]=ans.get(i);
     }
     return arr;
    }
    public static void main(String args[]){
        
    }
    
}