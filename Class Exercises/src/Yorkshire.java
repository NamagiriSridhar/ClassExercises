public class Yorkshire extends Dog 
{
 private int breedWeight = 50;

 public Yorkshire(String name) 
 {
 super(name);
 }

 @Override
 public String speak() 
 {
 return "woof";
 }
 public  int avgBreedWeight()  
 {
 return breedWeight;
 }

}