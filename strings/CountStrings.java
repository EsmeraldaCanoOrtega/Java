public class CountStrings {
    public static void main(String[] args) {
        int vowels = 0;
        int consonants = 0;
        int commas = 0;
        int spaces = 0;
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec non fringilla " +
                "dolor. Proin neque mi, pharetra et elit malesuada, eleifend dictum erat. " +
                "Curabitur eros tellus, lacinia nec nisi a, congue faucibus tortor. " +
                "Ut ullamcorper laoreet dolor malesuada laoreet. Ut sollicitudin scelerisque arcu," +
                " ac viverra diam malesuada eu. Phasellus facilisis nulla eu orci congue," +
                " vitae sagittis ligula rutrum. Ut tempus eros ac dui imperdiet mattis." +
                " Fusce quis varius eros. Quisque malesuada lectus at nulla fringilla," +
                " in sodales sapien finibus";
        text = text.toLowerCase();
        System.out.println(text);
        String vowelsString = "aeiou";
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (Character.isWhitespace(currentChar)) {
                spaces++;
            } else if (Character.isLetter(currentChar)) {
                if (vowelsString.contains(String.valueOf(currentChar))) {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (currentChar == ',') {
                commas++;
            }
        }
        System.out.println("There are " + spaces + " spaces");
        System.out.println("There are " + vowels + " vowels");
        System.out.println("There are " + consonants + " consonants");
        System.out.println("There are " + commas + " commas");
    }
}
