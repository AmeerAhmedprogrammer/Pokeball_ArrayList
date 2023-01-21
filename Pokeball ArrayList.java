//Ameer Ahmed

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class PokemonArraylist {

	public static void main(String[] args) {

		// create ArrayList and add with Arrays.asList() method from import statement
		// Arrays.
		ArrayList<String> Pokeballs = new ArrayList<>(
				Arrays.asList("Poke Ball", "Great Ball", "Ultra Ball", "Net Ball"));

		/*
		 * add elements into the list, other way Pokeballs.add("Poke Ball");
		 * Pokeballs.add("Great Ball"); Pokeballs.add("Ultra Ball");
		 * Pokeballs.add("Net Ball"); Pokeballs.add("");
		 */

		System.out.println("The list of Pokeballs you have: " + Pokeballs);

		// get an element from the arraylist
		String Give = Pokeballs.get(0);
		System.out.println("You showed this to Youngster Joey: " + Give);

		// setting an empty index to something
		System.out.println("\n" + "Youngster Joey gave you an item!" + Pokeballs.set(4, "Nest Ball"));
		System.out.println("My bag now has: " + Pokeballs);

		// removing something from the list
		System.out.println("\n" + "You encountered a Heracross! I used a Net Ball. ");
		Pokeballs.remove(3);
		System.out.println("My bag now has: " + Pokeballs);

		// sorting through a list, need an import statement to the interface
		System.out.println("\n" + "My bag was a mess, so I sorted it out. ");
		Pokeballs.sort(Comparator.naturalOrder());
		System.out.println("My sorted bag is: " + Pokeballs);

		System.out.println("\n" + "Is my bag empty? " + Pokeballs.isEmpty());
		System.out.println("\n" + "Does my bag still have the Net Ball? " + Pokeballs.contains(4) + "\n");

		/* enhanced for loop approach 
		 * for(String Bag : Pokeballs) {
		 * System.out.println("\n" + "The PokeBalls section of the bag contains: " + Bag); }
		 */

		// defining indexes; for loop approach
		System.out.println("The PokeBalls section of the bag contains the: ");
		for (int i = 0; i < Pokeballs.size(); i++) {
			System.out.println(Pokeballs.get(i));
		}
	}
}