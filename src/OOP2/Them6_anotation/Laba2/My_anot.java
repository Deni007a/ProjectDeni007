package OOP2.Them6_anotation.Laba2;




import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;


/**
 * Created by Den on 22.04.2017.
 */
//@Target(value= ElementType.METHOD)
@Retention(value= RetentionPolicy.RUNTIME)
public @interface My_anot {
   Person.PerAction  value();




}