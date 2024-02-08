//Ashley Gutierrez Carreto
//Novemeber 2nd, 2023
//Lab 9 Counter
//The class counts things counting by 1. The method will not allow the number 
//to be a negative. As well allows the the setter to return the current count 
// and displays the count sequence on screen.
public class Counter

{
    private int value = 0; //instance variable (only one)
    
    public void valueToZero()
    {
       value = 0; //declaring
    }
    
    
    public void increase () //method to increase 
    
    {
        value++; // adds 1
    }
    
    public void reduction () //method to decrease
    
    {
        if (value >= 0)
        {
            value--; //subtracts 1
        }
        else
        {
            System.out.println ("The counter is zero. "
                              + "Negatives are not allowed");
        }
    }
    
    //accesor method that returns the orignal  value
    public int getValue ()
    {
        return value;
    }
    
    public void displayCount() //display current value
    
    {
        System.out.println ("Your current count value is: " + value);
    }
    
}