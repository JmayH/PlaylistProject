
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
        
        System.out.println("Added " + songname + " by " + artist + " " + time);
        
        //this chunk isn't working; giving me an error of out of bounds stuff
        // System.out.println("Added " + playlist.get(playlist.size()).toString());
    }

    public void printSongs()
    {
        System.out.println("Printing the songs");
        for(int i = 0; i< playlist.size(); i++)
        {
            System.out.println(playlist.get(i).toString());  
        }
    }
 
    public void liking(int posa, int posb)
    {
        for (int i = 0; i < playlist.size(); i ++)
        {
            if (i == posa || i == posb)
            {
                playlist.get(i).like();
                playlist.get(i).toString();
            }
        }
    }

    public void removeSong(String songname)
    {
        for (int i = 0; i < playlist.size(); i++)
        {
            if (playlist.get(i).getName().equals(songname))
            {
                playlist.remove(i);
                
            }
        }
    }

    public void viewLiked()
    {
        for (int i = 0; i < playlist.size(); i ++)
        {
            if (playlist.get(i).isLiked())
            {
                System.out.println(playlist.get(i).toString());
            }
        }
    }

    public void totalDuration()
    {
        int time = 0;
        int min = 0;
        for (int i = 0; i < playlist.size(); i ++)
        {
            time += playlist.get(i).getTimeInSeconds();
            min = time/60;
        }
        System.out.println(min + ":" + (time - min*60));
    }

    // WHY IS IT NOT DELETING SONG3 ARFHFHDHFHFHF //
    //update: it finally deleted song3 :)//
    public void removeUnliked()
    {
        for (int i = playlist.size() - 1; i >= 0 ; i --)
        {
            if (!playlist.get(i).isLiked())
            {   
                System.out.println("Removing - " + playlist.get(i).toString());
                playlist.remove(i);
            }
        }
        
    }

}