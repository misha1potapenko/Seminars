import java.util.HashMap;

//mport java.util.HashMap;
//import java.util.HashMap;
//import java.util.Map;
//
//public class Passports {
//    public static void main(String[] args) {
//        HashMap<Integer, String> lastNameByPassport = new HashMap<> ();
//        lastNameByPassport.put (123456, "Иванов");
//        lastNameByPassport.put (321456, "Васильев");
//        lastNameByPassport.put (234561, "Петрова");
//        lastNameByPassport.put (234432, "Иванов");
//        lastNameByPassport.put (654321, "Петрова");
//        lastNameByPassport.put (345678, "Иванов");
//
//        // String lastName = lastNameByPassport.get (123456);
//        // System.out.println(lastName);
//
//        System.out.println(lastNameByPassport);
//
//        for (Map.Entry<Integer, String> entry : lastNameByPassport.entrySet())
//            if (entry.getValue().equals("Иванов"))
//                System.out.println(entry);
//    }
//}
//Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false,
//        если нет. Строки изоморфны, если одну букву в первом слове можно заменить на
//        некоторую букву во втором слове, при этом
//        повторяющиеся буквы одного слова меняются на одну
//        и ту же букву с сохранением порядка следования. (Например, add - egg изоморфны)
//        буква может не меняться, а остаться такой же. (Например, note - code)
//        Пример 1:
//        Input: s = "foo", t = "bar"
//        Output: false
//        Пример 2:
//        Input: s = "paper", t = "title"
//        Output: true
public class Main {
    public static void main(String[] args) {
        System.out.println(isIsomorph("aabbbsss","xxyzyzzz"));

    }
    public static boolean isIsomorph(String str1, String str2) { // dasdasd=sdfsdgsgf
        if (str1.length() != str2.length()) return false;
        HashMap<Character, Character> isomorph = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            if (isomorph.containsKey(str1.charAt(i))) {
                if (!isomorph.get(str1.charAt(i)).equals(str2.charAt(i))) return false;
            }
            isomorph.put(str1.charAt(i), str2.charAt(i));
        }
        return true;
    }
}