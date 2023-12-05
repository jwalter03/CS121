package weekTen.activity21;

import weekNine.Restaurant;

public class User {
    private String name;
    private int number;
    private String email;
    private String password;
    public User(){

    }

    public User(String name, String email, String password, int number){
        this.name = name;
        this.email = email;
        this.password = password;
        this.number = number;
    }
    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.name = name;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }

    @Override
    public String toString() {
        return String.format("Name: %s Email: %s Password: %s Number: %d",name,email,password,number);
    }
}
