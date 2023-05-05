import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        // Stacks are last in first out
        Stack<String> animals = new Stack<>();

        animals.push("Lion"); // push is used to add elements in stack
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println("Stack: " + animals);

        System.out.println(animals.peek()); // peek is used to see last added element

        animals.pop(); // pop removes last added element
        System.out.println(animals);
    }
}
