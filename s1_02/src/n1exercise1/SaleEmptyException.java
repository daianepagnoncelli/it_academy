package n1exercise1;

public class SaleEmptyException extends Exception{

	private static final long serialVersionUID = 1L;

	public SaleEmptyException(String message) {
        super(message);
    }
}
