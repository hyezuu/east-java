package day0614;

import java.io.IOException;

public class CustomException extends RuntimeException {
    public CustomException (String message) {
        super(message);
    }
}
