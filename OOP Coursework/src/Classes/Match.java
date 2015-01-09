/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import gui.*;

/**
 * This Class Represents a match within the football league 
 * @author Tom
 */
public class Match {
    private String Team1;
    private String Team2;
    private int Team1Score;
    private int Team2Score;
    /**
     * The Constructor for the match class which creates a new match object and initialises the variables
     * @param Team1 The Name of the Home Team
     * @param Team2 The Name of the Away Team
     * @param Team1Score The home team's score
     * @param Team2Score The Away team's score 
     */
    public Match(String Team1, String Team2, int Team1Score, int Team2Score)
    {
        this.Team1 = Team1;
        this.Team2 = Team2;
        this.Team1Score = Team1Score;
        this.Team2Score = Team2Score;
    }
    /**
     * This method calculates which team has won the match based on their scores
     * @return The Name of the winning Team
     */
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
    /**
     * This method gets the name of team 1
     * @return the name of team 1
     */
    public String GetTeam1()
    {
        return this.Team1;
    }
    /**
     * This method gets the name of team 2
     * @return the name of team 2
     */
    public String GetTeam2()
    {
        return this.Team2;
    }
    /**
     * This method gets the score of team 1
     * @return the name of team 1
     */
    public int GetTeam1Score()
    {
        return this.Team1Score;
    }
     /**
     * This method gets the score of team 2
     * @return the name of team 2
     */
    public int GetTeam2Score()
    {
        return this.Team2Score;
    }
     /**
     * This method sets the name of team 1
     * @param Name The name of team 1
     */
    public void SetTeam1(String Name)
    {
        this.Team1 = Name;
    }
    /**
     * This method sets the name of team 2
     * @param Name The name of team 2
     */
    public void SetTeam2(String Name)
    {
        this.Team2 = Name;
    }
    /**
     * This method sets the score of team 1
     * @param score The score of team 1
     */
    public void SetTeam1Score(int score)
    {
        this.Team1Score = score;
    }
    /**
     * This method sets the score of team 2
     * @param score The score of team 2
     */
    public void SetTeam2Score(int score)
    {
        this.Team2Score = score;
    }
}
