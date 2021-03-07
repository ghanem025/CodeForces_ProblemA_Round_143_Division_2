//Created by Ghanem Ghanem
import java.util.*;
 
public class team{
 
  public static void main(String [] args){
    Scanner sc = new Scanner (System.in);
    int partic = sc.nextInt();
    int [] arr = new int[3];
    int c=0;
    int sol =0;
    
   for(int j=0;j<partic;j++){
    c =0;
    for(int i=0; i<3;i++){
      int pvt = sc.nextInt();
      arr[i] = pvt;
      if(arr[i]>=1){
        c++;
      }
    }
    if(c>=2) {
     sol++;
    }
    }
    System.out.println(sol);

 }
}
 
 
