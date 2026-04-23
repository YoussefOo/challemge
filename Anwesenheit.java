import java.util.*;


enum AnweseheitStatus {
        ANWESEND, ABWESEND, ENTSCHULDIGT, VERSPAETET

}



class Student {
    private String name;
    private AnweseheitStatus status;

    public Student(String name, AnweseheitStatus status) {
        this.name = name;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public AnweseheitStatus getStatus() {
        return status;
    }
    public long countTeilnehmer(List<Student> students, AnweseheitStatus status) {
        return students.stream()
                .filter(student -> student.getStatus() == status)
                .count();
    }
}

public class Anwesenheit {
  
    public static void main(String[] args) {
        // list erstellen.
        List<Student> students = new ArrayList<>();
        
        students.add(new Student("AAA", AnweseheitStatus.ANWESEND));
        students.add(new Student("BBB", AnweseheitStatus.ABWESEND));
        students.add(new Student("CCC", AnweseheitStatus.ENTSCHULDIGT));
        students.add(new Student("DDD", AnweseheitStatus.VERSPAETET));
        
        Student counter = new Student("Helper", AnweseheitStatus.ANWESEND);
        
        System.out.println("=== Anwesenheitsstatus ===");
        System.out.println("Anwesend: " + counter.countTeilnehmer(students, AnweseheitStatus.ANWESEND));
        System.out.println("Abwesend: " + counter.countTeilnehmer(students, AnweseheitStatus.ABWESEND));
        System.out.println("Entschuldigt: " + counter.countTeilnehmer(students, AnweseheitStatus.ENTSCHULDIGT));
        System.out.println("Verspätet: " + counter.countTeilnehmer(students, AnweseheitStatus.VERSPAETET));
    }
}