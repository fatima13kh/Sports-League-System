/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Logic.SportsLeagueSystem;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 * This class represents the GUI for adding team in a sports league system. It
 * allows users to add a team to the system It also provides options to navigate
 * back to the teams option or exit the application.
 *
 * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
 */
public class AddTeamForm extends javax.swing.JFrame {

    /**
     * Creates new form AddTeamForm
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    public AddTeamForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnBack = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textStadiumName = new javax.swing.JTextField();
        textTeamName = new javax.swing.JTextField();
        textStadiumCapacity = new javax.swing.JTextField();
        lblTeamNameErr = new javax.swing.JLabel();
        lblStadiumNameErr = new javax.swing.JLabel();
        lblStadiumCapacityErr = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Futura", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Main Menu");

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(107, 112, 92));

        btnBack.setBackground(new java.awt.Color(221, 190, 169));
        btnBack.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        btnBack.setText("Back");
        btnBack.setBorderPainted(false);
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBackMouseExited(evt);
            }
        });
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(221, 190, 169));
        btnExit.setFont(new java.awt.Font("Futura", 0, 18)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI.Images/smallLogo.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Futura", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 232, 214));
        jLabel2.setText("Add Team");

        btnSubmit.setBackground(new java.awt.Color(221, 190, 169));
        btnSubmit.setFont(new java.awt.Font("Futura", 0, 20)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSubmitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSubmitMouseExited(evt);
            }
        });
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Futura", 0, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 232, 214));
        jLabel4.setText("Stadium Name:");

        jLabel5.setFont(new java.awt.Font("Futura", 0, 30)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 232, 214));
        jLabel5.setText("Stadium Capacity:");

        jLabel6.setFont(new java.awt.Font("Futura", 0, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 232, 214));
        jLabel6.setText("Team Name:");

        textStadiumName.setFont(new java.awt.Font("Futura", 0, 16)); // NOI18N
        textStadiumName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textStadiumNameActionPerformed(evt);
            }
        });

        textTeamName.setFont(new java.awt.Font("Futura", 0, 16)); // NOI18N
        textTeamName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textTeamNameActionPerformed(evt);
            }
        });

        textStadiumCapacity.setFont(new java.awt.Font("Futura", 0, 16)); // NOI18N
        textStadiumCapacity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textStadiumCapacityActionPerformed(evt);
            }
        });

        lblTeamNameErr.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        lblTeamNameErr.setForeground(new java.awt.Color(255, 0, 0));

        lblStadiumNameErr.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        lblStadiumNameErr.setForeground(new java.awt.Color(255, 0, 0));
        lblStadiumNameErr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblStadiumNameErrMouseEntered(evt);
            }
        });

        lblStadiumCapacityErr.setFont(new java.awt.Font("Futura", 0, 14)); // NOI18N
        lblStadiumCapacityErr.setForeground(new java.awt.Color(255, 0, 0));
        lblStadiumCapacityErr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblStadiumCapacityErrMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel3)
                        .addGap(313, 313, 313)
                        .addComponent(jLabel2)
                        .addGap(340, 340, 340)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(516, 516, 516)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(201, 201, 201)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblStadiumCapacityErr, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblTeamNameErr, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblStadiumNameErr, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textStadiumName, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textStadiumCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textTeamName, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textTeamName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTeamNameErr, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textStadiumName, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStadiumNameErr, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textStadiumCapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblStadiumCapacityErr, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
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

        setSize(new java.awt.Dimension(1220, 630));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
/**
     * Handles the event when the back button is clicked. Opens the TeamsOptions
     * window and closes the current window.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param evt The ActionEvent triggering this method.
     */
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        TeamsOptions teamsOptions = new TeamsOptions();
        teamsOptions.setVisible(true); //show teams options window
        dispose(); //hide the current window
    }//GEN-LAST:event_btnBackActionPerformed
    /**
     * Handles the event when the submit button is clicked. Validates team
     * information and adds the team to the system.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param evt The ActionEvent triggering this method.
     */
    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        //sets the text fields to null
        boolean submit = true;
        lblTeamNameErr.setText(null);
        lblStadiumNameErr.setText(null);
        lblStadiumCapacityErr.setText(null);
