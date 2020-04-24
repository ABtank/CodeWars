package ru.abramov.codewars;

public class ValidPin {

    public static void main(String[] args) {
        String pin ="+123";
        String charToString;
        boolean b = Character.isDigit(pin.charAt('+'));
        int num;
        for (int i = 0; i <pin.length() ; i++) {
            try{
                charToString = Character.toString(pin.charAt(i));
                num = Integer.parseInt(charToString);
                System.out.println("good = "+pin.charAt(i)+ " "+num);
            }catch (Exception e){
                System.out.println("+ "+pin.charAt(i));
            }
        }
    }
    public static boolean validatePin(String pin) {
        int num;
        String charToString;
        for (int i = 0; i <pin.length() ; i++) {
            try{
                charToString = Character.toString(pin.charAt(i));
                num = Integer.parseInt(charToString);
                System.out.println("good = "+pin.charAt(i)+ " "+num);
            }catch (Exception e){
                System.out.println("bad = "+pin.charAt(i));
                return false;
            }
        }
        try{
            num = Integer.parseInt(pin);
        }catch (Exception e){
            return false;
        }
        if (num < 0) return false;
        if (pin.length() == 4 || pin.length() == 6) return true;
        return false;
    }

    public static boolean validPinCode(String pin) {
//        return pin.matches("[0-9]{4}|[0-9]{6}");
        return pin.matches("\\d{4}|\\d{6}");
    }

    public static boolean validatePinIsDigit(String pin) {

        if (pin == null || (pin.length() != 4 && pin.length() != 6)) {
            return false;
        }

        for (int i = 0; i < pin.length(); i++) {
            if (!Character.isDigit(pin.charAt(i))) {
                return false;
            }
        }
        return true;

    }

}
