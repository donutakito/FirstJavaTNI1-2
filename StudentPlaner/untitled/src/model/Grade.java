package model;

import java.util.ArrayList;

public class Grade{
    // 1: ข้อมูลตั้งต้นจากหน้า UI (ที่ User ต้องกรอกตอนแรก)
    private double currentGpax;     // เกรดเฉลี่ยสะสมปัจจุบัน
    private int currentCredits;     // หน่วยกิตสะสมทั้งหมดที่มี

    //  2: รายการวิชาที่จะเอามาจำลอง
    //  ArrayListเพื่อเก็บหลายๆ วิชาที่ User จะลองกรอกในเทอมนี้
    private ArrayList<SimulatedSubject> simulatedSubjects;

    public Grade(double currentGpax, int currentCredits) {
        this.currentGpax = currentGpax;
        this.currentCredits = currentCredits;
        this.simulatedSubjects = new ArrayList<>();
    }


    public double getCurrentGpax() { return currentGpax; }
    public int getCurrentCredits() { return currentCredits; }
    public ArrayList<SimulatedSubject> getSimulatedSubjects() { return simulatedSubjects; }

    // คลาสไว้ สำหรับเก็บข้อมูลวิชาที่จำลอง
    public static class SimulatedSubject {
        private String name;
        private int credit;
        private double gradePoint; // เช่น A=4.0, B+=3.5

        public SimulatedSubject(String name, int credit, double gradePoint) {
            this.name = name;
            this.credit = credit;
            this.gradePoint = gradePoint;
        }

        public int getCredit() { return credit; }
        public double getGradePoint() { return gradePoint; }
    }
}