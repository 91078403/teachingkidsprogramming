package org.teachingkidsprogramming.section06modelviewcontroller;

import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class ExceptionalAdLibs
{
  public static void main(String[] args)
  {
    String adverb = askAdverb();
    MessageBox.showMessage("The adverb is " + adverb);
    String edVerb = askEdVerb();
    MessageBox.showMessage("The edVerb is " + edVerb);
    String bodyPart = askBodyPart();
    MessageBox.showMessage("The body part is " + bodyPart);
    String currentStory = "Today I woke " + adverb + ". Then I " + edVerb + " my " + bodyPart + ".";
  }
  public static String askAdverb()
  {
    String adverb = MessageBox.askForTextInput("What is the adverb");
    if (adverb.isEmpty())
    {
      MessageBox.showMessage("PLease enter an adverb");
      adverb = askAdverb();
    }
    if(adverb.matches("[\\d]))
    return adverb;
  }
  public static String askEdVerb()
  {
    String edVerb = MessageBox.askForTextInput("What is the -ed verb?");
    if (edVerb.isEmpty())
    {
      MessageBox.showMessage("Please enter a verb ending in -ed");
      edVerb = askEdVerb();
    }
    return edVerb;
  }MessageBox.showMessage("Please enter a body part");bodyPart=
  askBodyPart();
}