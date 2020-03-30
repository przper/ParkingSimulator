package przper;

import java.awt.Color;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JLabel;

public class pSpace {
    boolean isOccupied;
    String licensePlate;
    String entryTime;
    JLabel label;
    static ArrayList<pSpace> instList = new ArrayList<>();

    public pSpace(JLabel lbl) {
        isOccupied = false;
        licensePlate = "";
        entryTime = "";
        instList.add(this);
        label = lbl;
    }

    public void makeOccupied(String plate, String t) {
        isOccupied = true;
        licensePlate = plate;
        entryTime = t;
        label.setBackground(Color.red);
    }

    public void makeFree() {
        isOccupied = false;
        licensePlate = "";
        entryTime = "";
        label.setBackground(Color.green);
    }

    public static ArrayList<pSpace> getFreeList() {
        ArrayList<pSpace> result = new ArrayList<>();
        for (pSpace ps : instList) {
            if (ps.isOccupied == false) {
                result.add(ps);
            }
        }
        return result;
    }

    public static ArrayList<pSpace> getOccupiedList() {
        ArrayList<pSpace> result = new ArrayList<>();
        for (pSpace ps : instList) {
            if (ps.isOccupied == true) {
                result.add(ps);
            }
        }
        return result;
    }

    public static boolean isPlateCorrect(String p) {
        Pattern pattern = Pattern.compile("[A-Z]{2,3} [A-Z0-9]{4,5}");
        Matcher matcher = pattern.matcher(p);
        return matcher.matches();
    }

    public static boolean isTimeCorrect(String p) {
        Pattern pattern = Pattern.compile("\\d{2}:\\d{2}:\\d{2}");
        Matcher matcher = pattern.matcher(p);
        return matcher.matches();
    }

}
