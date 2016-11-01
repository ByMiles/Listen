import data.Student;
import lists.Listable;
import lists.SinglyLinkedList;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("Ted", "Mosby", 1, 0);
		Student s2 = new Student("Donald", "Duck", 1, 0);
		Student s3 = new Student("Micky", "Maus", 2, 0);
		
		Listable<Student> list = new SinglyLinkedList<Student>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		list.printAll();
		
		System.out.println("Size: " + list.getSize());
		System.out.println(list.get(2));}

}
