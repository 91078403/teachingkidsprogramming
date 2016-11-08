package org.teachingkidsprogramming.section04mastery.Katas_and_Variations;

import java.awt.Color;

import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.ColorWheel;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;

public class DigiFlower_Variations_01
{
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    Tortoise.getBackgroundWindow().setBackground(PenColors.Blues.CornflowerBlue);
    Tortoise.setPenWidth(3);
    for (int i = 0; i < 15; i++)
    {
      Tortoise.turn(360 / 15);
      createColorPalette();
      //
      drawOctogon();
    }
  }
  private static void drawOctogon()
  {
    for (int i = 0; i < 8; i++)
    {
      Tortoise.setPenColor(ColorWheel.getNextColor());
      Tortoise.move(50);
      Tortoise.turn(360 / 8);
    }
  }
  private static void createColorPalette()
  {
    Color color1 = PenColors.Pinks.Fuchsia;
    Color color2 = PenColors.Pinks.LightPink;
    Color color3 = PenColors.Purples.DarkOrchid;
    Color color4 = PenColors.Purples.Magenta;
    ColorWheel.addColor(color1);
    ColorWheel.addColor(color2);
    ColorWheel.addColor(color3);
    ColorWheel.addColor(color4);
    ColorWheel.addColor(color4);
    ColorWheel.addColor(color3);
    ColorWheel.addColor(color2);
    ColorWheel.addColor(color1);
  }
}
