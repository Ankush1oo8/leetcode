import java.util.*;
public class maxRrctangle {
    public int maximalRectangle(char[][] matrix) {
        if( matrix.length==0) return 0;
        int height[]=new int[ matrix[0].length];
        int largest=0;
        for(int i=0;i< matrix.length;i++){
            for(int j=0;j< matrix[0].length;j++){
                int val=( matrix[i][j]-'0');
                if(val==0){
                    height[j]=0;

                }else{
                    height[j]+=val;
                }
            
            }
                int maxArea=largestRectangleArea(height);
            if(largest<maxArea){
                largest=maxArea;
            }
           
        }
         return largest;
    }
     public int largestRectangleArea(int[] heights) {
        if(heights.length==0){
            return 0;
        }
        Stack<Integer>stack=new Stack<>();
        int n=heights.length;
        int max=0;
        for(int i=0;i<=n;i++){
            int element=(i==n)?0:heights[i];
            while(!stack.isEmpty() && heights[stack.peek()]>element){
                int h=heights[stack.pop()];
                int ps=(stack.isEmpty())?-1:stack.peek();
                int w=i-ps-1;
                max=Math.max(max,h*w);
            }
            stack.push(i);
        }
        return max;
    }
}
