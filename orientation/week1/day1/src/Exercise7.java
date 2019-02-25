import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise7 {
    public static void main(String[] args) {
        System.out.println(filterCitiesByStart('a'));
    }


    public static List<String> filterCitiesByStart(char c){
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI",
                "AMSTERDAM", "ABU DHABI", "PARIS");
        List<String> filteredCities = cities.stream()
                .filter(s -> s.toLowerCase().charAt(0)== c)
                .collect(Collectors.toList());
    return filteredCities;
    }
}
