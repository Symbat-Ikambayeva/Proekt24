public class Main {
    public static void main(String[] args) {
        University university=new University("101", "Восточно-Казахстанский технический университет","ВКГТУ",1950,StudyProfile.ENGINEER);
        Student student=new Student("Иванов Иван","101",1,4.9f);
        Student student2=new Student("Петров Петр","101",1,5.0f);
        System.out.println(university);
        System.out.println(student);
        System.out.println(student2);
    }
}
