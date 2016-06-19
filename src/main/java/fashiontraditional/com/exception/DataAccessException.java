package fashiontraditional.com.exception;

public class DataAccessException extends Exception {

	private Integer errorCode;

	public DataAccessException(Integer code) {
		super();
		this.errorCode = code;
	}

	public DataAccessException(Integer code, String message) {
		super(message);
		this.errorCode = code;
	}

	public Integer getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(Integer errorCode) {
		this.errorCode = errorCode;
	}

	
}
