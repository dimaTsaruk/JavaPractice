package codingBat.Array1;

public class plus2 {
    public static void main(String[] args) {
        /**
         * Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
         *
         *
         * plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
         * plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
         * plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
         */
    }

    public int[] plusTwo(int[] a, int[] b) {
        int[] arr = new int[a.length + b.length];
        arr[0] = a[0];
        arr[1] = a[1];
        arr[2] = b[0];
        arr[3] = b[1];
        return arr;

    }

}
