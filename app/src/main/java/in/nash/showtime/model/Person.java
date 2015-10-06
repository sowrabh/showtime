package in.nash.showtime.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Table;
import com.google.gson.annotations.Expose;

/**
 * Created by Avinash Hindupur on 25/06/15.
 */
@Table(name = "Person")
public class Person extends Model {

    @Expose
    public String id;

    @Expose
    public String name;

    @Expose
    public String profile_path;

    @Expose
    public String credit_id;

    @Expose
    public String character;

    @Expose
    public String job;

    @Expose
    public String department;

    public Person(){
        super();
    }
}
