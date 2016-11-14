package org.teachingkidsprogramming.section04mastery.Katas_and_Variations;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class KnottedRing_Variations_01
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    createColorPalette();
    for (int i = 0; i < 40; i++)
    {
      Tortoise.setPenColor(ColorWheel.getNextColor());
      drawOctagonWithOverLap();
      Tortoise.turn(360 / 50);
      Tortoise.turn(5);
    }
  }
  private static void drawOctagonWithOverLap()
  {
    for (int i = 0; i < 5 + 1; i++)
    {
      Tortoise.move(110);
      Tortoise.turn(360 / 5);
    }
  }
  private static void createColorPalette()
  {
    ColorWheel.addColor(PenColors.Pinks.HotPink);
    ColorWheel.addColor(PenColors.Blues.Aquamarine);
    ColorWheel.addColor(PenColors.Pinks.Fuchsia);
    ColorWheel.addColor(PenColors.Blues.DarkBlue);
    ColorWheel.addColor(PenColors.Pinks.DeepPink);
    ColorWheel.addColor(PenColors.Reds.MediumVioletRed);
    ColorWheel.addColor(PenColors.Reds.Crimson);
    ColorWheel.addColor(PenColors.Reds.Tomato);
  }
}