import java.lang.*;
public class main {

	public static void main(String args []) throws EgaliteException 
	{
		VectorHelp T = new VectorHelp();
         int[] tab1 = {5, 10, 7, 14};
         int[] tab2 = {2, 4 , 7 , 5};
         
         /*for(int i=0 ; i<tab1.length;i++)
         {
        	 System.out.print("  |  " +tab1[i]);
         }*/
         System.out.println();
         
        //////////////////////////Test de somme////////////////////////////////////
         
         int a[] = new int[1000];
         if(tab1.length != tab2.length)
         {
        	 throw new EgaliteException();
         }
         else
         {
        	 System.out.println();
        	 System.out.println("le somme des 2 tableau est :");
             a = T.somme(tab1 , tab2);
         }
         System.out.println();
         
         for(int i=0 ; i<tab1.length;i++)
         {
        	 System.out.print("  |  " +a[i]);
         }
         
         /////////////////////////////Test de produit/////////////////////////////////
         
         int c[] =  new int[100];
         c = T.produit2(tab2);
         System.out.println();
         System.out.println("TEST DU PRODUIT");
         System.out.println();
         for(int i=0 ; i<tab2.length;i++)
         {
            System.out.print("  |  " +c[i]);
         }
         
         //////////////////////////Test de max et min////////////////////////////////////
         
         System.out.println();
         int[] maxmin = new int[2];
         maxmin = T.MaxMin(tab1);
         /*for(int i=0 ; i<maxmin.length;i++)
         {
        	 System.out.print("  |  " +maxmin[i]);
         }*/
         int min = maxmin[0];
         int max = maxmin[1];
         System.out.println();
         System.out.println("le max du tableau est : "+max);
         System.out.println();
         System.out.println("le min du tableau est : "+min);
         System.out.println();
         
         ///////////////////////////Test de linverse/////////////////////////////////
         
         int inv[] = new int[100];
         inv = T.inverser(tab1);
         System.out.println("l'inverse du tableau est :");
         
         for(int i=0 ; i<tab1.length;i++)
         {
        	 System.out.print("  |  " +tab1[i]);
         }
         System.out.println();
         
         ///////////////////////////Test de tri///////////////////////////////////
         
         int b[] = new int[100];
         b = T.trier(tab2);
         System.out.println();
         System.out.println("TEST DU TRI");
         System.out.println();
         for(int i=0 ; i<tab2.length;i++)
         {
        	 System.out.print("  |  " +b[i]);
         }
         
         
	}

}
