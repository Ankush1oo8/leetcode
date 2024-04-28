/**
 * reachTheNumber
 */
public class reachTheNumber {

    public int reachNumber(int target) {
        int tar=Math.abs(target);
        int sum =0,steps=0;
        while(sum<tar){
            sum+=steps;
            steps++;
        }
        while((sum-tar)%2==1){
            sum+=steps;
            steps++;
        }
        return steps-1;
        }
}