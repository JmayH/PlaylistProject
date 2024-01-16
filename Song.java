/**
 * File for a Song class to be used in the Playlist Project
 * @author
 * @version
 */
public class Song {
    //Fields-- what information do we want each Song to store?

    private String name;
    private String artist;
    private String time;
    private String song;
    private boolean liked;


    /**
     * Constructor-- what information needs to be given to make a Song?
     * How will you handle 'liked' songs? It makes sense for a Song not be 'liked' by default
     */
    public Song (String name, String artist, String time)
    {
        this.name = name;
        this.artist = artist;
        this.time = time;
        song = "";
        liked = false;
    }
    


     /**
      * Methods-- what will you want each Song to do?
      * Consider all the getter methods (getName, getArtist, etc.)
      * You should probably have a toString method to be able to get the information for the full
      * song easily as well!
      * What kind of mutator (setter) methods will you need?
      */

      public String getName()
      {
        return name;
      }
      public String getArtist()
      {
        return artist;
      }
      public String gettime()
      {
        return time;
      }
      public void toString()
      {
            song = name+"by"+artist+time;
      }
      public boolean isLiked()
      {
        return liked;
      }
      public void like()
      {
        liked = true;
      }
      public void unlike()
      {
        liked = false;
      }


}