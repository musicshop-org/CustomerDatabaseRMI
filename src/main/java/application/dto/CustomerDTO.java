package application.dto;

import java.io.Serializable;

public class CustomerDTO implements Serializable {
    private String firstName;
    private String lastName;

    public CustomerDTO(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
