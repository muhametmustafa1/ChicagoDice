import javax.swing.*;
public class Kontrolleri { 
   public Kontrolleri( Lojtari lojtari , Loja loja) { 

  
      if (loja.numri<2 || loja.numri>6) { JOptionPane.showMessageDialog(null,
                          "Numri i lojtareve duhet te jete nga 2 deri ne 6 ") ; }
       
         else{
           lojtari.afishoLojtaret();
           loja.filloLojen();
           loja.afishoPiket();
           loja.afishoFituesin();
        }
   }
}