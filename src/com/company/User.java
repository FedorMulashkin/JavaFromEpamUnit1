package com.company;

public class User {
    private String userName;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public User() {
    }

    public User(String userName) {
        this.userName = userName;
    }

    public void greetings() {
        if (!userName.isBlank()) {
            System.out.println("Hello " + userName + "!");
        } else {
            System.out.println("User doesn't have name");
        }
    }

    public boolean checkPassword(String checkString) {
        return checkString.equals(password);
    }

    public boolean checkUserName(String checkString){
        return checkString.equals(userName);
    }

    public boolean login(String userName, String password){
        return checkPassword(password) && checkUserName(userName);
    }


}
