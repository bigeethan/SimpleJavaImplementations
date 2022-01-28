public class SelectionSort {
    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        int[] arr = {10, 13, 2, 5, 18, 6, 92, 8};
        System.out.println(Arrays.toString(arr));
        selectionSort.Sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void Sort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            int minimumIndex = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minimumIndex]) {
                    minimumIndex = j;
                }
            }
            int smallerNumber = arr[minimumIndex];
            arr[minimumIndex] = arr[i];
            arr[i] = smallerNumber;
        }
    }
}