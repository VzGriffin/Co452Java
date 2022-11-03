package Week4;

public class Song 
{
    private String title;
    private String name;
    private int playcount;

    public Song(String title, String name, int playcount)
    {
        this.title = title;
        this.name = name;
        this.playcount = playcount;

    }

    public void print()
    {
        System.out.println("Title: " + this.title + this.name + this.playcount);
    }



}
