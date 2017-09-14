//the <T> is a generic type
public class Box<T>
{
  //class fields
  private T contents;
  private boolean isFull;

  // Make a new empty box
  public Box()
  {
  	super();
  	isFull = false;
  }

  // Make a new box pre-filled with contents
  public Box(T t)
  {
  	super();
  	isFull = true;
  	contents = t;
  }

  /**
   * Check the contents of the box
   *@return whatever is in the box
   */
  public T getContents()
  {
  	return contents;
  }

  /**
   * Tell whether the box is full or not
   *@return true if the box is full, false if it is empty
   */
  public boolean isFull()
  {
  	return isFull;
  }

  /**
   * Empty out the box, and give back whatever was in it
   *@return whatever was in the box that was taken out
   */
  public T empty()
  {
  	T junk = contents;
  	contents = null;
  	isFull = false;
  	return junk;

  }
  /**
  *Tells whether a box was filled successfully or not
  *@return true if the box was filled successfully, and false if the box was already full
  */
  public boolean fill(T t)
  {
  	if(isFull)
  		return false;
  	else
  	{
  		contents = t;
  		isFull = true;
  		return true;
  	}
  		
  }

  /**
  *if box is empty, prints 'empty box', if full, prints what is in the box
  *@return the string that tells if the box is empty or not
  */
  public String toString()
  {
  	if(isFull)
  		return contents + "";
  	else
  		return "Empty";
  }

  public static void main(String[] args)
  {

    // Make two boxes
    Box<String> stringBox = new Box<String>();
    Box<Integer> intBox   = new Box<Integer>(25);

    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);

    //TODO Add something to a box
	stringBox.fill("Nate Hefner");

    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);

    //TODO Test your peek method
	System.out.println("The boxes contain: " + stringBox.getContents() + ", " + intBox.getContents());


    //TODO Empty a box
	System.out.println("The box intBox was just emptied. " + intBox.empty() + " was taken out of the box."); 


    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);
  }
}
