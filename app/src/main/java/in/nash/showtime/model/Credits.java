package in.nash.showtime.model;

import com.google.gson.annotations.Expose;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.sql.language.Insert;
import com.raizlabs.android.dbflow.structure.BaseModel;

import java.util.List;

import in.nash.showtime.model.db.PersonToCredits;
import in.nash.showtime.model.db.ShowTimeDatabase;

/**
 * Created by avinash on 9/12/15.
 */
@Table(databaseName = ShowTimeDatabase.NAME)
public class Credits extends BaseModel{

    @Expose
    @Column
    @PrimaryKey
    public Integer id;

    @Expose
    public List<Person> cast;

    @Expose
    public List<Person> crew;

    @Expose
    public List<Person> guest_stars;

    @Override
    public void save() {
        super.save();

//        for(Person person : cast){
//            PersonToCredits p2c = new PersonToCredits();
//            p2c.person_id = person;
//            p2c.credits_id = this;
//            p2c.save();
////            Insert.into(PersonToCredits.class).columns("person_id", "credits_id")
////                    .values(person.id, id).query();
//        }
    }

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