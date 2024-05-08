package C_14_Template.clase;

import C_14_Template.clase.Reteta;

public class AchizitiePeBazaDeRerera extends AchizitieMedicamente {
    Reteta reteta;

    public  AchizitiePeBazaDeRerera(Reteta reteta)
    {
        this.reteta=reteta;

    }
    @Override
    public void primesteReteta() {
        System.out.println("A fost primita reteta cu numarul "+reteta.getNrReteta());

    }

    @Override
    public boolean verificaStoc() {
        for(String medicament:reteta.getListaMedicamente())
        {
            if(!(super.stocuri.containsKey(medicament)))
            {
                System.out.println("Medicamentul "+medicament+ " nu este in stoic");
                return false;
            }
        }
        return true;
    }

    @Override
    public void aducereMedicamente() {
        System.out.println("Medicamentele pentru reteta "+reteta.getNrReteta()+ " sunt aduse");
        for(String medicament:reteta.getListaMedicamente())
        {
            int stocDisponibil = super.stocuri.get(medicament);
            stocDisponibil--;
            super.stocuri.replace(medicament, stocDisponibil);
        }

        //trebuie sa parcurgem mapul si daca un medicament este mai mic sau egal cu 0, trebuie sa ii dam remuve
    }

    @Override
    public void incaseaza() {
        System.out.println("Au sost incasati banii pentr reteta "+reteta.getNrReteta());
    }

    @Override
    public void emitereBon() {
        System.out.println("Bonul pentru reteta "+reteta.getNrReteta()+" a fost emis");
    }

    @Override
    public void respingereAchizitie() {
        System.out.println("Medicamentele din reteta "+reteta.getNrReteta()+" nu sunt disponibile");
    }
}
