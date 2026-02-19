package bad;

import java.util.ArrayList;

import static java.awt.AWTEventMulticaster.add;

public class MoviesAppbad {

    static ArrayList<String> n = new ArrayList<>();
    static ArrayList<String> g = new ArrayList<>();
    static ArrayList<String> r = new ArrayList<>();

    static void main() {

        add("The Shawshank Redemption", "Drama", "9.3");
        add("The Godfather", "Crime", "9.2");
        add("The Dark Knight", "Action", "9.0");
        add("Punch drunk love", "Romance", "7.9");
        add("The Room", "Drama", "3.7");

        list();

        System.out.println("Total movies: "+ count());
        System.out.println("Average rating: "+ avg());

        filter("Drama");

    }

    public static void add(String name, String genre, String rating) {
        n.add(name);
        g.add(genre);
        r.add(rating);
    }

    public static void list(){
        System.out.println("----------- Movies -----------");
        for(int i = 0; i < n.size(); i++){
            System.out.println(n.get(i) + " - " + g.get(i) + " - " + r.get(i));
        }

    }

    public static int count(){
        return n.size();
    }

    public static double avg(){
        double sum = 0;
        for(int i = 0; i < r.size(); i++){
            sum += Double.parseDouble(r.get(i));
        }
        return sum / r.size();
    }

    public static void filter(String genre){

        System.out.println("\nFiltered movies by gnere: "+ genre);

        for (int i = 0; i < g.size(); i++){
            if(g.get(i).equals(genre)){
                System.out.println(n.get(i) + " - " + g.get(i) + " - " + r.get(i));
            }

        }


    }
}

