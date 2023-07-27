import java.text.DecimalFormat;
import java.util.Scanner;

public class Item {
    private int location;
    private String description;

    public Item(int location, String description)
    {
        this.location=location;
        this.description=description;
    }

    public void setLocation(int location)
    {

        this.location = location;
    }
    public int getLocation()
    {

        return location;
    }

    public void setDescription(String description)
    {

        this.description = description;
    }
    public String getDescription()
    {

        return description;
    }
    public void display()
    {
        System.out.println("Location: "+location+"\nDescription: "+description);
    }
}
