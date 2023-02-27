package model;

import com.google.gson.annotations.SerializedName;

public class Student {

    @SerializedName("studentName")
    private String fullName;
    @SerializedName("idUniversity")
    private String universityId;
    @SerializedName("courseNumber")
    private int currentCourseNumber;
    @SerializedName("savgScore")
    private float avgExamScore;

    public Student(String fullName, String universityId, int currentCourseNumber, float avgExamScore) {
        this.fullName = fullName;
        this.universityId = universityId;
        this.currentCourseNumber = currentCourseNumber;
        this.avgExamScore = avgExamScore;
    }

    public Student() {

    }

    /*public void setFullName(String fullName) {
        this.fullName = fullName;
    }*/
    public Student setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public Student setUniversityId(String universityId) {
        this.universityId = universityId;
        return this;
    }

    public Student setCurrentCourseNumber(int currentCourseNumber) {
        this.currentCourseNumber = currentCourseNumber;
        return this;
    }

    public Student setAvgExamScore(float avgExamScore) {
        this.avgExamScore = avgExamScore;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public String getUniversityId() {
        return universityId;
    }

    public int getCurrentCourseNumber() {
        return currentCourseNumber;
    }

    public float getAvgExamScore() {
        return avgExamScore;
    }

    public String toString(){
        // return "ФИО "+fullName+";"+"идентификатор университета "+universityId+";"+"номер курса "+currentCourseNumber+";"+"средний балл "+avgExamScore;
        return String.format("fullName = %s, universityId = %s, currentCourseNumber = %s, avgExamScore = %s",
                this.fullName,
                this.universityId,
                this.currentCourseNumber,
                this.avgExamScore);
    }
}
