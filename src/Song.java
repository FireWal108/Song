public class Song
{
    //Clas or Instance varibles
    private String title;
    private String artist;
    private boolean hasChorus;
    private int tempo;
    private double playTime;
    private static int numSongs;

    //2) Constructors
    public Song(String title, String artist, boolean hasChorus, int tempo, double time)
    {
        this.title = title;
        this.artist = artist;
        this.hasChorus = hasChorus;
        this.tempo = tempo;
        this.playTime = time;
        numSongs++;
    }// end of constructor
    //Overload constructor - must be different by type in the paramerter list

    public Song( String myArtist, boolean myHasChorus,String myTitle, int myTempo, double time)
    {
        title = myTitle;
        artist = myArtist;
        hasChorus = myHasChorus;
        tempo = myTempo;
        playTime = time;
        numSongs++;
    }// end of constructor

    public Song()
    {
        //title = ""; //empty string, frequently used as a default value
        title = "title goes here";
        artist = "none";//String types can be null or empty
        hasChorus = false;//typical default for a boolean type
        tempo = 0;
        numSongs++;//typical default for a number type
    }//end of default constructor

    //4) Getter = allow the client to access instance variables
    public String getTitle()
    {
        return title;
    }//end of gettter

    public String getArtist()
    {
        return artist;
    }//end of artist getter

    public int getTempo()
    {
        return tempo;
    }

    public static int getNumSongs()
    {
        return numSongs;
    }

    //5) Setters (aka mutators) To change a value
    public void setTempo(int myTempo)
    {
        tempo = myTempo;
    }//end tempo setter

    //6) Brain Methods
    //Convert the playTime into seconds
    public int playTimeSeconds()
    {
        int minuteInSeconds = 60 * (int)(playTime);
        //subtract minute part from playTime to get second part
        double something = (int)((playTime - (int)(playTime)) * 10);
        int seconds = (int)(playTime * 100) % 100;
                //gets the minute part into seconds
        return seconds + minuteInSeconds;
    }


    //3) ToString
    public String toSting()
    {
        String output = "Title" + title +
                "\nArtist: " + artist +
                "\nHas a Chorus " + hasChorus +
                "\nTempo " + tempo +
                "\nplayTime" + playTime;



        return output;

    }

} //end of song class
