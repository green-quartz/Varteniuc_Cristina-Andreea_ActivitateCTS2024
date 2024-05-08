package C_13_State.clase;

public class Reteta {
    private int nrReteta;
    private int nrMedicamente;
    private State stare;

    public Reteta(int nrReteta, int nrMedicamente) {
        this.nrReteta = nrReteta;
        this.nrMedicamente = nrMedicamente;
        this.stare = new Emisa();
    }

    protected void setStare(State stare) {
        this.stare = stare;
    }

    public void solicitaMedicament()
    {
        if( this.stare instanceof  Emisa) {
            System.out.println("Conform retetei cu "+ nrReteta+ " au fost solicitate " + nrMedicamente+ " medicamente");
//            this.stare = new Solicitata();

            //alta varianta
            State solicitata = new Solicitata();
            solicitata.schimbaStare(this);
        }
        else {
            System.out.println("Medicamentele din reteta " + nrReteta+ " nu pot fi solicitate");
        }
    }

    public void cumparaMedicamente()
    {
        if(this.stare instanceof Solicitata){
            System.out.println("Reteta cu numarul "+ nrReteta + " a fost achizitionata.");
           State achizitionata = new Achizitionata();
           achizitionata.schimbaStare((this));
        }
        else {
            System.out.println("Medicamentele din reteta " + nrReteta+ " nu pot fi achizitionate");
        }
    }

    public void respingeAchizitie()
    {
        if(this.stare instanceof Solicitata){
            System.out.println("Ne pare rau nu avem medicamentele din reteta "+ nrReteta);
            State emisa = new Emisa();
            emisa.schimbaStare(this);
        }
        else {
            System.out.println("Reteta nu poate fi respinsa");
        }
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "nrReteta=" + nrReteta +
                ", nrMedicamente=" + nrMedicamente +
                ", stare=" + stare +
                '}';
    }
}
