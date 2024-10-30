/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;

/**
 * Represents the sports league, implementing Serializable. This class manages
 * the system-related information such as teamsList, assigned members list,
 * unassigned players list, teams ID, players ID, and manager ID.
 *
 * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
 * @version 1.0
 */
public class SportsLeagueSystem implements Serializable {

    /**
     * ArrayList to store all teams in the system.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    private static ArrayList<Team> teamsList = new ArrayList<Team>();

    /**
     * ArrayList to store all members in the system.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    private static ArrayList<Member> assignedMembersList = new ArrayList<Member>();

    /**
     * ArrayList to store all unassigned players in the system.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    private static ArrayList<Player> unAssignedPlayersList = new ArrayList<Player>();

    /**
     * Counter for generating unique IDs for teams.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    private static Integer teamsIds = 0;

    /**
     * Counter for generating unique IDs for players.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    private static Integer playersIds = 202400000;

    /**
     * Counter for generating unique IDs for managers.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    private static Integer managersIds = 300000000;

    /**
     * Constructs a new instance of the SportsLeague class. Initializes the
     * lists for teams, assigned members, and unassigned players.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    public SportsLeagueSystem() {
        teamsList = new ArrayList<Team>();
        assignedMembersList = new ArrayList<Member>(); // managers and assigned players
        unAssignedPlayersList = new ArrayList<Player>();

    }

    // getters
    /**
     * Name: getTeamsIds Purpose/Description: Retrieves the teams ID
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @return the team ID
     *
     */
    public static Integer getTeamsIds() {
        return teamsIds;
    }

    /**
     * Name: getManagersIds Purpose/Description: Retrieves the managers ID
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @return the manager ID
     */
    public static Integer getManagersIds() {
        return managersIds;
    }

    /**
     * Name: getPlayersIds Purpose/Description: Retrieves the players ID
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @return the players ID
     */
    public static Integer getPlayersIds() {
        return playersIds;
    }

    /**
     * Name: getTeamsList Purpose/Description: Retrieves the list of teams in
     * the system
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @return the list of teams
     */
    public static ArrayList<Team> getTeamsList() {
        if (teamsList == null) {
            teamsList = new ArrayList<Team>();
        }
        return teamsList;
    }

    /**
     * Name: getAssignedMembersList Purpose/Description: Retrieves the list of
     * assigned members in the system
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @return the list of assigned members
     */
    public static ArrayList<Member> getAssignedMembersList() {
        if (assignedMembersList == null) {
            assignedMembersList = new ArrayList<Member>();
        }
        return assignedMembersList;
    }

    /**
     * Name: getUnAssignedPlayersList Purpose/Description: Retrieves the list of
     * unassigned players list
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @return the list of unassigned players
     */
    public static ArrayList<Player> getUnAssignedPlayersList() {
        if (unAssignedPlayersList == null) {
            unAssignedPlayersList = new ArrayList<Player>();
        }
        return unAssignedPlayersList;
    }

    // setters
    /**
     * Name: setTeamIds Purpose/Description: setter method used to set the
     * team's ID.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param teamsIds the id of the team
     */
    public static void setTeamsIds(Integer teamsIds) {
        SportsLeagueSystem.teamsIds = teamsIds;
    }

    /**
     * Name: setPlayersIds Purpose/Description: setter method used to set the
     * player's ID.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param playersIds the id of the player
     */
    public static void setPlayersIds(Integer playersIds) {
        SportsLeagueSystem.playersIds = playersIds;
    }

    /**
     * Name: setManagerIds Purpose/Description: setter method used to set the
     * manager's ID.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param managersIds the id of the manager
     */
    public static void setManagersIds(Integer managersIds) {
        SportsLeagueSystem.managersIds = managersIds;
    }

    /**
     * Name: setTeamIds Purpose/Description: setter method used to set the the
     * teams' list.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param teamsList the list of the teams
     */
    public static void setTeamsList(ArrayList<Team> teamsList) {
        SportsLeagueSystem.teamsList = teamsList;
    }

    /**
     * Name: setAssignedMembersList Purpose/Description: setter method used to
     * set the assigned members' list.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param assignedMembersList the list of the assigned members
     */
    public static void setAssignedMembersList(ArrayList<Member> assignedMembersList) {
        SportsLeagueSystem.assignedMembersList = assignedMembersList;
    }

