class Header {

	private int numberOfElements = 0;
	
	public Header() {
	}	

	public int getNumberOfElements() {
		return numberOfElements;
	}

	public void setNumberOfElements(int numberOfElements) {
		this.numberOfElements = numberOfElements;
	}

	public void addElement() {
		numberOfElements++;
	}

	public void removeElement() {
		numberOfElements--;
	}
	
	public void removeAllElements() {
		numberOfElements = 0;
	}
}
