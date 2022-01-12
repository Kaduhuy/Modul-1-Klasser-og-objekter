
/**
 * Write a description of class Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle
{
    private int diameter;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;
    
   public Circle()
    {
        diameter = 50;
        xPosition = 50;
        yPosition = 50;
        color = "blue";
    }
   public void MakeVisible()
    {
        isVisible = true;
    }
}
