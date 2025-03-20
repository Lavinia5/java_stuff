import java.util.ArrayList;

class Medicine {
    private String name;
    private int code;
    private String activeSub;
    private int mg;
    public Medicine(String name, int code, String activeSub, int mg){
        this.name = name;
        this.code = code;
        this.activeSub = activeSub;
        this.mg = mg;
    }
    public String getName(){
        return name;
    }

     public int getMg() {
         return mg;
     }

     public String getActiveSub(){
        return activeSub;
  }
 public String toString(){
        return "Medicine : " + name + ": " + code + " , "+activeSub + " , " +mg + "\n";
 }

}
