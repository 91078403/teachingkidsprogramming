package org.teachingkidsprogramming.section05recursion.Katas_and_Variations;

public class PlayingWithRecursion
{
  public static void main(String[] args)
  {
    recurse(15);
  }
  public static void recurse(int counter)
  {
    if (counter > 0)
    {
      System.out.println(counter + ". Hello!");
      recurse(counter - 1);
    }
  }
}
