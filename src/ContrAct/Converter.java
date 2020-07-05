package ContrAct;

public class Converter {

    public static Act convert(Contract contract) {
        Act act = new Act();
        act.setName(contract.getName());
        act.setDate(contract.getDate());
        act.setList(contract.getList());
        return act;
    }
}
