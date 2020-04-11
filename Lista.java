
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
		// Header.num_elem++;
	}

	public void add(int item, int ind) {
		Node atual, temp;
		int i = 0;

		if (ind <= 0)
			add(item);
		else if (ind >= Header.num_elem)
			addOnEnd(item);
		else {
			temp = first;
			// descobre a posição onde deve ser inserido
			while ((i < ind) && (temp != null)) {
				temp = temp.getNext();
				i++;
			}

			atual = new Node(item);
			atual.setNext(temp);

			atual.setPrev(temp.getPrev());

			atual.getNext().setPrev(atual);
			atual.getPrev().setNext(atual);
			// Header.num_elem++;
		}
	}

	public void addOnEnd(int element) {
		Node current;
		if (isEmpty()) {
			current = new Node(element);
			first = current;
			last = current;
		} else {
			current = new Node(element);

			last.setNext(current);
			current.setPrev(last);
			last = current;
		}
		// Header.num_elem++;
	}

	public void removeFirst() throws Exception {

		if (isEmpty())
			throw new Exception("EMPTY LIST");

		if (first.equals(last)) {
			first = null;
			last = null;
		} else {
			Node temp = first;
			first = first.getNext();
			first.setPrev(null);
			temp.setNext(null);
		}
		// Header.num_elem--;
	}

	public void removeLast() throws Exception {

		if (isEmpty())
			throw new Exception("EMPTY LIST");

		if (first.equals(last)) {
			first = null;
			last = null;
		} else {
			Node current = last; // Procura o penúltimo nodo
			current = current.getPrev();
			last = current;
			current.setNext(null);
		}
		// Header.num_elem--;
	}

	public void remove(int index) {

		Node temp = first;
		int i = 0;

		while ((i < index) && (temp != null)) {
			temp = temp.getNext();
			i++;
		}

		temp.getPrev().setNext(temp.getNext());

		if (temp != last) {
			temp.getNext().setPrev(temp.getPrev());
		} else {
			temp.setNext(null);
		}
		// Header.num_elem--;
	}

	public boolean isEmpty() {
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
