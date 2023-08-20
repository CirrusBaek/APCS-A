
/**
 * The purpose of this program is to sort an array of movies
 * based on title, studio, and year(ascending or descending order) using selection sort methods.
 *
 * @author 
 * @version (2/20/23)
 */
public class MovieTester
{
    public static void main(String[]args){
         Movie[] movies = new Movie[10];
         
         movies[0] = new Movie("Star Wars",2007,"Disney");
         movies[1] = new Movie("Avatar",2018,"Pixar");
         movies[2] = new Movie("Simon Says",2003,"Disney");
         movies[3] = new Movie("Katherine the Great",2004,"Disney");
         movies[4] = new Movie("Mary's World",2002,"Warner Bros");
          movies[5] = new Movie("It",2006,"Illumination");
          movies[6] = new Movie("Coraline",2013,"Pixar");
          movies[7] = new Movie("A Dog's World",2010,"Blue Sky");
          movies[8] = new Movie("Senorita",2019,"Paramount");
          movies[9] = new Movie("Harry Potter",1998,"Dream Works");
        
        System.out.println("<<Original>>");
          print(movies);
          System.out.println();
          System.out.println("<<Ascending Year>>");
          sortYear(movies,1);
          print(movies);
          
          System.out.println();
          System.out.println("<<Descending Year>>");
          sortYear(movies,2);
          print(movies);
          
          System.out.println();
          System.out.println("<<Ascending Title>>");
          sortTitle(movies,1);
          print(movies);
          
          System.out.println();
          System.out.println("<<Descending Title>>");
          sortTitle(movies,2);
          print(movies);
          
          System.out.println();
          System.out.println("<<Ascending Studio>>");
          sortStudio(movies,1);
          print(movies);
          
          System.out.println();
          System.out.println("<<Descending Studio>>");
          sortStudio(movies,2);
          print(movies);
                
        
    }
    public static void print(Movie[]array){
        for(Movie m : array){
             System.out.printf(m.toString());
            }
    }
    public static void sortYear(Movie[] source,int sort)
    {
        int i;
        int k;
        int posMax;
        Movie temp;

        for ( i = source.length - 1 ; i >= 0 ; i-- )
        {
            posMax = 0;
            for ( k = 0 ; k <= i ; k++ )
            {
                if(sort==1){
                if ( source[ k ].getYear() > source[ posMax ].getYear() ){
                    posMax = k;
                }
            }
            if(sort==2){
                if ( source[ k ].getYear() < source[ posMax ].getYear() ){
                    posMax = k;}
        }
    }
            
            temp = source[ i ];
            source[ i ] = source[posMax ];
            source[ posMax ] = temp;
    }
}
    public static void sortTitle(Movie[] source,int sort)
    {
        int i;
        int k;
        int posMax;
        Movie temp;

        for ( i = source.length - 1 ; i >= 0 ; i-- )
        {
            posMax = 0;
            for ( k = 0 ; k <= i ; k++ )
            {
                if(sort==1){
                if (source[k].getTitle().compareTo( source[ posMax ].getTitle() ) > 0 ){
                    posMax = k;
                }
            }
            if(sort==2){
                if (source[k].getTitle().compareTo( source[ posMax ].getTitle() ) < 0 ){
                    posMax = k;}
        }
    }
            
            temp = source[ i ];
            source[ i ] = source[posMax ];
            source[ posMax ] = temp;
    }
    }
    public static void sortStudio(Movie[] source,int sort)
    {
        int i;
        int k;
        int posMax;
        Movie temp;

        for ( i = source.length - 1 ; i >= 0 ; i-- )
        {
            posMax = 0;
            for ( k = 0 ; k <= i ; k++ )
            {
                if(sort==1){
                if (source[k].getStudio().compareTo( source[ posMax ].getStudio() ) > 0 ){
                    posMax = k;
                }
            }
            if(sort==2){
                if (source[k].getStudio().compareTo( source[ posMax ].getStudio() ) < 0 ){
                    posMax = k;}
        }
    }
            
            temp = source[ i ];
            source[ i ] = source[posMax ];
            source[ posMax ] = temp;
    }
    }
}
