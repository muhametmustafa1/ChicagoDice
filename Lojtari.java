import javax.swing.*;
public class Lojtari { 
 static String[] emri = new String[Loja.numri]; 
  public void afishoLojtaret(){
     for(int i = 0 ; i < Loja.numri ; i++ ) { 
        emri[i] = JOptionPane.showInputDialog("Jepe emrin e lojtarit  " + (i+1)).toUpperCase();
         System.out.print(emri[i]); System.out.print("              ");
     } 
     System.out.println(); System.out.println();
  }
}

 
 
