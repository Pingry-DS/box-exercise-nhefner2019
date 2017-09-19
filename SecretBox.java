public class SecretBox<T> extends Box<T>
{

	private T hiddenCompartment;
	private String password;

	public SecretBox(T main, T secret)
	{
		isFull = true;
		contents = main;
		hiddenCompartment = secret;
	}
	
	public void setPassword(String s)
	{
		password = s;
	}
	
	public T getSecretContents(String guess)
	{
		if(guess.equals(password))
			return hiddenCompartment;
		else
			return null;
	}
	
	public String toString()
	{
		if(isFull)
			return hiddenCompartment + " is in the hidden compartment. The password for the hidden compartment is " + password;
		else
			return "Empty";
	}
	
}