//Ashley Gutierrez Carreto
//Novemeber 2nd, 2023
//Lab 9 CounterTest
//The class counts things counting by 1. The method will not allow the number 
//to be a negative. As well allows the the setter to return the current count 
// and displays the count sequence on screen
public class CounterTest
{   
    public static void main (String [] args)
    {
        
       
        Counter myCounter = new Counter();//Instantiates the class "Counter"
        System.out.println ("The the initial value is " + myCounter.getValue());
        
          
        myCounter.valueToZero();
        myCounter.increase();
        myCounter.increase();
        myCounter.increase(); 
        myCounter.displayCount();
        myCounter.reduction();
        myCounter.increase();
        myCounter.valueToZero();
        myCounter.displayCount();
        myCounter.increase();
        myCounter.reduction();
        myCounter.reduction();
        myCounter.reduction();
        
        // code something to reset the counter
        //increase a few times then decrease it a few times
        //print the counter in btwn to verify its doing it
    }
}
