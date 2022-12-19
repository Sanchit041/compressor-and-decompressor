/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Compressor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

/**
 *
 * @author gupta
 */
public class Decompressor {
    public static void method(File file) throws IOException
    {
        String filedirectory = file.getParent();
        
        FileInputStream fis = new FileInputStream(file);
        GZIPInputStream gzip = new GZIPInputStream(fis);
        FileOutputStream fos = new FileOutputStream(filedirectory+"/Decompressor");
        
        byte[] buffer = new byte[1024];
        
        int len;
        
        while((len = gzip.read(buffer))!=-1)
        { 
            System.out.println("length of file"+len);
            fos.write(buffer,0,len);
        }
       gzip.close();
       fis.close();
       fos.close();
    }
    public static void main(String[] args)throws IOException
    {
        File path = new File("/Users/gupta/OneDrive/Documents/Compressed.gz");
        method(path);
    }
}
