package src;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;

@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.TYPE_USE)
public @interface LeetCodeInformation
{
    int Number();
    String Url();
}