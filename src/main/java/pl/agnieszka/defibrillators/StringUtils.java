package pl.agnieszka.defibrillators;

public class StringUtils {

    public static double toDouble(String number){
        return Double.parseDouble(number.replace(',', '.'));
    }
}
