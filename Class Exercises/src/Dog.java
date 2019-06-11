public abstract class Dog
{
 protected String name;
 private int breedWeight ;

 public Dog(String name) 
 {
 this.name = name;
 }

 public String getName() 
 {
 return name;
 }

 public String speak() 
 {
 return "Woof";
 }
 public  abstract int avgBreedWeight() ;

}