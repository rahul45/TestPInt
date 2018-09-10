package exceptions;

public class UserException extends Exception{
	public UserException(){
		System.out.println("Exception in user!");
	}
	public String error(){
		return "PrettyException";
	}
}
