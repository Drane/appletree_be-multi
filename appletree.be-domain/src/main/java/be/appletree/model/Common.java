package be.appletree.model;

import be.appletree.annotation.NotNullable;

/**
 * Created by jochen on 6/26/13.
 */
public class Common {

    @NotNullable(message = "Common message cannot be NULL!")
    private String message = "hello";

    public String sayHello(){
        return "Common says " + message + "!";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
