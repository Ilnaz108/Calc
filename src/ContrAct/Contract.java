package ContrAct;

import java.util.Date;

public class Contract {

        private String name;
        private Date date;
        private String[] list;

    public Contract(String name, Date date, String[] list) {
        this.name = name;
        this.date = date;
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public String[] getList() {
        return list;
    }
}
