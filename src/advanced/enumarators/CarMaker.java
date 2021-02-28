package advanced.enumarators;

public enum CarMaker {
    BMW("bymer", 1850),
    VOLVO("volvo", 2020),
    MB("mercedes-benz", 1920);

    final String fullName;
    final int establishedOn;

    CarMaker(String fullName, int establishedOn) {
        this.fullName = fullName;
        this.establishedOn = establishedOn;
    }
}
