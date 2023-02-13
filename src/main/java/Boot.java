
import comparator.StudentComparator;
import comparator.UniversityComparator;
import enam.StudentType;
import enam.UniversityType;
import model.ComparatorUtil;
import model.Student;
import model.University;
import xlsreader.XlsReader;

import java.io.IOException;
import java.util.List;

public class Boot {
    public static void main(String[] args) throws IOException {

        List<University> universities =
                XlsReader.readXlsUniversities("src/main/resources/universityInfo.xlsx");
        UniversityComparator universityComparator= ComparatorUtil.getUniversityComparator(UniversityType.YEAR_OF_FOUNDATION);
        universities.stream().sorted(universityComparator).forEach(System.out::println);
        /*for(University university : universities) {
            System.out.println(university);
        }*/

        List<Student> students =
                XlsReader.readXlsStudents("src/main/resources/universityInfo.xlsx");
        StudentComparator studentComparator=ComparatorUtil.getStudentComparator(StudentType.AVG_EXAM_SCORE);
        students.stream().sorted(studentComparator).forEach(System.out::println);
        /*for(Student student : students) {
            System.out.println(student);
        }*/
    }
}
