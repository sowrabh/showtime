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

    public List<Person> cast;

    public List<Person> crew;

    public List<Person> guest_stars;
}