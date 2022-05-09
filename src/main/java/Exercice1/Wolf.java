package Exercice1;

public class Wolf {

    EPosition position;
    public Wolf() {
        position = EPosition.NORD;
    }

    public void next() {
        switch (this.position) {
            case NORD:
                this.position = EPosition.EST;
            case EST:
                this.position = EPosition.SUD;
            case SUD:
                this.position = EPosition.OUEST;
            case OUEST:
                this.position = EPosition.NORD;

        }
    }
}
