package cat.itacademy.barcelonactiva.pagnoncellidaiane.S05T02.exception;

import java.io.Serial;

public class GameNotFoundException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public GameNotFoundException(String msg) {
        super(msg);
    }
}

