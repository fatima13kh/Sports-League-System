/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 * This class represents the Welcome Screen GUI for the Sports League System. It
 * provides functionality to initialize system data from a startup file,
 * serialize and deserialize data, and manage the main menu and exit functions.
 *
 * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
 */
import Logic.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The WelcomeScreen class provides a graphical user interface for the Sports
 * League System. It allows users to interact with the system, including
 * accessing the main menu, exiting the program, and performing data
 * serialization and deserialization operations.
 *
 * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
 */
public class WelcomeScreen extends javax.swing.JFrame {

    private static boolean flagFileExists = false;

//    static Logic.SportsLeagueSystem sls;
    /**
     * Creates new form WelcomeScreen
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    static SportsLeagueSystem sls;

    /**
     * Creates new form WelcomeScreen and initializes system data from a startup
     * file.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    public WelcomeScreen() {

//      sls= new SportsLeagueSystem(); 
        // Initialize system data from startup file
        initializeFromStartupFile();
        initComponents();

    }

    //add data from the startup file in the 
    /**
     * Name: initializeFromStartupFile Purpose/Description: Initializes system
     * data from a startup file if it exists.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    static File startFlagFile = new File("startFlag.txt");

    /**
     *
     */
    public static void initializeFromStartupFile() {
//   File startFlagFile = new File("startFlag.txt");
        if (!startFlagFile.exists()) {
//        flagFileExists=true;
            try (Scanner scanner = new Scanner(new File("startup.txt"))) {
                // Read the number of team records
                while (scanner.hasNext()) {
                    //read number of teams
                    int numOfTeams = Integer.parseInt(scanner.nextLine());

                    // Read each team record
                    for (int i = 0; i < numOfTeams; i++) {
                        // Read team details
                        String teamName = scanner.nextLine();
                        String stadiumName = scanner.nextLine();
                        int stadiumCapacity = Integer.parseInt(scanner.nextLine());

                        // Create team object and add to system      
                        SportsLeagueSystem.addTeam(teamName, stadiumName, stadiumCapacity);

                        // Read manager details
                        String managerName = scanner.nextLine();
                        String managerAddress = scanner.nextLine();
                        String managerDOB = scanner.nextLine();
                        String managerNationality = scanner.nextLine();
                        double managerYearlySalary = Double.parseDouble(scanner.nextLine());
                        double bonusPercentage = Double.parseDouble(scanner.nextLine());
                        String managerQualifications = scanner.nextLine();

                        // add to members list
                        Integer managerId = SportsLeagueSystem.getManagersIds();
                        Manager m = SportsLeagueSystem.addManagerMember(managerId, managerName, managerAddress, managerDOB, managerNationality, managerYearlySalary, bonusPercentage, managerQualifications);

                        SportsLeagueSystem.getTeamsList().get(i).setTeamManager(m);

                        // Read number of players for the team
                        int numPlayers = Integer.parseInt(scanner.nextLine());

                        // Read each player record
                        for (int j = 0; j < numPlayers; j++) {
                            // Read player details
                            String playerName = scanner.nextLine();
                            String playerAddress = scanner.nextLine();
                            String playerDOB = scanner.nextLine();
                            String playerNationality = scanner.nextLine();
                            double playerSalary = Double.parseDouble(scanner.nextLine());
                            String playerPosition = scanner.nextLine();
                            String isCaptainStr = scanner.nextLine();
                            boolean isCaptain = false;
                            if (isCaptainStr.equalsIgnoreCase("Captain")) {
                                isCaptain = true;
                            } else if (isCaptainStr.equalsIgnoreCase("Not Captain")) {
                                isCaptain = false;
                            } else {
                                //error
                            }

                            // Add player to members list
                            Integer playerId = SportsLeagueSystem.getPlayersIds();
                            Player p = SportsLeagueSystem.addPlayerMember(playerId, playerName, playerAddress, playerDOB, playerNationality, playerSalary, playerPosition, isCaptain);

                            SportsLeagueSystem.getTeamsList().get(i).getTeamPlayers().add((Player) SportsLeagueSystem.searchMember(p.getMemberId()));

                        }
                    }
                    // Read unassigned players
                    if (scanner.hasNext()) {
                        int numUnassignedPlayers = Integer.parseInt(scanner.nextLine());
                        for (int i = 0; i < numUnassignedPlayers; i++) {
                            // Read player details
                            String playerName = scanner.nextLine();
                            String playerAddress = scanner.nextLine();
                            String playerDOB = scanner.nextLine();
                            String playerNationality = scanner.nextLine();
                            double playerSalary = Double.parseDouble(scanner.nextLine());
                            String playerPosition = scanner.nextLine();
                            String isCaptainStr = scanner.nextLine();
                            boolean isCaptain = false;
                            if (isCaptainStr.equalsIgnoreCase("Captain")) {
                                isCaptain = true;
                            } else if (isCaptainStr.equalsIgnoreCase("Not Captain")) {
                                isCaptain = false;
                            } else {
                                //error
                            }

                            //add the unassigned player to the system
                            Integer uplayerId = SportsLeagueSystem.getPlayersIds();

                            SportsLeagueSystem.addUnassignedPlayerMember(uplayerId, playerName, playerAddress, playerDOB, playerNationality, playerPosition, isCaptain);
                        }
                    }
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(WelcomeScreen.class.getName()).log(Level.SEVERE, null, ex);
            }

            try {
                startFlagFile.createNewFile();

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            // nothing will happen because the file has been executed before
            System.out.println("Won't run again");

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnMainMenu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(107, 112, 92));
        jPanel1.setPreferredSize(new java.awt.Dimension(1220, 630));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Futura", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sports League System");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 720, -1));

