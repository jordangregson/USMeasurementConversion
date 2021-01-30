import javax.swing.JOptionPane;

public class USMeasurementConversionV2 {

    public USMeasurementConversionV2() {

        String firstMessage = "What would you like to convert from:\n1: Inches\n2: Feet\n3: Yards\n4: Miles";
        String firstMessageInput = "";

        String secondMessage = "What would you like to convert to:\n1: Inches\n2: Feet\n3: Yards\n4: Miles";
        String secondMessageInput = "";

        // String numToConvert = "How many would you like to convert to ";
        // String numToConvertInput;

        /*
         * 1 = Inches 2 = Feet 3 = Yards 4 = Miles
         */

        // && Integer.parseInt(secondMessageInput) != i

        firstMessageInput = JOptionPane.showInputDialog(null, firstMessage);

        if (!isNumber(firstMessageInput)) {
            JOptionPane.showMessageDialog(null, firstMessageInput + " is not a number");
        }

        for (int i = 4; i < 10; i++) {

            if (Integer.parseInt(firstMessageInput) == i) {
                JOptionPane.showMessageDialog(null, i + " is not a valid number");
            }

            else if (Integer.parseInt(firstMessageInput) != i) {
                secondMessageInput = JOptionPane.showInputDialog(null, secondMessage);

            }

            // INCHES
            if (firstMessageInput.equals("1")) {
                String measurement = "Inches";

                if (secondMessageInput.equals("1")) {
                    String numToConvert = "How many " + measurement + " would you like to convert to Inches: ";
                    String numToConvertInput;
                    numToConvertInput = JOptionPane.showInputDialog(null, numToConvert);

                    int endValue = convertInchesToInches(Integer.parseInt(numToConvertInput));
                    JOptionPane.showMessageDialog(null, endValue + " " + measurement);
                    System.exit(0);
                }

                if (secondMessageInput.equals("2")) {
                    String numToConvert = "How many " + measurement + " would you like to convert to Feet: ";
                    String numToConvertInput;
                    numToConvertInput = JOptionPane.showInputDialog(null, numToConvert);

                    double endValue = convertInchesToFeet(Integer.parseInt(numToConvertInput));
                    JOptionPane.showMessageDialog(null, endValue + " " + measurement);
                    System.exit(0);
                }

                if (secondMessageInput.equals("3")) {
                    String numToConvert = "How many " + measurement + " would you like to convert to Yards: ";
                    String numToConvertInput;
                    numToConvertInput = JOptionPane.showInputDialog(null, numToConvert);

                    double endValue = convertInchesToYards(Integer.parseInt(numToConvertInput));
                    JOptionPane.showMessageDialog(null, endValue);
                    System.exit(0);
                }

                if (secondMessageInput.equals("4")) {
                    String numToConvert = "How many " + measurement + " would you like to convert to Miles: ";
                    String numToConvertInput;
                    numToConvertInput = JOptionPane.showInputDialog(null, numToConvert);

                    double endValue = convertInchesToMiles(Integer.parseInt(numToConvertInput));
                    JOptionPane.showMessageDialog(null, endValue + " " + measurement);
                    System.exit(0);
                }

            }

            // FEET
            if (firstMessageInput.equals("2")) {
                String measurement = "Feet";

                if (secondMessageInput.equals("1")) {
                    String numToConvert = "How many " + measurement + " would you like to convert to Inches: ";
                    String numToConvertInput;
                    numToConvertInput = JOptionPane.showInputDialog(null, numToConvert);

                    int endValue = convertFeetToInches(Integer.parseInt(numToConvertInput));
                    JOptionPane.showMessageDialog(null, endValue + " " + measurement);
                    System.exit(0);
                }

                if (secondMessageInput.equals("2")) {
                    String numToConvert = "How many " + measurement + " would you like to convert to Feet: ";
                    String numToConvertInput;
                    numToConvertInput = JOptionPane.showInputDialog(null, numToConvert);

                    int endValue = convertFeetToFeet(Integer.parseInt(numToConvertInput));
                    JOptionPane.showMessageDialog(null, endValue + " " + measurement);
                    System.exit(0);
                }

                if (secondMessageInput.equals("3")) {
                    String numToConvert = "How many " + measurement + " would you like to convert to Yards: ";
                    String numToConvertInput;
                    numToConvertInput = JOptionPane.showInputDialog(null, numToConvert);

                    double endValue = convertFeetToYards(Integer.parseInt(numToConvertInput));
                    JOptionPane.showMessageDialog(null, endValue + " " + measurement);
                    System.exit(0);
                }

                if (secondMessageInput.equals("4")) {
                    String numToConvert = "How many " + measurement + " would you like to convert to Miles: ";
                    String numToConvertInput;
                    numToConvertInput = JOptionPane.showInputDialog(null, numToConvert);

                    double endValue = convertFeetToMiles(Integer.parseInt(numToConvertInput));
                    JOptionPane.showMessageDialog(null, endValue + " " + measurement);
                    System.exit(0);
                }

            }

            // FEET
            if (firstMessageInput.equals("2")) {
                String measurement = "Feet";

                if (secondMessageInput.equals("1")) {
                    String numToConvert = "How many " + measurement + " would you like to convert to Inches: ";
                    String numToConvertInput;
                    numToConvertInput = JOptionPane.showInputDialog(null, numToConvert);

                    int endValue = convertFeetToInches(Integer.parseInt(numToConvertInput));
                    JOptionPane.showMessageDialog(null, endValue + " " + measurement);
                    System.exit(0);
                }

                if (secondMessageInput.equals("2")) {
                    String numToConvert = "How many " + measurement + " would you like to convert to Feet: ";
                    String numToConvertInput;
                    numToConvertInput = JOptionPane.showInputDialog(null, numToConvert);

                    int endValue = convertFeetToFeet(Integer.parseInt(numToConvertInput));
                    JOptionPane.showMessageDialog(null, endValue + " " + measurement);
                    System.exit(0);
                }

                if (secondMessageInput.equals("3")) {
                    String numToConvert = "How many " + measurement + " would you like to convert to Yards: ";
                    String numToConvertInput;
                    numToConvertInput = JOptionPane.showInputDialog(null, numToConvert);

                    double endValue = convertFeetToYards(Integer.parseInt(numToConvertInput));
                    JOptionPane.showMessageDialog(null, endValue + " " + measurement);
                    System.exit(0);
                }

                if (secondMessageInput.equals("4")) {
                    String numToConvert = "How many " + measurement + " would you like to convert to Miles: ";
                    String numToConvertInput;
                    numToConvertInput = JOptionPane.showInputDialog(null, numToConvert);

                    double endValue = convertFeetToMiles(Integer.parseInt(numToConvertInput));
                    JOptionPane.showMessageDialog(null, endValue + " " + measurement);
                    System.exit(0);
                }

            }

            // YARDS
            if (firstMessageInput.equals("3")) {
                String measurement = "Yards";

                if (secondMessageInput.equals("1")) {
                    String numToConvert = "How many " + measurement + " would you like to convert to Inches: ";
                    String numToConvertInput;
                    numToConvertInput = JOptionPane.showInputDialog(null, numToConvert);

                    int endValue = convertYardsToInches(Integer.parseInt(numToConvertInput));
                    JOptionPane.showMessageDialog(null, endValue + " " + measurement);
                    System.exit(0);
                }

                if (secondMessageInput.equals("2")) {
                    String numToConvert = "How many " + measurement + " would you like to convert to Feet: ";
                    String numToConvertInput;
                    numToConvertInput = JOptionPane.showInputDialog(null, numToConvert);

                    int endValue = convertYardsToFeet(Integer.parseInt(numToConvertInput));
                    JOptionPane.showMessageDialog(null, endValue + " " + measurement);
                    System.exit(0);
                }

                if (secondMessageInput.equals("3")) {
                    String numToConvert = "How many " + measurement + " would you like to convert to Yards: ";
                    String numToConvertInput;
                    numToConvertInput = JOptionPane.showInputDialog(null, numToConvert);

                    int endValue = convertYardsToYards(Integer.parseInt(numToConvertInput));
                    JOptionPane.showMessageDialog(null, endValue + " " + measurement);
                    System.exit(0);
                }

                if (secondMessageInput.equals("4")) {
                    String numToConvert = "How many " + measurement + " would you like to convert to Miles: ";
                    String numToConvertInput;
                    numToConvertInput = JOptionPane.showInputDialog(null, numToConvert);

                    double endValue = convertYardsToMiles(Double.parseDouble(numToConvertInput));
                    JOptionPane.showMessageDialog(null, endValue + " " + measurement);
                    System.exit(0);
                }

            }

            // Miles
            if (firstMessageInput.equals("4")) {
                String measurement = "Miles";

                if (secondMessageInput.equals("1")) {
                    String numToConvert = "How many " + measurement + " would you like to convert to Inches: ";
                    String numToConvertInput;
                    numToConvertInput = JOptionPane.showInputDialog(null, numToConvert);

                    int endValue = convertMilesToInches(Integer.parseInt(numToConvertInput));
                    JOptionPane.showMessageDialog(null, endValue + " " + measurement);
                    System.exit(0);
                }

                if (secondMessageInput.equals("2")) {
                    String numToConvert = "How many " + measurement + " would you like to convert to Feet: ";
                    String numToConvertInput;
                    numToConvertInput = JOptionPane.showInputDialog(null, numToConvert);

                    int endValue = convertMilesToFeet(Integer.parseInt(numToConvertInput));
                    JOptionPane.showMessageDialog(null, endValue + " " + measurement);
                    System.exit(0);
                }

                if (secondMessageInput.equals("3")) {
                    String numToConvert = "How many " + measurement + " would you like to convert to Yards: ";
                    String numToConvertInput;
                    numToConvertInput = JOptionPane.showInputDialog(null, numToConvert);

                    int endValue = convertMilesToYards(Integer.parseInt(numToConvertInput));
                    JOptionPane.showMessageDialog(null, endValue + " " + measurement);
                    System.exit(0);
                }

                if (secondMessageInput.equals("4")) {
                    String numToConvert = "How many " + measurement + " would you like to convert to Miles: ";
                    String numToConvertInput;
                    numToConvertInput = JOptionPane.showInputDialog(null, numToConvert);

                    int endValue = convertMilesToMiles(Integer.parseInt(numToConvertInput));
                    JOptionPane.showMessageDialog(null, endValue + " " + measurement);
                    System.exit(0);
                }

            }

        }
    }

