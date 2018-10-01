
//----------------------------------------------------------------------------------
//  Exercise 3: 
//  OOP example on Inheritance
//----------------------------------------------------------------------------------

public class Duck extends Animal
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


  void fly(int limit)
  {
    System.out.println("Flying over "+limit+" meters.");
  }
}



