
import java.util.*;



public class VectorHelp {
 
	public int[] trier(int[] tab){
		  int taille = tab.length;
		  int j = 0;
		  int tmp = 0;
		  for(int i=0;i<taille;i++){
		    j = i;
		    for(int k = i;k<taille;k++){
		      if(tab[j]>tab[k]){
		        j = k;
		      }
		    }
		    tmp = tab[i];
		    tab[i] = tab[j];
		    tab[j] = tmp;
		  }
		  return tab;
		}
	}