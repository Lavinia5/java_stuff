import java.util.ArrayList;

public class City {
    private String name;
    private ArrayList<Phamarcy> phamarcies = new ArrayList<>();
    public City(String name){
        this.name = name;

    }
    public void addPhamarcy(Phamarcy phamarcy){
        phamarcies.add(phamarcy);

    }
    public String getName(){
        return name;
    }
    public ArrayList<Phamarcy> getPhamarcies(){
        return phamarcies;
    }
   //public void displayPhamarcies(){
    //   System.out.println("City : " +name);
      // for(Phamarcy phamarcy : phamarcies){
        //   phamarcy.displayPhamarcy();
       //}

    //}
    public String displayPhamarcies(){
        String Mesaj = " City\n : " +name;
        for (Phamarcy phamarcy : phamarcies)
        Mesaj = Mesaj + phamarcy.displayPhamarcy()+phamarcy.displayTransfer() +'\n';
        return Mesaj;
    }
    public String toString(){
        return "Orasul" +name+'\n';

         }

}
