
public class PlaylistTester
{
    public static void main(String[] args)
    {
         System.out.println("Initializing a Playlist...\n");
        //Make your playlist here
        playlist tester = new playlist();

        System.out.println("Adding songs to the Playlist...\n");

        //adding songs
        tester.addToPlaylist("Song1", "Artist1,", "3:15");
        tester.addToPlaylist("Song2", "Artist2,", "3:15");
        tester.addToPlaylist("Song3", "Artist3,", "3:15");
        tester.addToPlaylist("Song4", "Artist4,", "3:15");
        tester.addToPlaylist("Song5", "Artist5,", "1:00");

        //Print out all the songs in the playlist to verify it's working correctly
        System.out.println("");
        tester.printSongs();

        System.out.println("\nLiking the songs in position 1, 3 or in other words, Song 2 & 4 etc....\n");
        
        tester.liking(1, 3);
        
        //Once your songs are 'liked', this should be reflected in the next printout
        
        tester.printSongs();

        System.out.println("\nRemoving the song in position 1 aka Song2 \n");
        tester.removeSong("Song2");
        tester.printSongs();

        System.out.println("\nPrinting only the liked songs...\n");
        //Your Playlist should be able to do this without looping while in main
        tester.viewLiked();
        
        System.out.println("\nPrinting the total duration of all songs...\n");
        //Note that the format should look something like minutes:seconds
        tester.totalDuration();
        

        System.out.println("\nRemoving all unliked songs from the playlist...\n");
        //This should be doable with a single method call
        tester.removeUnliked();
        
        System.out.println();
        //This should now look like only the liked songs list from before
        tester.printSongs();
    }

}
