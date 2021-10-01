import java.util.*;
class DuplicateCharacter {

    public static void countDuplicateCharacters(String str)
    {

        Map<Character, Integer> map = new HashMap<Character, Integer>();

        char[] charArray = str.toCharArray();

        for (char c : charArray) {

            if (map.containsKey(c)) {

                map.put(c, map.get(c) + 1);
            }
            else {

                map.put(c, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }

    // Driver Code
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str= sc.nextLine();              //reads string
        // Function Call
        countDuplicateCharacters(str);
    }
}