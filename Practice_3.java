public class Practice_3 {
    public static void main(String[] args) {

        // problem 1
        String name = "AWESOME COOLDUDE";
        name = name.toLowerCase();
        System.out.println(name);

        // problem 2

        String text = "To lower Case";
        text = text.replace(" ", "_");
        System.out.println(text);

        // problem 3
        String letter = "dear <|name|>,thanks a lot";
        letter = letter.replace("<|name|>", "ninja");
        System.out.println(letter);

        // problem 3

        String spaces = " This string contains  double and  tripple space";
        System.out.println(spaces.indexOf("  "));
        System.out.println(spaces.indexOf("   "));

        // problem 5

        String myletter = "Dear harry,\n\t this java course \n is amazing";
        System.out.println(myletter);

    }

}
