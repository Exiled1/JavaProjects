package Songs;

/**
 * @author rudyp
 */

/*
 I don't completely understand what the assignment is asking us. So when the user creates
 a song, they input all of the information about the song right? So they decide on the
 duration, genre, and the title? Also the assignment doesn't say to do anything with
 genre, so I assume the only thing i'm doing with it is setting it and printing it?

 The wording is very nonspecific, and there aren't any example cases for the Client code
 so I don't even know what the expected output is supposed to be, I'll just do what I think
 is the right thing to do and just ask tomorrow.
 */
public class SongType {
    private String title;
    private String genre;
    private int duration;


    public void setSong(String title, String genre, int duration) {
        this.title = title; //Object = instance variable, int a = 0.
        this.genre = genre;
        this.duration = duration;

    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getDuration() {
        return duration;
    }

    public boolean longerSong(SongType otherSong) {
        return otherSong.duration > this.duration; //Might do what I want?
    }

    public String toString() { //replace the variables with this keywords later?
        return "Song: " + this.title
                + ",\nDuration: " + this.duration + " min"
                + "\nGenre: " + this.genre;
    }

}
