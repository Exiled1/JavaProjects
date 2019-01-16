package Songs;

/**
 * This class is an example of how you should write test code for your own classes.
 * It is like a unit test, but simplified.
 * <p>
 * You write small tests that can test the various parts of your code, including testing
 * failure conditions.
 * <p>
 * All of these tests require that you visually verify your code is running correctly.
 * Run the test, then look at your output and make sure it looks correct.
 * <p>
 * You are welcome to modify this file to try other things with your dataBase.
 * You do not need to turn in this file with your .java code.
 */
public class SongDataBaseClient {
    public static void main(String[] args) {
        // You should get an exception when you call this code because your
        // class invariant should throw an error.
        // Once you verify it works, comment out this line.
        //SongDataBase expectError = new SongDataBase(0);

        SongDataBase dataBase = new SongDataBase(5);
        simpleAddTest(dataBase);
        simpleRemoveTest(dataBase);
        oneLastAddTest(dataBase);
    }


    /**
     * Very simple test.  Runs through and adds the song.
     * Only direclty checks the boolean return value & the numSongs.
     * <p>
     * To check the songs were added, listSongs is called, which must be manually
     * verified on the screen.
     * <p>
     * After this code runs your database should look like this (note that the print
     * may not be exactly the same depending on how you implemented SongType toString)
     * <p>
     * Index 0 : Name = TestSong0, Genre = test genre, Duration = 10.0
     * Index 1 : Name = TestSong1, Genre = test genre, Duration = 11.0
     * Index 2 : Name = TestSong2, Genre = test genre, Duration = 12.0
     * Index 3 : Name = TestSong3, Genre = test genre, Duration = 13.0
     * Index 4 : Name = TestSong4, Genre = test genre, Duration = 14.0
     */
    public static boolean simpleAddTest(SongDataBase dataBase) {
        for (int i = 0; i <= 6; i++) {
            boolean result = dataBase.addSong("TestSong" + i, "test genre", 10 + i);
            if ((i >= 5 && result != false) || (result == false && i < 5)) {
                System.err.println("Expected " + (!result) + " when adding song " + i);
                return false;
            }
        }
        if (dataBase.numSongs() != 5) {
            System.err.println("Expected numSongs() to return 5 in simpleAddTest");
            return false;
        }
        System.out.println("Songs after simpleAddTest runs");
        dataBase.listSongs();
        return true;
    }

    /**
     * Very simple test.  Runs through and removes a song.
     * Only direclty checks the boolean return value.
     * <p>
     * You will need to implement listSongs to verify the actual results.
     * <p>
     * After this code runs your database should look like this (note that the print
     * may not be exactly the same depending on how you implemented SongType toString)
     * <p>
     * Index 0 : Name = TestSong0, Genre = test genre, Duration = 10.0
     * Index 1 : Name = TestSong1, Genre = test genre, Duration = 11.0
     * Index 3 : Name = TestSong3, Genre = test genre, Duration = 13.0
     * Index 4 : Name = TestSong4, Genre = test genre, Duration = 14.0
     */
    public static boolean simpleRemoveTest(SongDataBase dataBase) {

        if (dataBase.removeSong(2) == false) {
            System.err.println("Expected removeSong(2) to return true");
            return false;
        }
        if (dataBase.removeSong(2) == true) {
            System.err.println("Expected removeSong(2) to return false");
            return false;
        }
        if (dataBase.removeSong(5) == true) {
            System.err.println("Expected removeSong(5) to return false");
            return false;
        }
        if (dataBase.removeSong(-1) == true) {
            System.err.println("Expected removeSong(-1) to return false");
            return false;
        }
        if (dataBase.numSongs() != 4) {
            System.err.println("Expected numSongs() to return 4 in simpleRemoveTest");
            return false;
        }
        System.out.println("Songs after simpleRemoveTest runs");
        dataBase.listSongs();
        return true;
    }

    /**
     * Very simple test.  Runs through and adds the song.
     * Only direclty checks the boolean return value.
     * <p>
     * After this code runs your database should look like this (note that the print
     * may not be exactly the same depending on how you implemented SongType toString)
     * <p>
     * After this code runs your database should look like this:
     * <p>
     * Index 0 : Name = TestSong0, Genre = test genre, Duration = 10.0
     * Index 1 : Name = TestSong1, Genre = test genre, Duration = 11.0
     * Index 2 : Name = Song 6, Genre = test genre 2, Duration = 1000.37
     * Index 3 : Name = TestSong3, Genre = test genre, Duration = 13.0
     * Index 4 : Name = TestSong4, Genre = test genre, Duration = 14.0
     */
    public static boolean oneLastAddTest(SongDataBase dataBase) {
        dataBase.addSong("Song 6", "test genre 2", 1000.37);
        if (dataBase.numSongs() != 5) {
            System.err.println("Expected numSongs() to return 5 in oneLastAddTest");
            return false;
        }
        System.out.println("Songs after oneLastAddTest runs");
        dataBase.listSongs();
        return true;
    }

}
