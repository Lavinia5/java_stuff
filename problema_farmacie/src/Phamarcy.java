 import java.util.ArrayList;
 import java.util.HashMap;

 class Phamarcy {
     private String name;
     private String code;
     private String address;
     private ArrayList<Employee> employees = new ArrayList<>();
     private ArrayList<String> transferHistory = new ArrayList<>();

   private HashMap<String,Integer> inventory =new HashMap<>();

     public Phamarcy(String name, String code, String address) {
         this.name = name;
         this.code = code;
         this.address = address;
     }
     public String toString(){
         return name+" " +code+ " " +address;
     }
     public String displayInventory( ){
         String inv= " Farmacia  "+getName()+getCode() +"solicita urmatoarele medicamente: " ;
         for(String med:inventory.keySet()){
             inv+=  med+" : " +inventory.get(med);
         }
         return inv;
     }


     public void addInventory( String med, int count) {
         inventory.put(med, count);
         // history.add(displayInventory1());
         // storages.add("Farmacia"+getName()+" , " +getCode() + "solicita urmatoarele medicamente: " + med+":" +count);
        // history.add(getName()+ " , " +getCode()+"solicita " +med +" : "+count + " de la Depozitul : " );//+storage.getName() + " " +getCode());

     }


     public void addEmployees(Employee employee) {
         employees.add(employee);
     }

     public void removeEmployees(Employee employee) {
         employees.remove(employee);
     }

     public String getName() {
         return name;
     }

     public String getCode() {
         return code;
     }

     public String getAddress() {
         return address;
     }
     public String displayPhamarcy() {
         String Ph = " Phamarcy : " + name + " -Code:" + code + " -Address: " + address + '\n';
         for (Employee employee : employees) {
             Ph += " Name :" + employee.getName() + " Surname: " + employee.getSurname() + " CNP: " + employee.getCnp() + " Position: "
                     + employee.getPosition() + '\n' ;
         }
         return Ph  ;

     }


     public void transferEmployee(Employee employee, Phamarcy targetPhamarcy) {
         removeEmployees(employee);
         targetPhamarcy.addEmployees(employee);
         String transferRecord = String.format("%s %s was transferred from %s%s to %s%s", employee.getName(), employee.getSurname()
               , getName(), getCode(), targetPhamarcy.getName(), targetPhamarcy.getCode());
         transferHistory.add(transferRecord);
         targetPhamarcy.transferHistory.add(transferRecord);

     }


public String displayTransfer(){
         String t ="History : "+getName() +'\n';
         for( String transferRecord : transferHistory){
             t+="  -  " +transferRecord + '\n';
         }
return t;
     }


 }