    /**
     * Name: setUnAssignedPlayersList Purpose/Description: setter method used to
     * set the unassigned players' list.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param list array list of unassigned players
     */
    public static void setUnAssignedPlayersList(ArrayList<Player> list) {
        unAssignedPlayersList = list != null ? list : new ArrayList<>();
    }

    // method to add team to the system
    /**
     * Name: addTeam Purpose/Description: Adds a new team to the sports league
     * system.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param teamName The name of the team to be added.
     * @param stadiumName The name of the stadium associated with the team.
     * @param stadiumCapacity The capacity of the stadium associated with the
     * team.
     */
    public static void addTeam(String teamName, String stadiumName, int stadiumCapacity) {
        try {
            Team team = new Team(++teamsIds, teamName, stadiumName, stadiumCapacity);
            teamsList.add(team);
        } catch (Exception e) {
            // Handle exceptions
            System.err.println("Error occurred while adding team: " + e.getMessage());
        }
    }

    //method to add player 
    /**
     * Name: addPlayerMember Purpose/Description: Adds a player to the list of
     * assigned members.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param playerId The unique identifier for the player.
     * @param playerName The name of the player.
     * @param playerAddress The address of the player.
     * @param playerDateOfBirth The date of birth of the player.
     * @param playerNationality The nationality of the player.
     * @param yearlySalary The yearly salary of the player.
     * @param fieldPosition The playing position of the player.
     * @param captain Indicates whether the player is a captain.
     * @return The player object that was added to the list.
     */
    public static Player addPlayerMember(int playerId, String playerName, String playerAddress, String playerDateOfBirth,
            String playerNationality, double yearlySalary, String fieldPosition, boolean captain) {

        Player player = new Player(fieldPosition, captain, playerId, playerName, playerAddress, playerDateOfBirth,
                playerNationality, yearlySalary);

        try {
            playersIds++;
            assignedMembersList.add(player);

        } catch (Exception e) {
            // Handle exceptions
            System.err.println("Error occurred while adding player member: " + e.getMessage());
        }
        return player;
    }

    //method to add manager member
    /**
     * Name: addManagerMember Purpose/Description: Adds a manager to the list of
     * assigned members.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param managerId The unique identifier for the manager.
     * @param managerName The name of the manager.
     * @param managerAddress The address of the manager.
     * @param managerDateOfBirth The date of birth of the manager.
     * @param managerNationality The nationality of the manager.
     * @param yearlySalary The yearly salary of the manager.
     * @param bonusPercentage The bonus percentage of the manager.
     * @param managerQualifications The qualifications of the manager.
     * @return The manager object that was added to the list.
     */
    public static Manager addManagerMember(int managerId, String managerName, String managerAddress, String managerDateOfBirth,
            String managerNationality, double yearlySalary, double bonusPercentage, String managerQualifications) {
        Manager manager = new Manager(bonusPercentage, managerQualifications, managerId, managerName,
                managerAddress, managerDateOfBirth, managerNationality, yearlySalary);
        try {
            managersIds++;
            assignedMembersList.add(manager); // add the new manager to the assignedMembers list
        } catch (Exception e) {
            // Handle exceptions
            System.err.println("Error occurred while adding manager member: " + e.getMessage());
        }
        return manager;
    }

    //method to add unassigned player member
    /**
     * Name: addUnassignedPlayerMember Purpose/Description: Adds an unassigned
     * player to the list of unAssignedPlayersList.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param playerId The unique identifier for the player.
     * @param playerName The name of the player.
     * @param playerAddress The address of the player.
     * @param playerDateOfBirth The date of birth of the player.
     * @param playerNationality The nationality of the player.
     * @param fieldPosition The playing position of the player.
     * @param captain Indicates whether the player is a captain.
     * @return The player object that was added to the list of unassigned
     * players.
     */
    public static Player addUnassignedPlayerMember(int playerId, String playerName, String playerAddress, String playerDateOfBirth,
            String playerNationality, String fieldPosition, boolean captain) {
        Player player = new Player(fieldPosition, captain, playerId, playerName, playerAddress, playerDateOfBirth,
                playerNationality);
        try {
            //String fieldPosition, boolean captain, int memberId, String memberName, String memberAddress, String dateOfBirth, String nationality
            playersIds++;
            unAssignedPlayersList.add(player);
        } catch (Exception e) {
            // Handle exceptions
            System.err.println("Error occurred while adding unassigned player member: " + e.getMessage());
        }
        return player;
    }

