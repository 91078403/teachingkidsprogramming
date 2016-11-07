package org.teachingkidsprogramming.section04mastery.Katas_and_Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Blues;
import org.teachingextensions.logo.utils.ColorUtils.PenColors.Reds;

public class PentagonCrazy_Variation_01
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    createColorPalette();
    drawPentagon();
  }
  private static void drawPentagon()
  {
    for (int i = 0; i < 200; i++)
    {
      adjustPen();
      int length = i;
      Tortoise.move(length);
      int sides = 6;
      Tortoise.turn(360 / sides);
      Tortoise.turn(1);
    }
  }
  private static void adjustPen()
  {
    Tortoise.setPenColor(ColorWheel.getNextColor());
    Tortoise.setPenWidth(Tortoise.getPenWidth() + 1);
    if (Tortoise.getPenWidth() > 4)
    {
      Tortoise.setPenWidth(1);
    }
  }
  private static void createColorPalette()
  {
    ColorWheel.addColor(Reds.PaleVioletRed);
    ColorWheel.addColor(Blues.CornflowerBlue);
    ColorWheel.addColor(Reds.IndianRed);
    ColorWheel.addColor(Blues.DarkCyan);
    ColorWheel.addColor(Reds.Salmon);
  }
}
