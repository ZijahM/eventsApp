package com.events.events.service.dto;

import java.io.Serializable;
import java.util.Objects;

public class RoleDTO implements Serializable, Comparable<RoleDTO> {

    private Long id;

    private String name;

    public RoleDTO(){}

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

    public RoleDTO withName(String name){
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return "RoleDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoleDTO roleDTO = (RoleDTO) o;
        return Objects.equals(getId(), roleDTO.getId()) &&
                Objects.equals(getName(), roleDTO.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }

    @Override
    public int compareTo(RoleDTO roleDTO) {
        return this.name.compareTo(roleDTO.name);
    }
}
