import db.DBHelper;
import models.films.Film;
import models.films.Genre;
import models.people.Actor;
import models.people.Director;
import models.studios.Studio;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FilmTest {

    Studio studio;
    Director director;
    Film film;
    Actor actor;

    @Before
    public void before() throws Exception {
        this.studio = new Studio("Universal Pictures", 1000000);
        this.director = new Director("Steven Spielberg");
        this.film = new Film("Jurassic Park", Genre.THRILLER, studio, director);
        this.actor = new Actor("Jeff Goldblum", 300000);
    }

    @Test
    public void canPayActor() {
        studio.payActor(actor, 100000);
        assertEquals(400000, actor.getCash());
        assertEquals(900000, studio.getBudget());
    }
}
