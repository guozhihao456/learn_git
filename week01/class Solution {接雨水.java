class Solution {
    public int trap(int[] height) {
        Stack<Integer> stack = new Stack();
        int res = 0;
        for (int i = 0 ; i < height.length ; i++){
            while(!stack.isEmpty() && height[i] > height[stack.peek()]){
                int top = stack.pop();
                if(stack.isEmpty()) {
                    break;
                }

                int hei = Math.min(height[i] , height[stack.peek()]) - height[top];  
                int wid = i - stack.peek() - 1 ;

                int t = hei*wid;
                res = res + t;
            }
            stack.push(i);
        }

        return res;
    }
}