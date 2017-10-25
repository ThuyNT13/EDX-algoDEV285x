public class SelectSort {

  public static void main(String[] args) {
    // int[] arr = {4,9,7,1,3,6,5};
    int[] arr = {4,9,7,1,3,6,5,2,0};

    findMinSwap(arr);

    for (int i=0; i<arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  static int[] findMinSwap(int[] arr) {

    for (int i=0; i<arr.length; i++) {
      int min = arr[i];
      int swapIndex = i;
      for (int j=i; j<arr.length; j++) {
        if (arr[j] < min) {
          min = arr[j];
          swapIndex = j;
        }
      }
      int temp = arr[i];
      arr[i] = min;
      arr[swapIndex] = temp;
    }
    return arr;
  }
}
