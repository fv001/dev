/**
 * OOPS Banner App
 * UC6: Refactor Banner Logic into Functions
 *
 * Key Concepts:
 * 1. Static Methods       - Belong to the class, no object instantiation needed
 * 2. Helper Methods       - Utility methods that return character patterns
 * 3. Method Abstraction   - Encapsulates pattern creation logic in named methods
 * 4. DRY Principle        - getOPattern() called once, reused for both O's in OOPS
 * 5. Loop-Based Rendering - Single loop assembles and prints all 7 banner lines
 */
public class UC6 {

    // Helper method: returns 7-line ASCII pattern for letter 'O'
    public static String[] getOPattern() {
        return new String[] {
            " *** ",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            "*   *",
            " *** "
        };
    }

    // Helper method: returns 7-line ASCII pattern for letter 'P'
    public static String[] getPPattern() {
        return new String[] {
            "**** ",
            "*   *",
            "*   *",
            "**** ",
            "*    ",
            "*    ",
            "*    "
        };
    }

    // Helper method: returns 7-line ASCII pattern for letter 'S'
    public static String[] getSPattern() {
        return new String[] {
            " *** ",
            "*    ",
            "*    ",
            " *** ",
            "    *",
            "    *",
            " *** "
        };
    }

    public static void main(String[] args) {

        // Call each method once and store — DRY principle
        // getOPattern() called once but reused for both O's in OOPS
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Single loop assembles and prints each banner line
        // oPattern[i] used twice for the two O's in OOPS
        for (int i = 0; i < oPattern.length; i++) {
            System.out.println(oPattern[i] + "  " + oPattern[i] + "  " + pPattern[i] + "  " + sPattern[i]);
        }
    }
}