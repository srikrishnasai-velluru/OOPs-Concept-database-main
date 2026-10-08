class Student {

    private String name;
    private float marks;

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for marks
    public void setMarks(float marks) {
        this.marks = marks;
    }

    // Getter for marks
    public float getMarks() {
        return marks;
    }
}

public class Encapsulation {

    public static void main(String[] args) {

        Student obj = new Student();

        obj.setName("Vamsi");
        obj.setMarks(85.5f);

        System.out.println("Name: " + obj.getName());
        System.out.println("Marks: " + obj.getMarks());
    }
}