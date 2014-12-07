package com.abhi.mywork.nonbook;

/**
 * The following implementation of a Bounded Queue leverages an array as a circular buffer.
 * It has optimal asymptotic runtime and memory usage: enqueue and dequeue run in worst-case 
 * O(1) time, and the queue uses O(capacity) memory. Both bounds are asymptotically optimal.
 * The implementation is furthermore cache-friendly, as it uses an array allocated only once in
 * the constructor, thus offering great spatial locality.
 * Testing code can be found in the main method.
 * ---------------------------------------------------------------------------------------------
 * To compile: 			 execute "javac BoundedQueue.java" in the source directory
 * To run the test code: execute "java -ea BoundedQueue" in the source directory
 * ---------------------------------------------------------------------------------------------
 * Author: Nicholas Platias, Stanford University
 */
public final class BoundedQueue {

	/**
	 * The elements of the queue lie in the data array at indices head, head-1, ..., tail, where
	 * this sequence may wrap around the end of the array and continue on the other side.
	 * The advantage of keeping track of size, head and tail is that we avoid the use of modulo operations
	 */
	private int capacity;
	private int[] data; // holds the contents of the queue
	private int size; // number of elements currently residing in the queue
	private int head; // index in data where the head of the queue lies, i.e. first element to be dequeued
	private int tail; // index in data where the tail of the queue lies, i.e. last element that was queued

	/**
	 * Constructs a new BoundedQueue with the provided capacity.
	 * Throws an IllegalArgumentException if the provided capacity is negative.
	 */
	public BoundedQueue(int capacity) throws IllegalArgumentException {
		if(capacity < 0) {
			throw new IllegalArgumentException("The capacity of the queue cannot be negative.");
		}

		this.capacity = capacity;
		this.data = new int[capacity];
		this.size = 0;
		this.head = capacity-1;
		this.tail = capacity;
	}

	/**
	 * Inserts the provided integer at the tail of the queue if the queue has space.
	 * Returns a boolean that represents whether or not the insertion was successful (the insertion fails if the queue is full).
	 */
	public boolean enqueue(int element) {
		if(size == capacity) {
			return false;
		}

		int insertionIndex = (tail > 0) ? tail - 1 : capacity - 1;
		data[insertionIndex] = element;
		tail = insertionIndex;
		size++;
		return true;
	}

	/**
	 * Removes and returns the integer at the head of the queue, if it is non-empty.
	 * Throws an IllegalStateException if the queue is empty.
	 * -------------------------------------------------------------------------------
	 * Note that if we were allowed to use Integers we could have returned null when
	 * the queue was empty. The restriction to return ints requires that we throw an
	 * Exception to signal that the queue is empty.
	 */
	public int dequeue() throws IllegalStateException {
		if(size == 0) {
			throw new IllegalStateException("The queue is empty.");
		}

		int element = data[head];
		head = (head > 0) ? head - 1 : capacity-1;
		size--;
		return element;
	}



