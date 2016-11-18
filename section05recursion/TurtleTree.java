package org.teachingkidsprogramming.section05recursion;

import java.awt.Color;
import java.util.HashMap;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class TurtleTree
{
  @SuppressWarnings("unused")
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.getBackgroundWindow().setBackground(PenColors.Grays.Black);
    int length = 60;
    drawBranch(length);
  }
  private static void drawBranch(int length)
  {
    if (length > 0)
    {
      adjustColor(length);
      Tortoise.move(length);
      drawLowerBranches(length);
    }
  }
  private static void adjustColor(int length)
  {
    HashMap<Integer, Color> colors = new HashMap<Integer, Color>();
    colors.put(10, PenColors.Greens.Lime);
    colors.put(20, PenColors.Greens.ForestGreen);
    colors.put(30, PenColors.Greens.DarkGreen);
    colors.put(40, PenColors.Greens.Olive);
    colors.put(50, PenColors.Browns.Sienna);
    colors.put(60, PenColors.Browns.SaddleBrown);
    // if (length == 10)
    //  {
    // Tortoise.setPenColor(PenColors.Greens.Lime);
    // }
    // if (length == 20)
    //{
    //  Tortoise.setPenColor(PenColors.Greens.ForestGreen);
    // }
    //  if (length == 30)
    // {
    //  Tortoise.setPenColor(PenColors.Greens.DarkGreen);
    // }
    //if (length == 40)
    //{
    //   Tortoise.setPenColor(PenColors.Greens.Olive);
    //}
    // if (length == 50)
    // {
    //  Tortoise.setPenColor(PenColors.Browns.Sienna);
    //}
    // if (length == 60)
    // {
    // Tortoise.setPenColor(PenColors.Browns.SaddleBrown);
    // }
  }
  private static void drawLowerBranches(int length)
  {
    Tortoise.turn(30);
    drawShorterBranch(length);
    Tortoise.turn(-60);
    drawShorterBranch(length);
    Tortoise.turn(30);
    //            adjustColor --#16
    adjustColor(length);
    Tortoise.move(-length);
    //        ------------- End of drawLowerBranches recipe --#6.3
  }
  private static void drawShorterBranch(int length)
  {
    //            ------------- Recipe for drawShorterBranch --#8.2
    drawBranch(length - 10);
    //            ------------- End of drawShorterBranch recipe --#8.3
  }
}