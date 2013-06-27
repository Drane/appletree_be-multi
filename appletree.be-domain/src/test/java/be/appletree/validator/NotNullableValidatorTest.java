package be.appletree.validator;

import be.appletree.annotation.NotNullable;
import be.appletree.model.Common;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by jochen on 6/26/13.
 */
public class NotNullableValidatorTest {

    class NotNullableValidatorImplObject {

        @NotNullable(message = "NotNullableValidatorImplObject message cannot be NULL!")
        private String message = "hello";

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

    @Test
    public void testValidate() throws Exception {
        NotNullableValidatorImplObject testObj = new NotNullableValidatorImplObject();
        testObj.setMessage(null);
        List errors = NotNullableValidator.validate(testObj);
        Assert.assertEquals(1, errors.size(), "Error(s):" + errors.toString());
        Assert.assertEquals("Error(s):[NotNullableValidatorImplObject message cannot be NULL!]",
                "Error(s):" + errors.toString(), "Error message not correctly displayed!");
    }
}
