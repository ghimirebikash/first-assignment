
import java.util.*;
import java.util.ArrayList;
import java.util.Collection;

class person {

    String fname;

    int age;

  //  public person() {
    //}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public person(String fname,  int age) {
        this.fname = fname;

        this.age = age;
    }

    public String toString() {
        return fname  + age;
    }




public static void main(String[] args) {
    List<person> persons = new ArrayList<>();
    persons.add(new person("tarun", 28));
    persons.add(new person("arun", 29));
    persons.add(new person("varun", 12));
    persons.add(new person("arun", 22));

    Collections.sort(persons, new Comparator<person>() {

        public int compare(person t, person t1) {
            int comp = t.getFname().compareTo(t1.getFname());
            if (comp != 0) {    
                return comp;
            }
            return t.getAge() - t1.getAge();
        }
    });
    System.out.println(persons);

}}