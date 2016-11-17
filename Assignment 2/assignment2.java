// Francisco Samuel Rios
// Assignment 2 - Process Scheduling
// COP 3402 - February 2, 2016

import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class assignment2
{
    public String schedulingType = "";
    public int processCount = 0;
    public int runTime = 0;
    public int quantum = 0; //Only used for Round-Robin style
    public int procArray[][];
    public String procNameArray[];

    public static void main(String args[]) throws FileNotFoundException
    {
        String schedulingType = "";
        int processCount = 0;
        int runTime = 0;
        int quantum = 0; //Only used for Round-Robin style
        int procArray[][];
        String procNameArray[];
   
        File file = new File("processes.in");
        Scanner sc = new Scanner(file);
        
        // Line by line will have to be the case until we have the number of processes
        // I don't like this method, but it seems like the only way. We lose out on a lot of
        // Sweet, sweet iterative checking for #s :(
        
        // Gets number of processes 
        
        // Gets runtime limit
        
        // Gets the scheduling type
        
        if( schedulingType.equals("rr") )
        {
            // Gets quantum (if the type is rr)
        }
        
        // This array will hold the arrival time in the first column, and the burst time in the second
        procArray = new int[processCount][2];
        
        // This array is alighned with procArray, and holds the names for each process
        procNameArray = new String[processCount];
        
        for(int i = 0; i<processCount; i++)
        {
            //Grab name
            
            
            // Grab arrival time
            
            
            // Grab burst time
            
        }
        
        // After this is the easy part, the actual algorithms
    }
}