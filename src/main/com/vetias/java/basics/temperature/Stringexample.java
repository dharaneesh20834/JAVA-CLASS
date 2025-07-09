public class Stringexample {
    public static void main(String[] args) {
       String sentance = "This proogram shows how we can we spplit a string into multiple strings.We find out the how many sentence, words,letters in this sentences.";
       String[] sentances=sentance.split("\\.");
       String[] words=sentance.split(" ");
       System.out.println(sentances.length);
       System.out.println(words.length);
       System.out.println(sentance.length());

    }

}



