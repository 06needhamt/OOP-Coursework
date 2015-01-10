/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;
import java.io.*;
import javax.swing.*;
import Classes.*;

/**
 * This class manages the Form where users will add and remove Teams from the league
 * @author Tom
 */
public class AddRemoveTeamForm extends javax.swing.JFrame {

    /**
     * Default Constructor for AddRemoveTeamForm
     */
    private TeamManager manager;
    public AddRemoveTeamForm() {
        initComponents();
    }
     /**
     * Constructor for AddRemoveTeamForm which takes a TeamManager so teams can be read from a file
     * @param manager The team manager that will manage the teams
     */
    public AddRemoveTeamForm(TeamManager manager)
    {
        this.manager = manager;
        initComponents();
        try
        {
            String ReadTeams;
            String[] Teams;
            File f = new File("Teams.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            ReadTeams = br.readLine(); // read the teams from the file
            Teams = ReadTeams.split(",[ ]*"); // Split the string on commas
            for(int i = 0; i < Teams.length; i++)
            {
                manager.AddTeam(new Team(Teams[i])); // add all the read teams to the team manager
            }
            this.lstTeamList.setListData(Teams); // set the list box data to a list of the read team names
            br.close(); // close the buffered writer
            
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(null, "An Error occured while reading the teams from a file"); // if an error occured show an error message
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTeamName = new javax.swing.JTextField();
        btnAddTeam = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstTeamList = new javax.swing.JList();
        btnRemoveTeam = new javax.swing.JButton();
        btnCloseForm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Team Name");

        btnAddTeam.setText("Add Team");
        btnAddTeam.setToolTipText("");
        btnAddTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTeamActionPerformed(evt);
            }
        });

        jLabel2.setText("Team List");

        jScrollPane1.setViewportView(lstTeamList);

        btnRemoveTeam.setText("Remove Team");
        btnRemoveTeam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveTeamActionPerformed(evt);
            }
        });

        btnCloseForm.setText("Close Form");
        btnCloseForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseFormActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(btnAddTeam))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(56, 56, 56)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTeamName, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(btnRemoveTeam)
                        .addGap(29, 29, 29)
                        .addComponent(btnCloseForm)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTeamName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAddTeam)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemoveTeam)
                    .addComponent(btnCloseForm))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * This method is called when the add team button is clicked so the team is added to the league
     * @param evt Event Listener for the add team button
     */
    private void btnAddTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTeamActionPerformed
        try
        {
            if(this.txtTeamName.getText().equals("")) // if no name was entered
            {
                throw new Exception(); // throw an exception
            }
            manager.AddTeam(new Team(this.txtTeamName.getText())); // add the team to the team manager
            lstTeamList.setListData(CreateList()); // recreate the list of players
            txtTeamName.setText(""); // empty the team name input box so another team is entered
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Please Enter A Team Name"); // if the user did nor enter a team name show an error message
        }
    }//GEN-LAST:event_btnAddTeamActionPerformed

    /**
     * This method is called when the close form button is clicked so form is closed
     * @param evt The event listener for the close form button
     */
    private void btnCloseFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseFormActionPerformed
        try
        {
            String[] list = CreateList();
            File f = new File("Teams.txt");
            FileWriter fw = new FileWriter(f,false);
            BufferedWriter br = new BufferedWriter(fw);
            for(int i = 0; i < list.length; i++)
            {
                br.write(list[i] + ",");
               // manager.AddTeam(new Team(list[i]));
            }
            br.close();
        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(this, "An Error occured while writing the teams to a file");
        }
        finally
        {
            this.setVisible(false);
            this.dispose();
        }
    }//GEN-LAST:event_btnCloseFormActionPerformed

    /**
     * This method is called when the remove team button is clicked so the team is removed from the league
     * @param evt The event listener for the remove team button
     */
    private void btnRemoveTeamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveTeamActionPerformed
        try
        {
            String TeamNameToRemove = lstTeamList.getSelectedValue().toString();
            for(int i = 0; i < manager.GetTeams().size(); i++)
            {
                Team T = manager.GetTeams().get(i);
                if(T.getName().equals(TeamNameToRemove))
                {
                    manager.GetTeams().remove(i);
                }
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, "Please Select A team to remove");
        }
        finally
        {
            lstTeamList.setListData(CreateList());
        }
    }//GEN-LAST:event_btnRemoveTeamActionPerformed
    /**
     * This method creates a list of teams to be displayed in a lit box
     * @return A list of team names to be displayed in the list box
     */
    private String[] CreateList()
    {
        String[] names = new String[manager.GetTeams().size()];
        for(int i = 0; i < manager.GetTeams().size(); i++)
        {
            names[i] = manager.GetTeams().get(i).getName();
        }
        return names;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddTeam;
    private javax.swing.JButton btnCloseForm;
    private javax.swing.JButton btnRemoveTeam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList lstTeamList;
    private javax.swing.JTextField txtTeamName;
    // End of variables declaration//GEN-END:variables
}
