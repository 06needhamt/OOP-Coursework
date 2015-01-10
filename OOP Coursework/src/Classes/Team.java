/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import java.util.*;
/**
 * This Class Represents a team within the league
 * @author Tom
 */
public class Team {
    private ArrayList<Player> players = new ArrayList<Player>();
    private String TeamName;
    private int Wins;
    private int Losses;
    private int Draws;
    private int Score;
    
    /**
     * Constructor for the Team Class used when creating a new team
     * @param Name The Name For the team
     */
    public Team(String Name)
    {
        this.TeamName = Name;
        this.Draws = 0;
        this.Wins = 0;
        this.Losses = 0;
    }
    /**
     * Constructor for the Team Class used when loading an existing team from a file
     * @param Name The name for the team
     * @param Wins The number of games the team has won
     * @param Draws The number of games the team has drawn
     * @param Losses The number of games the team has won
     */
    public Team(String Name, int Wins, int Draws, int Losses)
    {
        this.TeamName = Name;
        this.Wins = Wins;
        this.Draws = Draws;
        this.Losses = Losses;
    }
    /**
     * this method gets a ArrayList containing this teams players
     * @return a ArrayList of Players that contains this teams players
     */
    public ArrayList<Player> GetPlayers()
    {
        return this.players;
    }
    /**
     * this method sets this teams players
     * @param Players An ArrayList of players for this team
     */
    public void SetPlayers(ArrayList<Player> Players)
    {
        this.players = Players;
    }
    /**
     * this method adds a player to the team
     * @param p the player to add to the team
     * @return ArrayList of the team's players after adding the new player
     */
    public ArrayList<Player> AddPlayer(Player p)
    {
        this.players.add(p);
        return this.players;
    }
    /**
     * this method removes a player from the team
     * @param p The player to remove from the team
     * @return ArrayList of the team's players after removing the player
     */
    public ArrayList<Player> RemovePlayer(Player p)
    {
        this.players.remove(p);
        return this.players;
    }
    /**
     * this method removes a player from the team using its index in the list
     * @param index the index to remove
     * @return ArrayList of the team's players after removing the player at the specified index
     */
    public ArrayList<Player> RemovePlayerByIndex(int index)
    {
        this.players.remove(index);
        return this.players;
    }
    /**
     * Gets the name of a player
     * @return The name of the player
     */
    public String getName()
    {
        return this.TeamName;
    }
    /**
     * Sets the name of a player
     * @param Name The Name of the player
     */
    public void setName(String Name)
    {
        this.TeamName = Name;
    }
    /**
     * gets the amount of games the team has drawn
     * @return The amount of games the team has drawn
     */
    public int GetDraws()
    {
        return this.Draws;
    }
    /**
     * sets the amount of games the team has drawn
     * @param amount the amount of games the team has drawn
     */
    public void SetDraws(int amount)
    {
        this.Draws = amount;
    }
    /**
     * Gets the amount of games the team has won
     * @return the amount of games the team has won
     */
    public int getWins()
    {
        return this.Wins;
    }
    /**
     *  Sets the amount of games the team has won
     * @param amount the amount of games the team has won
     */
    public void SetWins(int amount)
    {
        this.Wins = amount;
    }
    /**
     * gets the amount of games the team has lost
     * @return the amount of games the team has lost
     */
    public int GetLosses()
    {
        return this.Losses;
    }
    /**
     * sets the amount of games the team has lost
     * @param amount the amount of games the team has lost
     */
    public void SetLosses(int amount)
    {
        this.Losses = amount;
    }
    /**
     * Gets the current score for the team
     * @return the current score for the team
     */
    public int GetScore()
    {
        this.CalculateScore(); // calculate the current score for the team
        return this.Score;
    }
    /**
     * This method calculates the current score for the team
     */
    public void CalculateScore()
    {
        this.Score = (this.Wins * 3) + (this.Draws);
    }
    /**
     * this method increments the amount of games the team has won
     */
    public void IncrenentWin()
    {
        this.Wins++;
    }
    /**
     * this method increments the amount of games the team has drawn
     */
    public void IncrementDraw()
    {
        this.Draws++;
    }
    /**
     * this method increments the amount of games the team has lost
     */
    public void IncrementLoss()
    {
        this.Losses++;
    }
}
