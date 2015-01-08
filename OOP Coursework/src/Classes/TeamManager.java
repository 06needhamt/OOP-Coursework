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
public class TeamManager {
    private ArrayList<Team> Teams;
    public TeamManager()
    {
        this.Teams = new ArrayList<Team>();
    }
    public ArrayList<Team> AddTeam(Team T)
    {
        this.Teams.add(T);
        return this.Teams;
    }
    public ArrayList<Team> RemoveTeam(Team T)
    {
        this.Teams.remove(T);
        return this.Teams;
    }
    public ArrayList<Team> GetTeams()
    {
        return this.Teams;
    }
    public void SetTeams(ArrayList<Team> teams)
    {
        this.Teams = teams;
    }
}
