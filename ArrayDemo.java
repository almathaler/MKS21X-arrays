class ArrayDemo {
  public static void main(String[] args) {
    //testing printArray
    System.out.print("1D printArray should print \"1 2 3 4\" ");
    int[] ary = {1, 2, 3, 4};
    printArray(ary);
    //System.out.println("");
    //testing printArray for 2D arrays
    System.out.print("2D printArray should print \"1 2 3 4 \n 2 4 6 8 \n 1 3 5 7\" \n");
    int[][] ary2 = new int[][] {
      {1, 2, 3, 4},
      {2, 4, 6, 8},
      {1, 3, 5, 7},
    };
    printArray(ary2);
    //System.out.println("");
  }
  public static void printArray (int[] ary) {
    for (int i = 0; i<ary.length; i++) {
      if (i == ary.length-1) {
        System.out.print(ary[i] + "\n");
      }
      else {
        System.out.print(ary[i] + " ");
      }
    }
    //System.out.println("");
  }
  public static void printArray(int[][] ary){
    for (int i = 0; i< ary.length; i++) {
      printArray(ary[i]);
    }
  }
}
