class ArrayDemo {
  public static void main(String[] args) {
    //testing printArray
    System.out.println("1D printArray should print \"1 2 3 4\" ");
    int[] ary = {1, 2, 3, 4};
    printArray(ary);
    //System.out.println("");
    //testing printArray for 2D arrays
    System.out.println("2D printArray should print \"1 2 3 4 \n 2 4 6 8 \n 1 3 5 7\" \n");
    int[][] ary2 = new int[][] {
      {1, 2, 3, 4},
      {2, 4, 6, 8},
      {1, 3, 5, 7},
    };
    printArray(ary2);
    //System.out.println("");
    System.out.println("countZeros2D should return 0 for an empty array");
    System.out.println("then another 0 then 1 then 2 then 3.");
    int[][] ary3 = new int[][] {
      //empty
    };
    int[][] ary4 = new int[][] {
                          {0},
                          {2, 4, 6, 8},
                          {1, 3, 5, 7},
    };
    int[][] ary5 = new int[][] {
                          {1, 2, 3},
                          {0, 5, 0},
                          {4, 67},
    };
    int[][] ary6 = new int[][] {
                          {3, 4, 5, 5, 0},
                          {0, 0},
                          {34, 54, 654, 21},
    };
    //for (int aryNum=2; aryNum<7; aryNum++) {
      //System.out.println(countZeros2D("ary" + aryNum));
    //}
    System.out.println(countZeros2D(ary2));
    System.out.println(countZeros2D(ary3));
    System.out.println(countZeros2D(ary4));
    System.out.println(countZeros2D(ary5));
    System.out.println(countZeros2D(ary6));
    //now 2a, i know it's a bit messy but it's so late dont want to chage import junit.framework.TestCase;
    System.out.println("Now let's test 2a. Let's give it ary2 and see what is returned");
    fill2D(ary2);
    printArray(ary2);
    System.out.println("Finally, let's test 2b. Given an array of 3 rows with 5, 6 and 3 items in length 1D arrays");
    System.out.println("We should see:\n {1, 1, 3, 1, 1}\n {1, 3, 3, 1, 1, 1}\n {1, 1, 1,}");
    int[][] ary7 = new int[][] {
                              {2, 3, -4, 3, 1, },
                              {2, -1, -65, 43, 223, 456},
                              {3, 4, 2},
    };
    printArray(fill2DCopy(ary7));
    System.out.println("Thank you for viewing my homework!");
  }
  public static void printArray (int[] ary) {
    for (int i = 0; i<ary.length; i++) {
      if (i == ary.length-1) {
        System.out.print(ary[i] + "}" + "\n");
      }
      else if (i == 0) {
        System.out.print("{" + ary[0] + ", ");
      }
      else {
        System.out.print(ary[i] + ", ");
      }
    }
    //System.out.println("");
  }
  public static void printArray(int[][] ary){
    for (int i = 0; i< ary.length; i++) {
      printArray(ary[i]);
    }
  }
  public static int countZeros2D(int[][] nums){
    //in the first array, there is either definitely just one zero or none at all/it's an empty 2D array
    int result = 0;
    int i = 0;
    for (; i<nums.length; i++) {
      //if (i == 0) {
        //result++;
      //}
      for (int j = 0; j<nums[i].length; j++) {
        if (nums[i][j] == 0) {
          result++;
        }
      }
    }
    return result;
  }
  public static void fill2D(int[][] vals){
    for (int r = 0; r<vals.length; r++) {
      for (int c = 0; c<vals[r].length; c++) {
        if (r == c) {
          vals[r][c] = 3;
        }
        else {
          vals[r][c] = 1;
        }
      }
    }
  //  System.out.println(printArray(vals));
  }
  public static int[][] fill2DCopy(int[][] vals){
    int[][] copy = new int[vals.length][];
    for (int r = 0; r<vals.length; r++) {
      copy[r] = new int[vals[r].length];
      for (int c = 0; c<vals[r].length; c++) {
        if (vals[r][c] < 0) {
          copy[r][c] = 3;
        }
        else {
          copy[r][c] = 1;
        }
      }
    }
    return copy;
  }
}
