package our_list;

public class OurArrayList<E> {

	private Object[] data;
	private int size;

	public static final int DEFAULT_CAPACITY = 10;

	public OurArrayList() {
		data = new Object[DEFAULT_CAPACITY];
		size = 0;
	}

	// Capacity ********

	private void ensureCapacity() {
		if (size == data.length) {
			int newCapacity = data.length + (data.length / 2);
			Object[] newData = new Object[newCapacity];

			for (int i = 0; i < data.length; i++) {
				newData[i] = data[i];
			}
			data = newData;
		}
	}

	// Size ************

	public int size() {
		return size;
	}

	// Add **************

	public void add(E element) {
		ensureCapacity();
		data[size++] = element;
	}

	// Get **********

	public E get(int index) {
		checkIndex(index);
		return (E) data[index];
	}

	// Set ***********

	public void set(int index, E element) {
		checkIndex(index);

		data[index] = element;
	}

	// Remove *************


	public E remove(int index) {
		checkIndex(index);

		E removed = (E) data[index];

		for (int i = index; i < size; i++) {
			data[i] = data[i + 1];
		}
		data[--size] = null;
		return removed;
	}

	// Check Index ***********

	private void checkIndex(int index) {
		if (index < 0 || index >= size) {

			throw new IndexOutOfBoundsException("Index : " + index);
		}
	}

	// To String ***********

	@Override

	public String toString() {
		StringBuilder sb = new StringBuilder("[");

		for (int i = 0; i < size; i++) {
			sb.append(data[i]);

			if (i < size - 1) {
				sb.append(",");
			}

		}
		sb.append("]");
		return sb.toString();
	}

}
