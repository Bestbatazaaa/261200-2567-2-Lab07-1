import java.awt.*;
import java.sql.SQLOutput;
import java.util.*;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World! " + args[0] + " " + args[1]);

        List<String> aList = new ArrayList<>(); //can expand
        for (int i = 0; i < args.length; i++) {
            aList.add(args[i]);
        }

            System.out.println(aList);
            Collections.shuffle(aList, new Random());
            System.out.println(aList);

            System.out.println("------------------------------------------------------");

            Set<String> hSet = new HashSet<>();
            hSet.add("OOP");
            hSet.add("GG");
            hSet.add("EZ");
            hSet.add("F");
            hSet.add("not");
            hSet.add("drop");
            hSet.add("GG");
            hSet.add("GG");
            hSet.add("GG");
            hSet.remove("GG");
            System.out.println(hSet);

            System.out.println("------------------------------------------------------");

            SortedSet<String> sSet = new TreeSet<>();
            sSet.add("OOP");
            sSet.add("GG");
            sSet.add("EZ");
            sSet.add("F");
            sSet.add("not");
            sSet.add("drop");
            sSet.add("GG");
            sSet.add("ZZZ");
            sSet.add("123");
            sSet.add("กขค");
            System.out.println(sSet);

            System.out.println("------------------------------------------------------");

            Stack<String> stacko = new Stack<>();
            stacko.push("a");
            stacko.push("b");
            stacko.push("c");
            System.out.println(stacko);
            System.out.println(stacko.pop());
            System.out.println(stacko);

            System.out.println("------------------------------------------------------");

            Map<String, Color> favouriteColors = new HashMap<String, Color>();
            favouriteColors.put("Robert" , Color.BLACK);
            favouriteColors.put("Mark" , Color.WHITE);
            favouriteColors.put("Pedro", Color.YELLOW);
            favouriteColors.put("Cole" , Color.BLUE);

            Set<String> keySet = favouriteColors.keySet();

            for (String key : keySet){
                Color value = favouriteColors.get(key);
                System.out.println(key + ":" + value);
            }

            System.out.println("------------------------------------------------------");

            SortedMap<String, Color> favouriteSee = new TreeMap<String, Color>();
            favouriteSee.put("Robert" , Color.BLACK);
            favouriteSee.put("Mark" , Color.WHITE);
            favouriteSee.put("Pedro", Color.YELLOW);
            favouriteSee.put("Cole" , Color.BLUE);

             Set<String> Setkey = favouriteSee.keySet();

            for (String key : Setkey){
                Color value = favouriteSee.get(key);
                System.out.println(key + ":" + value);
            }
            System.out.println("------------------------------------------------------");
    }
}