	/**
	 * Runs a series of tests on queues of different capacities.
	 * -------------------------------------------------------------------------
	 * Note that for all tests a precondition and postcondition is that
	 * the queue is empty. This makes it easy to serially execute many tests
	 * and interleave them in any order without worrying about the queue's state
	 * between different tests. We arbitrarily interleave many tests to ensure
	 * the queue operates correctly regardless of its internal state.
	 */
	public static void main(String[] args) throws IllegalArgumentException, IllegalStateException {
		int capacity;
		BoundedQueue queue;

		/**
		 * Ensure that an IllegalArgumentException is thrown when the capacity is negative
		 */
		try {
			capacity = -1;
			queue = new BoundedQueue(capacity); // empty queue
			assert(false); // we should never get here, since the constructor must throw an exception
		} catch (IllegalArgumentException e) {
			System.out.println("Successfuly caught " + e);
		}

		
		/////
		capacity = 0;
		queue = new BoundedQueue(capacity); // empty queue
		
		
		/////
		capacity = 0;
		queue = new BoundedQueue(capacity); // empty queue
		test1(queue, capacity);
		test3(queue, capacity);
		test1(queue, capacity);
		test4(queue, capacity);
		test1(queue, capacity);
		test5(queue, capacity);
		test1(queue, capacity);

		capacity = 1;
		queue = new BoundedQueue(capacity); // empty queue
		test1(queue, capacity);
		test2(queue, capacity);
		test1(queue, capacity);
		test3(queue, capacity);
		test1(queue, capacity);
		test4(queue, capacity);
		test1(queue, capacity);
		test5(queue, capacity);
		test1(queue, capacity);

		capacity = 5;
		queue = new BoundedQueue(capacity); // empty queue
		test1(queue, capacity);
		test2(queue, capacity);
		test3(queue, capacity);
		test5(queue, capacity);
		test1(queue, capacity);
		test5(queue, capacity);
		test4(queue, capacity);
		test4(queue, capacity);
		test2(queue, capacity);
		test1(queue, capacity);
		test5(queue, capacity);
		test1(queue, capacity);
		test2(queue, capacity);
		test3(queue, capacity);
		test1(queue, capacity);
		test2(queue, capacity);
		test4(queue, capacity);
		test5(queue, capacity);
		test1(queue, capacity);
		test5(queue, capacity);
		test3(queue, capacity);
		test4(queue, capacity);
		test1(queue, capacity);
		test2(queue, capacity);
		test1(queue, capacity);
		test4(queue, capacity);
		test3(queue, capacity);
		test1(queue, capacity);

		capacity = 177;
		queue = new BoundedQueue(capacity); // empty queue
		test1(queue, capacity);
		test2(queue, capacity);
		test3(queue, capacity);
		test5(queue, capacity);
		test1(queue, capacity);
		test5(queue, capacity);
		test4(queue, capacity);
		test4(queue, capacity);
		test2(queue, capacity);
		test1(queue, capacity);
		test5(queue, capacity);
		test1(queue, capacity);
		test2(queue, capacity);
		test3(queue, capacity);
		test1(queue, capacity);
		test2(queue, capacity);
		test4(queue, capacity);
		test5(queue, capacity);
		test1(queue, capacity);
		test5(queue, capacity);
		test3(queue, capacity);
		test4(queue, capacity);
		test1(queue, capacity);
		test2(queue, capacity);
		test1(queue, capacity);
		test4(queue, capacity);
		test3(queue, capacity);
		test1(queue, capacity);

		capacity = 1728;
		queue = new BoundedQueue(capacity); // empty queue
		test1(queue, capacity);
		test5(queue, capacity);
		test2(queue, capacity);
		test2(queue, capacity);
		test1(queue, capacity);
		test2(queue, capacity);
		test1(queue, capacity);
		test3(queue, capacity);
		test1(queue, capacity);
		test5(queue, capacity);
		test1(queue, capacity);
		test3(queue, capacity);
		test2(queue, capacity);
		test2(queue, capacity);
		test1(queue, capacity);
		test5(queue, capacity);
		test2(queue, capacity);
		test4(queue, capacity);
		test4(queue, capacity);
		test5(queue, capacity);
		test4(queue, capacity);
		test1(queue, capacity);
		test2(queue, capacity);
		test2(queue, capacity);
		test3(queue, capacity);
		test1(queue, capacity);
		test4(queue, capacity);
		test3(queue, capacity);
		test5(queue, capacity);
		test5(queue, capacity);
		test3(queue, capacity);
		test2(queue, capacity);
		test1(queue, capacity);
		test2(queue, capacity);
		test4(queue, capacity);
		test4(queue, capacity);
		test1(queue, capacity);
		test3(queue, capacity);
		test2(queue, capacity);
		test5(queue, capacity);
		test1(queue, capacity);
		test3(queue, capacity);
		test4(queue, capacity);
	}

	/**
	 * Confirm that no element can be dequeued since the queue is empty.
	 */
	private static void test1(BoundedQueue queue, int capacity) {
		boolean success;
		int element;

		try {
			element = queue.dequeue();
			assert(false); // we must never get here, since dequeue should throw an exception
		} catch (IllegalStateException e) {
			System.out.println("Successfuly caught " + e);
		}
		System.out.println("--- Test Passed ---");
	}

	/**
	 * Enqueue an integer, then dequeue it.
	 */
	private static void test2(BoundedQueue queue, int capacity) throws IllegalStateException {
		boolean success;
		int element;

		success = queue.enqueue(0);
		assert(success);
		element = queue.dequeue();
		assert(element == 0);
		System.out.println("--- Test Passed ---");
	}

	/**
	 * Fill up the queue, then empty it up.
	 */
	private static void test3(BoundedQueue queue, int capacity) throws IllegalStateException {
		boolean success;
		int element;

		for(int i=0; i<capacity; i++) {
			success = queue.enqueue(i);
			assert(success);
		}
		success = queue.enqueue(0);
		assert(!success);

		for(int i=0; i<capacity; i++) {
			element = queue.dequeue();
			assert(element == i);
		}
		System.out.println("--- Test Passed ---");
	}

	/**
	 * Insert some elements into the queue, then remove them.
	 */
	private static void test4(BoundedQueue queue, int capacity) throws IllegalStateException {
		boolean success;
		int element;

		for(int i=0; i<capacity/3; i++) {
			success = queue.enqueue(i);
			assert(success);
		}

		for(int i=0; i<capacity/3; i++) {
			element = queue.dequeue();
			assert(element == i);
		}
		System.out.println("--- Test Passed ---");
	}

	/**
	 * Fill up the queue, remove some elements, add some other ones
	 * until the queue is full again and then remove them all.
	 */
	private static void test5(BoundedQueue queue, int capacity) throws IllegalStateException {
		boolean success;
		int element;
		int firstBatch = capacity/4; // dequeue batch

		for(int i=0; i<capacity; i++) {
			success = queue.enqueue(i);
			assert(success);
		}
		success = queue.enqueue(0);
		assert(!success);

		for(int i=0; i<firstBatch; i++) {
			element = queue.dequeue();
			assert(element == i);
		}

		for(int i=0; i<firstBatch; i++) {
			success = queue.enqueue(capacity + i);
			assert(success);
		}

		for(int i=0; i<capacity; i++) {
			element = queue.dequeue();
			assert(element == firstBatch + i);
		}
		System.out.println("--- Test Passed ---");
	}


}