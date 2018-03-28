package pl.agnieszka.defibrillators;

import static pl.agnieszka.defibrillators.StringUtils.toDouble;

public class Defibrillator {

    private int number;
    private String name;
    private String addres;
    private String phoneNumber;
    private Point location;

    public Defibrillator(){}

    public static Defibrillator createDefibrillator(String description){

        String[] tokens = description.split(";");
        Defibrillator defibrillator = new Defibrillator();
        defibrillator.number = Integer.parseInt(tokens[0]);
        defibrillator.name = tokens[1];
        defibrillator.addres = tokens[2];
        defibrillator.phoneNumber = tokens[3];
        defibrillator.location = new Point(StringUtils.toDouble(tokens[4]), StringUtils.toDouble(tokens[5]));

        return defibrillator;
    }

    public String getName() {
        return name;
    }

    public Point getLocation() {
        return location;
    }

    public int getNumber() {
        return number;
    }

    public String getAddres() {
        return addres;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
