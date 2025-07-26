//DefaultUser.java
package model.impl;

import model.User;

public class DefaultUser implements User {
    private static int idCounter = 0;

    private int id;
    private String firstName;
    private String lastName;
    private String password;
    private String email;

    {
        this.id = ++idCounter;
    }
    public DefaultUser(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }
    public DefaultUser() {
    }
    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setPassword(String newPassword) {
        if (newPassword == null) {
            return;
        }
        this.password = newPassword;
    }

    @Override
    public void setEmail(String newEmail) {
        if (newEmail == null || newEmail.isEmpty()) {
            return;
        }
        this.email = newEmail;
    }

    @Override
    public String toString() {
        return "User{id=" + id + ", firstName='" + firstName + "', lastName='" + lastName + "', email='" + email + "'}";
    }

    void clearState() {
        idCounter = 0;
    }
}
