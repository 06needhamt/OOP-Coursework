/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import java.util.*;
/**
 * This class manages all of the teams in the list
 * @author Tom
 */
public class TeamManager {
    private ArrayList<Team> Teams;
    /**
     * Constructor for the team manager class
     */
    public TeamManager()
    {
        this.Teams = new ArrayList<Team>();
    }
    /**
     * This method adds a team to the league
     * @param T The team to add to the league
     * @return A list of teams in the league with the new team added
     */
    public ArrayList<Team> AddTeam(Team T)
    {
        this.Teams.add(T);
        return this.Teams;
    }
    /**
     * This method removes a team from the league
     * @param T The team ro remove from the league
     * @return A list of teams in the league after the team has been removed
     */
    public ArrayList<Team> RemoveTeam(Team T)
    {
        this.Teams.remove(T);
        return this.Teams;
    }
    /**
     * Gets the list of teams in the league
     * @return A list of all the teams in the league
     */
    public ArrayList<Team> GetTeams()
    {
        return this.Teams;
    }
    /**
     * Adds A list of teams in the league
     * @param teams the list of teams to be in the league
     */
    public void SetTeams(ArrayList<Team> teams)
    {
        this.Teams = teams;
    }
}
