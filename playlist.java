
  /**
       * Methods-- Remember that you need to be able to complete all of the following:
       * Adding a song
       * 'liking' a song
       * Removing a specific song
       * Examining all Songs (a String return or void print makes sense here)
       * Examining a sublist of all liked songs
       * Determining the total duration of all songs
       * Removing all unliked songs from the playlist (careful with this one!)
    **/
import java.util.ArrayList;
public class playlist
{
    private ArrayList<Song> playlist;
    public playlist()
    {
        playlist = new ArrayList<Song>();
    }
    public void addToPlaylist(String songname, String artist, String time)
    {
        playlist.add(new Song(songname, artist, time));
        System.out.println("Added " + playlist.get(playlist.size()).toString());
    }
    public void printSongs()
    {
        System.out.println("Printing the songs...");
        for(int i = 0; i< playlist.size(); i++)
        {
            System.out.println(playlist.get(i).toString());  
        }
    }
    public void likeSongs()
    {

    }



}