package Week4;

import java.util.ArrayList;
import java.util.Arrays;

public class Week04 
{
    public static final String CONSOLE_CLEAR = "\033[H\033[2J";
    public static void main(String[] args)
    {
        System.out.println(CONSOLE_CLEAR);

        System.out.println("==================================");
        System.out.println("Spotify Songs and Play Count");
        System.out.println("==================================");
        System.out.println();
        System.out.println(" by Myles Griffiths");
        System.out.println();

        ArrayList<Song> songlist = new ArrayList<Song>();

        Song sweaterwather = new Song("Sweater Wather",              "The Neighbourhood", 75647);
        Song heatwave = new Song("Heat Wave", "Glass Animals", 65778);
        Song tekit = new Song("Tek It", "Cafune", 98973);
        Song yovoy = new Song("Yo Voy", "Zion & Lennox", 134256);
        Song anotherlove = new Song("Another Love", "Tom Osell", 56452);
        Song marryonacross = new Song("Marry On A Cross", "Ghost", 82788);
        Song bota = new Song("B.O.T.A", "Eliza Rose", 64537);
        Song vivalavida = new Song("Viva La Vida", "Coldplay", 599392);
        Song homecoming = new Song("Homecoming", "Kanye West", 465783);
        Song myway = new Song("My Way", "Frank Sinatra", 274950);

        songlist.add(sweaterwather);
        songlist.add(heatwave);
        songlist.add(tekit);
        songlist.add(yovoy);
        songlist.add(anotherlove);
        songlist.add(marryonacross);
        songlist.add(bota);
        songlist.add(vivalavida);
        songlist.add(homecoming);
        songlist.add(myway);


        
        for(Song current : songlist)
        {
            current.print();
        }


        
    }     
    
}
