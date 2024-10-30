package Logic;

import java.io.Serializable;

/**
 * Represents a Player in a team, extending the Member class and implementing
 * Serializable. This class manages player-related information such as field
 * position and captain status.
 *
 * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
 * @version 1.0
 */
public class Player extends Member implements Serializable {

    /**
     * Represents a player in the sports league system.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    private String fieldPosition; // The position played by the player on the field.

    /**
     * Indicates whether the player is the captain of their team.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    private boolean captain; // True if the player is the captain of their team, false otherwise.

    //default constructor
    /**
     * Name: Player Purpose/Description: Constructor to create a new Player
     * object with default values for field position and captain status.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    public Player() {
        fieldPosition = null;
        captain = false;
    }

    //Custom Constructor 
    //for unassigned players
    /**
     * Name: Player Purpose/Description: Constructor to create a new Player
     * object with specified characteristics.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param fieldPosition The position at which the player typically plays on
     * the field.
     * @param captain A boolean value indicating whether the player is the
     * captain of the team.
     * @param memberId The unique ID of the player.
     * @param memberName The name of the player.
     * @param memberAddress The address of the player.
     * @param dateOfBirth The date of birth of the player.
     * @param nationality The nationality of the player.
     */
    public Player(String fieldPosition, boolean captain, int memberId, String memberName, String memberAddress, String dateOfBirth, String nationality) {
        super(memberId, memberName, memberAddress, dateOfBirth, nationality);
        this.fieldPosition = fieldPosition;
        this.captain = captain;
    }

    //for assigned players
    /**
     * Name: Player Purpose/Description: Constructor to create a new Player
     * object with specified characteristics.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param fieldPosition The position at which the player typically plays on
     * the field.
     * @param captain A boolean value indicating whether the player is the
     * captain of the team.
     * @param memberId The unique ID of the player.
     * @param memberName The name of the player.
     * @param memberAddress The address of the player.
     * @param dateOfBirth The date of birth of the player.
     * @param nationality The nationality of the player.
     * @param yearlySalary The yearly salary of the player.
     */
    public Player(String fieldPosition, boolean captain, int memberId, String memberName, String memberAddress, String dateOfBirth, String nationality, double yearlySalary) {
        super(memberId, memberName, memberAddress, dateOfBirth, nationality, yearlySalary);
        this.fieldPosition = fieldPosition;
        this.captain = captain;
    }

    //Getters 
    /**
     * Name: getFieldPosition Purpose/Description: Retrieves the field position
     * of the player.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @return The field position of the player.
     */
    public String getFieldPosition() {
        return fieldPosition;
    }

    /**
     * Name: isCaptain Purpose/Description: Checks whether the player is the
     * captain of the team.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @return true if the player is the captain, false otherwise.
     */
    public boolean isCaptain() {
        return captain;
    }

    //Setters
    /**
     * Name: setFieldPosition Purpose: Updates the field position of the player.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param fieldPosition The new field position of the player.
     */
    public void setFieldPosition(String fieldPosition) {
        this.fieldPosition = fieldPosition;
    }

    /**
     * Name: setCaptain Purpose/Description: Updates whether the player is the
     * captain of the team.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param captain A boolean value indicating whether the player is the
     * captain of the team.
     */
    public void setCaptain(boolean captain) {
        this.captain = captain;
    }

    /**
     * Name: toString Purpose/Description: Provides a string representation of
     * the player, including player ID, field position, and captain status.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @return A string representing the player, including player ID, field
     * position, and captain status.
     */
    @Override
    public String toString() {
        String captain = isCaptain() ? ", is the team captain" : ", not the team captain";
        return "Player Id: " + getMemberId() + " Field Position: " + getFieldPosition() + captain;
    }

}
