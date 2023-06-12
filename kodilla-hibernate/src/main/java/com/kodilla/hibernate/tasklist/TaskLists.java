package com.kodilla.hibernate.tasklist;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "TASKLISTS")
public final class TaskLists {

    private int id;
    private String listName;
    private String description;

    public TaskLists() {
    }

    public TaskLists(String listName, String description) {
        this.listName = listName;
        this.description = description;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    public int getId() {
        return id;
    }


    @Column(name = "LASTNAME")
    public String getListName() {
        return listName;
    }

    @Column(name = "DECRIPTION")
    public String getDescription() {
        return description;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setListName(String lastName) {
        this.listName = lastName;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}