
public class Lista {

	private Header header;
	private Node first;
	private Node last;

	public Lista() {
		this.header = new Header();
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
		header.addElement();
	}

	public void add(int item, int index) {
		Node atual, temp;
		int i = 0;

		if (index <= 0)
			add(item);
		else if (index >= header.getNumberOfElements())
			addOnEnd(item);
		else {
			temp = first;
			while ((i < index) && (temp != null)) {
				temp = temp.getNext();
				i++;
			}

			atual = new Node(item);
			atual.setNext(temp);

			atual.setPrev(temp.getPrev());

			atual.getNext().setPrev(atual);
			atual.getPrev().setNext(atual);
			header.addElement();
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
		header.addElement();
	}

	public void removeFirst() {

		if (isEmpty())
			System.out.println("EMPTY LIST");

		if (first.equals(last)) {
			first = null;
			last = null;
		} else {
			Node temp = first;
			first = first.getNext();
			first.setPrev(null);
			temp.setNext(null);
		}
		header.removeElement();
	}

	public void removeLast() {

		if (isEmpty())
			System.out.println("EMPTY LIST");

		if (first.equals(last)) {
			first = null;
			last = null;
		} else {
			Node current = last;
			current = current.getPrev();
			last = current;
			current.setNext(null);
		}
		header.removeElement();
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
		header.removeElement();
	}

	public void clear() {
		first = null;
		last = null;
		header.removeAllElements();
	}

	public boolean isEmpty() {
		return first == null;
	}
	
	public int lenght() {
		return this.header.getNumberOfElements();
	}

	public void print() {
		if (isEmpty()) {
			System.out.println("EMPTY LIST");
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
