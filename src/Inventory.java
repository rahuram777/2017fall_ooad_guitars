/**
 * Class: Object Oriented Analysis and Design
 * Professor: Orlando Montalvo
 * Assignment: 1
 * Students: Raghuram Rangaraju (@01377909)
 */
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Inventory class implements properties such as add, get and search functions
 * of Guitar.
 */
public class Inventory {

    private List<Guitar> guitars;

    /**
     * Constructor - creates new guitar inventory
     */
    public Inventory() {
        guitars = new LinkedList();
    }

    /**
     * Adds a new guitar to the guitar inventory
     *
     * @param serialNumber Guitar's serial number
     * @param price Guitar's serial price
     * @param builder Guitar's serial builder
     * @param model Guitar's serial model
     * @param type Guitar's serial type
     * @param backWood Guitar's serial backwood
     * @param topWood Guitar's serial topwood
     */
    public void addGuitar(String serialNumber, double price,
            String builder, String model,
            String type, String backWood, String topWood) {
        Guitar guitar = new Guitar(serialNumber, price, builder,
                model, type, backWood, topWood);
        guitars.add(guitar);
    }

    /**
     * Searches and returns the guitar object if it matches the provided guitar
     * serialnumber. else returns null
     *
     * @param serialNumber Guitar's serial number
     * @return guitar object or null
     */
    public Guitar getGuitar(String serialNumber) {
        for (Iterator i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar) i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    /**
     * Searches and returns guitar that match the provided guitar spec.
     *
     * @param searchGuitar Guitar object
     * @return guitars object or null
     */
    public Guitar search(Guitar searchGuitar) {
        for (Iterator i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar) i.next();
            // Ignore serial number since that's unique
            // Ignore price since that's unique
            String builder = searchGuitar.getBuilder();
            if ((builder != null) && (!builder.equals(""))
                    && (!builder.equals(guitar.getBuilder()))) {
                continue;
            }
            String model = searchGuitar.getModel();
            if ((model != null) && (!model.equals(""))
                    && (!model.equals(guitar.getModel()))) {
                continue;
            }
            String type = searchGuitar.getType();
            if ((type != null) && (!searchGuitar.equals(""))
                    && (!type.equals(guitar.getType()))) {
                continue;
            }
            String backWood = searchGuitar.getBackWood();
            if ((backWood != null) && (!backWood.equals(""))
                    && (!backWood.equals(guitar.getBackWood()))) {
                continue;
            }
            String topWood = searchGuitar.getTopWood();
            if ((topWood != null) && (!topWood.equals(""))
                    && (!topWood.equals(guitar.getTopWood()))) {
                continue;
            }
            return guitar;
        }
        return null;
    }
}
