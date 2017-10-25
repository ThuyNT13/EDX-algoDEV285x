public class LinearSearch {

  public static void main(String[] args) {
    int[] arr = {4,9,7,1,3,6,5};
    linSearch(arr, 8);
    linSearch(arr, 1);
    linSearch(arr, 15);
    linSearch(arr, 3);
  }

  static void linSearch(int[] array, int val) {
    for (int i=0; i<array.length; i++) {
      if (array[i] == val) {
        System.out.println(val+ " was found at index " +i);
        return;
      }
    }
    System.out.println(val+ " not found in this array.");
  }
}
