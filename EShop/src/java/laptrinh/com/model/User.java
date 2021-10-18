
package laptrinh.com.model;

import java.io.Serializable;

public class User implements Serializable{
    private int userId;
    private String userName;
    private String passWord;
    private int role;

    public User() {
    }

    public User(int userId, String userName, String passWord, int role) {
        this.userId = userId;
        this.userName = userName;
        this.passWord = passWord;
        this.role = role;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" + "userId=" + userId + ", userName=" + userName + ", passWord=" + passWord + ", role=" + role + '}';
    }

   
    
}
