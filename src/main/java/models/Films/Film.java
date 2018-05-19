package models.films;

import models.people.Actor;
import models.people.Director;
import models.studios.Studio;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name = "films")
public class Film {
    private int id;
    private String title;
    private Genre genre;
    private Studio studio;
    private Director director;
    private Set<Actor> cast;

    public Film(String title, Genre genre, Studio studio, Director director) {
        this.title = title;
        this.genre = genre;
        this.studio = studio;
        this.director = director;
    }

    public Film() {
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

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Enumerated(EnumType.STRING)
    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @ManyToOne
    @JoinColumn(name = "studion_id", nullable = false)
    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }

    @ManyToOne
    @JoinColumn(name = "director_id", nullable = false)
    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name="actor_film",
            joinColumns = {@JoinColumn(name = "film_id", nullable = false, updatable = false)},
            inverseJoinColumns = {@JoinColumn(name = "student_id", nullable = false, updatable = false)}
    )
    public Set<Actor> getCast() {
        return cast;
    }

    public void setCast(Set<Actor> cast) {
        this.cast = cast;
    }
}
