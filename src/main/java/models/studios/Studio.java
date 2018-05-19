package models.studios;

import models.films.Film;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "studios")
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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "budget")
    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    @OneToMany(mappedBy = "studio")
    public Set<Film> getFilms() {
        return films;
    }

    public void setFilms(Set<Film> films) {
        this.films = films;
    }
}
