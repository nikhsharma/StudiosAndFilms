package models.people;

import models.films.Film;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "directors")
public class Director extends Person {

    private Set<Film> films;

    public Director(String name) {
        super(name);
    }

    public Director() {
    }

    @OneToMany(mappedBy = "director")
    public Set<Film> getFilms() {
        return films;
    }

    public void setFilms(Set<Film> films) {
        this.films = films;
    }
}
