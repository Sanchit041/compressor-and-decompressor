/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Compressor;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author gupta
 */
public class Appframe extends JFrame implements ActionListener{
     JButton compressButton;
     JButton decompressButton;
     
     
     
    Appframe()
    {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setLayout(null);
      
      compressButton = new JButton("Select file to compress");
      compressButton.addActionListener(this);
      compressButton.setBounds(20,100,200,30);
      
      decompressButton = new JButton("Select file to decompress");
      decompressButton.addActionListener(this);
      decompressButton.setBounds(250, 100, 200, 30);
      
      this.add(compressButton);
      this.add(decompressButton);
      this.setSize(500,200);
      this.getContentPane().setBackground(Color.black);
      
      this.setVisible(true);
    }
    @Override 
     public void actionPerformed(ActionEvent e)
    {
        // for compressbutton
        if(e.getSource()==compressButton)
        {
            JFileChooser filechooser = new JFileChooser();
            int response = filechooser.showSaveDialog(null);
            
            if(response == JFileChooser.APPROVE_OPTION)
            {
                File file = new File(filechooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
                
                try{
                    Comperssor.method(file);
                }
                catch(Exception excp)
                {
                    JOptionPane.showMessageDialog(null,excp.toString());
                }
            }
        }
            // for decompressbutton
             if(e.getSource()==decompressButton)
             {
              
                 JFileChooser filechooser = new JFileChooser();
            int response = filechooser.showSaveDialog(null);
            
            if(response==JFileChooser.APPROVE_OPTION)
            {
                File file = new File(filechooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
                try{
                    Decompressor.method(file);
                    
                }
                catch(Exception excp){
                    JOptionPane.showMessageDialog(null, excp.toString());
                    
                }
            }
        }
        }
    }
    
