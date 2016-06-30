package main.java.hello;

/**
 * Created by zhouboli on 16/6/29.
 */
public class Greeting
{
    private final long id;
    private final String content;

    public Greeting(long id, String content)
    {
        this.id = id;
        this.content = content;
    }

    public long getId()
    {
        return id;
    }

    public String getContent()
    {
        return content;
    }
}