//creates variables for the text inserted
        String teamName = textTeamName.getText();
        String stadiumName = textStadiumName.getText();
        String capacity = textStadiumCapacity.getText();

        // Check if any field is blank or less than 3 characters
        if (teamName.isEmpty() || teamName.length() < 3) {
            lblTeamNameErr.setText(teamName.isEmpty() ? "Team Name cannot be blank" : "Team Name must be at least 3 characters");
            submit = false;
        }

        if (stadiumName.isEmpty() || stadiumName.length() < 3) {
            lblStadiumNameErr.setText(stadiumName.isEmpty() ? "Stadium Name cannot be blank" : "Stadium Name must be at least 3 characters");
            submit = false;
        }

        if (capacity.isEmpty() || capacity.length() < 3) {
            lblStadiumCapacityErr.setText(capacity.isEmpty() ? "Stadium Capacity cannot be blank" : "Stadium Capacity must be at least 3 digits");
            submit = false;
        }

        // Check if team name or stadium name contains numbers
        Pattern pattern = Pattern.compile(".*\\d+.*"); // Pattern to match any digit
        Matcher matcherTeamName = pattern.matcher(teamName);
        Matcher matcherStadiumName = pattern.matcher(stadiumName);

        if (matcherTeamName.find()) {
            lblTeamNameErr.setText("Team Name cannot contain numbers");
            submit = false;
        }

        if (matcherStadiumName.find()) {
            lblStadiumNameErr.setText("Stadium Name cannot contain numbers");
            submit = false;
        }

        // Check if stadium capacity contains characters
        Pattern patternCapacity = Pattern.compile("\\D"); // Pattern to match any non-digit character
        Matcher matcherCapacity = patternCapacity.matcher(capacity);

        if (matcherCapacity.find()) {
            lblStadiumCapacityErr.setText("Stadium Capacity must be a number");
            submit = false;
        }

        if (submit) {
            try {

                int stadiumCapacity = Integer.parseInt(capacity);
                SportsLeagueSystem.addTeam(teamName, stadiumName, stadiumCapacity);
                JOptionPane.showMessageDialog(this, "The team information has been added successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                dispose(); //hide the current screen
                TeamsOptions teamsOptions = new TeamsOptions();
                teamsOptions.setVisible(true); //display teams options screen
                System.out.println("There are " + SportsLeagueSystem.getTeamsList().size());

            } catch (NumberFormatException ex) {
                lblStadiumCapacityErr.setText("Invalid stadium capacity");
            }
        }

    }//GEN-LAST:event_btnSubmitActionPerformed

    private void textStadiumNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textStadiumNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textStadiumNameActionPerformed

    private void textTeamNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textTeamNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textTeamNameActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void textStadiumCapacityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textStadiumCapacityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textStadiumCapacityActionPerformed
    /**
     * Handles the event when the exit button is clicked. Exits the application.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param evt The ActionEvent triggering this method.
     */
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);//exit the system
    }//GEN-LAST:event_btnExitActionPerformed

    private void lblStadiumCapacityErrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStadiumCapacityErrMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblStadiumCapacityErrMouseEntered

    private void lblStadiumNameErrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStadiumNameErrMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblStadiumNameErrMouseEntered
    /**
     * Handles the event when the mouse enters the back button. Changes the
     * background color of the back button.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param evt The MouseEvent triggering this method.
     */
    private void btnBackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseEntered
        // TODO add your handling code here:
        btnBack.setBackground(java.awt.Color.decode("#CB997E"));
    }//GEN-LAST:event_btnBackMouseEntered
    /**
     * Handles the event when the mouse enters the exit button. Changes the
     * background color of the exit button.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param evt The MouseEvent triggering this method.
     */
    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        // TODO add your handling code here:
        btnExit.setBackground(java.awt.Color.decode("#CB997E"));
    }//GEN-LAST:event_btnExitMouseEntered
    /**
     * Handles the event when the mouse enters the submit button. Changes the
     * background color of the submit button.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param evt The MouseEvent triggering this method.
     */
    private void btnSubmitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseEntered
        // TODO add your handling code here:
        btnSubmit.setBackground(java.awt.Color.decode("#CB997E"));
    }//GEN-LAST:event_btnSubmitMouseEntered
    /**
     * Handles the event when the mouse exits the back button. Changes the
     * background color of the back button.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param evt The MouseEvent triggering this method.
     */
    private void btnBackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseExited
        // TODO add your handling code here:
        btnBack.setBackground(java.awt.Color.decode("#DDBEA9"));
    }//GEN-LAST:event_btnBackMouseExited
    /**
     * Handles the event when the mouse exits the exit button. Changes the
     * background color of the exit button.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param evt The MouseEvent triggering this method.
     */
    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        // TODO add your handling code here:
        btnExit.setBackground(java.awt.Color.decode("#DDBEA9"));
    }//GEN-LAST:event_btnExitMouseExited
    /**
     * Handles the event when the mouse exits the submit button. Changes the
     * background color of the submit button.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param evt The MouseEvent triggering this method.
     */
    private void btnSubmitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSubmitMouseExited
        // TODO add your handling code here:
        btnSubmit.setBackground(java.awt.Color.decode("#DDBEA9"));
    }//GEN-LAST:event_btnSubmitMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddTeamForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddTeamForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddTeamForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddTeamForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddTeamForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JLabel lblStadiumCapacityErr;
    private javax.swing.JLabel lblStadiumNameErr;
    private javax.swing.JLabel lblTeamNameErr;
    private javax.swing.JTextField textStadiumCapacity;
    private javax.swing.JTextField textStadiumName;
    private javax.swing.JTextField textTeamName;
    // End of variables declaration//GEN-END:variables
}
