package be.appletree.validator;

import be.appletree.annotation.NotNullable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by jochen on 6/26/13.
 */
public class NotNullableValidator {

    public static List validate(Object obj) {

        List<String> errorMessages = new ArrayList<String>();
        Field[] fields = obj.getClass().getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {
            NotNullable notNullAnnotation = fields[i].getAnnotation(NotNullable.class);
            if (notNullAnnotation != null) {
                try {
                    fields[i].setAccessible(true);
                    if (fields[i].get(obj) == null) {
                        errorMessages.add(notNullAnnotation.message());
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
        return errorMessages;
    }
}
