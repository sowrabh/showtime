package in.nash.showtime.model;

import com.activeandroid.annotation.Table;
import com.google.gson.annotations.Expose;

import java.util.List;

/**
 * Created by avinash on 9/12/15.
 */
@Table(name="Credits")
public class Credits {

    @Expose
    public Integer id;

    @Expose
    public List<Person> cast;

    @Expose
    public List<Person> crew;

    @Expose
    public List<Person> guest_stars;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Person> getCast() {
        return cast;
    }

    public void setCast(List<Person> cast) {
        this.cast = cast;
    }

    public List<Person> getCrew() {
        return crew;
    }

    public void setCrew(List<Person> crew) {
        this.crew = crew;
    }

    public List<Person> getGuestStars() {
        return guest_stars;
    }

    public void setGuestStars(List<Person> guestStars) {
        this.guest_stars = guestStars;
    }
}