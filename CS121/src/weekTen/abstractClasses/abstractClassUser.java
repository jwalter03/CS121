package weekTen.abstractClasses;

public abstract class abstractClassUser {
    protected String name;
    protected int contactNum;
    protected String email;
    protected String password;
    public abstractClassUser(){

    }

    public abstractClassUser(String name, String email, String password, int contactNum) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.contactNum = contactNum;
    }
    public int getContactNum(){
        return contactNum;
    }
    public void setContactNum(int number){
        this.contactNum = number;
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

    public abstract void displayInfo();
    }

