package designPatterns.prototypeAndRegistry;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        StudentRegistry studentRegistry = new StudentRegistry();

        Student aprilBatchStudent = new Student();
        aprilBatchStudent.setAvgBatchPSP(80);
        aprilBatchStudent.setBatchName("April-LLD");
        aprilBatchStudent.setYearOfEnrollment(2022);
        studentRegistry.save(aprilBatchStudent);


        Student aprilBatchStudent1 = aprilBatchStudent.clone();
        Student aprilBatchStudent2 = aprilBatchStudent.clone();
        Student aprilBatchStudent3 = aprilBatchStudent.clone();


        Student mayBatchStudent = new Student();
        mayBatchStudent.setAvgBatchPSP(75);
        mayBatchStudent.setBatchName("May-LLD");
        mayBatchStudent.setYearOfEnrollment(2022);
        studentRegistry.save(mayBatchStudent);

        Student janBatchStudent = new Student();
        janBatchStudent.setAvgBatchPSP(85);
        janBatchStudent.setBatchName("January-LLD");
        janBatchStudent.setYearOfEnrollment(2022);
        studentRegistry.save(janBatchStudent);


        Student aprilBatchStudent4 = studentRegistry.get("April-LLD").clone();
        Student mayBatchStudent1 = studentRegistry.get("May-LLD").clone();
        Student janBatchStudent1 = studentRegistry.get("January-LLD").clone();

        IntelligentStudent scalerIntelligentStudent = new IntelligentStudent();
        scalerIntelligentStudent.setBatchName("TntelligentGroup");
        scalerIntelligentStudent.setAvgBatchPSP(100);
        scalerIntelligentStudent.setYearOfEnrollment(2020);
        scalerIntelligentStudent.setIq(100);

        IntelligentStudent scalerIntelligentStudent1 = scalerIntelligentStudent.clone();

    }
}
