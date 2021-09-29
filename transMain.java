import java.util.*;
//Tedy
public class Product
{
   private String ProductId;
   private double Bought;
   private double Sold;
   private String Descr;
   private int numSold;
   private int numBought;
   
   public Product(String input)
    {
        String[] x = input.split("\\s", 4);
        x[0] = ProductId
        Bought = Double.parseDouble(x[1]);
        Sold = Double.parseDouble(x[2]);
        x[3] = Descr
        numSold = 0;
        numBought = 0;
        
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
    
    public void addBought(int n);
    {
        numBought += n;
    }
    
    public void addSold(int n);
    {
        numSold += n;
    }
    
    public String toString()
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
