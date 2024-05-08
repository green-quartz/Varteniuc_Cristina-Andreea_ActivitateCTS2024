package C_13_State.clase;

public class Emisa implements State{
    @Override
    public void schimbaStare(Reteta reteta) {
        reteta.setStare(this);
    }
}
