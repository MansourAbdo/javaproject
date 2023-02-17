package p4;
import java.util.Scanner;

public class DemoLandTract

   {

      public static void main(String[] args)

      {

      double length;         

      double width;       

          

       
         Scanner keyboard = new Scanner(System.in);

            System.out.print("Enter the length for Tract 1: ");

         length = keyboard.nextDouble();

            System.out.print("Enter the width for Tract 1: ");

         width = keyboard.nextDouble();

       

       

         LandTract lt1 = new LandTract(length, width);
         double area1 = lt1.getArea();

       

         System.out.print("Enter the length for Tract 2: ");

         length = keyboard.nextDouble();

            System.out.print("Enter the width for Tract 2: ");

         width = keyboard.nextDouble();
         
           LandTract lt2 = new LandTract(length, width);
           double area2 = lt2.getArea();
           
           System.out.println(lt1.toString());
           System.out.println(lt2.toString());
           System.out.println();
           
         if (lt2.equals(lt2))
			System.out.println("The two land Tracts are equal.");
		else
			System.out.println("The the two land Tracts are not equal");
           

      } 
   }
