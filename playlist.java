
  /**
       *Methods-- Remember that you need to be able to complete all of the following:
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
    public void addToPlaylist(Song asong)
    {
        playlist.add(asong);
        System.out.println("Added " + playlist.get(playlist.size()-1).toString());
    }
    public void printSongs()
    {
        for(int i = 0; i< playlist.size(); i++)
        {
            System.out.println(playlist.get(i).toString());  
        }
    }
    public void likeSong(int x)
    {
        playlist.get(x-1).like();    
    }
    public void removeSong(int x)
    {
        playlist.remove(x-1);
    }
    public void likedOnly()
    {
        for (int i = 0; i<playlist.size(); i++)
        {
            if (playlist.get(i).isLiked()) 
            {
                System.out.println(playlist.get(i).toString());
            }

        }
    }
    public void calculateDuration()
    {
       int totalsec = 0;
       int fsec = 0;
       int fmin = 0;
       String finalSeconds = "";

        for(int i = 0; i<playlist.size(); i++)
        {
           totalsec += playlist.get(i).getTimeInSeconds();
        }
        fmin = totalsec/60;
        fsec = totalsec%60;
        if(fsec<10)
           {
             finalSeconds = "0" + Integer.toString(fsec);
           } 
        else 
           {
             finalSeconds = Integer.toString(fsec);
           }
           System.out.println( fmin+":"+finalSeconds);

    }

    public void removeUnliked()
    {
        for(int i =0; i<playlist.size(); i++)
        {
            if( playlist.get(i).isLiked() == false)
            {
                playlist.remove(i);
            }

        }

    }


}