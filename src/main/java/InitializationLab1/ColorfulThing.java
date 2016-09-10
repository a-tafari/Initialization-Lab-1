package InitializationLab1;

/**
 * Created by abijah on 9/10/16.
 */
public class ColorfulThing {

    private Color color;

    public ColorfulThing(Color color){
        this.color = color;
    }

    public Color getColor(){

        return color;

    }

    public enum Color {

        BLUE, GREEN, YELLOW , RED
    }

}
