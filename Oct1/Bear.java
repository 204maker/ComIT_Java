
public class Bear extends Animal
{
  public Bear(int age, int color, String specie)
  {
    super(age, color, specie);      // superconstructor
  }
  
  public void walk()
  {
    System.out.println("The bear is walking!");
  }
}
