package in.nash.showtime.network;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;

import in.nash.showtime.model.Movie;

/**
 * Created by avinash on 8/26/15.
 */
public class MoviesResponse extends BaseResponse {

    @Expose
    public ArrayList<Movie> results;

}
