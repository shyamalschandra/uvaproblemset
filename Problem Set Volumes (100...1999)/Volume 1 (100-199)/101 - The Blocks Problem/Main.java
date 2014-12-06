// Solution: Copyright Shyamal Chandra, 2014
// Link to original problem description: http://uva.onlinejudge.org/external/1/101.pdf
// 

import java.io.*;
import java.util.*;

class Main implements Runnable
{
    static String ReadLn(int maxLength) 
    {
        byte line[] = new byte [maxLength];
        int length = 0;
        int input = -1;
        try 
        {
            while (length < maxLength)
            {
                input = System.in.read();
                if ((input < 0) || (input == '\n')) break;
                line [length++] += input;
            }
            
            if ((input < 0) && (length == 0)) return null;
            return new String(line, 0, length);
        }
        catch (IOException e) {
            return null;
        }
    }
    
    public static void main(String args[])
    {
        Main myWork = new Main();
        myWork.run();
    }
    
    public void run()
    {
        new myStuff().run();
    }
}

class myStuff implements Runnable 
{
    int maxcycle;
    int tempcycle;
    
    public void run() 
    {
        String input;
        StringTokenizer idata;
        int a, b;
        int ctr = 0;
        while ((input = Main.ReadLn(255)) != null)
        {
            idata = new StringTokenizer(input);
            a = Integer.parseInt(idata.nextToken());
            b = Integer.parseInt(idata.nextToken());
            
            
        }
    }
}