package epam_framework.framework.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * FrameworkAnnotation
 * custom annotations are added here
 */

@Target(ElementType.METHOD) // This annotation can be applied to methods
@Retention(RetentionPolicy.RUNTIME)
public @interface FrameworkAnnotation {

	public String authorname();

}
