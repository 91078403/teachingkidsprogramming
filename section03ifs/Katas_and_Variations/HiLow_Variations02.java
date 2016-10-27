package org.teachingkidsprogramming.section03ifs.Katas_and_Variations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;

public class HiLow_Variations02
{
  public static void main(String[] args)
  {
    int numGuesses = MessageBox.askForNumericalInput("How many guesses do you need?");
    int answer = NumberUtils.getRandomInt(1, 100);
    for (int i = 0; i < numGuesses; i++)
    {
      int guess = MessageBox.askForNumericalInput("Guess an integer between 50 and 100");
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You won the game.");
        System.exit(0);
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("Too High!");
      }
      else
      {
        MessageBox.showMessage("Too Low!");
      }
    }
    MessageBox.showMessage("You lose!");
  }
}
