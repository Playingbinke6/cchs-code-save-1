import java.util.*;
// Product Class, By: Zachary Ware.



public class Product
{
   // variable names
   private String ProductId;
   private double Bought; // Buy price
   private double Sold;  // sell price
   private String Descr; // Desription
   private int numSold; // Number sold
   private int numBought; // Number bought
   
   public Product(String input)
    {
        
        String[] x = input.split("\\s", 4);
        x[0] = ProductId;
        Bought = Double.parseDouble(x[1]);
        Sold = Double.parseDouble(x[2]);
        x[3] = Descr;
        numSold = 0;
        numBought = 0;
        
    }
       // All the getters for my class.
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
    
    public void addBought(int n)
    {
        numBought += n;
    }
    
    public void addSold(int n)
    {
        numSold += n;
    }
    
    // toString to return this format.
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
         File inP = new File("");
         File inT = new File("");
         Scanner scanP = new Scanner(in);
         Scanner scanT = new Scanner(inT);
         
         ArrayList<Product> arrProd = new ArrayList;
         ArrayList<String> arrtrans = new ArrayList;
         
         while(scanP.hasNextLine())
         {
            int i = 0;
            String newLineP = scanP.nextLine();
            arrProd[i] = Product(newLineP);
            i++;
         }
         while(scanT.hasNextLine())
         {
            int i = 0;
            String newLineT = scanT.nextLine();
            trans(newLineT);
            i++;
         }
         printReport();
         

      
   }
   public static void printReport()
      {
         for (int i=0; i<arrProd.length; i++)
         {
            System.out.println(arrProd[i].toString());
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
      Product[] arrProd = new 
      
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
