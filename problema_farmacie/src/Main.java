import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        National national = new National();
        City city1 = new City("Timisoara");
        City city2 = new City("Cluj");
        national.addCity(city1);
        national.addCity(city2);
        Phamarcy p1 = new Phamarcy("Catena" ," 1", "Strada Cluj" );
        Employee e1 = new Employee("Popescu", "Ion", "23456", "Farmacist");
        Employee e2 = new Employee("Marinescu" , "Ionel", "66666", "Farmacist");
        Employee e8 = new Employee("Precup", " Radu", "678900", "Diriginte");

       // city1.displayPhamarcies();
        Phamarcy p2 = new Phamarcy("Dona" ," 2 ", "Strada Cluj" );
        Phamarcy p3 = new Phamarcy("Dr. Max", "3", "Ion Creanga");
        Employee e3 = new Employee("Popescu1", "Ion", "23456", "Farmacist");
        Employee e4 = new Employee("Marinescu1" , "Ionel", "66666", "Farmacist");
        Employee e5 = new Employee("Popescu2", "Ion", "23456", "Asistent");
        Employee e6 = new Employee("Marinescu2" , "Ionel", "66666", "Asistent");
        Employee e7 = new Employee("Popa", "Calin", "777", "Diriginte");
        Employee e9 = new Employee("Muntean", "Darius", "55555", "Asistent");
        Employee e10 = new Employee("Neghis", "Laur", "66000", "Diriginte");
        Employee e11 = new Employee("Cojocaru", "Maria", "66780", "Farmacist");
        Employee e12 = new Employee("Paiusan", "Laura", "5666", "Asistent");
        Employee e13 = new Employee("Matei", "Ioana", "75858", "Diriginte");
        Employee e14 = new Employee("Murarescu", "Maia", "77766", "Farmacist");
        Phamarcy p4 = new Phamarcy("Catena", "11", "Str Narciselor");
       // city1.addPhamarcy(p1);
        city2.addPhamarcy(p2);
        city2.addPhamarcy(p3);
        city2.addPhamarcy(p4);
        city1.addPhamarcy(p1);
        p1.addEmployees(e8);
        p1.addEmployees(e2);
        p4.addEmployees(e12);
        p4.addEmployees(e13);
        p4.addEmployees(e14);
        p4.addEmployees(e1);
        p2.addEmployees(e3);
        p2.addEmployees(e4);
        p2.addEmployees(e5);
        p2.addEmployees(e6);
        p2.addEmployees(e7);
        p3.addEmployees(e9);
        p3.addEmployees(e10);
        p3.addEmployees(e11);
        p2.transferEmployee(e5,p1);
        p3.transferEmployee(e9,p1);
        p4.transferEmployee(e14,p1);
       p1.transferEmployee(e8,p2);
        p1.transferEmployee(e3,p3);
        //System.out.println(city1.displayPhamarcies());
       // System.out.println(p1.displayTransfer());
       // System.out.println( city2.displayPhamarcies());
       // System.out.println(p1.displayTransfer());

       // System.out.println(p2.displayTransfer());
        //System.out.println(p3.displayTransfer());
        //System.out.println(p4.displayTransfer());
     //  city1.displayPhamarcies();
        Medicine medicines = new Medicine("Nurofen", 22, " toate", 1000);
     Storage storage = new Storage( " Depozit1", "22");
     storage.addInventory("Aspirina", 200);
     storage.addInventory("Paracetamol", 150);
     storage.addInventory("Nurofen", 250);
        HashMap<String, Integer> medicineCounts = new HashMap<>();
        medicineCounts.put("Nurofen", 100);
        medicineCounts.put("Aspirina", 50);
        medicineCounts.put("Nurofen", 375);
     storage.Supply(p1,medicineCounts);
      // p1.addInventory( " Aspirina", 20);
       // p1.addInventory( " Paracetamol", 10);
        //

        //storage.addMed(medicine1);
        //storage.addMed(medicine);
       //storage.numaipot(medicine1,p1,20);
      //  System.out.println(medicine1.toString());
        //storage.Supply(p1,"Paracetamol", 210);
        //storage.Supply(p1, "Nurofen", 15);
        System.out.println(city1.displayPhamarcies());
        System.out.println(city2.displayPhamarcies());
        System.out.println( p1.displayInventory());
        System.out.println(storage.displayInventory());
        System.out.println(storage.displayRequest());

       // System.out.println(p1.npot());
       // System.out.println(city1.displayPhamarcies());
        //System.out.println(city2.displayPhamarcies());


}
}