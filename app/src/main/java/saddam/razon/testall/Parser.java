package saddam.razon.testall;

import javax.inject.Inject;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by HP on 20-Jan-18.
 */

@Module
public class Parser {

    @Inject
    public Parser(){
    }

    @Provides
    @Singleton
    public Client getRetroClient(){

        OkHttpClient.Builder okBuilder = new OkHttpClient.Builder();

        Retrofit.Builder builder = new Retrofit.Builder()
                .baseUrl(apis.BASE_API)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .client(okBuilder.build());

        return builder.build().create(Client.class);

    }


    Observable<Movie> getMovieListObservble(String url, Client retrofitClient){
        return retrofitClient.getMovieList(url).subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread());
    }


    public Observable<MovieDetails> getMovieDetails(String url, Client retrofitClient){
        return retrofitClient.getMovieDetails(url);
    }

}
