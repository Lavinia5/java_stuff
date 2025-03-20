import java.util.ArrayList;
import java.util.HashMap;

class Storage {
    private String name;
    private String code;
    private HashMap<String, Integer> inventory = new HashMap<>();
    private ArrayList<String> history= new ArrayList<>();
    private ArrayList<Medicine> medicines = new ArrayList<>();
    public Storage(String name, String code) {
        this.code = code;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }
  /*public void addMed(Medicine medic){
       medicines.add(medic);
  }

   */
    public void addInventory(String med, int count) {
        inventory.put(med, count);

    }
   //public void numaipot(ArrayList<Medicine>medicines, Phamarcy phamarcy, int count){
     //   for(Medicine med: medicines){
       //     Supply(phamarcy,med.toString(), count);
           /* if(inventory.containsKey(med)){
                System.out.println("Medicament: " +med+"disponibi in cantitatea "+inventory.get(med));
            }
            else {
                System.out.println( med +" nu ii");
            }

            */
        //}
//}


    public void Supply(Phamarcy phamarcy, HashMap<String,Integer>medicineList) {
        if (phamarcy == null) {
            System.out.println("Sorry!");
            return;
        }
        for(String medicine: medicineList.keySet()){
            if(!inventory.containsKey(medicine)){
                System.out.println("Medicamentul" +medicine + " nu ii ");
                continue;
            }

       int available = inventory.get(medicine);
            int request = medicineList.get(medicine);
        if(available<request){
            history.add( "Pentru " + medicine +" avem doar cantitatea de " +available);
            phamarcy.addInventory(medicine,available);
            inventory.put(medicine, 0);
        }
          else {
            phamarcy.addInventory(medicine, request);
            inventory.put(medicine, available-request);
            history.add(phamarcy.getName() + " , " + phamarcy.getCode() + " solicita: " + medicine + ": " + request + " de la Depozitul: " + getName() + " " + getCode());
        }
    }
    }
      public String displayRequest(){
      String req = " Istoricul solicitarilor din depozitul"+getName() +getCode()+'\n';
      for(String request:history){
          req += request+'\n';
      }
      return req;
      }


        public String displayInventory(){
        String di = "Inventarul depozitului" + getName()+"," +getCode() +" ";
        for(String med:inventory.keySet()){
            di += med + ": " +inventory.get(med) +" \n ";
        }
        return di;
        }



}
