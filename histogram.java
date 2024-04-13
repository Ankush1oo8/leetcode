import java.util.*;

class histogram {
    public int largestRectangleArea(int[] heights) {
        if (heights.length == 0) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        int n = heights.length;
        int max = 0;
        for (int i = 0; i <= n; i++) {
            int element = (i == n) ? 0 : heights[i];
            while (!stack.isEmpty() && heights[stack.peek()] > element) {
                int h = heights[stack.pop()];
                int ps = (stack.isEmpty()) ? -1 : stack.peek();
                int w = i - ps - 1;
                max = Math.max(max, h * w);
            }
            stack.push(i);
        }
        return max;
    }

}