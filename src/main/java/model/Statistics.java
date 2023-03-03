package model;
import enam.StudyProfile;

public class Statistics {
    private StudyProfile profile;
    private float avgExamScore;
    private int countOfStudents;
    private int countOfUniversities;
    private String universityNames;

    public Statistics() {
    }

    public StudyProfile getProfile() {
        return profile;
    }

    public Statistics setProfile(StudyProfile profile) {
        this.profile = profile;
        return this;
    }

    public float getAvgExamScore() {
        return avgExamScore;
    }

    public Statistics setAvgExamScore(float avgExamScore) {
        this.avgExamScore = avgExamScore;
        return this;
    }

    public int getCountOfStudents() {
        return countOfStudents;
    }

    public Statistics setCountOfStudents(int numberOfStudents) {
        this.countOfStudents = numberOfStudents;
        return this;
    }

    public int getCountOfUniversities() {
        return countOfUniversities;
    }

    public Statistics setCountOfUniversities(int numberOfUniversities) {
        this.countOfUniversities = numberOfUniversities;
        return this;
    }

    public String getUniversityNames() {
        return universityNames;
    }

    public Statistics setUniversityNames(String universityNames) {
        this.universityNames = universityNames;
        return this;
    }
}
