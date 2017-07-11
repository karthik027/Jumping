# Jumping
import java.io.*;
import java.util.*;
public class Jumping
{
  public static void main(String args[])
  {
    int d=0,z=0,y=0;  
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the positive number");
    int n=sc.nextInt();
    if(n>0)
    {
      if((n>0)&&(n<10))
      {
        System.out.println("Jumping Number");
      }
      else
      if(n>9)
      {
        String s=String.valueOf(n);
        int l=s.length();
        char[] c=s.toCharArray();
        for(int i=0,j=i+1;i<l&&j<l;i++,j++)
        {
          d=Math.abs(c[i]-c[j]);
          if(d==1)
          {
            z++;
          }
        }
        y=l-1;
        if(z==y)
        {
          System.out.println("Jumping Number");
        }
        else
        {
          System.out.println("Not a Jumping Number");
        }
      }
      }
      else
      {
        System.out.println("Not a Jumping Number");
      }
       }
       }
      
      
      
      
      
      
      
    
