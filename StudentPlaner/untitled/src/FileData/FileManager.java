package FileData;

import model.Subject;
import model.Homework;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileManager {

    private static final String SUBJECT_FILE = "subjects.txt";
    private static final String HOMEWORK_FILE = "homeworks.txt";
    private static final String GRADE_FILE = "grades.txt";
    // ่วนของจัดการไฟล์วิชาเรียน (Subject)
    public static void saveSubjects(ArrayList<Subject> subjects) {
        try (PrintWriter out = new PrintWriter(new FileWriter(SUBJECT_FILE))) {
            for (Subject s : subjects) {
                // ใช้เครื่องหมาย|แบ่งข้อมูลแต่ละส่วนใน1บรรทัด
                out.println(s.getCode() + "|" + s.getName() + "|" + s.getTeacher() + "|" + s.getTime());
            }
        } catch (IOException e) {
            System.err.println("ไม่สามารถบันทึกไฟล์วิชาเรียนได้: " + e.getMessage());
        }
    }

    public static ArrayList<Subject> loadSubjects() {
        ArrayList<Subject> list = new ArrayList<>();
        File file = new File(SUBJECT_FILE);
        if (!file.exists()) return list;

        try (Scanner reader = new Scanner(file)) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] data = line.split("\\|"); // แยกข้อมูลด้วย |
                if (data.length == 4) {
                    list.add(new Subject(data[0], data[1], data[2], data[3]));
                }
            }
        } catch (FileNotFoundException e) {

        }
        return list;
    }

    // สไฟล์การบ้าน (Homework)
    public static void saveHomework(ArrayList<Homework> homeworks) {
        try (PrintWriter out = new PrintWriter(new FileWriter(HOMEWORK_FILE))) {
            for (Homework h : homeworks) {
                out.println(h.getSubject() + "|" + h.getTask() + "|" + h.getDeadline() + "|" + h.getStatus());
            }
        } catch (IOException e) {
            System.err.println("ไม่สามารถบันทึกไฟล์การบ้านได้: " + e.getMessage());
        }
    }

    public static ArrayList<Homework> loadHomework() {
        ArrayList<Homework> list = new ArrayList<>();
        File file = new File(HOMEWORK_FILE);
        if (!file.exists()) return list;

        try (Scanner reader = new Scanner(file)) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] data = line.split("\\|");
                if (data.length == 4) {
                    list.add(new Homework(data[0], data[1], data[2], data[3]));
                }
            }
        } catch (FileNotFoundException e) {
            // ข้ามไปถ้าไม่พบไฟล์
        }
        return list;
    }

    // Method สำหรับบันทึกเกรด
    public static void saveBaseGrade(double gpax, int credits) {
        try (PrintWriter out = new PrintWriter(new FileWriter(GRADE_FILE))) {
            out.println(gpax + "|" + credits);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method สำหรับโหลดเกรดสะสมกลับมา
    public static double[] loadBaseGrade() {
        File file = new File(GRADE_FILE);
        if (!file.exists()) return new double[]{0.0, 0.0};
        try (Scanner reader = new Scanner(file)) {
            if (reader.hasNextLine()) {
                String[] data = reader.nextLine().split("\\|");
                if (data.length == 2) {
                    return new double[]{Double.parseDouble(data[0]), Double.parseDouble(data[1])};
                }
            }
        } catch (Exception e) { }
        return new double[]{0.0, 0.0};
    }
}