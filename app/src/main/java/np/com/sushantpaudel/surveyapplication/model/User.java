package np.com.sushantpaudel.surveyapplication.model;

import java.io.Serializable;

public class User implements Serializable {
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String phoneNumber;
    private String placeName;

    public User() {

    }

    public User(String email, String password, String firstName, String lastName, String placeName, String phoneNumber) {
        this.userName = "username";
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.placeName = placeName;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public String getPlaceName() {
        return placeName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
