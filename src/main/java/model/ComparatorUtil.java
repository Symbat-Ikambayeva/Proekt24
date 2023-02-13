package model;

import comparator.*;
import enam.StudentType;
import enam.UniversityType;

public class ComparatorUtil {

    public static UniversityComparator getUniversityComparator(UniversityType universityType) {

        switch (universityType) {

            case ID:
                return new UniversityIdComparator();
            case FULL_NAME:
                //noinspection DuplicateBranchesInSwitch
                return new UniversityFullNameComparator();
            case SHORT_NAME:
                return new UniversityShortNameComparator();
            case MAIN_PROFILE:
                return new UniversityMainProfileComparator();
            case YEAR_OF_FOUNDATION:
                return new UniversityYearOfFoundationComparator();
            default:
                return new UniversityFullNameComparator();
        }
    }

    public static StudentComparator getStudentComparator(StudentType studentType) {

        switch (studentType) {

            case UNIVERSITY_ID:
                return new StudentUniversityIdComparator();
            case FULL_NAME:
                return new StudentFullNameComparator();
            case CURRENT_COURSE_NUMBER:
                return new StudentCurrentCourseComparator();
            case AVG_EXAM_SCORE:
                return new StudentAvgExamScoreComparator();
            default:
                return new StudentFullNameComparator();
        }
    }
}
