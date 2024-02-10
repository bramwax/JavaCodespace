public class Queue {

    private Object[] queue;
	private int elementCount = 0;

    /* constructor: creates n-sized array of objects */
    Queue(int n) {

        this.queue = new Object[n];

    }

    /* setter: adds element to the end of queue (if not full) */
    public void enqueue(Object element) {

		if (this.elementCount < queue.length) {
			this.queue[elementCount] = element;
			System.out.println("The element " + element + " was added to the back of the queue");
			this.elementCount++;
		} else {
			System.out.println(element + " was not added to the queue because the queue is full");
		}

	}

    /* setter: removes element from front of queue (if not empty), shifting remaining elements left */
    public Object dequeue() {

		if (!isEmpty()) {
			Object tmpElement = queue[0];
			System.out.println(tmpElement + " was removed from the queue");

            /* shift all elements to the left by 1 */
            for (int i = 0; i < this.elementCount - 1; i++) {
                this.queue[i] = this.queue[i + 1];
            }

            /* reset last element to null */
            this.queue[elementCount - 1] = null;

			this.elementCount--;

			return tmpElement;
		}

		System.out.println("Queue is empty!");
		return null;

	}

    /* getter: ... */
    public boolean isEmpty() {
		if(this.elementCount == 0) {
			return true;
		}
		return false;
    }

}
