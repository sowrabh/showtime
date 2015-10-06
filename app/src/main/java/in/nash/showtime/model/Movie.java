package in.nash.showtime.model;

import in.nash.showtime.network.MoviesResponse;

/**
 * Created by avinash on 19/06/15.
 */

public class Movie {

    public String id;

    public String original_language;

    public String original_title;

    public String release_date;

    public Integer budget;

    public String popularity;

    public String title;

    public String backdrop_path;

    public String poster_path;

    public String overview;

    public Integer revenue;

    public int runtime;

    public double vote_average;

    public int vote_count;

    public Credits credits;

    public Videos videos;

    public MoviesResponse similar;
}
