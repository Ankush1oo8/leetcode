import java.util.HashMap;

public class minLenofStrAfterOperations {

    public int minimumLength(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch:s.toCharArray()){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        int length=0;
        for(char ch:map.keySet()){
            if(map.get(ch)%2==0){
                length+=2;
            }else{
                length++;
            }
        }
        return length;
    }

}
