class Main {
  public static void main(String[] args) {
    String words2[] = {"apple", "banana", "peach", "cherries", "blueberries"};

    //for-each
    for(String fruit : words2)
    {
      System.out.println(fruit);
    }

    System.out.println();

    //for-each - print only fruits with length 5
    for(String fruit : words2)
    {
      if(fruit.length() == 5)
      {
      System.out.println(fruit);
      }
    }

    System.out.println();


    for(int i = 0; i < words2.length; i++)
    {
      String first = words2[i].substring(0,1);
      String last = words2[i].substring(words2[i].length() - 1);
      System.out.println("Index value " + i + ": " + words2[i] + " " + first + " " + last);
    }

    System.out.println();

    int nums[] = {12, 65, 80, 70, 34, 22};

    //total value of ints in array
    int sum = 0;
    for(int x: nums)
    {
      sum+=x;
    }
    System.out.println("The average of nums is " + ((double)sum/nums.length));
    System.out.print("The average of nums is ");
    System.out.printf("%.2f%n", ((double)sum/nums.length));//how you want it formatted, what you want to format. 2 means 2 decimals. f stands for float (bigger double). n = move to new line after.

    for(int i = nums.length - 1; i>3; i--)
    {
      nums[i] = nums[i - 1];
    }
    nums[3] = 99;

    for(int i = 2; i<nums.length - 1; i++)
    {
      nums[i] = nums[i + 1];
    }

    System.out.println();

    for(int i = 0; i<nums.length; i++)
    {
      System.out.println(nums[i] + " ");
    }


    //shifting to left
    int[] nums3 = {1,2,3,4};
    int temp = nums3[0];
    for(int i = 0; i<nums3.length - 1; i++) //had to decrease length by 1 because you add 1. cannot call on 3+1 (4) value because there is no 4 indicy
    {
      nums3[i] = nums3[i+1];
    }
    nums3[nums3.length-1] = temp;

    for(int i = 0; i <nums3.length; i++)
    {
      System.out.println(nums3[i] + " ");
    }

    System.out.println();


    //shifting to right
    int temp2 = nums3[nums3.length - 1];
    for(int i = nums3.length - 1; i>0; i--)
    {
      nums3[i] = nums3[i-1];
    }
    nums3[0] = temp2;

    for(int i = 0; i <nums3.length; i++)
    {
      System.out.println(nums3[i] + " ");
    }


    //swapping all elements by looping through half the array
    //sample algorithm, would work for odd number due to integer math
    /*for(int i = 0; i<list.length/2; i++)
    {
      int j = list.length- i -1; //index of element in back half
    }*/
    //unfinished

    System.out.println();

    //reversing the elements - using swap inside of for loop
    for(int i = 0; i<nums3.length/2; i++)
    {
      int j = nums3.length - i - 1;
      int temp3 = nums3[i];
      nums3[i] = nums3[j];
      nums3[j] = temp3;
    }
    for(int i = 0; i <nums3.length; i++)
    {
      System.out.println(nums3[i] + " ");
    }

  }
}