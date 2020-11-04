package esa.bscs.sps.tmx.client.service;

public class InvalidPasswordException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public InvalidPasswordException() {
        super("Incorrect password");
    }
}
