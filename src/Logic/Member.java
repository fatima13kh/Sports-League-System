package Logic;

import java.io.Serializable;

/**
 * Represents a Member in a sports league, implementing Serializable. This class
 * manages member-related information such as ID, name, address, date of birth,
 * nationality, and yearly salary.
 *
 * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
 * @version 1.0
 */
public class Member implements Serializable {

    /**
     * Represents the unique identifier of the member.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    private int memberId;

    /**
     * Represents the name of the member.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    private String memberName;

    /**
     * Represents the address of the member.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    private String memberAddress;

    /**
     * Represents the date of birth of the member.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    private String dateOfBirth;

    /**
     * Represents the nationality of the member.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    private String nationality;

    /**
     * Represents the yearly salary of the member.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    private double yearlySalary;

    // Default Constructor
    /**
     * Name: Member Purpose/Description: Constructs a new Member object with
     * default values. Default values are: - memberName: null - memberAddress:
     * null - dateOfBirth: null - nationality: null - yearlySalary: 0.0
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    public Member() {

        memberName = null;
        memberAddress = null;
        dateOfBirth = null;
        nationality = null;
        yearlySalary = 0.0;
    }

    //Custome constructor for unassigned players
    /**
     * Name: Member Purpose/Description: Constructs a new Member object for
     * unassigned players with specified values.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param memberId The unique ID of the member.
     * @param memberName The name of the member.
     * @param memberAddress The address of the member.
     * @param dateOfBirth The date of birth of the member.
     * @param nationality The nationality of the member.
     */
    public Member(int memberId, String memberName, String memberAddress, String dateOfBirth, String nationality) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberAddress = memberAddress;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
    }

    // Custom Constructor for assigned players
    /**
     * Name: Member Purpose/Description: Constructs a new Member object for
     * assigned players with specified values.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param memberId The unique ID of the member.
     * @param memberName The name of the member.
     * @param memberAddress The address of the member.
     * @param dateOfBirth The date of birth of the member.
     * @param nationality The nationality of the member.
     * @param yearlySalary The yearly salary of the member.
     */
    public Member(int memberId, String memberName, String memberAddress, String dateOfBirth, String nationality, double yearlySalary) {
        this.memberId = memberId;
        this.memberName = memberName;
        this.memberAddress = memberAddress;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.yearlySalary = yearlySalary;
    }

    // Custom Constructor for startup manager
    /**
     * Name: Member Purpose/Description: Constructs a new Member object for
     * startup managers with specified values. memberId Automatically assigns a
     * unique ID for the manager.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param memberName The name of the manager.
     * @param memberAddress The address of the manager.
     * @param dateOfBirth The date of birth of the manager.
     * @param nationality The nationality of the manager.
     * @param yearlySalary The yearly salary of the manager.
     */
    public Member(String memberName, String memberAddress, String dateOfBirth, String nationality, double yearlySalary) {
        memberId = SportsLeagueSystem.getManagersIds() + 1;
        this.memberName = memberName;
        this.memberAddress = memberAddress;
        this.dateOfBirth = dateOfBirth;
        this.nationality = nationality;
        this.yearlySalary = yearlySalary;
    }

    // Getters
    /**
     * Name: getMemberId Purpose/Description: Retrieves the unique identifier of
     * the member.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @return The member's identifier.
     */
    public int getMemberId() {
        return memberId;
    }

    /**
     * Name: getMemberName() Purpose/Description: Retrieves the name of the
     * member.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @return The name of the member.
     */
    public String getMemberName() {
        return memberName;
    }

    /**
     * Name: getMemberAddress() Purpose/Description: Retrieves the address of
     * the member.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @return The address of the member.
     */
    public String getMemberAddress() {
        return memberAddress;
    }

    /**
     * Name: getDateOfBirth Purpose/Description: Retrieves the date of birth of
     * the member.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @return The date of birth of the member.
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * Name: getNationality Purpose/Description: Retrieves the nationality of
     * the member.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @return The nationality of the member.
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Name: getYearlySalary Purpose/Description: Retrieves the yearly salary of
     * the member.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @return The yearly salary of the member.
     */
    public double getYearlySalary() {
        return yearlySalary;
    }

    // Setters
    /**
     * Name: setMemberName Purpose/Description: Sets the name of the member.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param memberName The name of the member.
     */
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    /**
     * Name: setMemberAddress Purpose/Description: Sets the address of the
     * member.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param memberAddress The address of the member.
     */
    public void setMemberAddress(String memberAddress) {
        this.memberAddress = memberAddress;
    }

    /**
     * Name: setDateOfBirth Purpose/Description: Sets the date of birth of the
     * member.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param dateOfBirth The date of birth of the member.
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * Name: setNationality Purpose/Description: Sets the nationality of the
     * member.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param nationality The nationality of the member.
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * Name: setYearlySalary Purpose/Description: Sets the yearly salary of the
     * member.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param yearlySalary The yearly salary of the member.
     */
    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

}
