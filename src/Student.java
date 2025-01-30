public class Student {

    //Daten = Attribute = Instanzvariablen

    //Sichtbarkeit = private | Datentyp | Variablenname (frei wählbar)
    private String firstName;
    private String lastName;
    private int llp;

    //Defaultkonstruktor
    public Student() {}

    //Konstruktor mit Parametern
    public Student(String firstName, String lastName, int llp) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.llp = llp;
    }

    //Methoden = Funktionalität
    //Sichtbarkeit Rückgabewert Methodenname(Parameter){}
    //void = kein Rückgabewert
    public void print() {
        System.out.println(firstName + " " + lastName + " " + llp);
    }

    //Methode, welche LLPs hinzufügt
    public void addLLP(int llpToAdd) {
        this.llp = this.llp + llpToAdd;
    }

    public void removeLLP(int llpToRemove) {
        this.llp = this.llp - llpToRemove;
    }

}
