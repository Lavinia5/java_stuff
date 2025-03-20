  class Employee {
   private String name;
   private String surname;
   private String cnp;
   private String position;
   public Employee(String name, String surname, String cnp, String position){
       this.name = name;
       this.surname = surname;
       this.cnp = cnp;
       this.position = position;
   }
   public String getName(){
       return name;
   }
   public String getSurname(){
       return surname;
   }
   public String getCnp(){
       return cnp;
   }
   public String getPosition(){
       return position;
   }
    public String toString(){
       return name + " " +surname + " : " + cnp + " " +position;
   }


  /*public String Employ(){
  String Ph1 = " Employes: ";
       for (Employee employee : employees) {
           Ph1 +=" Name :" + employee.getName() + " Surname: " + employee.getSurname() + " CNP: " + employee.getCnp() + " Position: " + employee.getPosition();
       }
       return Ph1;
   }

   */


}
