package br.cristian.zupteste.desafioorangetalents.handler;

public class ErrorMessageResponse {
	
	private String message;
	
	public ErrorMessageResponse(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
