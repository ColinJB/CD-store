import java.io.Console;
import java.util.List;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console userConsole = System.console();

    List<CD> allCD = new ArrayList<CD>();

    CD luda = new CD("Ludacris", "Red Light District", 2004, 10);
    CD jayZ = new CD("Jay-Z", "Blueprint", 2001, 12);
    CD pac = new CD("Tupac", "All Eyez on Me", 1996, 14);

    boolean programRunning = true;
    while( programRunning ){
      System.out.println("Welcome to CDworld! Please enter one of the following: 'See all inventory', 'Search based on release year', 'Search based on price range', 'Search by artist', 'Search by album name'.");
      String userChoice = userConsole.readLine();

      if ( userChoice.equals("See all inventory") ) {
        for ( CD eachCD : allCD ) {
          System.out.println("-------------");
          System.out.println( eachCD.mArtistName );
          System.out.println( eachCD.mAlbumName );
          System.out.println( eachCD.mYear );
          System.out.println( eachCD.mPrice );
        }
      } else if ( userChoice.equals("Search based on release year") ) {
        System.out.println("What year is the EARLIEST year that you are interested in?");
        String stringFloorYear = userConsole.readLine();
        Integer floorYear = Integer.parseInt(stringFloorYear);
        System.out.println("What year is the LATEST year that you are interested in?");
        String stringCeilingYear = userConsole.readLine();
        Integer ceilingYear = Integer.parseInt(stringCeilingYear);

        for ( CD eachCD : allCD ) {
          if ( eachCD.mYear >= floorYear || eachCD.mYear <= ceilingYear ) {
            System.out.println("-------------");
            System.out.println( eachCD.mArtistName );
            System.out.println( eachCD.mAlbumName );
            System.out.println( eachCD.mYear );
            System.out.println( eachCD.mPrice );
          }
        }
      } else if ( userChoice.equals("Search based on price range") ) {
        System.out.println("What is the LEAST you are looking to spend? (Just enter a number, no '$')");
        String stringFloorPrice = userConsole.readLine();
        Integer floorPrice = Integer.parseInt(stringFloorPrice);
        System.out.println("What is the MOST you are looking to spend? (Just enter a number, no '$')");
        String stringCeilingPrice = userConsole.readLine();
        Integer ceilingPrice = Integer.parseInt(stringCeilingPrice);

        for ( CD eachCD : allCD ) {
          if ( eachCD.mPrice >= floorPrice || eachCD.mPrice <= ceilingPrice ) {
            System.out.println("-------------");
            System.out.println( eachCD.mArtistName );
            System.out.println( eachCD.mAlbumName );
            System.out.println( eachCD.mYear );
            System.out.println( eachCD.mPrice );
          }
        }
      } else if ( userChoice.equals("Search by artist") ) {
        System.out.println("What artist are you looking for?");
        String userArtist = userConsole.readLine();

        for ( CD eachCD : allCD ) {
          if ( eachCD.mArtistName == userArtist ) {
            System.out.println("-------------");
            System.out.println( eachCD.mArtistName );
            System.out.println( eachCD.mAlbumName );
            System.out.println( eachCD.mYear );
            System.out.println( eachCD.mPrice );
          }
        }
      } else if ( userChoice.equals("Search by album name") ) {
        System.out.println("What is the name of the album you are looking for?");
        String userAlbum = userConsole.readLine();

        for ( CD eachCD : allCD ) {
          if ( eachCD.mAlbumName == userAlbum ) {
            System.out.println("-------------");
            System.out.println( eachCD.mArtistName );
            System.out.println( eachCD.mAlbumName );
            System.out.println( eachCD.mYear );
            System.out.println( eachCD.mPrice );
          }
        }
      }
    }
  }
}
