package ru.gb.oseminar.data;

public abstract class User {
    private String firstname;
    private String laststname;
    private String patronymic;

    public User(String firstname, String laststname, String patronymic){
        this.firstname=firstname;
        this.laststname=laststname;
        this.patronymic=patronymic;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setLaststname(String laststname) {
        this.laststname = laststname;
    }

    public String getLaststname() {
        return laststname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getPatronymic() {
        return patronymic;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", laststname='" + laststname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                '}';
    }
}