    // method to alter team's details
    /**
     * Name: alterTeam Purpose/Description: Alters a team that exists in the
     * system.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param teamId The unique identifier of the team to be altered.
     * @param teamName The new name of the team.
     * @param stadiumName The new name of the stadium associated with the team.
     * @param stadiumCapacity The new capacity of the stadium associated with
     * the team.
     * @return true if the team was successfully altered, false otherwise.
     */
    public static boolean alterTeam(int teamId, String teamName, String stadiumName, int stadiumCapacity) {
        boolean altered = false;
        try {
            Team tempTeam = searchTeam(teamId);
            if (tempTeam != null) {
                tempTeam.setTeamName(teamName);
                tempTeam.setStadiumName(stadiumName);
                tempTeam.setStadiumCapacity(stadiumCapacity);
                altered = true;
            } else {
                // Handle case when team with given ID is not found
                throw new IllegalArgumentException("Team with ID " + teamId + " not found.");
            }
        } catch (IllegalArgumentException e) {
            // Handle exception
            System.err.println(e.getMessage());
        } catch (Exception e) {
            // Handle other exceptions
            System.err.println("An error occurred while altering team details: " + e.getMessage());
        }
        return altered;
    }

    // method to alter player
    /**
     * Name: alterPlayerMember Purpose/Description: Alters a player that exists
     * in the system.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param playerId The unique identifier of the player to be altered.
     * @param fieldPosition The new playing position of the player.
     * @param captain Indicates whether the player is a captain.
     * @param memberName The new name of the player.
     * @param memberAddress The new address of the player.
     * @param dateOfBirth The new date of birth of the player.
     * @param nationality The new nationality of the player.
     * @return true if the player was successfully altered, false otherwise.
     */
    public static boolean alterPlayerMember(int playerId, String fieldPosition, boolean captain, String memberName,
            String memberAddress, String dateOfBirth, String nationality) {
        boolean altered = false;
        try {
            Player tempMember = (Player) searchMember(playerId);
            if (tempMember != null && tempMember instanceof Player) {
                tempMember.setFieldPosition(fieldPosition);
                tempMember.setCaptain(captain);
                tempMember.setMemberName(memberName);
                tempMember.setMemberAddress(memberAddress);
                tempMember.setDateOfBirth(dateOfBirth);
                tempMember.setNationality(nationality);
                altered = true;
            } else {
                // Handle case when player with given ID is not found or not a player
                throw new IllegalArgumentException("Player with ID " + playerId + " not found or not a player.");
            }
        } catch (IllegalArgumentException e) {
            // Handle exception
            System.err.println(e.getMessage());
        } catch (Exception e) {
            // Handle other exceptions
            System.err.println("An error occurred while altering player details: " + e.getMessage());
        }
        return altered;
    }

    // method to alter manager
    /**
     * Name: alterManagerMember Purpose/Description: Alters a manager that
     * exists in the system.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param managerId The unique identifier of the manager to be altered.
     * @param bonusPercentage The new bonus percentage of the manager.
     * @param coachingQualifications The new coaching qualifications of the
     * manager.
     * @param memberName The new name of the manager.
     * @param memberAddress The new address of the manager.
     * @param dateOfBirth The new date of birth of the manager.
     * @param nationality The new nationality of the manager.
     * @param yearlySalary The new yearly salary of the manager.
     * @return true if the manager was successfully altered, false otherwise.
     */
    public static boolean alterManagerMember(int managerId, double bonusPercentage, String coachingQualifications,
            String memberName, String memberAddress, String dateOfBirth, String nationality, double yearlySalary) {
        boolean altered = false;
        try {
            Manager tempMember = (Manager) searchMember(managerId);
            if (tempMember != null && tempMember instanceof Manager) {
                tempMember.setBonusPercentage(bonusPercentage);
                tempMember.setCoachingQualifications(coachingQualifications);
                tempMember.setMemberName(memberName);
                tempMember.setMemberAddress(memberAddress);
                tempMember.setDateOfBirth(dateOfBirth);
                tempMember.setNationality(nationality);
                tempMember.setYearlySalary(yearlySalary);
                altered = true;
            } else {
                // Handle case when manager with given ID is not found or not a manager
                throw new IllegalArgumentException("Manager with ID " + managerId + " not found or not a manager.");
            }
        } catch (IllegalArgumentException e) {
            // Handle exception
            System.err.println(e.getMessage());
        } catch (Exception e) {
            // Handle other exceptions
            System.err.println("An error occurred while altering manager details: " + e.getMessage());
        }
        return altered;
    }

