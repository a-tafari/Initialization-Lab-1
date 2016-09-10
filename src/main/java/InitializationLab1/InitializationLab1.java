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


        ColorfulThing color1 = new ColorfulThing("red");

        ColorfulThing color2 = new ColorfulThing("blue");
        ColorfulThing color3 = new ColorfulThing("yellow");
        ColorfulThing color4 = new ColorfulThing("green");
        ColorfulThing color5 = new ColorfulThing("orange");

        System.out.println(color1.getColor());
        System.out.println(color2.getColor());
        System.out.println(color3.getColor());
        System.out.println(color4.getColor());
        System.out.println(color5.getColor());

    }
}
