package models.studios;

import models.Films.Film;

import java.util.Set;

public class Studio {

    private int id;
    private String name;
    private int budget;
    private Set<Film> films;

    public Studio(String name, int budget) {
        this.name = name;
        this.budget = budget;
    }

    public Studio() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public Set<Film> getFilms() {
        return films;
    }

    public void setFilms(Set<Film> films) {
        this.films = films;
    }
}
