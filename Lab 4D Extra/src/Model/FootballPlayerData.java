/**
 * Fatou Sawaneh 
 * Lab 4 
 * Due date: 4/29/2022 
 * fjs5286@psu.edu 
 * FootballPlayerData.java
 * Implements the interface Displayable
 */
 
package Model;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;




public class FootballPlayerData implements TableData, Displayable, Sort
{
    //uninitialized attributes
    //hold player data
    
    private ArrayList<FootballPlayer> players;
    
    //displayable interface
    private int firstLine;
    private int highlightedLine;
    private int lastLine;
    private int numberOfLines;
    
    //sortable interface
    private int sortType;
    private int sortField;
    
    
    
    
    //constructor that calls loadTable method 
    public FootballPlayerData()
    {
        //displays players in centerpanel
        numberOfLines = 20;
        firstLine = 0;
        highlightedLine = -1;
        lastLine = 19;
        sortType = -1;
        sortField = -1;
        
        players = new ArrayList<>();
        
        loadTable();
    }

    //reads XML file and assigns all data to players ArrayList
    public void ReadPlayersFromXML()
    {
        try
        {
            FootballPlayer fp;
            XMLDecoder decoder;
            decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("FootballPlayerTable.xml")));
            fp = new FootballPlayer();
            while (fp != null)
            {
                try
                {
                    fp = (FootballPlayer) decoder.readObject();
                    players.add(fp);

                } 
                catch (ArrayIndexOutOfBoundsException theend)
                {
                    
                    break;
                }
            }
            decoder.close();
        } 
        catch (Exception xx)
        {
            xx.printStackTrace();
        }
    }

    //returns the correct comparator for sorting
    public Comparator<FootballPlayer> getComparator(int sortField)
    {
        if (sortField == 0)
        {
            Comparator<FootballPlayer> sortPlayersByName = new Comparator<FootballPlayer>()
            {
                @Override
                public int compare(FootballPlayer o1, FootballPlayer o2)
                {
                    return o1.getName().compareTo(o2.getName());
                }
            };
            return sortPlayersByName;
        }
        if (sortField == 1)
        {
            Comparator<FootballPlayer> sortPlayersByHeight = new Comparator<FootballPlayer>()
            {
                @Override
                public int compare(FootballPlayer o1, FootballPlayer o2)
                {
                    if (o1.getHeight().getTotalInches() < o2.getHeight().getTotalInches())
                    {
                        return -1;
                    }

                    if (o1.getHeight().getTotalInches() == o2.getHeight().getTotalInches())
                    {
                        return 0;
                    }

                    return 1;
                }
            };
            return sortPlayersByHeight;
        }        
        if (sortField == 2)
        {
            Comparator<FootballPlayer> sortPlayersByWeight = new Comparator<FootballPlayer>()
            {
                @Override
                public int compare(FootballPlayer o1, FootballPlayer o2)
                {
                    if (o1.getWeight() < o2.getWeight())
                    {
                        return -1;
                    }
                    if (o1.getWeight() == o2.getWeight())
                    {
                        return 0;
                    }
                    return 1;
                }
            };
            return sortPlayersByWeight;
        }        
        if (sortField == 3)
        {
            Comparator<FootballPlayer> sortPlayersByHometown = new Comparator<FootballPlayer>()
            {
                @Override
                public int compare(FootballPlayer o1, FootballPlayer o2)
                {
                    return o1.getHometown().compareTo(o2.getHometown());
                }
            };
            return sortPlayersByHometown;
        }         
        if (sortField == 4)
        {
            Comparator<FootballPlayer> sortPlayersByHighSchool = new Comparator<FootballPlayer>()
            {
                @Override
                public int compare(FootballPlayer o1, FootballPlayer o2)
                {
                    return o1.getHighschool().compareTo(o2.getHighschool());
                }
            };
            return sortPlayersByHighSchool;
        }        
        if (sortField == 5)
        {
            Comparator<FootballPlayer> sortPlayersByNumber = new Comparator<FootballPlayer>()
            {
                @Override
                public int compare(FootballPlayer o1, FootballPlayer o2)
                {
                    if (o1.getNumber() < o2.getNumber())
                    {
                        return -1;
                    }
                    if (o1.getNumber() == o2.getNumber())
                    {
                        return 0;
                    }
                    return 1;
                }
            };
            return sortPlayersByNumber;
        }            
        if (sortField == 6)
        {
            Comparator<FootballPlayer> sortPlayersByPosition = new Comparator<FootballPlayer>()
            {
                @Override
                public int compare(FootballPlayer o1, FootballPlayer o2)
                {
                    return o1.getPosition().compareTo(o2.getPosition());
                }
            };
            return sortPlayersByPosition;
        }
        
        return null;
    }
    
    //Selection sort algorithm for players
    public void selectionSort(Comparator<FootballPlayer> comparePlayers)
    {
        for (int i = 0; i < (players.size() - 1); ++i)
        {
            int minPosition = i;
            for (int j = i + 1; j < players.size(); ++j)
            {
                if (comparePlayers.compare(players.get(j), players.get(minPosition)) < 0)
                {
                    minPosition = j;
                }
            }
            FootballPlayer temp = players.get(i);
            players.set(i, players.get(minPosition));
            players.set(minPosition, temp);         
        }
    }
    
   
    
    
    
    //loads data to players arrayList by calling ReadPlayersFromXML method
    @Override
    public void loadTable()
    {
        ReadPlayersFromXML();
    }

    //returns table of data as players ArrayList
    @Override
    public ArrayList<FootballPlayer> getTable()
    {
        return players;
    }

    //returns attribute names as ArrayList with getAttributeNames method
    @Override
    public ArrayList<String> getHeaders()
    {
        ArrayList<String> headers = (new FootballPlayer()).getAttributeNames();
        return headers;
    }

    /*
    uses getAttributes method of FootballPlayer to return ArrayList
     */
    @Override
    public ArrayList<String> getLine(int line)
    {
        FootballPlayer pl = new FootballPlayer();
        pl = players.get(line);
        return pl.getAttributes();
    }

    /*
    uses getLine method and for loop to return ArrayList<ArrayList<String>>
     */
    @Override
    public ArrayList<ArrayList<String>> getLines(int firstLine, int lastLine)
    {
        ArrayList<ArrayList<String>> lines = new ArrayList<>();
        ArrayList<String> lineGetter;

        for (int i = firstLine; i <= lastLine; ++i)
        {
            lineGetter = getLine(i);
            lines.add(lineGetter);
        }

        return lines;
    }

    
    //getter for firstLine
    @Override
    public int getFirstLineToDisplay()
    {
        return firstLine;
    }

    //getter for highlightedLine
    @Override
    public int getLineToHighlight()
    {
        return highlightedLine;
    }

    //getter for lastLine
    @Override
    public int getLastLineToDisplay()
    {
        return lastLine;
    }

    //getter for numberOfLines
    @Override
    public int getLinesBeingDisplayed()
    {
        return numberOfLines;
    }

    //setter for firstLine
    @Override
    public void setFirstLineToDisplay(int firstLine)
    {
        this.firstLine = firstLine;
    }

    //setter for highlightedLine
    @Override
    public void setLineToHighlight(int highlightedLine)
    {
        this.highlightedLine = highlightedLine;
    }

    //setter for lastLine
    @Override
    public void setLastLineToDisplay(int lastLine)
    {
        this.lastLine = lastLine;
    }

    //setter for numberOfLines
    @Override
    public void setLinesBeingDisplayed(int numberOfLines)
    {
        this.numberOfLines = numberOfLines;
    }

  //methods implemented from Sort
    @Override
    public void sort(int sortType, int sortField)
    {
        if (sortType == 0)
        {
            try
            {
                selectionSort(getComparator(sortField));
            }
            catch (Exception e)
            {
                System.out.println("");
            }
        }
        if (sortType == 1)
        {
            try
            {
                Collections.sort(players, getComparator(sortField));
            } 
            catch (Exception e)
            {
                System.out.println("");
            }
        }
        if (sortType == 2)
        {
            try
            {
                players.sort(getComparator(sortField));
            } 
            catch (Exception e)
            {
                System.out.println("");
            }
        }
    }
    
    //getter and setter method for sortType
    @Override
    public int getSortType()
    {
        return sortType;
    }

    @Override
    public void setSortType(int sortType)
    {
        this.sortType = sortType;
    }
    
    //getter and setter method for sortField
    @Override
    public int getSortField()
    {
        return sortField;
    }

    @Override
    public void setSortField(int sortField)
    {
        this.sortField = sortField;
    }

    
}
