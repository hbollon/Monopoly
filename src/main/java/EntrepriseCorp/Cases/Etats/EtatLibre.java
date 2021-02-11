package EntrepriseCorp.Cases.Etats;

import EntrepriseCorp.Cases.Case;

public class EtatLibre implements Etat {
    public EtatLibre(int tarif) {
        super(tarif);
    }

    public int proposeAchat() {
        return tarif;
    }

    @Override
    public Etat achat(int solde) {

    }

    @Override
    public void demandeConsigne() {
        return;
    }

    @Override
    public Etat miseAJourEtat() {
        return;
    }
}