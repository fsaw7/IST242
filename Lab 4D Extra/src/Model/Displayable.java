/**
 * Fatou Sawaneh 
 * Lab 3 
 * Due date: 4/19/2022 
 * fjs5286@psu.edu 
 * Displayable.java
 * Interface; contains methods that will help TableData display the data graphically
 */

    package Model;

public interface Displayable
{
  public int getFirstLineToDisplay(); 
  public int getLineToHighlight(); 
  public int getLastLineToDisplay(); 
  public int getLinesBeingDisplayed(); 

  public void setFirstLineToDisplay(int firstLine); 
  public void setLineToHighlight(int highlightedLine); 
  public void setLastLineToDisplay(int lastLine); 
  public void setLinesBeingDisplayed(int numberOfLines); 
}
    
