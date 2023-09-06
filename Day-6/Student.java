import java.util.Comparator;

public class Student {

    
    private String name;
    private int age;
    public static final ByName BY_NAME=new ByName();
    public static final ByAge BY_AGE=new ByAge();

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private static  class ByName implements Comparator<Student>{

        @Override
        public int compare(Student v, Student w) {
     return v.name.compareTo(w.name);
        }

    }

    private static class ByAge implements Comparator<Student> {

        @Override
        public int compare(Student v, Student w) {
            return v.age-w.age;
        }
        
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    

}
