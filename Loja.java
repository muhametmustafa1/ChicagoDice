import javax.swing.*;
public class Loja { 
Zari zari= new Zari() ;  private Lojtari l;
  static int numri = new Integer(JOptionPane.showInputDialog("Jepe nr e lojtareve")).intValue();
  int[] piket= new int[numri];
  int[] totali= new int[numri];
  int rundi = 2 ; 
    public void filloLojen(){
        while (rundi <=12) { 
          System.out.println("Rundi " + rundi) ;  
           luajRundin();
          System.out.println();        rundi++;
       JOptionPane.showMessageDialog(null, "Shtyp OK per te luajtur rundin tjeter");
       }
   }  
       private  void luajRundin() { 
        int count = 0;
         while(count<numri) {
          piket[count] = zari.hedhZaret();
          System.out.print("piket: "+piket[count]);  System.out.print("             "); 
            if(piket[count]== rundi ) { totali[count]++; } 
          count++;
         }
        System.out.println();
  
      }
   public void afishoPiket() {
        String fjalia = "" ; String poenat="" ;
            for(String temp : l.emri)  { fjalia=fjalia+temp+"       "; }
            for(int nr: totali)  { poenat = poenat+ nr + "                     ";}
     JOptionPane.showMessageDialog(null,"Totali i pikeve \n"+fjalia+"\n" +poenat  );
  }   
   
 
 private int ktheFituesin() { 
   int index=0; int max = totali[0];
     for (int i = 1 ; i< numri ; i++ ) { 
         if (totali[i] > max ) { 
            max = totali[i] ;
             index = i ; 
         } 
      } 
  return index ;  
 }
 
 private String ktheFituesit(){ 
     String rez= "" ;
     int indeksi = ktheFituesin();
     if(totali[indeksi] == 0 ) { rez = "nukkafitues" ; }
      else { for(int j = 0 ; j < totali.length ; j++ ) { 
              if(totali[j] == totali[indeksi] ) { rez= rez+j ; } 
             }     
     }
   return rez;
 }
 
 public void afishoFituesin() { 
 String indeksat= ktheFituesit();
   if(indeksat.equals("nukkafitues")) { JOptionPane.showMessageDialog(null,"Nuk ka fitues"); }
 
   if(indeksat.length()== 1) 
    { int a = new Integer(indeksat.substring(0,1)).intValue();
       JOptionPane.showMessageDialog(null,"Pra fitues eshte " + l.emri[a]+ 
                                         " me " + totali[a] + " pike") ; }
else if(indeksat.length()== 2) 
     { int a = new Integer(indeksat.substring(0,1)).intValue();
       int b = new Integer(indeksat.substring(1,2)).intValue();
      JOptionPane.showMessageDialog(null,"Pra fitues jane " + l.emri[a]+" dhe " + l.emri[b]+ 
                                         " me nga " + totali[a] + " pike") ; } 
 else if(indeksat.length()== 3) 
     { int a = new Integer(indeksat.substring(0,1)).intValue();
       int b = new Integer(indeksat.substring(1,2)).intValue();
       int c = new Integer(indeksat.substring(2,3)).intValue();
      JOptionPane.showMessageDialog(null, "Pra fitues jane " + l.emri[a]+", " + l.emri[b]+" dhe " + l.emri[c]+
                                     " me nga " + totali[a] + " pike") ; } 
else if(indeksat.length()== 4) 
 { int a = new Integer(indeksat.substring(0,1)).intValue();
   int b = new Integer(indeksat.substring(1,2)).intValue();
   int c = new Integer(indeksat.substring(2,3)).intValue();
   int d = new Integer(indeksat.substring(3,4)).intValue();
  
    JOptionPane.showMessageDialog(null, "Pra fitues jane " + l.emri[a]+", " + l.emri[b]+", " + l.emri[c] 
                                    +" dhe " + l.emri[d] +  " me nga " + totali[a] + " pike") ; } 
  else if(indeksat.length()== 5) 
 { int a = new Integer(indeksat.substring(0,1)).intValue();  int b = new Integer(indeksat.substring(1,2)).intValue();
   int c = new Integer(indeksat.substring(2,3)).intValue();  int d = new Integer(indeksat.substring(3,4)).intValue();
   int e = new Integer(indeksat.substring(4,5)).intValue();  
    JOptionPane.showMessageDialog(null, "Pra fitues jane " + l.emri[a]+", " + l.emri[b]+", " + l.emri[c] 
                                    +", " + l.emri[d] +" dhe " + l.emri[e]+" me nga " + totali[a] + " pike") ; } 
   else if(indeksat.length()== 6) 
 { int a = new Integer(indeksat.substring(0,1)).intValue();  int b = new Integer(indeksat.substring(1,2)).intValue();
   int c = new Integer(indeksat.substring(2,3)).intValue();  int d = new Integer(indeksat.substring(3,4)).intValue();
   int e = new Integer(indeksat.substring(4,5)).intValue();  int f = new Integer(indeksat.substring(5,6)).intValue();
    JOptionPane.showMessageDialog(null, "Pra fitues jane " + l.emri[a]+", " + l.emri[b]+", " + l.emri[c] 
            +", " + l.emri[d] +", " + l.emri[e]+" dhe " + l.emri[f]+ " me nga " + totali[a] + " pike") ; }

   }

}