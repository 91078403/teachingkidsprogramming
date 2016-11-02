package org.teachingkidsprogramming.section03ifs.Katas_and_Variations;

import java.awt.Color;

import org.teachingextensions.approvals.lite.util.ThreadUtils;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.utils.ColorUtils.PenColors;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ChooseYourOwnAdventure2
{
  public static void main(String[] args)
  {
    startStory();
  }
  private static void startStory()
  {
    tellMoreStory("One morning the Tortoise woke up.");
    animateStartStory();
    String action = askAQuestion("Do you want to 'brush your teeth' or 'have breakfast'");
    if ("brush your teeth".equalsIgnoreCase(action))
    {
      brushYourTeeth();
    }
    else if ("have breakfast".equalsIgnoreCase(action))
    {
      haveBreakfast();
    }
    else
    {
      endStory();
    }
  }
  private static void endStory()
  {
    MessageBox.showMessage("You don't know how to read directions. You can't play this game. The end.");
  }
  private static void haveBreakfast()
  {
    MessageBox.showMessage("Your mom makes pancakes and waffles.");
    String input = askAQuestion("Do you want to eat 'pancakes' or 'waffles'?");
    if ("pancakes".equalsIgnoreCase(input))
    {
      youEatPancakes();
    }
    else if ("waffles".equalsIgnoreCase(input))
    {
      pourIntoBackyard();
    }
    else
    {
      endStory();
    }
  }
  private static void pourIntoBackyard()
  {
    MessageBox.showMessage(
        "As you walk into the backyard a net scoops you up and a giant takes you to a boiling pot of water.");
    String input = askAQuestion("As the man starts to prepare you as soup, do you...'Scream' or 'Faint'?");
    if ("Faint".equalsIgnoreCase(input))
    {
      MessageBox.showMessage("You made a delicious soup! Yum! The end.");
    }
    else if ("Scream".equalsIgnoreCase(input))
    {
      startStory();
    }
    else
    {
      endStory();
    }
  }
  private static void youEatPancakes()
  {
    MessageBox.showMessage("As you eat your pancakes, it turns 8:00 a.m. and you are late for school.");
    String input = askAQuestion("Do you want to 'rush to school' or 'HECK YES'?");
    if ("Yes".equalsIgnoreCase(input))
    {
      MessageBox
          .showMessage("Awesome dude!  You live out the rest of your life fighting crimes and eating pizza!");
    }
    else if ("HECK YES".equalsIgnoreCase(input))
    {
      MessageBox
          .showMessage("Awesome dude!  You live out the rest of your life fighting crimes and eating pizza!");
    }
    else
    {
      endStory();
    }
  }
  private static void brushYourTeeth()
  {
    MessageBox.showMessage("You wake up and brush your teeth, and have a boring day at school. The end.");
  }
  private static void animateStartStory()
  {
    Tortoise.show();
    Color color = PenColors.Blues.DarkCyan;
    for (int i = 0; i < 25; i++)
    {
      Tortoise.getBackgroundWindow().setColor(color);
      color = PenColors.lighten(color);
      ThreadUtils.sleep(100);
    }
  }
  private static void tellMoreStory(String message)
  {
    MessageBox.showMessage(message);
  }
  private static String askAQuestion(String question)
  {
    String answer = MessageBox.askForTextInput(question);
    return answer;
  }
}
