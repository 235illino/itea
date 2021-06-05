package com.itea.pim.illia_chvyr.user;


/*
Создать класс User.java и поместить его в com.itea.pim.your_name.user
package
○ Класс User должен иметь атрибуты: имя, фамилия, логин, пароль, имейл.
○ Класс должен иметь геттеры и сеттеры на все атрибуты кроме атрибута пароль (только
сеттер)
 */


public class User {
    private String name;
    private String surname;
    private String login;
    private String password;
    private String email;

    public User() {
    }

    public User(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public User(User user) {
        this.name = user.getName();
        this.name = user.getSurname();
        this.name = user.getEmail();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
