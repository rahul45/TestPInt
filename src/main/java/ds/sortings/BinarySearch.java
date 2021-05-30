package ds.sortings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearch {

	public static void main(String[] args) {
		int a[] = {};
		int val = 27;
		List<Integer> list = new ArrayList(Arrays.asList(a));
		if (a.length == 0) {
			System.out.println(-1);
		} else {
			int v = binarySearch(a, 0, a.length - 1, 11);
			System.out.println("Value:" + v);
		}
	}

	private static int binarySearch(int[] a, int start, int end, int val) {
		if (start < end) {
			int mid = (start + end) / 2;
			if (a[mid] == val) {
				return mid;
			}
			if (a[mid] > val) {
				return binarySearch(a, start, mid - 1, val);
			} else {
				return binarySearch(a, mid + 1, end, val);
			}
		} else {
			if (a[start] == val) {
				return start;
			} else {
				return -1;
			}
		}
	}

}
