package ContrAct;

import java.util.Arrays;
import java.util.Date;

public class Act {

    private String name;
    private Date date;
    private String[] list;

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setList(String[] list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "ContrAct.Act{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", list=" + Arrays.toString(list) +
                '}';
    }
}
