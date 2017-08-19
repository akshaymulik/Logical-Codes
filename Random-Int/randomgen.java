public class randomgen
{

   public static void main(String args[]) 
   {
      int RandomValue = RandomGenerator();
      System.out.println(RandomValue);
   }

   public static int RandomGenerator()
   {
     int output = (int)(Math.random()*10);
     return output;
   }
}
