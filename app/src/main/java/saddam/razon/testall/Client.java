package saddam.razon.testall;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Url;

/**
 * Created by HP on 20-Jan-18.
 */
public interface Client {

    @GET
    Observable<Movie> getMovieList(@Url String url);

    @GET
    Observable<MovieDetails> getMovieDetails(@Url String url);

}
