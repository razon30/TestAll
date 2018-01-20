package saddam.razon.testall;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by HP on 20-Jan-18.
 */

@Singleton
@Component(modules = Parser.class)
public interface MyComponent {

    void inject(MainActivity mainActivity);
    void inject(MyApplication myApplication);
}
