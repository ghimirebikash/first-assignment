public class printarr {
  public static <E> void printArray(E[] inputArray) {
    for (E abc: inputArray)
      System.out.printf("%s ", abc);
    System.out.println();
  }
  public static void main(String args[]) {
    Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
    Double[] doubleArray = { 1.1, 2.1, 3.1, 4.1, 5.1, 6.1, 7.1 };
    Character[] characterArray = { 'B','I','K','A','S','H' };
    System.out.println("integer array contains:");
    printArray(integerArray);
    System.out.println("\n double array contains:");
    printArray(doubleArray);
    System.out.println("\ncharacter array contains:");
    printArray(characterArray); 
  } 
}