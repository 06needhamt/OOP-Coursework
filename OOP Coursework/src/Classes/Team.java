/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import java.util.*;
/**
 *
 * @author Tom
 */
public class Team {
    private ArrayList<Player> players = new ArrayList<Player>();
    private String TeamName;
    private int Wins;
    private int Losses;
    private int Draws;
    private int Score;
    
    public Team(String Name)
    {
        this.TeamName = Name;
        this.Draws = 0;
        this.Wins = 0;
        this.Losses = 0;
    }
    
    public Team(String Name, int Wins, int Draws, int Losses)
    {
        this.TeamName = Name;
        this.Wins = Wins;
        this.Draws = Draws;
        this.Losses = Losses;
    }
    
    public ArrayList<Player> GetPlayers()
    {
        return this.players;
    }
    public void SetPlayers(ArrayList<Player> Players)
    {
        this.players = Players;
    }
    public ArrayList<Player> AddPlayer(Player p)
    {
        this.players.add(p);
        return this.players;
    }
    public ArrayList<Player> RemovePlayer(Player p)
    {
        this.players.remove(p);
        return this.players;
    }
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
