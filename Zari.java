public class Zari { 
private int zari1 ; 
private int zari2 ;
 
   public int hedhZaret() { 
  zari1 =(int)(Math.random() * 6) +1;
  zari2 =(int)(Math.random() * 6) +1;
  return zari1+zari2;
  }
 
 
 public int merrPiket1() 
 {return zari1; } 
 
 public int merrPiket2() 
 { return zari2 ;} 

} 