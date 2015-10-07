package in.nash.showtime.ui.presenter.impl;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import in.nash.showtime.R;
import in.nash.showtime.model.Movie;
import in.nash.showtime.network.MoviesResponse;
import in.nash.showtime.network.Tmdb;
import in.nash.showtime.ui.presenter.IMoviesPresenter;
import in.nash.showtime.ui.view.IMoviesView;
import in.nash.showtime.ui.view.impl.MovieFragment;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by avinash on 8/18/15.
 */
public class MoviesPresenterImpl implements IMoviesPresenter {
    private static final String TAG = "MoviesPresenterImpl";

    private IMoviesView mMoviesView;

    public MoviesPresenterImpl(IMoviesView moviesView) {
        mMoviesView = moviesView;
    }

    @Override
    public void queryMovies(MovieFragment.MovieType category) {

        Log.d("Category", category.getMovieType());
        Observable<MoviesResponse> movies;
        Tmdb tmdb = new Tmdb();

        switch (category) {

            case TOP:
                movies = tmdb.moviesService().fetchTopMovies();
                break;
            case UPCOMING:
                movies = tmdb.moviesService().fetchUpcomingMovies();
                break;
            case PLAYING:
                movies = tmdb.moviesService().fetchNowPlayingMovies();
                break;
            default:
                movies = tmdb.moviesService().fetchPopularMovies();

        }

        try{
            String json = "{\n" +
                    "adult: false,\n" +
                    "backdrop_path: \"/tdHH6rFxVoHIwiJzSDPrCkbFetB.jpg\",\n" +
                    "belongs_to_collection: null,\n" +
                    "budget: 0,\n" +
                    "genres: [\n" +
                    "{\n" +
                    "id: 18,\n" +
                    "name: \"Drama\"\n" +
                    "},\n" +
                    "{\n" +
                    "id: 35,\n" +
                    "name: \"Comedy\"\n" +
                    "},\n" +
                    "{\n" +
                    "id: 10749,\n" +
                    "name: \"Romance\"\n" +
                    "}\n" +
                    "],\n" +
                    "homepage: \"\",\n" +
                    "id: 276928,\n" +
                    "imdb_id: \"tt3678938\",\n" +
                    "original_language: \"en\",\n" +
                    "original_title: \"Humpty Sharma Ki Dulhania\",\n" +
                    "overview: \"The carefree son (Varun Dhawan) of a campus bookstore owner and an unattainable beauty (Alia Bhatt) find that their love-hate relationship is turning into all love.\",\n" +
                    "popularity: 0.01127,\n" +
                    "poster_path: \"/mMPCTavsy4W5vTmTxDD47cHu8VH.jpg\",\n" +
                    "production_companies: [ ],\n" +
                    "production_countries: [\n" +
                    "{\n" +
                    "iso_3166_1: \"RO\",\n" +
                    "name: \"Romania\"\n" +
                    "}\n" +
                    "],\n" +
                    "release_date: \"2014-07-11\",\n" +
                    "revenue: 0,\n" +
                    "runtime: 133,\n" +
                    "spoken_languages: [ ],\n" +
                    "status: \"Released\",\n" +
                    "tagline: \"\",\n" +
                    "title: \"Humpty Sharma Ki Dulhania\",\n" +
                    "video: false,\n" +
                    "vote_average: 6.1,\n" +
                    "vote_count: 13\n" +
                    "}";
            Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().serializeNulls().create();
            Movie movie = gson.fromJson(json, Movie.class);
            movie.save();
        }catch(Exception e){
            Log.d(TAG, "queryMovies() called with " + "category = [" + category + "]\n Error: " + e);
        }

        movies.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<MoviesResponse>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        mMoviesView.setError(R.string.something_went_wrong);
                        Log.e("Error", e.getMessage());
                    }

                    @Override
                    public void onNext(MoviesResponse moviesResponse) {
                        if(moviesResponse != null && moviesResponse.results != null) {
                            for (Movie movie : moviesResponse.results) {
                                movie.save();
                            }
                        }
                        mMoviesView.setMovies(moviesResponse.results);
                    }
                });

    }
}
