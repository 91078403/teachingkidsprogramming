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
      youEatWaffles();
    }
    else
    {
      endStory();
    }
  }
  private static void youEatWaffles()
  {
    MessageBox.showMessage("You eat your waffles and you have spare time.");
    String input = askAQuestion("Do you want to 'play video games' or 'read a book'?");
    if ("play video games".equalsIgnoreCase(input))
    {
      MessageBox.showMessage("You should do something productive.");
    }
    else if ("read a book".equalsIgnoreCase(input))
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
    String input = askAQuestion("Do you want to 'rush to school' or 'stay home'?");
    if ("rush to school".equalsIgnoreCase(input))
    {
      MessageBox.showMessage("Awesome Bro, good choice!");
    }
    else if ("stay home".equalsIgnoreCase(input))
    {
      MessageBox.showMessage("Not awesome you need to get an education");
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
