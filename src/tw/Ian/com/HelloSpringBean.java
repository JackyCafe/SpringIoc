package tw.Ian.com;

public class HelloSpringBean {
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "HelloSpringBean [message=" + message + "]";
	}

}
