package flyLady;

/**
 * @Author Rudy Peralta
 * also for whatever reason I thought I uploaded this code like, a while ago,
 * turns out I wrote the code, went to google classroom, dragged all the stuff in,
 * then closed out of the window as it was uploading, so, it's my fault these are so late.
 */
public class SuperFly {
    /**
     * Prints my variation of the nursery rhyme
     * "There Once Was a Lady Who Swallowed a Fly."
     * Called by the SuperFly main() function
     */
    public static void main(String[] args) {
        sheAteAnotherFly();
        sheAteAnotherSpider();
        sheSwallowedABird();
        printCatVerse();
        shesApparentlyIndonesian();
        sheAteAHorse();

    }


    /**
     * Prints the last verse
     */
    private static void sheAteAHorse() {
        System.out.println("There was an old lady who swallowed a horse,");
        System.out.println("She died of course.");
    }

    /**
     * Prints verse #5
     */
    private static void shesApparentlyIndonesian() {
        System.out.println("There was an old lady who swallowed a dog,");
        System.out.println("What a hog to swallow a dog.");
        sheAteADog();
    }

    /**
     * Prints verse #4
     */
    private static void printCatVerse() {
        System.out.println("There was an old lady who swallowed a cat,");
        System.out.println("Imagine that, to swallow a cat.");
        sheAteACat();
    }

    /**
     * Prints verse #3
     * Bird stuff
     */
    private static void sheSwallowedABird() {
        System.out.println("There was an old lady who swallowed a bird,");
        System.out.println("How absurb to swallow a bird.");
        sheAteABird();
    }

    /**
     * Prints verse #2
     * Spider stuff
     */
    private static void sheAteAnotherSpider() {
        System.out.println("There was an old lady who swallowed a spider,");
        System.out.println("That wriggled and iggled and jiggled inside her.");
        sheAteASpider();
    }

    /**
     * Prints verse #1
     */
    private static void sheAteAnotherFly() {
        System.out.println("There was an old lady who swallowed a fly.");
        sheAteAFly();
    }

    /**
     * Prints the lady's reasoning behind swallowing the dog
     */
    private static void sheAteADog() {
        System.out.println("She swallowed the dog to catch the cat,");
        sheAteACat();
    }

    /**
     * Prints the lady's reasoning behind swallowing the cat
     * so shes now one of those people...
     */
    private static void sheAteACat() {
        System.out.println("She swallowed the cat to catch the bird,");
        sheAteABird();
    }

    /**
     * Prints the lady's reasoning behind swallowing the bird
     * which doesnt make sense
     */
    private static void sheAteABird() {
        System.out.println("She swallowed the bird to catch the spider,");
        sheAteASpider();
    }

    /**
     * Prints the lady's reasoning behind swallowing the spider
     * God knows why she didn't just swallow a frog -_-
     * legit it would have solved all her problems.
     */
    private static void sheAteASpider() {
        System.out.println("She swallowed the spider to catch the fly,");
        sheAteAFly();
    }

    /**
     * Prints the lady's obsession with flies.
     */
    private static void sheAteAFly() {
        System.out.println("I don\'t know why she swallowed that fly,");
        System.out.println("Perhaps she\'ll die.\n");
    }

}