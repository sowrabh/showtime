package in.nash.showtime.model;

import com.google.gson.annotations.Expose;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.ForeignKey;
import com.raizlabs.android.dbflow.annotation.ForeignKeyReference;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;
import com.raizlabs.android.dbflow.structure.container.ForeignKeyContainer;

import java.util.List;

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

    //    @Column
    @Expose
    public List<Person> cast;

    //    @Column
    @Expose
    public List<Person> crew;

    //    @Column
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