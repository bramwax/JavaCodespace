public class App {
    public static void main(String[] args) throws Exception {

        Stack nameStack = new Stack(2);
        nameStack.push("Andy");
        nameStack.push("Nate");
        nameStack.push("Päherdin");

        nameStack.pop();
        nameStack.pop();
        nameStack.pop();

        Queue nameQueue = new Queue(3);
        nameQueue.enqueue("Andy");
        nameQueue.enqueue("Nate");
        nameQueue.enqueue("Päherdin");

        nameQueue.dequeue();
        nameQueue.dequeue();
        nameQueue.dequeue();


    }

}
