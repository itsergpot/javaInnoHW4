package potapov.sergey.part3.HW12.task3;

import java.io.Serializable;

public class UnknownException extends Exception implements Serializable {

    private static final long serialVersionUID = 6460961021014044549L;

    public UnknownException() {
        super();
    }

    public UnknownException(String message) {
        super(message);
    }

    public UnknownException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnknownException(Throwable cause) {
        super(cause);
    }
}
