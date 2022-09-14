package com.company.entity;

public class UserSkill {
    private Integer id;
    private User user;
    private Skill skil;
    private int power;

    public UserSkill(Integer id, User user, Skill skil, int power) {
        this.id = id;
        this.user = user;
        this.skil = skil;
        this.power = power;
    }
    public UserSkill(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Skill getSkil() {
        return skil;
    }

    public void setSkil(Skill skil) {
        this.skil = skil;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "UserSkill{" +
                "id=" + id +
                ", user=" + user +
                ", skil=" + skil +
                ", power=" + power +
                '}';
    }
}
