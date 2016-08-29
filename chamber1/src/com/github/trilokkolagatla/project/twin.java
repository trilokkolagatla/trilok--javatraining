package com.github.trilokkolagatla.project;

import java.util.*;

public class twin {
	boolean isPrime(int n) 
    {
        int count=0;
        for(int i=1; i<=n; i++)
            {
                if(n%i == 0)
                    count++;
            }
        if(count == 2)
            return true;
         else
            return false;
    }

public static void main(String args[]) 
    {
        twin ob = new twin();
        Scanner br=new Scanner(System.in);
       

        System.out.print("Enter the lower range : ");
        int p=br.nextInt();
        System.out.print("Enter the upper range : ");
        int q = br.nextInt();
         
        if(p>q)
            System.out.println("Invalid Range !");
        else
        {
            System.out.println("The Twin Prime Numbers within the given range are : ");
            for(int i=p; i<=(q-2); i++)
            {
                if(ob.isPrime(i) == true && ob.isPrime(i+2) == true)
                {
                    System.out.print("("+i+","+(i+2)+") ");
                }
            }
        }                 
    }


}
