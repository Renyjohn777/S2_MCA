public class Exp22 {

    
    static class GenericStack<T> {
        private Object[] stackArray;
        private int top;
        private int capacity;

        public GenericStack(int size) {
            capacity = size;
            stackArray = new Object[capacity];
            top = -1;
        }

        
        public void push(T item) {
            if (top == capacity - 1) {
                System.out.println("Stack Overflow! Cannot push " + item);
            } else {
                stackArray[++top] = item;
                System.out.println("Pushed: " + item);
            }
        }

        
        @SuppressWarnings("unchecked")
        public T pop() {
            if (top == -1) {
                System.out.println("Stack Underflow! Stack is empty.");
                return null;
            } else {
                T item = (T) stackArray[top--];
                System.out.println("Popped: " + item);
                return item;
            }
        }

        
        @SuppressWarnings("unchecked")
        public T peek() {
            if (top == -1) {
                System.out.println("Stack is empty.");
                return null;
            }
            return (T) stackArray[top];
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public void display() {
            if (top == -1) {
                System.out.println("Stack is empty.");
                return;
            }
            System.out.print("Stack (top to bottom): ");
            for (int i = top; i >= 0; i--) {
                System.out.print(stackArray[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        System.out.println("=== Integer Stack ===");
        GenericStack<Integer> intStack = new GenericStack<>(5);
        intStack.push(10);
        intStack.push(20);
        intStack.push(30);
        intStack.display();
        intStack.pop();
        intStack.display();

        // String Stack
        System.out.println("\n=== String Stack ===");
        GenericStack<String> strStack = new GenericStack<>(3);
        strStack.push("Java");
        strStack.push("Python");
        strStack.push("C++");
        strStack.display();
        strStack.pop();
        strStack.display();
    }
}
