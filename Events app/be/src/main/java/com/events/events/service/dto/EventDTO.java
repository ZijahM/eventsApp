package com.events.events.service.dto;

import com.events.events.entity.User;

import java.io.Serializable;

public class EventDTO implements Serializable {
    private Long id;
    private String name;
    private String address;
    private String genre;
    private String type;
    private int agegroup;
    private String description;
   // private Long user_id;

    public EventDTO() {
    }

    public EventDTO(Long id, String name, String address, String genre, String type, int agegroup, String description) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.genre = genre;
        this.type = type;
        this.agegroup = agegroup;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAgegroup() {
        return agegroup;
    }

    public void setAgegroup(int agegroup) {
        this.agegroup = agegroup;
    }

   /* public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }*/
}
