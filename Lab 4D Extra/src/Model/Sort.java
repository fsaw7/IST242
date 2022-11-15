package Model;

/**
 * Fatou Sawaneh 
 * Lab 3 
 * Due date: 4/19/2022 
 * fjs5286@psu.edu 
 * Sort.java
 * Interface implemented by FootballPlayerData, contains methods for sorting
 */

public interface Sort
{
    
  public void sort(int sortType, int sortField);
  
  public int getSortType();
  
  public void setSortType(int sortType);
  
  public int getSortField();
  
  public void setSortField(int sortField);
}
