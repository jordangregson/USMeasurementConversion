import javax.swing.JOptionPane;

public class USMeasurementConversion {

    public USMeasurementConversion() {
        double endValue = 0;

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

        if(!isNumber(firstMessageInput)){
            JOptionPane.showMessageDialog(null, firstMessageInput + " is not a number");
        }

        for (int i = 4; i < 10; i++) {

            if (Integer.parseInt(firstMessageInput) == i) {
                JOptionPane.showMessageDialog(null, i + " is not a valid number");
            }

            else if(Integer.parseInt(firstMessageInput) != i){
                secondMessageInput = JOptionPane.showInputDialog(null, secondMessage);
                
            }

            // Convert from inches to...
            if (firstMessageInput.equals("1") && secondMessageInput.equals("1")) {
                String numToConvert = "How many inches would you like to convert to inches: ";
                String numToConvertInput;
                numToConvertInput = JOptionPane.showInputDialog(null, numToConvert);

                endValue = convertInchesToInches(Double.parseDouble(numToConvertInput));
                JOptionPane.showMessageDialog(null, endValue);
                System.exit(0);
            }

            else if (firstMessageInput.equals("1") && secondMessageInput.equals("2")) {
                String numToConvert = "How many inches would you like to convert to feet: ";
                String numToConvertInput;
                numToConvertInput = JOptionPane.showInputDialog(null, numToConvert);

                endValue = convertInchesToFeet(Double.parseDouble(numToConvertInput));
                JOptionPane.showMessageDialog(null, endValue);
                System.exit(0);
            }

            else if (firstMessageInput.equals("1") && secondMessageInput.equals("3")) {
                String numToConvert = "How many inches would you like to convert to yards: ";
                String numToConvertInput;
                numToConvertInput = JOptionPane.showInputDialog(null, numToConvert);

                endValue = convertInchesToYards(Double.parseDouble(numToConvertInput));
                JOptionPane.showMessageDialog(null, endValue);
                System.exit(0);
            }

            else if (firstMessageInput.equals("1") && secondMessageInput.equals("4")) {
                String numToConvert = "How many inches would you like to convert to miles: ";
                String numToConvertInput;
                numToConvertInput = JOptionPane.showInputDialog(null, numToConvert);

                endValue = convertInchesToMiles(Double.parseDouble(numToConvertInput));
                JOptionPane.showMessageDialog(null, endValue);
            }

            // Convert from feet to...
            else if (firstMessageInput.equals("2") && secondMessageInput.equals("1")) {
                String numToConvert = "How many feet would you like to convert to inches: ";
                String numToConvertInput;
                numToConvertInput = JOptionPane.showInputDialog(null, numToConvert);

                endValue = convertFeetToInches(Double.parseDouble(numToConvertInput));
                JOptionPane.showMessageDialog(null, endValue);
                System.exit(0);
            }

            else if (firstMessageInput.equals("2") && secondMessageInput.equals("2")) {
                String numToConvert = "How many feet would you like to convert to feet: ";
                String numToConvertInput;
                numToConvertInput = JOptionPane.showInputDialog(null, numToConvert);

                endValue = convertFeetToFeet(Double.parseDouble(numToConvertInput));
                JOptionPane.showMessageDialog(null, endValue);
                System.exit(0);
            }

            else if (firstMessageInput.equals("2") && secondMessageInput.equals("3")) {
                String numToConvert = "How many feet would you like to convert to yards: ";
                String numToConvertInput;
                numToConvertInput = JOptionPane.showInputDialog(null, numToConvert);

                endValue = convertFeetToYards(Double.parseDouble(numToConvertInput));
                JOptionPane.showMessageDialog(null, endValue);
                System.exit(0);
            }

            else if (firstMessageInput.equals("2") && secondMessageInput.equals("4")) {
                String numToConvert = "How many feet would you like to convert to miles: ";
                String numToConvertInput;
                numToConvertInput = JOptionPane.showInputDialog(null, numToConvert);

                endValue = convertFeetToMiles(Double.parseDouble(numToConvertInput));
                JOptionPane.showMessageDialog(null, endValue);
                System.exit(0);
            }

            // Converting from yards to...
            else if (firstMessageInput.equals("3") && secondMessageInput.equals("1")) {
                String numToConvert = "How many yards would you like to convert to inches: ";
                String numToConvertInput;
                numToConvertInput = JOptionPane.showInputDialog(null, numToConvert);

                endValue = convertYardsToInches(Double.parseDouble(numToConvertInput));
                JOptionPane.showMessageDialog(null, endValue);
                System.exit(0);
            }

            else if (firstMessageInput.equals("3") && secondMessageInput.equals("2")) {
                String numToConvert = "How many yards would you like to convert to feet: ";
                String numToConvertInput;
                numToConvertInput = JOptionPane.showInputDialog(null, numToConvert);

                endValue = convertYardsToFeet(Double.parseDouble(numToConvertInput));
                JOptionPane.showMessageDialog(null, endValue);
                System.exit(0);
            }

            else if (firstMessageInput.equals("3") && secondMessageInput.equals("3")) {
                String numToConvert = "How many yards would you like to convert to yards: ";
                String numToConvertInput;
                numToConvertInput = JOptionPane.showInputDialog(null, numToConvert);

                endValue = convertYardsToYards(Double.parseDouble(numToConvertInput));
                JOptionPane.showMessageDialog(null, endValue);
                System.exit(0);
            }

            else if (firstMessageInput.equals("3") && secondMessageInput.equals("4")) {
                String numToConvert = "How many yards would you like to convert to miles: ";
                String numToConvertInput;
                numToConvertInput = JOptionPane.showInputDialog(null, numToConvert);

                endValue = convertYardsToMiles(Double.parseDouble(numToConvertInput));
                JOptionPane.showMessageDialog(null, endValue);
                System.exit(0);
            }

            // Convert from miles to...
            else if (firstMessageInput.equals("4") && secondMessageInput.equals("1")) {
                String numToConvert = "How many miles would you like to convert to inches: ";
                String numToConvertInput;
                numToConvertInput = JOptionPane.showInputDialog(null, numToConvert);

                endValue = convertMilesToInches(Double.parseDouble(numToConvertInput));
                JOptionPane.showMessageDialog(null, endValue);
                System.exit(0);
            }

            else if (firstMessageInput.equals("4") && secondMessageInput.equals("2")) {
                String numToConvert = "How many miles would you like to convert to feet: ";
                String numToConvertInput;
                numToConvertInput = JOptionPane.showInputDialog(null, numToConvert);

                endValue = convertMilesToFeet(Double.parseDouble(numToConvertInput));
                JOptionPane.showMessageDialog(null, endValue);
                System.exit(0);
            }

            else if (firstMessageInput.equals("4") && secondMessageInput.equals("3")) {
                String numToConvert = "How many miles would you like to convert to yards: ";
                String numToConvertInput;
                numToConvertInput = JOptionPane.showInputDialog(null, numToConvert);

                endValue = convertMilesToYards(Double.parseDouble(numToConvertInput));
                JOptionPane.showMessageDialog(null, endValue);
                System.exit(0);
            }

            else if (firstMessageInput.equals("4") && secondMessageInput.equals("4")) {
                String numToConvert = "How many miles would you like to convert to miles: ";
                String numToConvertInput;
                numToConvertInput = JOptionPane.showInputDialog(null, numToConvert);

                endValue = convertMilesToMiles(Double.parseDouble(numToConvertInput));
                JOptionPane.showMessageDialog(null, endValue);
                System.exit(0);
            }
        }
    }

    // Converting from Inches to...
    public double convertInchesToInches(double a) {
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
    public double convertFeetToInches(double a) {
        return a * 12;
    }

    public double convertFeetToFeet(double a) {
        return a;
    }

    public double convertFeetToYards(double a) {
        return a / 3;
    }

    public double convertFeetToMiles(double a) {
        return a / 5280;
    }

    // Converting from Yards to...
    public double convertYardsToInches(double a) {
        return a * 36;
    }

    public double convertYardsToFeet(double a) {
        return a * 3;
    }

    public double convertYardsToYards(double a) {
        return a;
    }

    public double convertYardsToMiles(double a) {
        return a / 1760;
    }

    // Converting from Miles to...
    public double convertMilesToInches(double a) {
        return a * 63360;
    }

    public double convertMilesToFeet(double a) {
        return a * 5280;
    }

    public double convertMilesToYards(double a) {
        return a * 1760;
    }

    public double convertMilesToMiles(double a) {
        return a;
    }



    public boolean isNumber(String s)
    {
        for (int i = 0; i < s.length(); i++)
            if (Character.isDigit(s.charAt(i)) == false)
                return false;
 
        return true;
    }

}