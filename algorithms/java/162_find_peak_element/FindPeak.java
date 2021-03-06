public class FindPeak {
    public int findPeak(int[] array) {
        if (array == null || array.length == 0) return -1;
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (array[mid] < array[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}