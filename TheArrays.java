import java.util.Arrays;

public class TheArrays{
    public static void main(String[] args) {
        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";

        System.out.println(Arrays.toString(colors));
        System.out.println(colors[0]);
        colors[2] = "yellow";
        System.out.println(colors[2]);
        colors[0] = "white";
        System.out.println(colors[0]);

        int[] numbers = {100, 200};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println(numbers.length);

        for(String color : colors){
            System.out.println(color);
        }

        Arrays.stream(numbers).forEach(System.out::println);

    }
}