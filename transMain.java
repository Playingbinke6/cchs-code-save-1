import java.util.*;

public class Product
{
   private String ProductId;
   private double Bought;
   private double Sold;
   private String Descr;

  public Product(String pro, double buy, double sell, String Desc)
  {
       ProductId = pro;
       Bought = buy;
       Sold = sell;
      Descr = Desc;
   }
   public String getID()
   {
       return ProductId;
   }
   public double getBuy()
   {
       return Bought;
   }
   public double getSell()
   {
       return Sold;
   }
   public String getDisc()
   {
       return Descr;
   }
   public String finalPrint()
      {
           String ans = ProductId + " " + Descr + " $" + Sold + " $" + Bought + " " + numSold + " " + numBought;
           return ans;
      } 

   



}


public class transMain
{
   public static void main(String[] args)
   {
      Scanner scanP = new Scanner();
      Scanner scanT = new Scanner();
      
   }
   public static void finalOut()
      {
         for (int i=0; i<arrProd.length; i++)
         {
            
         }
         
         //this should print out the final report for all items
      }
   public static void trans(String input)
      {
         String[] arrIn = input.split("\\s");
         for (int i=0; i<arrProd.length; i++)
         {
            String prodId = arrProd[i].getId();
            if(prodId.equals(arrIn[1]))
            {
               
            }
         }
         
      }
}

public class transMain
{
   public static void main(String[] args)
   {
      Scanner scanP = new Scanner();
      Scanner scanT = new Scanner();
      
   }
   public static void finalOut()
      {
         for (int i=0; i<arrProd.length; i++)
         {
            
         }
         
         //this should print out the final report for all items
      }
   public static void trans(String input)
      {
         String[] arrIn = input.split("\\s");
         for (int i=0; i<arrProd.length; i++)
         {
            String prodId = arrProd[i].getId();
            if(prodId.equals(arrIn[1]))
            {
               
            }
         }
         
      }
}
