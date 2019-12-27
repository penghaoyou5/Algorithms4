package 第一章基础.第一节.二分法;

public class 递归 {

	public static void main(String[] args) {
		System.out.println(rank(4, new int[]{1, 2, 4, 7, 7, 7, 7, 7, 8, 9, 10}));
	}

	public static int rank(int key, int[] a) {
		return rank(key, a, 0, a.length - 1);
	}

	public static int rank(int key, int[] a, int lo, int hi) {
		int mid = (lo + hi) / 2;


		System.out.println(lo + "  " + hi + "  " + mid);

		if (hi < lo) {
			return -1;
		}

		if (key > a[mid]) {
			return rank(key, a, mid + 1, hi);
		} else if (key < a[mid]) {
			return rank(key, a, lo, mid - 1);
		} else {
			return mid;
		}

	}
}
