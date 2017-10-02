/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author pbibu
 */
public class JavaFileMakerAndWriter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{
    PrintWriter writer = new PrintWriter("MultiDataSet.txt", "UTF-8");
    for(int i = 0; i <= 1000; i++){
        for(int j = 0; j <= 1000; j++){
            writer.println(i + "," + j + "," + i*j);
        }
    }
    writer.close();
} catch (IOException e) {
   // do something
}
    }
    
}
