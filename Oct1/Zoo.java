
//----------------------------------------------------------------------------------
//  Exercise 3: 
//  OOP examples
//  Zoo.java
//----------------------------------------------------------------------------------

public class Zoo
{
  public static void main(String[] args)
  {
    int x = 10;
    Bear bear1 = new Bear(34, 10, "Wild");
    
    Duck alex = new Duck();         //Object instantiation
    
    Animal animal = new Animal();   //If animal is abstract, you can not instantiate

    alex.age = 34;                  //Properties
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