    // Converting from Inches to...
    public int convertInchesToInches(int a) {
        return a;
    }

    public double convertInchesToFeet(double a) {
        return a / 12;
    }

    public double convertInchesToYards(double a) {
        return a / 36;
    }

    public double convertInchesToMiles(double a) {
        return a / 63360;
    }

    // Converting from Feet to...
    public int convertFeetToInches(int a) {
        return a * 12;
    }

    public int convertFeetToFeet(int a) {
        return a;
    }

    public double convertFeetToYards(double a) {
        return a / 3;
    }

    public double convertFeetToMiles(double a) {
        return a / 5280;
    }

    // Converting from Yards to...
    public int convertYardsToInches(int a) {
        return a * 36;
    }

    public int convertYardsToFeet(int a) {
        return a * 3;
    }

    public int convertYardsToYards(int a) {
        return a;
    }

    public double convertYardsToMiles(double a) {
        return a / 1760;
    }

    // Converting from Miles to...
    public int convertMilesToInches(int a) {
        return a * 63360;
    }

    public int convertMilesToFeet(int a) {
        return a * 5280;
    }

    public int convertMilesToYards(int a) {
        return a * 1760;
    }

    public int convertMilesToMiles(int a) {
        return a;
    }



    public boolean isNumber(String s) {
        for (int i = 0; i < s.length(); i++)
            if (Character.isDigit(s.charAt(i)) == false)
                return false;

        return true;
    }

}