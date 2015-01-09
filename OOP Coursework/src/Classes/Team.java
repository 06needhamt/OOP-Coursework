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
    public String getName()
    {
        return this.TeamName;
    }
    public void setName(String Name)
    {
        this.TeamName = Name;
    }
    public int GetDraws()
    {
        return this.Draws;
    }
    public void SetDraws(int amount)
    {
        this.Draws = amount;
    }
    public int getWins()
    {
        return this.Wins;
    }
    public void SetWins(int amount)
    {
        this.Wins = amount;
    }
    public int GetLosses()
    {
        return this.Losses;
    }
    public void SetLosses(int amount)
    {
        this.Losses = amount;
    }
    public int GetScore()
    {
        this.CalculateScore();
        return this.Score;
    }
    public void CalculateScore()
    {
        this.Score = (this.Wins * 3) + (this.Draws);
    }
    public void IncrenentWin()
    {
        this.Wins++;
    }
    public void IncrementDraw()
    {
        this.Draws++;
    }
    public void IncrementLoss()
    {
        this.Losses++;
    }
}
