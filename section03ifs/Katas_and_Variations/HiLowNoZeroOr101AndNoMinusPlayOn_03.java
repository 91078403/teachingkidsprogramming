package org.teachingkidsprogramming.section03ifs.Katas_and_Variations;

import org.teachingextensions.approvals.lite.util.NumberUtils;
import org.teachingextensions.logo.Sound;
import org.teachingextensions.logo.utils.EventUtils.MessageBox;
//-------------Kata Question-----------//
// How would you make sure the guess is not zero
//     and end the game if the guess is zero?
// How would you make sure the guess is not a negative number
// but go to the next turn if the guess is negative
// How would you make sure the guess is less than 100 
// and end the game if the guess is greater than 100?
// Write out the steps in English
// Translate the steps into code
// Make sure to run after each line
//

public class HiLowNoZeroOr101AndNoMinusPlayOn_03
{
  public static void main(String[] args)
  {
    int answer = NumberUtils.getRandomInt(1, 100);
    MessageBox.showMessage("The answer is " + answer); // delete (or comment out) this line after testing the game 
    for (int i = 0; i < 2; i++)
    {
      int guess = MessageBox.askForNumericalInput("Guess a number");
      if (guess == answer)
      {
        Sound.playBeep();
        MessageBox.showMessage("You won!");
        System.exit(0);
        break;
      }
      // if guess is more than 100 end the game
      else if (guess > 100)
      {
        System.exit(0);
      }
      else if (guess == 0)
      {
        // inform the user of invalid input
        MessageBox.showMessage("Zero is not valid input. Try again.");
        // try again
      }
      else if (guess == -answer)
      {
        // inform the user that they can't enter negative numbers
        MessageBox.showMessage("Negative numbers are not valid input. Try again.");
        //try again
      }
      else if (guess > answer)
      {
        MessageBox.showMessage("Too high");
      }
      else
      {
        MessageBox.showMessage("Too low");
      }
    }
    MessageBox.showMessage("You lost");
  }
}