package in.nash.showtime.model;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;
import com.google.gson.annotations.Expose;

import in.nash.showtime.network.MoviesResponse;

/**
 * Created by avinash on 19/06/15.
 */
@Table(name = "Movies")
public class Movie extends Model {

    @Expose
    @Column(name = "id", unique = true, onUniqueConflict = Column.ConflictAction.REPLACE)
    public String id;

    @Expose
    @Column(name = "originalLanguage")
    public String original_language;

    @Expose
    @Column(name = "originalTitle")
    public String original_title;

    @Expose
    @Column(name = "releaseDate")
    public String release_date;

    @Expose
    @Column(name = "budget")
    public Integer budget;

    @Expose
    @Column(name = "popularity")
    public String popularity;

    @Expose
    @Column(name = "title")
    public String title;

    @Expose
    @Column(name = "backdropPath")
    public String backdrop_path;

    @Expose
    @Column(name = "posterPath")
    public String poster_path;

    @Expose
    @Column(name = "overview")
    public String overview;

    @Expose
    @Column(name = "revenue")
    public Integer revenue;

    @Expose
    @Column(name = "runtime")
    public int runtime;

    @Expose
    @Column(name = "voteAverage")
    public double vote_average;

    @Expose
    @Column(name = "voteCount")
    public int vote_count;

    @Expose
    public Credits credits;

    @Expose
    public Videos videos;

    @Expose
    public MoviesResponse similar;

    public Movie() {
        super();
    }
}
