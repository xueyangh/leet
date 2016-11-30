class MyStack {
    Queue<Integer> stack = new LinkedList<>();
    // Push element x onto stack.
    public void push(int x) {
        Queue<Integer> newStack = new LinkedList();
        newStack.offer(x);
        while (!stack.isEmpty()) {
            int curr = stack.poll();
            newStack.offer(curr);
        }
        stack = newStack;
    }

    // Removes the element on top of the stack.
    public void pop() {
        stack.poll();
    }

    // Get the top element.
    public int top() {
        return stack.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return stack.isEmpty();
    }
}
