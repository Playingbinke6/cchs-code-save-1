import java.util.*;
// Product Class, By: Zachary Ware



public class Product
{
   // variable names
   private String ProductId;
   private double Bought;
   private double Sold;
   private String Descr;
   private int numSold;
   private int numBought;
   
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
    
    public void addBought(int n);
    {
        numBought += n;
    }
    
    public void addSold(int n);
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
   
    
   
    



public class transMain
{
   public static void main(String[] args)
   {
         File inP = new File("");
         File inT = new File("");
         Scanner scanP = new Scanner(inP);
         Scanner scanT = new Scanner(inT);
         double taxRate = Double.parseDouble(scanT.nextLine());
         
         ArrayList<Product> arrProd = new ArrayList();
         
         
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
            trans(newLineT);
         }
         printReport();
         

      
   }
   public static void printReport(ArrayList)
      {
         for (int i=0; i<arrProd.length; i++)
         {
            System.out.println(arrProd.get(i).toString());
         }
         
         //this should print out the final report for all items
      }
   public static void trans(String input)
      {
         String[] arrIn = input.split("\\s");
         boolean buying;//if true then action is buying, if false action is selling
         int numBS = Intger.parseIntger(arrIn[3]);
         
         if(arrIn.equals("buy"))//identfy if action is buying or selling
         {
            buying = true;
         }
         
         int loc = -1;//saves the location for the matching ID in arrProd
         for (int i=0; i<arrProd.length; i++)//cycles through all locations in attProd
         {
            String prodId = arrProd.get(i).getId();//sees if the productID match to the one we are looking for 
            if(prodId.equals(arrIn[1]))
            {
               loc = i;
               
               if(buying)//add the num sold/bought to the prodoct obj
               {
                  arrProd.get(i).addBought(numBS);
               }
               else
               {
                  arrProd.get(i).addSold(numBS);
               }
            }
         }
         
      }
}
