package ContrAct;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Date date = new Date();
        String[] list = new String[3];
        list[0] = "a";
        list[1] = "b";
        list[2] = "c";
        // String newList[] = {"a", "b", "c"};
        Contract contract = new Contract("Name", date, list);
        Act act = Converter.convert(contract);
        System.out.println(act.toString());
    }
}