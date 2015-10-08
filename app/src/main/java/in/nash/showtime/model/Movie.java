package in.nash.showtime.model;

import com.google.gson.annotations.Expose;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.ForeignKey;
import com.raizlabs.android.dbflow.annotation.ForeignKeyReference;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

import in.nash.showtime.model.db.ShowTimeDatabase;
import in.nash.showtime.network.MoviesResponse;

/**
 * Created by avinash on 19/06/15.
 */

@Table(databaseName = ShowTimeDatabase.NAME)
public class Movie extends BaseModel{

    @Expose
    @Column
    @PrimaryKey
    public String id;

    @Expose
    @Column
    public String original_language;

    @Expose
    @Column
    public String original_title;

    @Expose
    @Column
    public String release_date;

    @Expose
    @Column
    public Integer budget;

    @Expose
    @Column
    public String popularity;

    @Expose
    @Column
    public String title;

    @Expose
    @Column
    public String backdrop_path;

    @Expose
    @Column
    public String poster_path;

    @Expose
    @Column
    public String overview;

    @Expose
    @Column
    public Integer revenue;

    @Expose
    @Column
    public int runtime;

    @Expose
    @Column
    public double vote_average;

    @Expose
    @Column
    public int vote_count;

    @Expose
    @Column
    @ForeignKey(
            references = {@ForeignKeyReference(columnName = "credits",
                    columnType = Integer.class,
                    foreignColumnName = "id")},
            saveForeignKeyModel = true)
    public Credits credits;

//    @Expose
    public Videos videos;

//    @Expose
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
