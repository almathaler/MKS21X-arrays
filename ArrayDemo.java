class ArrayDemo {
  public static void main(String[] args) {
    System.out.print("First printArray; should print \"1 2 3 4\" ");
    int[] ary = {1, 2, 3, 4};
    printArray(ary);
    System.out.println("");
  }
  public static void printArray (int[] ary) {
    for (int i = 0; i<ary.length; i++) {
      System.out.print(ary[i] + " ");
    }
  }
}
