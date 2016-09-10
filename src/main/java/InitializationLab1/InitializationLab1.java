package InitializationLab1;

/**
 * Created by abijah on 9/10/16.
 */
public class InitializationLab1 {

    public static void main(String[] args) {
        BoringThing boringThing = new BoringThing();
        BoringThing boringThing1 = new BoringThing();
        BoringThing boringThing2 = new BoringThing();
        BoringThing boringThing3 = new BoringThing();
        BoringThing boringThing4 = new BoringThing();


        ColorfulThing color1 = new ColorfulThing(ColorfulThing.Color.BLUE);

        ColorfulThing color2 = new ColorfulThing(ColorfulThing.Color.RED);
        ColorfulThing color3 = new ColorfulThing(ColorfulThing.Color.GREEN);
        ColorfulThing color4 = new ColorfulThing(ColorfulThing.Color.YELLOW);


        System.out.println(color1.getColor());
        System.out.println(color2.getColor());
        System.out.println(color3.getColor());
        System.out.println(color4.getColor());





      
    }
}
