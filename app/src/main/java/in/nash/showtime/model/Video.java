package in.nash.showtime.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Table;
import com.google.gson.annotations.Expose;

/**
 * Created by avinash on 9/25/15.
 */
@Table(name = "Video")
public class Video extends Model {

    @Expose
    public String id;
    @Expose
    public String iso_639_1;
    @Expose
    public String key;
    @Expose
    public String name;
    @Expose
    public String site;
    @Expose
    public Integer size;
    @Expose
    public String type;

    public Videos videos;

    public Video() {
        super();
    }
}
