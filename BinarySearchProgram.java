package oceanOfCode;

// Time Complexity = O(log n)
public class BinarySearchProgram {
	
	static int binarySearch(int[] arr, int target) {
		if (arr == null) {
			return -1;
		}
		int left = 0, right = arr.length - 1;
		while (left <= right) {
			int mid = left + (right - left)/2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {3, 6, 7, 9, 10};
		System.out.println(binarySearch(null, 11));
	}

}
