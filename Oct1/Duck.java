
//----------------------------------------------------------------------------------
//  Exercise: 
//  OOP example on Inheritance
//    - Inheritance works only with one parent
//    - 
//----------------------------------------------------------------------------------

public class Duck extends FlyAnimal
{
  private Duck friend;               // One duck can have another friend of type duck
                                     // JVM sees principal and a friend - example of AGGREGATION
 
  public Duck(int age, int color, String specie)
  {
    super(age, color, specie);      // superclass
  }


  // void eat(int food)
  void eat(int food)
  {
    if(weight+food < 20000)
    {
      weight = weight + food;
      System.out.println("eating "+food+" ...done!");
    }
    
    else
      System.out.println("Duck is full!");
  }
  

  public void walk()
  {
    System.out.println("Walking...........done!");
  }

  // void fly(int limit)
  void fly(int limit)
  {
    System.out.println("Flying over "+limit+" meters.");
  }
  
}