    /**
     * Name: deleteTeam Purpose/Description: Deletes a team that exists in the
     * system.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param teamId The unique identifier of the team to be deleted.
     */
    public static void deleteTeam(int teamId) {
        try {
            // Search for the team in the teams list
            int teamIndex = searchTeamIndex(teamId);
            if (teamIndex != -1) {
                Team deletedTeam = SportsLeagueSystem.getTeamsList().get(teamIndex);
                for (int i = 0; i < unAssignedPlayersList.size(); i++) {
                    System.out.println("Player: " + unAssignedPlayersList.get(i).getMemberName());
                }
                System.out.println("-------------- after removing ");
                // Remove the team manager from the system
                Manager teamManager = deletedTeam.getTeamManager();
                if (teamManager != null) {
                    // Remove the manager from the assigned members list
                    assignedMembersList.remove(searchMemberIndex(deletedTeam.getTeamManager().getMemberId()));

                }

                // Retrieve the players list of the deleted team
                ArrayList<Player> playersList = deletedTeam.getTeamPlayers();

                // Add players to the unassigned players list
                for (Player player : playersList) {
                    // Check if the player is not the manager
                    assignedMembersList.remove(player);
                    unAssignedPlayersList.add(player);

                }

                // Clear the players list of the deleted team
                playersList.clear();

                // Remove the team from the teams list
                SportsLeagueSystem.getTeamsList().remove(teamIndex);

                for (int i = 0; i < unAssignedPlayersList.size(); i++) {
                    System.out.println("Player: " + unAssignedPlayersList.get(i).getMemberName());
                }

                System.out.println("Team " + deletedTeam.getTeamName() + " deleted successfully.");
            } else {
                System.out.println("Team with ID " + teamId + " not found.");
            }
        } catch (Exception e) {
            // Handle exceptions
            System.err.println("An error occurred while deleting team: " + e.getMessage());
        }
    }

