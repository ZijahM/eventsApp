package com.events.events.entity;


import javax.persistence.*;

@Entity
@Table(name = "events", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
                "name"
        }),
})


public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String genre;
    private String type;
    private int agegroup;
    private String description;
   /* @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user_id;*/

    public Event(String name, String address, String genre, String type, String description) {
        this.name = name;
        this.address = address;
        this.genre = genre;
        this.type = type;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Event(String name, String address, String genre, String type, int agegroup, String description) {
        this.name = name;
        this.address = address;
        this.genre = genre;
        this.type = type;
        this.agegroup = agegroup;
        this.description = description;
    }

    public Event() {
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

   /* public User getUser_id() {
        return user_id;
    }

    public void setUser_id(User user_id) {
        this.user_id = user_id;
    }*/
}



