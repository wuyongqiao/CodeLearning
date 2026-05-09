package 最小栈;

import java.util.LinkedList;

class MinStack {
    LinkedList<Integer> stack; // 存数的栈
    LinkedList<Integer> minStack;  // 维护最小的列表、栈顶元素就是最小值
    public MinStack() {
        stack = new LinkedList<>();
        minStack = new LinkedList<>();
    }

    public void push(int val) {
        if(minStack.isEmpty()){
            minStack.push(val);
        }else {
            int min = minStack.pop();
            if(val < min){
                minStack.push(min);
                minStack.push(val);
            }else {
                minStack.push(val);
                minStack.push(min);
            }
        }
        stack.push(val);
    }

    public void pop() {
        int temp = stack.pop();
        minStack.remove(minStack.indexOf(temp));
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-1);
        System.out.println(minStack.getMin());
        System.out.println(minStack.top());
        minStack.pop();
        System.out.println(minStack.getMin());
    }
}

