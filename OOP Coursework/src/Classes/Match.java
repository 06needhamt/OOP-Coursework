/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import gui.*;

/**
 *
 * @author Tom
 */
public class Match {
    private String Team1;
    private String Team2;
    private int Team1Score;
    private int Team2Score;
    public Match(String Team1, String Team2, int Team1Score, int Team2Score)
    {
        this.Team1 = Team1;
        this.Team2 = Team2;
        this.Team1Score = Team1Score;
        this.Team2Score = Team2Score;
    }
    public String CalculateWinner()
    {
        if(Team1Score > Team2Score)
        {
            return Team1;
        }
        else if(Team1Score < Team2Score)
        {
            return Team2;
        }
        else if (Team1Score == Team2Score)
        {
            return "Draw";
        }
        return null;
    }
    public String GetTeam1()
    {
        return this.Team1;
    }
    public String GetTeam2()
    {
        return this.Team2;
    }
    public int GetTeam1Score()
    {
        return this.Team1Score;
    }
    public int GetTeam2Score()
    {
        return this.Team2Score;
    }
    public void SetTeam1(String Name)
    {
        this.Team1 = Name;
    }
    public void SetTeam2(String Name)
    {
        this.Team2 = Name;
    }
    public void SetTeam1Score(int score)
    {
        this.Team1Score = score;
    }
    public void SetTeam2Score(int score)
    {
        this.Team2Score = score;
    }
}
