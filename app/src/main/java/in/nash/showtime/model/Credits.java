package in.nash.showtime.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.google.gson.annotations.Expose;

import java.util.List;

/**
 * Created by avinash on 9/12/15.
 */
@Table(name = "Credits")
public class Credits extends Model {

    @Expose
    @Column(name = "id", unique = true, onUniqueConflict = Column.ConflictAction.REPLACE)
    public Integer id;

    @Expose
    public List<Person> cast;

    @Expose
    public List<Person> crew;

    @Expose
    public List<Person> guest_stars;

    public List<Person> cast(){
        return getMany(Person.class, "");
    }

    public Credits(){
        super();
    }
}