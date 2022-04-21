//Exercise 2: (2) Produce a Map and a Set containing all the countries that begin with ‘A’.

package Chapter17;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import Countries.Countries;

public class Ex2 {
    public static void main(String[] args) {
        Set<String> setA = new LinkedHashSet<>();
        Pattern p1 = Pattern.compile("A.*");
        for(int i = 0; i < Countries.DATA.length; i++) {
            String country = Countries.DATA[i][0];
            Matcher m = p1.matcher(country);
            if(m.matches())
                setA.add(country);
        }
        System.out.println(setA);
        Map<String,String> mapA = new LinkedHashMap<>();
        Pattern p2 = Pattern.compile("A.*");
        for(int i = 0; i < Countries.DATA.length; i++) {
            String country = Countries.DATA[i][0];
            String capital = Countries.DATA[i][1];
            Matcher m = p2.matcher(country);
            if(m.matches())
                mapA.put(country,capital);
        }
        System.out.println(mapA);
    }
}
/*
[ALGERIA, ANGOLA, AFGHANISTAN, AUSTRALIA, ARMENIA, AZERBAIJAN, ALBANIA, ANDORRA, AUSTRIA, ANTIGUA AND BARBUDA, ARGENTINA]
{ALGERIA=Algiers, ANGOLA=Luanda, AFGHANISTAN=Kabul, AUSTRALIA=Canberra, ARMENIA=Yerevan, AZERBAIJAN=Baku, ALBANIA=Tirana, ANDORRA=Andorra la Vella, AUSTRIA=Vienna, ANTIGUA AND BARBUDA=Saint John’s, ARGENTINA=Buenos Aires}

Process finished with exit code 0
 */
