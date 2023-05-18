package ss9_dsa_list.exercise.my_list_array_list;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Character> listCharacters = new MyList<>();
        listCharacters.add('a');
        listCharacters.add('b');
        listCharacters.add('c');
        listCharacters.add('d');
        listCharacters.add('e');
        System.out.println(listCharacters);
        listCharacters.remove(2);
        System.out.println(listCharacters);
        System.out.println(listCharacters.size());
        System.out.println(listCharacters.contains('a'));
        System.out.println(listCharacters.contains(null));
        System.out.println(listCharacters.contains('x'));
        System.out.println(listCharacters.get(2));
        System.out.println(listCharacters.clone());
        listCharacters.add(2,'x');
        System.out.println(listCharacters);

    }
}
