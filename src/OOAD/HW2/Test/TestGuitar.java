/**
 * Class: Object Oriented Analysis and Design
 * Professor: Orlando Montalvo
 * Assignment: 2
 * Students: Raghuram Rangaraju (@01377909), Vihar kodakandla (@01392814)
 */

package OOAD.HW2.Test;
import static org.junit.Assert.*;
import java.util.List;
import OOAD.HW2.Guitar.GuitarSpec;
import OOAD.HW2.Guitar.Inventory;
import OOAD.HW2.Guitar.Guitar;
import OOAD.HW2.Guitar.GuitarSpec.BackWoodandtopWood;
import OOAD.HW2.Guitar.GuitarSpec.Builder;
import OOAD.HW2.Guitar.GuitarSpec.Type;
import org.junit.Test;

/**
 * TestGuitar class performs unit test for the Inventory class functions.
 * 
 */
public class TestGuitar {

	Inventory inventory = new Inventory();

	/**
	 * Test for addGuitar function in the inventory
	 */

	@Test
	public void addGuitarTest() {
		//
		GuitarSpec guitarSpec = new GuitarSpec(Builder.Fender,
				BackWoodandtopWood.Sitka, BackWoodandtopWood.Sitka,
				Type.Electric, "Stratocastor");

		// Adding the new guitar into the inventory.
		inventory.addGuitar("110", 5495.95, guitarSpec);
		// Searching the guitar with the serial number.
		Guitar temp = inventory.getGuitar("110");
		// Comparing the first added guitar serial number with already known.
		assertEquals("110", temp.getSerialNumber());

	}

	/**
	 * Test for getGuitar function in the inventory
	 */

	@Test
	public void getGuitarTest() {

		GuitarSpec guitarSpec1 = new GuitarSpec(Builder.Fender,
				BackWoodandtopWood.Sitka, BackWoodandtopWood.Sitka,
				Type.Electric, "Stratocastor");

		inventory.addGuitar("120", 487.18, guitarSpec1);
		// Searching the guitar with the serial number
		Guitar tempGuitar = inventory.getGuitar("120");
		// Comparing the newly added guitar with the guitarSpec1 object.
		assertEquals(guitarSpec1, tempGuitar.getGuitarSpec());
	}

	/**
	 * Test for searchGuitar function in the inventory
	 */

	@Test
	public void searchGuitarTest() {

		GuitarSpec guitarSpec1 = new GuitarSpec(Builder.Fender,
				BackWoodandtopWood.Alder, BackWoodandtopWood.Alder,
				Type.Electric, "Stratocastor");
		GuitarSpec guitarSpec2 = new GuitarSpec(Builder.PRS,
				BackWoodandtopWood.BrazilianRosewood, BackWoodandtopWood.Alder,
				Type.Acoustic, "Stratocastor");

		inventory.addGuitar("140", 7895.95, guitarSpec1);
		inventory.addGuitar("150", 9895.95, guitarSpec2);

		Guitar guitarSearch = new Guitar("140", 9895.95, guitarSpec2);
		// searching in inventory
		List<Guitar> guitarsList = inventory.search(guitarSearch);
		// getting the size
		int guitarSize = guitarsList.size();
		// We know that the size of the guitar list should be 3. If at all it is
		// not 3 then test fails.
		assertEquals(3, guitarSize);
	}
}
