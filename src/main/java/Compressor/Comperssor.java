/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Compressor;
import java.io.*;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author gupta
 */
public class Comperssor {
    public static void method(File file)throws IOException
    {
         String filedirectory = file.getParent();
         
         FileInputStream fis = new FileInputStream(file);
         FileOutputStream fos = new FileOutputStream(filedirectory+"/Compressed.gz");
         GZIPOutputStream gzip = new GZIPOutputStream(fos);
         
         byte[] buffer = new byte[1024];
         int len;
         
         while((len = fis.read(buffer))!= -1)
         {
             gzip.write(buffer,0,len);
         }
         
         gzip.close();
         fos.close();
         fis.close();
         
    }
    public static void main( String[] args)throws IOException
    {
      File path = new File("/Users/gupta/OneDrive/Documents/" );
      method(path);
    }
}
