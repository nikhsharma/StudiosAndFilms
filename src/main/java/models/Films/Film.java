package models.Films;

import models.People.Actor;
import models.People.Director;
import models.studios.Studio;

import java.util.Set;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Studio getStudio() {
        return studio;
    }

    public void setStudio(Studio studio) {
        this.studio = studio;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Set<Actor> getCast() {
        return cast;
    }

    public void setCast(Set<Actor> cast) {
        this.cast = cast;
    }
}
