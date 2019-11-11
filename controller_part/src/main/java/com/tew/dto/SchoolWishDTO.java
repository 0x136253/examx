package com.tew.dto;

import com.tew.pojo.Person;
import com.tew.pojo.Wish;

public class SchoolWishDTO {
    private Person person;
    private Wish wish;

    @Override
    public String toString() {
        return "SchoolWishDTO{" +
                "person=" + person +
                ", wish=" + wish +
                '}';
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Wish getWish() {
        return wish;
    }

    public void setWish(Wish wish) {
        this.wish = wish;
    }

    public SchoolWishDTO() {
    }

    public SchoolWishDTO(Person person, Wish wish) {
        this.person = person;
        this.wish = wish;
    }
}
