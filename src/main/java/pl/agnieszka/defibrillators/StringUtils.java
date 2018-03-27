package pl.agnieszka.defibrillators;

public class StringUtils {

    static double toDouble(String number){
        return Double.parseDouble(number.replace(',', '.'));
    }
}
