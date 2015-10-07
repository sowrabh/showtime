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
public class Movie extends Model{

    @Expose
    @Column(name = "remote_id", unique = true, onUniqueConflict = Column.ConflictAction.REPLACE)
    public String id;

    @Expose
    @Column(name = "original_language")
    private String original_language;

    @Expose
    @Column(name = "original_title")
    private String original_title;

    @Expose
    @Column(name = "release_date")
    private String release_date;

    @Expose
    @Column(name = "budget")
    public Integer budget;

    @Expose
    @Column(name = "popularity")
    private String popularity;

    @Expose
    @Column(name = "title")
    private String title;

    @Expose
    @Column(name = "backdrop_path")
    private String backdrop_path;

    @Expose
    @Column(name = "poster_path")
    private String poster_path;

    @Expose
    @Column(name = "overview")
    private String overview;

    @Expose
    @Column(name = "revenue")
    private Integer revenue;

    @Expose
    @Column(name = "runtime")
    private int runtime;

    @Expose
    @Column(name = "vote_average")
    private double vote_average;

    @Expose
    @Column(name = "vote_count")
    private int vote_count;

    @Expose
    public Credits credits;

    @Expose
    public Videos videos;

    @Expose
    public MoviesResponse similar;

    public Credits getCredits() {
        return credits;
    }

    public void setCredits(Credits credits) {
        this.credits = credits;
    }

    public double getVoteAverage() {
        return vote_average;
    }

    public void setVoteAverage(double voteAverage) {
        this.vote_average = voteAverage;
    }

    public int getVoteCount() {
        return vote_count;
    }

    public void setVoteCount(int voteCount) {
        this.vote_count = voteCount;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(Integer revenue) {
        this.revenue = revenue;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int runtime) {
        this.runtime = runtime;
    }

    public String getBackdropPath() {
        return backdrop_path;
    }

    public void setBackdropPath(String backdropPath) {
        this.backdrop_path = backdropPath;
    }

    public String getPosterUrl() {
        return poster_path;
    }

    public void setPosterUrl(String posterPath) {
        this.poster_path = posterPath;
    }

    public String getOriginalLanguage() {
        return original_language;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.original_language = originalLanguage;
    }

    public String getOriginalTitle() {
        return original_title;
    }

    public void setOriginalTitle(String originalTitle) {
        this.original_title = originalTitle;
    }

    public String getReleaseDate() {
        return release_date;
    }

    public void setReleaseDate(String releaseDate) {
        this.release_date = releaseDate;
    }

    public String getPopularity() {
        return popularity;
    }

    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPosterPath() {
        return poster_path;
    }

    public void setPosterPath(String posterPath) {
        this.poster_path = posterPath;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }
}
