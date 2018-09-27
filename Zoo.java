
//----------------------------------------------------------------------------------
//  Exercise 3: 
//  OOP examples
//zoo.java
//----------------------------------------------------------------------------------

public class Zoo
{
  public static void main(String[] args)
  {
    int x = 10;
    Duck alex = new Duck();     //Object instantiation

    alex.age = 34;              //Properties
    alex.color = 10;
    alex.specie = "Wild";

    Duck paul = new Duck();
    paul.specie = "Domestic";   //Strings inside " ", characters inside ' '
    paul.age = 12;
    paul.color = 2;

    System.out.println(alex.weight);
    System.out.println(alex.fly);
    
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
*/
