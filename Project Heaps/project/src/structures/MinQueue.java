package structures;

import java.util.Comparator;
import java.util.Iterator;
import comparators.ReverseIntegerComparator;

public class MinQueue<V> implements PriorityQueue<Integer, V> {
  StudentArrayHeap<Integer, V> heap;
	
	public MinQueue() {
		ReverseIntegerComparator comparator = new ReverseIntegerComparator();
		heap = new StudentArrayHeap<Integer, V>(comparator);
	}
	
	@Override
	public PriorityQueue<Integer, V> enqueue(Integer priority, V value) {
		heap.add(priority, value);
		return this;
	}

	@Override
	public V dequeue() {
		return heap.remove();
	}

	@Override
	public V peek() {
		if (heap.isEmpty())
			throw new IllegalStateException();
		return heap.peek();
	}

	@Override
	public Iterator<Entry<Integer, V>> iterator() {
		return heap.asList().iterator();
	}

	@Override
	public Comparator<Integer> getComparator() {
		return heap.getComparator();
	}

	@Override
	public int size() {
		return heap.size();
	}

	@Override
	public boolean isEmpty() {
		return heap.isEmpty();
	}
}