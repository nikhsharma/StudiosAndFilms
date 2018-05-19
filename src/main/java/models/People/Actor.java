package models.people;

import models.films.Film;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "actors")
public class Actor extends Person {

    private Set<Film> films;
    private int cash;

    public Actor(String name, int cash) {
        super(name);
        this.cash = cash;
        this.films = new HashSet<Film>();
    }

    public Actor() {
    }

    @Column(name = "cash")
    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name="actor_film",
            joinColumns = {@JoinColumn(name = "student_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "film_id", nullable = false, updatable = false)})
    public Set<Film> getFilms() {
        return films;
    }

    public void setFilms(Set<Film> films) {
        this.films = films;
    }

    public void addFilmToActor(Film film){
        this.films.add(film);
    }

    public void addToCash(int amount) {
        this.cash += amount;
    }
}
