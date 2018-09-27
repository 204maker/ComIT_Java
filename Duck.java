
//----------------------------------------------------------------------------------
//  Exercise 3: 
//  OOP examples
//----------------------------------------------------------------------------------

public class Duck
{
  int color;
  int age;
  int weight;
  String specie;


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


  void fly(int altitude)
  {
    System.out.println("Flying over "+altitude+" meters.");
  }
}



/*
Java data types:
  integer
  boolean v = true;
  char
  float
  double
  String

  Actions --> METHODS
  i.e.
    eat
    fly
    swim
    walk
*/
