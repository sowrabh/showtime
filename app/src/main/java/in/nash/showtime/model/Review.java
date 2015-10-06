package in.nash.showtime.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Table;
import com.google.gson.annotations.Expose;

/**
 * Created by Avinash Hindupur on 28/06/15.
 */
@Table(name = "Review")
public class Review extends Model {

    @Expose
    public String id;

    @Expose
    public String author;

    @Expose
    public String content;

    @Expose
    public String url;

    public Review() {
        super();
    }
}
