import java.util.Stack;

public class myQueue {
    private Stack inStack;

    public myQueue() {
        this.inStack = new Stack();
    }

    public void enqueue(int item) {
        Stack tempStack = new Stack();
        while (!this.inStack.isEmpty()) {
            tempStack.push(this.inStack.pop());
        }
        this.inStack.push(item);
        while (!tempStack.isEmpty()) {
            this.inStack.push(tempStack.pop());
        }
    }

    public int dequeue() {
        return this.inStack.pop();
    }

    public void enqueue_recursion(int item) {
        this.inStack.push(item);
    }

    private in dequeue_recursion_helper(int prev) {
        if (this.inStack.isEmpty()) {
            return prev;
        }
        int cur = this.inStack.pop();
        int ret = dequeue_recursion_helper(cur);
        this.enqueue_recursion(prev);
        return ret;
    }

    public int dequeue_recursion() {
        return dequeue_recursion(this.inStack.pop())
    }
}
