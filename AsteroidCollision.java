import java.util.Stack;

public class AsteroidCollision {

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int num : asteroids) {
            if (stack.isEmpty() || num > 0) {
                stack.push(num);
            } else {
                while (!stack.isEmpty()) {
                    if (stack.peek() < 0) {
                        stack.push(num);
                        break;
                    }
                    int modVal = Math.abs(num);
                    if (modVal == stack.peek()) {
                        stack.pop();
                        break;
                    } else if (stack.peek() > modVal) {
                        break;
                    } else {
                        stack.pop();
                        if (stack.isEmpty()) {
                            stack.push(num);
                            break;
                        }
                    }
                }
            }
        }
        int[] arr = new int[stack.size()];
        int i = arr.length - 1;
        while (!stack.isEmpty()) {
            arr[i] = stack.pop();
            i--;
        }
        return arr;
    }

}
