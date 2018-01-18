package info.mahendrabagul.artajaspringboot1.exception;

public class BookIdMismatchException extends RuntimeException {
	private static final long serialVersionUID = 6823580694456476867L;

	public BookIdMismatchException() {
		super();
	}

	public BookIdMismatchException(final String message, final Throwable cause) {
		super(message, cause);
	}

	public BookIdMismatchException(final String message) {
		super(message);
	}

	public BookIdMismatchException(final Throwable cause) {
		super(cause);
	}
}