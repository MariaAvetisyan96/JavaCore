package homework.chapters.chapeter3part1;

// Comupte distance light travels using long variables.
public class LongExample {
    public static void main(String[] args) {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        //aproximate speed of light in miles per second
        lightspeed = 186000;
        days = 1000;
        seconds = days * 24 * 60 * 60;
        distance = lightspeed * seconds;
        System.out.print("In " + days);
        System.out.print("days light will travel about ");
        System.out.println(distance + "miles");



    }

}
