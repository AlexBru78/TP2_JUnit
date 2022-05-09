package Exercice1;

public class Wolf {

    EPosition position;
    public Wolf() {
        position = EPosition.NORD;
    }

    public void next() {
        EPosition currentPos = position;
        switch (currentPos) {
            case NORD:
                position = EPosition.EST;
                break;
            case EST:
                position = EPosition.SUD;
                break;
            case SUD:
                position = EPosition.OUEST;
                break;
            case OUEST:
                position = EPosition.NORD;
                break;

        }
    }
}
