package saddam.razon.testall;

/**
 * Created by Razon 21 Jan 2018
 */

public @interface Author {
    String author() default "Razon";
    String date() default "21 Jan 2018";
    String version() default "1.0.0";
}
