package EntrepriseCorp.Cases.Etats;

public class EtatLibre extends Etat {
    public int proposeAchat(int tarif) {
        return 0;
    }

    public boolean achat() {
        return true;
    }

    @Override
    public void demandeConsigne() {
        return;
    }
}