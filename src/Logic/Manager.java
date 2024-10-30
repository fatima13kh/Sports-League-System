/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import java.io.Serializable;

/**
 * Represents a Manager, extending the Member class and implementing
 * Serializable. This class manages bonus percentage and coaching qualifications
 * for managers.
 *
 * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
 * @version 1.0
 */
public class Manager extends Member implements Serializable {

    /**
     *
     * Represents the bonus percentage of the manager.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    private double bonusPercentage;

    /**
     * Represents the coaching qualifications of the manager.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    private String coachingQualifications;

    /**
     * Name: Manager Purpose/Description: Default constructor to create Manager
     * object with default values for bonus percentage and coaching
     * qualifications.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     */
    public Manager() {
        bonusPercentage = 0.0;
        coachingQualifications = null;
    }

    /**
     * Name: Manager Purpose/Description: Constructor to create a new manager
     * object with specified characteristics.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param bonusPercentage The bonus percentage for the manager.
     * @param coachingQualifications The coaching qualifications for the
     * manager.
     * @param memberId The unique ID of the manager.
     * @param memberName The name of the manager.
     * @param memberAddress The address of the manager.
     * @param dateOfBirth The date of birth of the manager.
     * @param nationality The nationality of the manager.
     * @param yearlySalary The yearly salary of the manager.
     */
    public Manager(double bonusPercentage, String coachingQualifications, int memberId, String memberName, String memberAddress, String dateOfBirth, String nationality, double yearlySalary) {
        super(memberId, memberName, memberAddress, dateOfBirth, nationality, yearlySalary);
        this.bonusPercentage = bonusPercentage;
        this.coachingQualifications = coachingQualifications;
    }

    /**
     * Name: Manager Purpose/Description: Custom constructor for Manager class
     * without ID.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param bonusPercentage The bonus percentage for the manager.
     * @param coachingQualifications The coaching qualifications for the
     * manager.
     * @param memberName The name of the manager.
     * @param memberAddress The address of the manager.
     * @param dateOfBirth The date of birth of the manager.
     * @param nationality The nationality of the manager.
     * @param yearlySalary The yearly salary of the manager.
     */
    public Manager(double bonusPercentage, String coachingQualifications, String memberName, String memberAddress, String dateOfBirth, String nationality, double yearlySalary) {
        super(memberName, memberAddress, dateOfBirth, nationality, yearlySalary);
        this.bonusPercentage = bonusPercentage;
        this.coachingQualifications = coachingQualifications;
    }

    /**
     * Name: getBonusPercentage Purpose/Description: Retrieves the bonus
     * percentage for the manager.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @return The bonus percentage of the manager.
     */
    public double getBonusPercentage() {
        return bonusPercentage;
    }

    /**
     * Name: setBonusPercentage Purpose/Description: Sets the bonus percentage
     * for the manager.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param bonusPercentage The new bonus percentage of the manager to set.
     */
    public void setBonusPercentage(double bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }

    /**
     * Name: getCoachingQualifications Purpose/Description: Retrieves the
     * coaching qualifications of the manager.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @return The coaching qualifications of the manager.
     */
    public String getCoachingQualifications() {
        return coachingQualifications;
    }

    /**
     * Name: setCoachingQualifications Purpose/Description: Sets the coaching
     * qualifications for the manager.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @param coachingQualifications The new coaching qualifications of the
     * manager to set.
     */
    public void setCoachingQualifications(String coachingQualifications) {
        this.coachingQualifications = coachingQualifications;
    }

    /**
     * Name: toString Purpose/Description: Provides a string representation of
     * the manager, including manager ID and fCoaching Qualifications.
     *
     * @author Maryam Mohsen, Fatima Khamis, Zahra Husain
     * @return A string representing the manager, including manager ID and
     * fCoaching Qualifications.
     */
    @Override
    public String toString() {
        return "Manager Id: " + getMemberId() + " Coaching Qualifications: " + getCoachingQualifications();
    }

}
