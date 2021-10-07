// Product Class, By: Zachary Ware
import java.util.*;


public class Product
{
   // variable names
   private String ProductId;
   private double Bought;// but price
   private double Sold;// sell price
   private String Descr;// decription
   private int numSold; // number sold
   private int numBought; // number bought
   
   public Product(String input)
    {
        
        String[] x = input.split("\\s", 4);
        ProductId = x[0];
        Bought = Double.parseDouble(x[1]);
        Sold = Double.parseDouble(x[2]);
        Descr = x[3];
        numSold = 0;
        numBought = 0;
        
    }
       // All the getters for my class
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
    
    // toString to return this format
    public String toString()
      {
           String ans = ProductId + " " + Descr + " $" + Sold + " $" + Bought + " " + numSold + " " + numBought;
           return ans;
      } 
    
    
    
    
    
}
  
   
    
   
    



import java.util.*;
import java.io.*;

public class transMain
{
   public static void main(String[] args)
   {
      try
      {
            File inP = new File("C:\\Users\\clarkthe\\Documents\\prog1\\products.txt");
            File inT = new File("C:\\Users\\clarkthe\\Documents\\prog1\\transactions.txt");
            Scanner scanP = new Scanner(inP);
            Scanner scanT = new Scanner(inT);
            double taxRate = Double.parseDouble(scanT.nextLine());
            
            ArrayList<Product> arrProd = new ArrayList<Product>();
            
            
            while(scanP.hasNextLine())
            {
               int i = 0;
               String newLineP = scanP.nextLine();
               Product prodTemp = new Product(newLineP);
               arrProd.add(prodTemp);
               i++;
            }
            while(scanT.hasNextLine())
            {
               String newLineT = scanT.nextLine();
               trans(newLineT, arrProd);
            }
            printReport(arrProd);
            scanP.close();
            scanT.close();
         
      }
      catch(FileNotFoundException|NoSuchElementException e)
      {
         System.out.println("An error occured");
         e.printStackTrace();
      }
      
   }
   public static void printReport(ArrayList<Product> arrProd)
      {
         for (Product p:arrProd)
         {
            System.out.println(p.toString());
         }
         
         //this should print out the final report for all items
      }
   public static void trans(String input, ArrayList<Product> arrProd)
      {
         String[] arrIn = input.split("\\s");
         boolean buying = true;//if true then action is buying, if false action is selling
         String buySell = arrIn[2];
         int numBS = Integer.parseInt(buySell);
         
         if(arrIn[1].equals("buy"))//identfy if action is buying or selling
         {
            buying = true;
         }
         
         for (Product p:arrProd)
         {
            String prodId = p.getID();//sees if the productID match to the one we are looking for 
            //System.out.println("*" + prodId + "*");
            if(prodId.equals(arrIn[0]))
            {
               
               if(buying)//add the num sold/bought to the prodoct obj
               {
                  p.addBought(numBS);
               }
               else
               {
                  p.addSold(numBS);
               }
            }
         }
         
      }
}
