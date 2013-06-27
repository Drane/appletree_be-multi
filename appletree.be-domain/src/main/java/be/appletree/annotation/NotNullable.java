package be.appletree.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by jochen on 6/26/13.
 */

/*
@Target type	Definition
    ElementType.TYPE	Applies only to Type. A Type can be a Java class or interface or an Enum or even an Annotation.
    ElementType.FIELD	Applies to Java fields
    ElementType.METHOD	Applies to Java methods
    ElementType.PARAMETER	Applies only to method parameters in a method definition
    ElementType.CONSTRUCTOR	Applies only to a constructor of a class
    ElementType.LOCAL_VARIABLE	Applies only to Local variables.
    ElementType.ANNOTATION_TYPE	Applies only to Annotation Types
    ElementType.PACKAGE	Applies only to packages

@Retention policy	Definition
    RetensionPolicy.RUNTIME	Annotation should be retained for runtime. Annotations of this type can be read reflectively.
    RetensionPolicy.SOURCE	 Annotations are to be discarded by the compiler.
    RetensionPolicy.CLASS	 Annotations will be included in the class file, but cannot be read reflectively
 */


@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface NotNullable {
    String message();
}
