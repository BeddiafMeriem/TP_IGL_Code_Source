
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
	

        public int[] inverser(int[] tab)
	{
		int i;
		int taille = tab.length;
		for(i=0 ; i<taille/2 ; i++)
		{
			int interm = tab[i];
			tab[i] = tab[taille-1-i];
			tab[taille-1-i] = interm;
		}
		return tab;
       }
	
	
	public int[] produit2(int[] tab)
	{
		int i=0;
		for(i=0;i<tab.length;i++)
		{
			tab[i] = tab[i]*2;
		}
		return tab;
	}

		
        public int[] somme(int[] tab1 , int[] tab2) throws EgaliteException
	{
		int taille1 = tab1.length;
		int taille2 = tab2.length;
		int res[] = new int[100];
		
			int i=0;
			for(i=0;i<taille1;i++)
			{
				res[i] = tab1[i]+tab2[i];
			}
			
	    
		return res;	
	}

}
