package saddam.razon.testall;

import android.app.Application;
import android.content.Context;

import javax.inject.Inject;

/**
 * Created by HP on 20-Jan-18.
 */

public class MyApplication extends Application {

    public static MyApplication getMyApplication(Context context){
        return (MyApplication) context.getApplicationContext();
    }

    MyComponent component;

    @Inject Parser parser;
    Client client;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerMyComponent.builder().build();
        component.inject(getMyApplication(getApplicationContext()));

    }

    public MyComponent getComponent(){
        return component;
    }


    public Client getClient(){
        if (client==null){
            return parser.getRetroClient();
        }else {
            return client;
        }
    }


}
