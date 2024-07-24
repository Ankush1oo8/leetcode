import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class uniqueNumOccuerence {
    
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:arr){
        map.put(i,map.getOrDefault(i,0)+1);
        }
         HashSet<Integer> hashSet = new HashSet<>();
        boolean flag = true;
        for (Map.Entry<Integer, Integer> mapElement : map.entrySet()){
            if (!hashSet.add(mapElement.getValue())){
                flag = false;
            }
        }
        return flag;
    }

}
