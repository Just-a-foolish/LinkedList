
public class Lista {

	Header header;
	Node first;
	Node last;
	
	public Lista() {
	}

	public void add(Object element) {
		Node current;
		if (isEmpty()) {
			current = new Node(element);
			first = current;
			last = current;
		} else {
			current = new Node(element);

			first.setPrev(current);
			current.setNext(first);
			first = current;
		}
	//FIXME	
	//	Header.num_elem++;
	}
	
	
	
	public boolean isEmpty() { // Testa se a lista está vazia
		return first == null;
	}
	
	public void print() {
		if (isEmpty()) {
			System.out.println("The list is empty");
			return;
		}
		System.out.println("LinkedList:");
		Node current = first;

		while (current != null) {
			System.out.println(current.getElement());
			current = current.getNext();
		}
	}
}
