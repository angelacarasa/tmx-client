package esa.bscs.sps.tmx.client.service;

public class UsernameAlreadyUsedException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public UsernameAlreadyUsedException() {
        super("Login name already used!");
    }
}
