package lab1;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private LevelOfDegree levelOfDegree;
    private HumanInfo info;
    private List<Exam> exams;

    public Student() {
    }

    public Student(LevelOfDegree levelOfDegree, HumanInfo info) {
        this.levelOfDegree = levelOfDegree;
        this.info = info;
        this.exams = new ArrayList<>();
    }

    public void printShortInfo() {
        double sum = 0;
        for (Exam exam : exams) {
            sum += exam.getGrade();
        }
        double average = sum / exams.size();
        System.out.printf("Short Student info. Name: %s, Surname: %s, Average Grade: %s%n",
                info.getName(), info.getSurname(), average);
    }

    public void printInfo() {
        System.out.printf("Student Info. levelOfDegree: %s%n", levelOfDegree);
        System.out.println("HumanInfo of student: ");
        info.printInfo();
        System.out.println();

        System.out.println("Exam info of student: ");
        for (Exam exam : exams) {
            exam.printInfo();
        }
        System.out.println("______________");
    }

    public void addExam(Exam exam) {
        exams.add(exam);
    }

    public List<Exam> getExams() {
        return exams;
    }

    public LevelOfDegree getLevelOfDegree() {
        return levelOfDegree;
    }

    public void setLevelOfDegree(LevelOfDegree levelOfDegree) {
        this.levelOfDegree = levelOfDegree;
    }

    public HumanInfo getInfo() {
        return info;
    }

    public void setInfo(HumanInfo info) {
        this.info = info;
    }
}
