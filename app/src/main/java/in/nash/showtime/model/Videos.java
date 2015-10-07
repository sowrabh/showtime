package in.nash.showtime.model;

import com.activeandroid.annotation.Table;
import com.google.gson.annotations.Expose;

import java.util.List;

/**
 * Created by avinash on 9/25/15.
 */
@Table(name="Videos")
public class Videos {

    @Expose
    public Integer id;
    @Expose
    public List<Video> results;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Video> getResults() {
        return results;
    }

    public void setResults(List<Video> results) {
        this.results = results;
    }
}
