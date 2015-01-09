/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 * This class represents a player within a team
 * @author Tom
 */
public class Player {
    
    private String Name;
    private EnumRole Role;
    private Team team;
    /**
     * Constructor for the player class
     * @param Name The name of the player
     */
    public Player(String Name)
    {
        this.Name = Name;
    }
    /**
     * this method returns the name of the player
     * @return the name of the player
     */
    public String GetName()
    {
        return this.Name;
    }
    /**
     * This method sets the name of the player
     * @param Name The name of the player
     */
    public void SetName(String Name)
    {
        this.Name = Name;
    }
    /**
     * this method gets the role of the player
     * @return The role of the player
     */
    public EnumRole GetRole()
    {
        return this.Role;
    }
    /**
     * this method sets the role of the player
     * @param Role The role of the player
     */
    public void SetRole(EnumRole Role)
    {
        this.Role = Role;
    }
    /**
     * this method gets the team that this player belongs to
     * @return The team that the player belongs to
     */
    public Team GetTeam()
    {
        return this.team;
    }
    /**
     * this method sets the team that the player belongs to
     * @param team the team that the player will belong to
     */
    public void SetTeam(Team team)
    {
        this.team = team;
    }
    
}
