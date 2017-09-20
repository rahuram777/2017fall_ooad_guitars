package OOAD.HW2.Guitar;
import java.util.*;
import OOAD.HW2.Guitar.GuitarSpec;
import OOAD.HW2.Guitar.GuitarSpec.*;

/**
 * Class: Object Oriented Analysis and Design
 * Assignment: 2
 * Students: Raghuram Rangaraju (@01377909), Vihar kodakandla (@01392814)
 */
public class FindGuitarTester {

	/**
	 * Main function creates a new inventory and initialize new object
	 * whatErinLikeSpecs of class GuitarSpec. And the object guitarErinLikes is
	 * searched on the inventory if the return type is not null it goes into for
	 * loop and prints output.
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// Set up Rick's guitar inventory
		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		GuitarSpec whatErinLikeSpecs = new GuitarSpec(Builder.Fender,
				BackWoodandtopWood.Sitka, BackWoodandtopWood.Sitka,
				Type.Electric, "Stratocastor");

		Guitar guitarErinLikes = new Guitar("1234", 5495.95, whatErinLikeSpecs);

		List guitarlist = inventory.search(guitarErinLikes);
		if (guitarlist != null) {
			for (Iterator i = guitarlist.iterator(); i.hasNext();) {
				Guitar guitar = (Guitar) i.next();
				System.out.println("Erin, you might like this "
						+ guitar.getGuitarSpec().getBuilder() + " "
						+ guitar.getGuitarSpec().getModel() + " "
						+ guitar.getGuitarSpec().getType() + " guitar:\n   "
						+ guitar.getGuitarSpec().getBackWood()
						+ " back and sides,\n   "
						+ guitar.getGuitarSpec().gettopWood()
						+ " top.\nYou can have it for only $"
						+ guitar.getPrice() + "!");
			}
		} else {
			System.out.println("Sorry, Erin, we have nothing for you.");
		}
	}

	/**
	 * initializeInventory adds up the new guitars into the inventory.
	 *
	 * @param inventory
	 */
	private static void initializeInventory(Inventory inventory) {

		inventory.addGuitar("11277", 3999.95, new GuitarSpec(Builder.Collings,
				BackWoodandtopWood.IndianRosewood, BackWoodandtopWood.Sitka,
				Type.Acoustic, "CJ"));

		inventory.addGuitar("V95693", 1499.95, new GuitarSpec(Builder.Fender,
				BackWoodandtopWood.Alder, BackWoodandtopWood.Alder,
				Type.Electric, "Stratocastor"));

		inventory.addGuitar("V9512", 1549.95, new GuitarSpec(Builder.Fender,
				BackWoodandtopWood.Alder, BackWoodandtopWood.Alder,
				Type.Electric, "Stratocastor"));

		inventory.addGuitar("122784", 5495.95, new GuitarSpec(Builder.Martin,
				BackWoodandtopWood.Mahogany, BackWoodandtopWood.Adirondack,
				Type.Acoustic, "D-18"));

		inventory.addGuitar("76531", 6295.95, new GuitarSpec(Builder.Martin,
				BackWoodandtopWood.BrazilianRosewood,
				BackWoodandtopWood.Adirondack, Type.Acoustic, "OM-28"));

		inventory.addGuitar("70108276", 2295.95, new GuitarSpec(Builder.Gibson,
				BackWoodandtopWood.Mahogany, BackWoodandtopWood.Maple,
				Type.Electric, "Les Paul"));

		inventory.addGuitar("82765501", 1890.95, new GuitarSpec(Builder.Gibson,
				BackWoodandtopWood.Mahogany, BackWoodandtopWood.Mahogany,
				Type.Electric, "SG '61 Reissue"));

		inventory.addGuitar("77023", 6275.95, new GuitarSpec(Builder.Martin,
				BackWoodandtopWood.BrazilianRosewood,
				BackWoodandtopWood.Adirondack, Type.Acoustic, "D-28"));

		inventory.addGuitar("1092", 12995.95, new GuitarSpec(Builder.Olson,
				BackWoodandtopWood.IndianRosewood, BackWoodandtopWood.Cedar,
				Type.Acoustic, "SJ"));

		inventory.addGuitar("566-62", 8999.95, new GuitarSpec(Builder.Ryan,
				BackWoodandtopWood.Cocobolo, BackWoodandtopWood.Cedar,
				Type.Acoustic, "Cathedral"));

		inventory.addGuitar("6 29584", 2100.95, new GuitarSpec(Builder.PRS,
				BackWoodandtopWood.Mahogany, BackWoodandtopWood.Maple,
				Type.Acoustic, "Dave Navarro Signature"));
	}
}
