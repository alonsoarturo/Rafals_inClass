import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Diver {

	public static void main(String[] args) {
		Object[] ar = new Object[10];
		
		try {
			Student s1 = new Student("Alex", "", 3);
			Student s2 = new Student("We", "Wa", 4);
			Student s3 = new Student("X", "Y", 5);
			
			ar[0] = 2;
			ar[1] = s1;
			ar[2] = "aha";
			ar[3] = s2;
			ar[4] = s3;
			
			NameHolder bo = new Student("O", "p", 1);
			((Student) bo).getRating(); //NameHolder doesn't have getRating method, must cast to Student type
			
			for (Object o : ar) {
				System.out.println(o);
			}
			
			List<Student> students = new LinkedList<>();
			
			//List<Student> sx = new ArrayList<>();

			students.add(s1);
			students.add(s2);
			students.add(s3);
			students.add((Student) bo);
			
			Map<String, Student> m = new HashMap<String, Student>();
			Integer index = 0;
			
			for (Student s: students) {
				m.put("s1" + index++, s);
				System.out.println(s);
			}
			
			Map<String, Student> t = new TreeMap<String, Student>();
			index = 0;
			
			for (Student s: students) {
				t.put("s1" + index++, s);
				System.out.println(s);
			}
			
		} catch (NameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
