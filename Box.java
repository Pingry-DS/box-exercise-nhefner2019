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
  *if box is empty, prints 'empty box', if full, prints what is in the box
  */
  public String toString()
  {
  	if(!isFull)
  		return "The box is empty";
  	else
  		return contents + " is in the box";
  }

  public static void main(String[] args)
  {

    // Make two boxes
    Box<String> stringBox = new Box<String>();
    //TODO start the second box with contents inside
    Box<Integer> intBox   = new Box<Integer>();

    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);

    //TODO Add something to a box



    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);

    //TODO Test your peek method


    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);

    //TODO Empty a boxes



    // View contents (via toString method)
    System.out.println("The boxes contain: " + stringBox + ", " + intBox);
  }
}
