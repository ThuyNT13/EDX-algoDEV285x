public class BubbleSort {
  public static void main(String[] args) {
    int[] arr = {4,9,7,1,3,6,5};

    // bubbleSorting(arr);
    optimizedBubbleSorting(arr);

    for (int i=0; i<arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  static int[] bubbleSorting(int[] array) {
    for (int i=0; i<array.length-1; i++) {
      // subdivision
      for (int j=0; j<array.length-i-1; j++) {
        if (array[j] > array[j+1]) {
          System.out.println(array[j]);
          int temp = array[j];
          array[j] = array[j+1];
          array[j+1] = temp;
        }
      }
    }
    return array;
  }

  static int[] optimizedBubbleSorting(int[] array) {
    boolean isSwapped = true;

    while (isSwapped) {
      // initialize as false
      isSwapped = false;
      for (int i=0; i<array.length-1; i++) {
        if (array[i] > array[i+1]) {
          int temp = array[i];
          array[i] = array[i+1];
          array[i+1] = temp;
          isSwapped = true;
        }
      }
    }
    return array;
  }

}
