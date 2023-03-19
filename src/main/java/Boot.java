
import comparator.StudentComparator;
import comparator.UniversityComparator;
import enam.StudentType;
import enam.UniversityType;
import model.*;
import xlsreader.JsonWriter;
import xlsreader.XlsReader;
import xlsreader.XlsWriter;
import xlsreader.XmlWriter;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Boot {

    private static final Logger logger = Logger.getLogger(Boot.class.getName());

    public static void main(String[] args) throws IOException {
        try {
            LogManager.getLogManager().readConfiguration(
                    Boot.class.getResourceAsStream("/logging.properties"));
        } catch (IOException e) {
            System.err.println("Could not setup logger configuration: " + e.toString());
        }
        logger.log(Level.INFO, "Application started, Logger configured");
        List<University> universities =
                XlsReader.readXlsUniversities("src/main/resources/universityInfo.xlsx");
        UniversityComparator universityComparator= ComparatorUtil.getUniversityComparator(UniversityType.YEAR_OF_FOUNDATION);
        universities.sort(universityComparator);
       /* String universitiesJson = JsonUtil.universityListToJson(universities);
        System.out.println(universitiesJson);*/
        /*universities.stream().sorted(universityComparator).forEach(System.out::println);
      for(University university : universities) {
            System.out.println(university);
        }*/
       /* universities.forEach(university -> {
            String universityJson = JsonUtil.universityToJson(university);
            System.out.println(universityJson);
            University universityFromJson = JsonUtil.jsonToUniversity(universityJson);
            System.out.println(universityFromJson);
        });
        List<University> universitiesFromJson = JsonUtil.jsonToUniversityList(universitiesJson);
        System.out.println("Результат сравнения: "+ (universities.size() == universitiesFromJson.size()));*/

        List<Student> students =
                XlsReader.readXlsStudents("src/main/resources/universityInfo.xlsx");
        StudentComparator studentComparator=ComparatorUtil.getStudentComparator(StudentType.AVG_EXAM_SCORE);
        /*students.stream().sorted(studentComparator).forEach(System.out::println);
        for(Student student : students) {
            System.out.println(student);
        }*/
        students.sort(studentComparator);
        //String studentsJson = JsonUtil.studentListToJson(students);
       /* System.out.println(studentsJson);
        students.forEach(student -> {
            String studentJson = JsonUtil.studentToJson(student);
            System.out.println(studentJson);
            Student studentFromJson = JsonUtil.jsonToStudent(studentJson);
            System.out.println(studentFromJson);
        });*/
        //List<Student> studentsFromJson = JsonUtil.jsonToStudentList(studentsJson);
        //System.out.println("Результат сравнения: "+ (students.size() == studentsFromJson.size()));

        List<Statistics> statisticsList = StatisticsUtil.createStatistics(students, universities);
        XlsWriter.writeXlsStatistics(statisticsList, "src/main/resources/Statistics.xlsx");
        FullInfo fullInfo = new FullInfo()
                .setStudentList(students)
                .setUniversityList(universities)
                .setStatisticsList(statisticsList)
                .setProcessDate(new Date());

        XmlWriter.generateXmlReq(fullInfo);
        JsonWriter.writeJsonReq(fullInfo);
        logger.log(Level.INFO, "Application finished");
    }
}
