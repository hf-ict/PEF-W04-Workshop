public class SchoolApp {

    public static void main(String[] args) {
        //Ablauf

        //Objekt erstellen
        //Datentyp (komplex) Variablenname = new Datentyp();
        Student student1 = new Student("Igor", "Ramljak", 200);
        Student student2 = new Student("Daniel", "N'Gunza", 100);
        Student student3 = new Student();

        student1.addLLP(80);
        student1.addLLP(200);
        student1.print();

        //Variable Punkt Methodenaufruf
        student2.addLLP(100);
        student2.removeLLP(10);
        student2.print();
    }
}
