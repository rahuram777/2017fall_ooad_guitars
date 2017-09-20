/**
 * Class: Object Oriented Analysis and Design
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
 * The class performs unit test for the Inventory class. 
 * 
 */
public class TestGuitar {

	Inventory inventory = new Inventory();

	@Test
	public void guitarTest() {	
		// For guitarAdd function
		GuitarSpec guitarSpec = new GuitarSpec(Builder.Fender,
				BackWoodandtopWood.Sitka, BackWoodandtopWood.Sitka,
				Type.Electric, "Stratocastor");

		inventory.addGuitar("110", 5495.95, guitarSpec); // Adding the new guitar into the inventory.
		Guitar temp = inventory.getGuitar("110"); // Searching the guitar with the serial number.
		assertEquals("110", temp.getSerialNumber()); // Comparing the first added guitar serial number with already known.
		
		// For the guitarGet function
		GuitarSpec guitarSpec1 = new GuitarSpec(Builder.Fender,
				BackWoodandtopWood.Sitka, BackWoodandtopWood.Sitka,
				Type.Electric, "Stratocastor");

		
		inventory.addGuitar("120", 487.18, guitarSpec1); 
		Guitar tempGuitar = inventory.getGuitar("120"); // Searching the guitar with the serial number
		assertEquals(guitarSpec1, tempGuitar.getGuitarSpec()); // Comparing the newly added guitar with the guitarSpec1 object.
		

		// For the guitarSearch function
		GuitarSpec guitarSpec2 = new GuitarSpec(Builder.Fender,
				BackWoodandtopWood.Alder, BackWoodandtopWood.Alder,
				Type.Electric, "Stratocastor");
		Guitar guitarSearch = new Guitar("130", 356.77, guitarSpec2);

		List<Guitar> guitarsList = inventory.search(guitarSearch);

		int guitarSize = guitarsList.size();
		assertEquals(2, guitarSize); // We know the size of the guitar list should be 2. If at all it is not 2 then test fails. 
	}
}
