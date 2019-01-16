package Songs;

/**
 * @author rudyp
 */
public class SongClient {
    public static void main(String[] args) {
        SongType songOne = new SongType();
        SongType songTwo = new SongType();
        songOne.setSong("Through the Fire and Flames", "Rock", 7);
        songTwo.setSong("Bubly", "Country", 5);
        //At this point in time song two is smaller than song one, so the
        //first one should come back as false

        System.out.println(songOne.longerSong(songTwo)); //Is song one longer than songTwo
        System.out.println(songTwo.longerSong(songOne)); //Is song two longer than songOne
        System.out.println(songOne.toString());
        System.out.println();
        System.out.println(songOne.getDuration());
        System.out.println(songOne.getGenre());
        System.out.println(songOne.getTitle());
    }
}
