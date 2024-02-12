import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Tester {

    public static void main(String[] args) {

        ArrayList<Integer> idOfStudents = new ArrayList<>();
        idOfStudents.add(1);
        idOfStudents.add(2);
        idOfStudents.add(3);
        System.out.println(idOfStudents);
        //using iterator interface
        Iterator<Integer> iterator = idOfStudents.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //using for each loop
        for (Integer ids:idOfStudents) {
            System.out.println(ids);
        }
        //using list iterator
        ListIterator<Integer> listIterator = idOfStudents.listIterator(idOfStudents.size());
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        //for loop
        for(int i=0; i < idOfStudents.size(); i++){
            System.out.println(idOfStudents.get(i));
        }

        System.out.println(idOfStudents.get(2));

        idOfStudents.set(0,5);
        System.out.println(idOfStudents);

        ArrayList<Integer> regNo = new ArrayList<>();
        regNo.add(23);
        regNo.add(24);
        regNo.add(25);

        regNo.addAll(idOfStudents);
        System.out.println(regNo);
        System.out.println(idOfStudents);

        regNo.remove(2);
        System.out.println(regNo);

        regNo.removeAll(idOfStudents);
        System.out.println(regNo);
        System.out.println(idOfStudents);
        idOfStudents.add(24);
        System.out.println(regNo);
        System.out.println(idOfStudents);
        regNo.retainAll(idOfStudents);
        System.out.println(regNo);
        System.out.println(idOfStudents);

    }
}
