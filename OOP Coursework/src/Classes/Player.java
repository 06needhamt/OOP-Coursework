/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Tom
 */
public class Player {
    
    private String Name;
    private EnumRole Role;
    private Team team;
    
    public Player(String Name)
    {
        this.Name = Name;
    }
    public String GetName()
    {
        return this.Name;
    }
    public void SetName(String Name)
    {
        this.Name = Name;
    }
    public EnumRole GetRole()
    {
        return this.Role;
    }
    public void SetRole(EnumRole Role)
    {
        this.Role = Role;
    }
    public Team GetTeam()
    {
        return this.team;
    }
    public void SetTeam(Team team)
    {
        this.team = team;
    }
    
}
