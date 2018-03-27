package pl.agnieszka.defibrillators;

public class Defibrillator {

    int number;
    String name;
    String addres;
    String phoneNumber;
    Point location;

    public Defibrillator(){}

    static Defibrillator createDefibrillator(String description){

        String[] tokens = description.split(";");
        Defibrillator defibrillator = new Defibrillator();
        defibrillator.number = Integer.parseInt(tokens[0]);
        defibrillator.name = tokens[1];
        defibrillator.addres = tokens[2];
        defibrillator.phoneNumber = tokens[3];
        defibrillator.location = new Point(Solution.toDouble(tokens[4]), Solution.toDouble(tokens[5]));

        return defibrillator;
    }
}
