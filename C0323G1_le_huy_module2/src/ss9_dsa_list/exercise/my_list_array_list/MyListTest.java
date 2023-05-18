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
        listCharacters.add(1, 'X');
        System.out.println(listCharacters);
        System.out.println(listCharacters.get(1));
        System.out.println(listCharacters.indexOf('X'));
        listCharacters.remove(1);
        System.out.println(listCharacters.contains('X'));
        System.out.println(listCharacters);
        System.out.println(listCharacters.clone());
        listCharacters.clear();
        System.out.println(listCharacters);
    }
}
