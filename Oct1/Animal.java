public abstract class Animal           //Abstract
{
  protected int color;                //when working with Inheritance, use protected
  protected int age;
  protected int weight;
  protected String specie;
  protected Person owner;
  
  public Animal()
  {
  }
  
  public Animal(int age, int color, String specie)
  {
      this.age = age;
      this.color = color;
      this.specie = specie;
  } 
  
  public int getAge()
  {
      return age;
  }
  
   public void setAge(int age)
  {
      this.age = age;
      return age;     
  }
  
  public abstract void walk();
  
  
}
