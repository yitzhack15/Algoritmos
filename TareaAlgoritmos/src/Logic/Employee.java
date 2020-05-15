
package Logic;

import java.time.LocalDate;
import java.util.Date;

public class Employee {

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the birthday
     */
    public LocalDate getBirthday() {
        return birthday;
    }

    /**
     * @param birthday the birthday to set
     */
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    /**
     * @return the contractStartDate
     */
    public LocalDate getContractStartDate() {
        return contractStartDate;
    }

    /**
     * @param contractStartDate the contractStartDate to set
     */
    public void setContractStartDate(LocalDate contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    /**
     * @return the contractEndDate
     */
    public LocalDate getContractEndDate() {
        return contractEndDate;
    }

    /**
     * @param contractEndDate the contractEndDate to set
     */
    public void setContractEndDate(LocalDate contractEndDate) {
        this.contractEndDate = contractEndDate;
    }
        private String id;
     private String lastname, firstname, title, gender, phone, address;
     private LocalDate birthday, contractStartDate , contractEndDate;

    public Employee(String id, String lastname, String firstname, String title, String gender, String phone, String address, LocalDate birthday, LocalDate contractStartDate, LocalDate contractEndDate) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.title = title;
        this.gender = gender;
        this.phone = phone;
        this.address = address;
        this.birthday = birthday;
        this.contractStartDate = contractStartDate;
        this.contractEndDate = contractEndDate;
    }
     
    
}
