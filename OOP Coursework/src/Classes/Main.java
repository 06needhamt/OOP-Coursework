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
public class Main {
    
    public static void main(String[] args)
    {
        System.out.println("Hello World");
        MainForm m = new MainForm(new TeamManager());
        m.setVisible(true);
    }
    
}
