import java.util.Arrays;

public class boatssavePeople {
      public int numRescueBoats(int[] people, int limit) {
        int l=0;
        int r=people.length-1;
        int boats=0;
        Arrays.sort(people);
        while(l<=r){
            if(people[r]+people[l]<=limit){
                boats++;
                l++;
                r--;
            }else{
                boats++;
                r--;
            }

        }
        return boats;
    }
}
