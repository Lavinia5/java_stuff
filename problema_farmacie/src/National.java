import java.util.ArrayList;

class National {
    private ArrayList<City>cities;
    public National(){
        this.cities = new ArrayList<>();
    }
    public void addCity(City city)
{
    cities.add(city);
}
public ArrayList<City> getCities(){
        return cities;
}

}