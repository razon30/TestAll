package saddam.razon.testall;

import android.app.ProgressDialog;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity {

    @Inject Parser parser;
    ArrayList<Movie.Results> movies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MyApplication.getMyApplication(this).getComponent().inject(this);
        setContentView(R.layout.activity_main);

        movies = new ArrayList<>();

        ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Please Wait...");
        progressDialog.show();

        Client client =  MyApplication.getMyApplication(this).getClient();
        Observable<Movie> observable = parser.getMovieListObservble(apis.NOW_PLAYING+apis.API_KEY, client);

        observable
                .subscribe(movie -> {
                    movies.addAll(movie.getResults());
                    Log.d("movie", movie.getResults().get(0).getTitle());
                }, throwable -> {
                    Log.d("movieError", throwable.getLocalizedMessage());
                    progressDialog.dismiss();
                }, progressDialog::dismiss);

    }
}
