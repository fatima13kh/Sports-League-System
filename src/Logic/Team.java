package Logic;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Represents a Team in a sports league, implementing Serializable. This class
 * manages team-related information such as team ID, name, stadium details, team
 * players, and team manager.
 *
 * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
 * @version 1.0
 */
public class Team implements Serializable {

    /**
     * Represents a sports team in the system.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    private int teamId; // The unique identifier of the team.

    /**
     * The name of the team.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    private String teamName;

    /**
     * The name of the stadium where the team plays its home games.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    private String stadiumName;

    /**
     * The capacity of the stadium where the team plays its home games.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    private int stadiumCapacity;

    /**
     * The list of players who are members of the team.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    private ArrayList<Player> teamPlayers;

    /**
     * The manager of the team.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    private Manager teamManager;

    //Default Constructors
    /**
     * Name: Team Purpose/Description: Constructs a new Team object with default
     * values. Default values are: teamId: 0 teamName: null stadiumName: null
     * stadiumCapacity: 0 teamPlayers: an empty ArrayList teamManager: null
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    public Team() {
        teamId = 0;
        teamName = null;
        stadiumName = null;
        stadiumCapacity = 0;
        teamPlayers = new ArrayList<Player>();
        teamManager = null;
    }

    //Custom Constructor
    /**
     * Name: Team Purpose/Description: Constructs a new Team object with
     * specified values for team ID, team name, stadium name, and stadium
     * capacity.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param teamId The ID of the team.
     * @param teamName The name of the team.
     * @param stadiumName The name of the stadium where the team plays.
     * @param stadiumCapacity The capacity of the stadium.
     */
    public Team(int teamId, String teamName, String stadiumName, int stadiumCapacity) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.stadiumName = stadiumName;
        this.stadiumCapacity = stadiumCapacity;
        this.teamPlayers = new ArrayList<Player>();
        this.teamManager = null;
    }

    //Getters 
    /**
     * Name: getTeamId Purpose/Description: getter method used to retrieve the
     * value of teamId
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @return teamId
     */
    public int getTeamId() {
        return teamId;
    }

    /**
     * Name: getTeamName Purpose/Description: getter method used to retrieve the
     * value of teamName
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @return teamName
     */
    public String getTeamName() {
        return teamName;
    }

    /**
     * Name: getStadiumName Purpose/Description: getter method used to retrieve
     * the value of stadium name
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @return stadiumName
     */
    public String getStadiumName() {
        return stadiumName;
    }

    /**
     * Name: getStadiumCapacity Purpose/Description: getter method used to
     * retrieve the value of stadium capacity
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @return stadiumCapacity
     */
    public int getStadiumCapacity() {
        return stadiumCapacity;
    }

    /**
     * Name: getTeamPlayers Purpose/Description: getter method used to retrieve
     * the list of players in the team.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @return An ArrayList containing the players in the team.
     */
    public ArrayList<Player> getTeamPlayers() {
        return teamPlayers;
    }

    /**
     * Name: getTeamManager Purpose/Description: getter method used to retrieve
     * the manager of the team.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @return the manager of the team
     */
    public Manager getTeamManager() {
        return teamManager;
    }

    //Setters 
    /**
     * Name: setTeamName Purpose/Description: setter method used to set the team
     * name.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param teamName the name of the team
     */
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    /**
     * Name: setStadiumName Purpose/Description: setter method used to set the
     * stadium name.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param stadiumName the name of the stadium
     */
    public void setStadiumName(String stadiumName) {
        this.stadiumName = stadiumName;
    }

    /**
     * Name: setStadiumCapacity Purpose/Description: setter method used to set
     * the stadium capacity.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param stadiumCapacity the capacity of the stadium
     */
    public void setStadiumCapacity(int stadiumCapacity) {
        this.stadiumCapacity = stadiumCapacity;
    }

    /**
     * Name: setTeamPlayers Purpose/Description: setter method used to set the
     * team players list.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param teamPlayers Array list of the team players
     */
    public void setTeamPlayers(ArrayList<Player> teamPlayers) {
        this.teamPlayers = teamPlayers;
    }

    /**
     * Name: setTeamManager Purpose/Description: setter method used to set the
     * team manager.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param teamManager team manager object
     */
    public void setTeamManager(Manager teamManager) {
        this.teamManager = teamManager;
    }

    /**
     * Name: toString Purpose/Description: Returns a string representation of
     * the team, including its ID, name, and stadium name.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @return A string representing the team's ID, name, and stadium name.
     */
    @Override
    public String toString() {
        return "Team Id: " + this.getTeamId() + "\nTeam Name: " + this.getTeamName() + "\nStadium Name: " + this.getStadiumName();
    }

}
