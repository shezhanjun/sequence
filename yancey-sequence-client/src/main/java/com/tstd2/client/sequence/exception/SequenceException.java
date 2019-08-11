package com.tstd2.client.sequence.exception;

/**
 * @author yancey
 */
public class SequenceException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public SequenceException() {
		super();
	}

	public SequenceException(String message) {
		super(message);
	}

	public SequenceException(String message, Throwable cause) {
		super(message, cause);
	}

	public SequenceException(Throwable cause) {
		super(cause);
	}
}