        btnMainMenu.setBackground(new java.awt.Color(221, 190, 169));
        btnMainMenu.setFont(new java.awt.Font("Futura", 0, 20)); // NOI18N
        btnMainMenu.setText("Main Menu");
        btnMainMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMainMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMainMenuMouseExited(evt);
            }
        });
        btnMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainMenuActionPerformed(evt);
            }
        });
        jPanel1.add(btnMainMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 380, 220, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI.Images/logo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 290, 330));

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
        jPanel1.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 50, 120, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI.Images/welcomeScreenImage.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 1150, 540));

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

    private void btnMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainMenuActionPerformed
        //Open Main Menu Frame 

        MainMenu mainmenu = new MainMenu();
        mainmenu.setVisible(true);//show the main menu window
        setVisible(false);//hide the current window
    }//GEN-LAST:event_btnMainMenuActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0); //exit the system
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnMainMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMainMenuMouseEntered
        // TODO add your handling code here:
        //hover effect
        btnMainMenu.setBackground(java.awt.Color.decode("#CB997E"));
    }//GEN-LAST:event_btnMainMenuMouseEntered

    private void btnMainMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMainMenuMouseExited
        // TODO add your handling code here:
        btnMainMenu.setBackground(java.awt.Color.decode("#DDBEA9"));
    }//GEN-LAST:event_btnMainMenuMouseExited

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        // TODO add your handling code here:
        //hover effect
        btnExit.setBackground(java.awt.Color.decode("#CB997E"));
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        // TODO add your handling code here:
        btnExit.setBackground(java.awt.Color.decode("#DDBEA9"));
    }//GEN-LAST:event_btnExitMouseExited

    /**
     * Name: serializeTeamsList Purpose/Description: Serializes the teams list
     * data to a file.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    public static void serializeTeamsList() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("TeamsData.dat"))) {
            outputStream.writeObject(SportsLeagueSystem.getTeamsList());
            System.out.println("Teams data has been serialized.");
            outputStream.close();
        } catch (IOException e) {
            System.err.println("An error occurred during serialization: " + e.getMessage());
        }
    }

    // Method to deserialize teamsList ArrayList
    /**
     *
     * Name: deserializeTeamsList Purpose/Description: Deserializes the teams
     * list data from a file.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     *
     */
    public static void deserializeTeamsList() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("TeamsData.dat"))) {
            @SuppressWarnings("unchecked")
            ArrayList<Team> teamsList = (ArrayList<Team>) inputStream.readObject();
            SportsLeagueSystem.setTeamsList(teamsList);
            System.out.println("Teams data has been deserialized.");
            inputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("An error occurred during deserialization: " + e.getMessage());
        }
    }

    // Method to serialize teamsIds
    /**
     * Name: serializeTeamsIds Purpose/Description: Serializes the teams IDs
     * data to a file.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    public static void serializeTeamsIds() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("TeamsIds.dat"))) {
            outputStream.writeObject(SportsLeagueSystem.getTeamsIds());
            System.out.println("Teams IDs data has been serialized.");
            outputStream.close();
        } catch (IOException e) {
            System.err.println("An error occurred during serialization: " + e.getMessage());
        }
    }

    // Method to deserialize teamsIds
    /**
     * Name: deserializeTeamsIds Purpose/Description: Deserializes the teams Ids
     * data from a file.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    public static void deserializeTeamsIds() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("TeamsIds.dat"))) {
            @SuppressWarnings("unchecked")
            Integer teamsIds = (Integer) inputStream.readObject();
            SportsLeagueSystem.setTeamsIds(teamsIds);
            System.out.println("Teams IDs data has been deserialized.");
            inputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("An error occurred during deserialization: " + e.getMessage());
        }
    }

    /**
     * Name: serializeManagersIds Purpose/Description: Serializes the managers
     * IDs data to a file.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    public static void serializeManagersIds() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("ManagersIds.dat"))) {
            outputStream.writeObject(SportsLeagueSystem.getManagersIds());
            System.out.println("Managers IDs data has been serialized.");
            outputStream.close();
        } catch (IOException e) {
            System.err.println("An error occurred during serialization: " + e.getMessage());
        }
    }

    // Method to deserialize teamsIds
    /**
     * Name: deserializeManagersIds Purpose/Description: Deserializes the
     * managers IDs data from a file.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    public static void deserializeManagersIds() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("ManagersIds.dat"))) {
            @SuppressWarnings("unchecked")
            Integer managersIds = (Integer) inputStream.readObject();
            SportsLeagueSystem.setManagersIds(managersIds);
            System.out.println("Teams IDs data has been deserialized.");
            inputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("An error occurred during deserialization: " + e.getMessage());
        }
    }

    /**
     * Name: serializePlayersIds Purpose/Description: Serializes the players IDs
     * data to a file.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    public static void serializePlayersIds() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("PlayersIds.dat"))) {
            outputStream.writeObject(SportsLeagueSystem.getPlayersIds());
            System.out.println("Players IDs data has been serialized.");
            outputStream.close();
        } catch (IOException e) {
            System.err.println("An error occurred during serialization: " + e.getMessage());
        }
    }

    // Method to deserialize teamsIds
    /**
     * Name: deserializePlayersIds Purpose/Description: Deserializes the players
     * IDs data from a file.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    public static void deserializePlayersIds() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("PlayersIds.dat"))) {
            @SuppressWarnings("unchecked")
            Integer playersIds = (Integer) inputStream.readObject();
            SportsLeagueSystem.setPlayersIds(playersIds);
            System.out.println("Players IDs data has been deserialized.");
            inputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("An error occurred during deserialization: " + e.getMessage());
        }
    }

    /**
     * Name: serializeAssignedMembers Purpose/Description: Serializes the
     * assigned members list data to a file.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    public static void serializeAssignedMembers() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("AssignedMembersData.dat"))) {

            outputStream.writeObject(SportsLeagueSystem.getAssignedMembersList());
            System.out.println("Assigned members data has been serialized.");
            outputStream.close();
        } catch (IOException e) {
            System.err.println("An error occurred during serialization: " + e.getMessage());
        }
    }

    /**
     * Name: deserializeAssignedMembers Purpose/Description: Deserializes the
     * assigned members list data from a file.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    public static void deserializeAssignedMembers() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("AssignedMembersData.dat"))) {
            @SuppressWarnings("unchecked")
            ArrayList<Member> assignedMembersList = (ArrayList<Member>) inputStream.readObject();
            SportsLeagueSystem.setAssignedMembersList(assignedMembersList);
            System.out.println("Assigned members data has been deserialized.");
            inputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("An error occurred during deserialization: " + e.getMessage());
        }
    }

    /**
     * Name: serializeUnAssignedPlayers Purpose/Description: Serializes the
     * unassigned members list data to a file.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    public static void serializeUnAssignedPlayers() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("UnAssignedPlayersData.dat"))) {

            outputStream.writeObject(SportsLeagueSystem.getUnAssignedPlayersList());
            System.out.println("UnAssigned players data has been serialized.");
            outputStream.close();
            for (Member me : SportsLeagueSystem.getUnAssignedPlayersList()) {
                System.out.println("---Name:" + me.getMemberName());
            }

        } catch (IOException e) {
            System.err.println("An error occurred during serialization: " + e.getMessage());
        }
    }

    /**
     * Name: deserializeUnAssignedPlayers Purpose/Description: Deserializes the
     * unassigned members list data from a file.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    public static void deserializeUnAssignedPlayers() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("UnAssignedPlayersData.dat"))) {
            @SuppressWarnings("unchecked")
            ArrayList<Player> unAssignedPlayers = (ArrayList<Player>) inputStream.readObject();
            SportsLeagueSystem.setUnAssignedPlayersList(unAssignedPlayers);
            System.out.println("UnAssigned players data has been deserialized.");
            inputStream.close();

            for (Member me : SportsLeagueSystem.getUnAssignedPlayersList()) {
                System.out.println("---Name:" + me.getMemberName());
            }

        } catch (IOException | ClassNotFoundException e) {
            System.err.println("An error occurred during deserialization: " + e.getMessage());
        }
    }

    /**
     * Main method to launch the WelcomeScreen GUI. It sets up serialization
     * hooks and starts the GUI event loop.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param args The command line arguments.
     */
    public static void main(String args[]) {

        // Serialization hooks
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            serializeTeamsList();
            serializeTeamsIds();
            serializeManagersIds();
            serializePlayersIds();
            serializeAssignedMembers();
            serializeUnAssignedPlayers();

        }));

        // Deserialization methods
        if (startFlagFile.exists()) {
            deserializeTeamsList();
            deserializeTeamsIds();
            deserializeManagersIds();
            deserializePlayersIds();
            deserializeAssignedMembers();
            deserializeUnAssignedPlayers();
        }

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
            java.util.logging.Logger.getLogger(WelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WelcomeScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        // GUI setup and display
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WelcomeScreen().setVisible(true);
            }
        });

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnMainMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
