public class Stack {
	
	private Object[] stack;
	private int elementCount = 0;

    /* constructor: creates n-sized array of objects */
	Stack(int n) {

		this.stack = new Object[n];

	}
	
	/* setter: adds element to top of the stack (if not full) */
	public void push(Object element) {

		if (this.elementCount < stack.length) {
			this.stack[elementCount] = element;
			System.out.println("The element " + element + " was pushed onto the stack");
			this.elementCount++;
		} else {
			System.out.println(element + " was not added because the stack is full");
		}
	
	}
	
	/* setter: removes element from top of stack (if not empty) */
	public Object pop() {

		if (!isEmpty()) {

			Object tmpElement = stack[elementCount-1];
			System.out.println(tmpElement + " was removed from the stack");
			this.stack[elementCount-1] = null;
			this.elementCount--;

			return tmpElement;
		}

		System.out.println("Stack is empty!");
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
