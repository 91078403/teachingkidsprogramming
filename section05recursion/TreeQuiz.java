package org.teachingkidsprogramming.section05recursion;

import org.teachingkidsprogramming.recipes.quizzes.graders.TreeQuizAdapter;
import org.teachingkidsprogramming.recipes.quizzes.graders.TreeQuizGrader;

public class TreeQuiz extends TreeQuizAdapter
{
  public void questions1To4()
  {
    //   Question 1 
    doubleLength();
    //   Question 2 
    decreaseTurn();
    //   Question 3 
    setNinety();
    //   Question 4 
    angleFive();
  }
  private void angleFive()
  {
    //       sets the 5th angle to 36 degrees
    angles.put(5, 36);
  }
  private void setNinety()
  {
    //       set the current turn angle to 90, HINT: Use angles.put(key,value);
    angles.put(turn, 90);
  }
  private void decreaseTurn()
  {
    //      decrease the current turn by 1
    turn = turn - 1;
  }
  private void doubleLength()
  {
    //       make the current length twice what it is
    length = length * 2;
  }
  public static void main(String[] args)
  {
    new TreeQuizGrader().grade(new TreeQuiz());
  }
}
