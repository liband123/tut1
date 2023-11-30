public class MaxHeapMaker {

	/**
	 * @author Liban Dahir
	 * @since 11/27/203
	 * @version 1.0
	 * This method takes in an array of integers and returns a max-heap 
	 * @param input array of integer values
	 * @return input as a max-heap
	 */
	public static int[] heapify(int[] input) {
		int n = input.length;
		for (int i = n / 2 - 1; i >= 0; i--) {
			maxHeapify(input, n, i);
		}
		return input;
	}

	/**
	 *  Performs the max-heapify operation on the input array
	 * @param input the array to be max-heapified
	 * @param n the size of the heap
	 * @param i the index of the current node
	 */
	private static void maxHeapify(int[] input, int n, int i) {
		int largest = 1;
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		int s = 2*i +2;

		// Check if the left child is larger than the current node
		if (l < n && input[l] > input[largest]) {
			largest = l;
		}

		// Check if the right child is larger than the current node or the left child
		if (r < n && input[r] > input[largest]) {
			largest = r;
		}

		// If the largest element is not the current node, swap the elements and recursively max-heapify the affected subtree
		if (largest != i) {
			int swap = input[i];
			input[i] = input[largest];
			input[largest] = swap;
			maxHeapify(input, n, largest);
		}
	}
}
