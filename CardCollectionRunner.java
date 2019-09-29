import java.util.Scanner;

public class CardCollectionRunner {
	public static void main(String[] args) {
		String name = "", type = "", rarity = "", expansion = "", cost = "", effect = "";
		int power = 0, health = 0;
		boolean hasCard = false, hasExpansion = false;
		int input0 = -1, input1 = -1, input2 = -1; // multiple input variables to keep the while loop going

		CardCollection collection = new CardCollection();
		Scanner in = new Scanner(System.in);

		while (input0 != 4) {
			System.out.println("Card Tracker");
			System.out.println("===================");
			System.out.println("OPTIONS:");
			System.out.println("(1) Add cards");
			System.out.println("(2) Remove cards");
			System.out.println("(3) View Collection");
			System.out.println("(4) Exit");
			System.out.print("Please enter the number of the option you wish to choose: ");

			input1 = in.nextInt();

			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

			if (input1 == 1) {
				System.out.println("Adding Cards");
				System.out.println("============");
				System.out.println("OPTIONS:");
				System.out.println("(1) Creature");
				System.out.println("(2) Spell (Instant/Enchantment/Sorcery");
				System.out.println("(3) Land");
				System.out.print("Please enter the number of the type of card you are adding: ");

				input2 = in.nextInt();

				in.nextLine();

				System.out.println();

				System.out.print("Enter the name of the card: ");
				name = in.nextLine();
				
				hasCard = collection.checkCard(name);

				if (!hasCard) { // adding a new card to the collection
					System.out.println("\n\n\n");

					System.out.println("Example: ");
					if (input2 == 1)
						System.out.print("Creature - Werewolf Horror");
					else if (input2 == 2) {
						System.out.print("Enchantment - Aura");
					} else {
						System.out.print("Basic Land- Forest");
					}
					System.out.println();
					System.out.print("Enter the type of the card: ");
					type = in.nextLine();

					System.out.println("\n\n\n");

					System.out.println("Rarities: Common, Uncommon, Rare, Mythic");
					System.out.print("Enter the rarity of the card: ");
					rarity = in.nextLine();

					System.out.println("\n\n\n");

					System.out.println("Examples: Core Set 2019, War of the Spark");
					System.out.print("Enter the expansion this card was released: ");
					expansion = in.nextLine();

					System.out.println("\n\n\n");

					System.out.println("Legend:");
					System.out.println("=======");
					System.out.println("C means colorless");
					System.out.println("G means green");
					System.out.println("R means red");
					System.out.println("B means black");
					System.out.println("Bl means blue");
					System.out.println();
					System.out.println("Example: If a card costs 2 colorless, 1 green, and 2 green/blue -- 2C1G2G/Bl");
					System.out.print("Enter the mana cost of this card: ");
					cost = in.nextLine();

					System.out.println("\n\n\n");

					System.out.println("Example: When Centaur Nurturer enters the battlefield, you gain 3 life. (TAP): Add one mana of any color.");
					System.out.print("Enter the effect of this card: ");
					effect = in.nextLine();

					if (input2 == 1) {
						System.out.print("Enter the power of this creature: ");
						power = in.nextInt();

						System.out.println();

						System.out.print("Enter the health of this creature: ");
						health = in.nextInt();

						System.out.println("\n\n\n");

						collection.addNewCard(new CreatureCard(name, type, rarity, expansion, cost, effect, power, health));
					} else if (input2 == 2) {
						collection.addNewCard(new SpellCard(name, type, rarity, expansion, cost, effect));
					} else {
						collection.addNewCard(new LandCard(name, type, rarity, expansion, cost, effect));
					}
				} else if(hasCard) {
//					System.out.println("Enter the expansion of the card: ");
//					expansion = in.nextLine();
//					hasExpansion = collection.containsExpansion(name, expansion);
//					if(hasExpansion) {
						collection.incrementACard(name);
				}

			} else if (input1 == 2) {

			} else if (input1 == 3) {
				System.out.println(collection);
			} else if (input1 == 4) {
				System.exit(0);
			} else {
				System.exit(0);
			}
		}
	}
}