    // method to remove player from team - if team was deleted
    /**
     * Name: removePlayerFromTeam Purpose/Description: Removes a player from a
     * team.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param teamId The unique identifier of the team from which the player is
     * to be removed.
     * @param playerId The unique identifier of the player to be removed from
     * the team.
     */
    public static void removePlayerFromTeam(int teamId, int playerId) {
        try {
            if (searchTeamIndex(teamId) != 99999) {// if team was found
                // loop through the team players list and remove the player
                for (int i = 0; i < teamsList.get(searchTeamIndex(teamId)).getTeamPlayers().size(); i++) {
                    if (teamsList.get(searchTeamIndex(teamId)).getTeamPlayers().get(i).getMemberId() == playerId) {
                        // removing the player from team
                        teamsList.get(searchTeamIndex(teamId)).getTeamPlayers().remove(i);
                        for (int m = 0; m < assignedMembersList.size(); m++) {
                            if (assignedMembersList.get(m).getMemberId() == playerId) {
                                // move it to unassigned list
                                unAssignedPlayersList.add((Player) assignedMembersList.get(m));
                                // removing the player from assignedMembers
                                assignedMembersList.remove(m);

                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            // Handle exceptions
            System.err.println("An error occurred while removing player from team: " + e.getMessage());
        }
    }

    // method to delete member from the system
    /**
     * Name: deleteMember Purpose/Description: Deletes a member (manager or
     * player) from the system.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param member The member to be deleted from the system.
     */
    public static void deleteMember(Member member) {

        try {
            ArrayList<Manager> managersList = new ArrayList<Manager>();
            for (Member member1 : assignedMembersList) {
                if (member1 instanceof Manager) {
                    managersList.add((Manager) member1);
                }
            }
            // if manager
            if (member instanceof Manager && managersList.size() != 0) {
                // search for the manager in assignedMembersList and remove it
                for (Team team : getTeamsList()) {
                    Manager teamManager = team.getTeamManager();
                    if (teamManager != null && teamManager.getMemberId() == member.getMemberId()) {
                        team.setTeamManager(null); // Set the team manager to null
                    }
                }

                assignedMembersList.remove(searchMemberIndex(member.getMemberId()));

            }
            // if player
            if (member instanceof Player) {
                boolean found = false;
                // check unassigned players list
                for (int i = 0; i < unAssignedPlayersList.size(); i++) {
                    if (unAssignedPlayersList.get(i).getMemberId() == member.getMemberId()) {
                        found = true;
                        unAssignedPlayersList.remove(i);// remove the player from the list

                    }
                }

                if (!found) {
                    for (Team team : teamsList) {
                        ArrayList<Player> teamPlayers = team.getTeamPlayers();
                        if (teamPlayers != null) {
                            for (Player player : teamPlayers) {
                                if (player != null && player.getMemberId() == member.getMemberId()) {
                                    assignedMembersList.remove(searchMemberIndex(member.getMemberId()));
                                    teamPlayers.remove(player);
                                    break; // Exit the loop once player is found and removed from team
                                }
                            }
                        }
                    }
                }

            }
        } catch (Exception e) {
            // Handle exceptions
            System.err.println("An error occurred while deleting member: " + e.getMessage());
        }

    }

    // Method to see list of assigned players and manager of a team
    /**
     * Name: displayTeamMembers Purpose/Description: Displays the players and
     * managers of a team.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param teamId The unique identifier of the team.
     * @return An ArrayList containing the members (players and managers) of the
     * team.
     */
    public static ArrayList<Member> displayTeamMembers(int teamId) {
        ArrayList<Member> membersList = new ArrayList<>();
        try {
            Team tempTeam = searchTeam(teamId);
            if (tempTeam != null) {
                // Adding team manager to the list
                if (tempTeam.getTeamManager() != null) {
                    membersList.add(tempTeam.getTeamManager());
                }

                // Adding players to the list
                if (tempTeam.getTeamPlayers() != null) {
                    membersList.addAll(tempTeam.getTeamPlayers());
                }

            }
        } catch (Exception e) {
            // Handle exceptions
            System.err.println("An error occurred while displaying team members: " + e.getMessage());
        }
        return membersList;
    }

    // method to transfer/assign player to team
    /**
     * Name: transferOrAssignToTeam Purpose/Description: Transfers or assigns a
     * player to a team.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param choice The choice indicating whether to assign (1) or transfer (2)
     * the player.
     * @param memberId The unique identifier of the player to be transferred or
     * assigned.
     * @param teamId The unique identifier of the team to which the player is to
     * be transferred or assigned.
     */
    public static void transferOrAssignToTeam(int choice, int memberId, int teamId) {
        try {
            Member tempPlayer = searchMember(memberId);
            Team tempTeam = searchTeam(teamId);

            if (choice == 1) { // for assigning players
                // Check if the player exists in the unAssignedPlayersList
                int playerIndex = searchMemberIndex(memberId);
                if (playerIndex != -1) {
                    // Add the player to the team
                    tempTeam.getTeamPlayers().add((Player) tempPlayer);
                    assignedMembersList.add(tempPlayer);
                    // Remove the player from the unassigned players list
                    unAssignedPlayersList.remove(playerIndex);
                } else {
                    System.out.println("Player not found in the unassigned players list.");
                }
            } else if (choice == 2) { // for transferring players
                // Find and remove the player from their old team
                boolean playerRemoved = false;
                for (Team team : teamsList) {
                    if (team != tempTeam) {
                        for (Player player : team.getTeamPlayers()) {
                            if (player.getMemberId() == memberId) {
                                team.getTeamPlayers().remove(player);
                                playerRemoved = true;
                                break;
                            }
                        }
                    }
                    if (playerRemoved) {
                        break;
                    }
                }

                if (!playerRemoved) {
                    System.out.println("Player's old team not found.");
                }

                // Add the player to the new team's players list
                tempTeam.getTeamPlayers().add((Player) tempPlayer);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }

// method to designate player as captain
    /**
     * Name: designatePlayerAsCaptain Purpose/Description: Designates a player
     * as the team captain of a team.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param teamId The unique identifier of the team.
     * @param playerId The unique identifier of the player to be designated as
     * captain.
     */
    public static void designatePlayerAsCaptain(int teamId, int playerId) {
        // Find the team in the teamList 
        Team tempTeam = searchTeam(teamId);
        Player tempPlayer = null;
        boolean found = false;
        int capMember = -1; // Initialize capMember outside the block

        if (tempTeam != null) {
            // Loop through the team's members and find if selected player is captain or not
            for (int i = 0; i < searchTeam(teamId).getTeamPlayers().size(); i++) {
                if (searchTeam(teamId).getTeamPlayers().get(i).getMemberId() == playerId) {
                    found = true;
                    tempPlayer = searchTeam(teamId).getTeamPlayers().get(i);
                    break;
                }
            }

            if (found) {
                // Loop through the team's players and unassign the current captain
                for (int i = 0; i < searchTeam(teamId).getTeamPlayers().size(); i++) {
                    // search for the current captain
                    if (searchTeam(teamId).getTeamPlayers().get(i).isCaptain()) {
                        // unassign the current captain in the team's players list
                        searchTeam(teamId).getTeamPlayers().get(i).setCaptain(false);
                        capMember = searchTeam(teamId).getTeamPlayers().get(i).getMemberId();
                        break;
                    }
                }

                // Update captain status in assignedMembersList
                for (Member member : assignedMembersList) {
                    if (member instanceof Player && member.getMemberId() == capMember) {
                        ((Player) member).setCaptain(false);
                    }
                    if (member instanceof Player && member.getMemberId() == playerId) {
                        ((Player) member).setCaptain(true);
                    }
                }

                // Assign the player as the captain in the team's players list
                tempPlayer.setCaptain(true);
            } else {
                // Player was not found in the team's players list
                System.out.println("Player not found in the team's players list.");
            }
        } else {
            // Team not found
            System.out.println("Team not found.");
        }
    }

    // method to calculate the fortnight salary
    /**
     * Name: calcFortnightSalary Purpose/Description: Calculates the fortnightly
     * salary for a member.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param member The member for whom the fortnightly salary is to be
     * calculated.
     * @return The calculated fortnightly salary.
     */
    public static double calcFortnightSalary(Member member) {
        return member.getYearlySalary() / 26; // since there are 26 fortnights in a year
    }

    //to round the numbers to 2 decimals
    /**
     * Name: roundToTwoDecimalPlaces Purpose/Description: Rounds a number to two
     * decimal places.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param number The number to be rounded.
     * @return The rounded number.
     */
    public static double roundToTwoDecimalPlaces(double number) {
        BigDecimal bd = new BigDecimal(number).setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    // method to produce the pay report
    /**
     * Name: producePayReport Purpose/Description: Generates a payroll report
     * for the teams in the system and writes it to a file named "payroll.txt".
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    public static void producePayReport() {

        try (FileWriter writer = new FileWriter("payroll.txt")) {
            double leagueTotal = 0.0; // total due for all teams in the league
            //if there are teams in the system, loopt through the teams list and print the details 
            if (teamsList.size() != 0) {
                for (Team team : teamsList) {
                    writer.write("Team: " + team.getTeamName() + " -------\n");
                    double teamTotal = 0;
                    // Generate payroll for the team manager
                    Manager manager = team.getTeamManager();
                    if (manager != null) {
                        double managerSalary = calcFortnightSalary(manager);

                        writer.write(
                                "Manager Name: " + manager.getMemberName() + ", ID: " + manager.getMemberId() + ", 2 weeks pay:"
                                + roundToTwoDecimalPlaces(managerSalary) + "\n");
                        teamTotal += roundToTwoDecimalPlaces(managerSalary);
                    } else {
                        writer.write("No manager found for this team!\n");
                    }
                    if (team.getTeamPlayers().size() != 0) {
                        // Generate payroll for the team players
                        for (Player player : team.getTeamPlayers()) {
                            double playerSalary = calcFortnightSalary(player);
                            writer.write("Player: " + player.getMemberName() + ", ID: " + player.getMemberId()
                                    + ", 2 weeks pay:" + roundToTwoDecimalPlaces(playerSalary) + "\n");
                            teamTotal += roundToTwoDecimalPlaces(playerSalary);
                        }
                    } else {
                        writer.write("No players found for this team.\n");
                    }

                    // Write total amount for the team
                    writer.write("Total amount for the team: " + roundToTwoDecimalPlaces(teamTotal) + "\n\n");
                    writer.write("---------------------------\n\n");

                    // Add team total to league total
                    leagueTotal += roundToTwoDecimalPlaces(teamTotal);
                }
                // Write total amount for the league
                writer.write("Total amount for the league: " + roundToTwoDecimalPlaces(leagueTotal) + "\n");

            } else {
                //if no teams found in the system. 
                writer.write("No Teams found in the system, the total amount for the league is 0.0\n");
            }

        } catch (IOException ex) {
            // Handle IOException
            System.err.println("An error occurred while writing to the file: " + ex.getMessage());
            java.util.logging.Logger.getLogger(SportsLeagueSystem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Name: searchTeam Purpose/Description: Searches for a team in the
     * arrayList of teams based on the provided team ID.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param teamId The ID of the team to search for.
     * @return The team with the specified ID if found, otherwise returns null.
     */
    public static Team searchTeam(int teamId) {
        Team tempTeam = null;
        try {
            for (int i = 0; i < teamsList.size(); i++) {
                if (teamsList.get(i).getTeamId() == teamId) {
                    tempTeam = teamsList.get(i);
                    break;
                }
            }
        } catch (NullPointerException e) {
            // Handle null pointer exception
            System.err.println("An error occurred while searching for team: " + e.getMessage());
            e.printStackTrace();
        }
        return tempTeam;
    }

    /**
     * Name: searchMember Purpose/Description: Searches for a member in the
     * arrayList of assigned members and unassigned players based on the
     * provided member ID.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param memberId The ID of the member to search for.
     * @return The member with the specified ID if found, otherwise returns
     * null.
     */
    public static Member searchMember(int memberId) {
        Member tempMember = null;
        try {
            for (int i = 0; i < assignedMembersList.size(); i++) {
                if (assignedMembersList.get(i).getMemberId() == memberId) {
                    tempMember = assignedMembersList.get(i);
                    break;
                }
            }
            // if not found in assignedMembersList, search in unassigned players list
            if (tempMember == null) {
                for (int i = 0; i < unAssignedPlayersList.size(); i++) {
                    if (unAssignedPlayersList.get(i).getMemberId() == memberId) {
                        tempMember = unAssignedPlayersList.get(i);
                        break;
                    }
                }
            }
        } catch (NullPointerException e) {
            // Handle null pointer exception
            System.err.println("An error occurred while searching for member: " + e.getMessage());
            e.printStackTrace();
        }
        return tempMember;
    }

    /**
     * Name: searchTeamIndex Purpose/Description: Searches for the index of a
     * specific team in the arrayList of teams based on the provided team ID.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param teamId The ID of the team to search for.
     * @return The index of the team in the arrayList if found, otherwise
     * returns -1.
     */
    public static int searchTeamIndex(int teamId) {
        int index = -1; // default index when not found
        try {
            for (int i = 0; i < teamsList.size(); i++) {
                if (teamsList.get(i).getTeamId() == teamId) {
                    index = i;
                    break;
                }
            }
        } catch (NullPointerException e) {
            // Handle null pointer exception
            System.err.println("An error occurred while searching for team index: " + e.getMessage());
            e.printStackTrace();
        }
        return index;
    }

    /**
     * Name: searchMemberIndex Purpose/Description: Searches for the index of a
     * specific member in the arrayList of members based on the provided member
     * ID.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param memberId The ID of the member to search for.
     * @return The index of the member in the arrayList if found, otherwise
     * returns -1.
     */
    public static int searchMemberIndex(int memberId) {
        int index = -1; // default index when not found
        try {
            for (int i = 0; i < assignedMembersList.size(); i++) {
                if (assignedMembersList.get(i).getMemberId() == memberId) {
                    index = i;
                    break;
                }
            }
            // if not found in assignedMembersList, search in unassigned players list
            if (index == -1) {
                for (int j = 0; j < unAssignedPlayersList.size(); j++) {
                    if (unAssignedPlayersList.get(j).getMemberId() == memberId) {
                        index = j;
                        break;
                    }
                }
            }
        } catch (NullPointerException e) {
            // Handle null pointer exception
            System.err.println("An error occurred while searching for member index: " + e.getMessage());
            e.printStackTrace();
        }
        return index;
    }
}
