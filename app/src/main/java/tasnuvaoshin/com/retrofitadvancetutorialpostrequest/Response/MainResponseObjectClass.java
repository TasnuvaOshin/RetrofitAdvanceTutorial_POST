package tasnuvaoshin.com.retrofitadvancetutorialpostrequest.Response;

import tasnuvaoshin.com.retrofitadvancetutorialpostrequest.LastLoginObject;

public class MainResponseObjectClass {
    private String name;
    private String email;
    private String id;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LastLoginObject getLast_login() {
        return last_login;
    }

    public void setLast_login(LastLoginObject last_login) {
        this.last_login = last_login;
    }

    public MainResponseObjectClass() {
    }

    public MainResponseObjectClass(String name, String email, String id, String gender, LastLoginObject last_login) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.gender = gender;
        this.last_login = last_login;
    }

    private LastLoginObject last_login;
}
