package uiApp;

import model.Subject;
import model.Homework;
import FileData.FileManager;

import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.util.ArrayList;
import java.util.Enumeration;

public class UImain extends JFrame {
    private CardLayout cardLayout = new CardLayout();
    private JPanel cardPanel = new JPanel(cardLayout);

    // Models สำหรับตารางต่างๆ
    private DefaultTableModel scheduleModel, homeworkModel, gradeSimModel;

    // พื้นที่แสดงผลหน้าหลัก (Dashboard)
    private JTextArea mainScheduleArea, mainHomeworkArea;

    // รายการข้อมูล
    private ArrayList<Subject> subjectList;
    private ArrayList<Homework> homeworkList;

    // การตกแต่งสี
    private Color bgBlue = new Color(225, 245, 255);
    private Color primaryColor = new Color(0, 102, 204);

    public UImain() {
        setTitle("จัดการตารางชีวิตของศิษย์พี่ใหญ่");
        setSize(950, 750);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // โหลดข้อมูลจากไฟล์ .txt
        subjectList = FileManager.loadSubjects();
        homeworkList = FileManager.loadHomework();

        initTableModels();

        cardPanel.add(createMainPanel(), "Main");
        cardPanel.add(createSchedulePanel(), "Schedule");
        cardPanel.add(createHomeworkPanel(), "Homework");
        cardPanel.add(createGradePanel(), "Grade");

        add(cardPanel);
        refreshDisplay();
    }

    private void initTableModels() {
        scheduleModel = new DefaultTableModel(new String[]{"รหัสวิชา", "ชื่อวิชา", "อาจารย์", "เวลาเรียน"}, 0);
        homeworkModel = new DefaultTableModel(new String[]{"วิชา", "งาน", "กำหนดส่ง", "สถานะ"}, 0);
        gradeSimModel = new DefaultTableModel(new String[]{"วิชา", "หน่วยกิต", "เกรดที่คาดหวัง"}, 0);
    }

    // --- หน้าหลัก (Dashboard) ---
    private JPanel createMainPanel() {
        JPanel panel = new JPanel(new BorderLayout(15, 15));
        panel.setBackground(bgBlue);
        panel.setBorder(new EmptyBorder(20, 20, 20, 20));

        JLabel head = new JLabel("จัดการตารางชีวิตของศิษย์พี่ใหญ่", JLabel.CENTER);
        head.setFont(new Font("Tahoma", Font.BOLD, 22));
        panel.add(head, BorderLayout.NORTH);

        JPanel displayPanel = new JPanel(new GridLayout(2, 1, 15, 15));
        displayPanel.setBackground(bgBlue);

        mainScheduleArea = createStyledTextArea();
        JPanel p1 = createCardPanel("📚 รายวิชาที่ลงทะเบียน");
        p1.add(new JScrollPane(mainScheduleArea));

        mainHomeworkArea = createStyledTextArea();
        JPanel p2 = createCardPanel("📝 รายการการบ้าน");
        p2.add(new JScrollPane(mainHomeworkArea));

        displayPanel.add(p1); displayPanel.add(p2);

        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        btnPanel.setBackground(bgBlue);
        JButton b1 = createStyledButton("จัดการตารางเรียน");
        JButton b2 = createStyledButton("การบ้าน");
        JButton b3 = createStyledButton("คำนวณเกรด (GPAX)");

        b1.addActionListener(e -> cardLayout.show(cardPanel, "Schedule"));
        b2.addActionListener(e -> cardLayout.show(cardPanel, "Homework"));
        b3.addActionListener(e -> cardLayout.show(cardPanel, "Grade"));

        btnPanel.add(b1); btnPanel.add(b2); btnPanel.add(b3);
        panel.add(displayPanel, BorderLayout.CENTER);
        panel.add(btnPanel, BorderLayout.SOUTH);
        return panel;
    }

    // --- [2] หน้าจัดการตารางเรียน ---
    private JPanel createSchedulePanel() {
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBackground(bgBlue);
        panel.setBorder(new EmptyBorder(15, 15, 15, 15));

        JTable table = new JTable(scheduleModel);
        panel.add(new JScrollPane(table), BorderLayout.CENTER);

        JPanel bp = new JPanel();
        bp.setBackground(bgBlue);
        JButton btnAdd = createStyledButton("+ เพิ่มวิชา");
        JButton btnDel = createStyledButton("- ลบรหัสวิชา");
        JButton btnBack = createStyledButton("< กลับหน้าหลัก");

        btnAdd.addActionListener(e -> {
            String c = JOptionPane.showInputDialog("รหัสวิชา (ตัวอย่าง: INT-108):");
            String n = JOptionPane.showInputDialog("ชื่อวิชา (ตัวอย่าง: HUM SHONTHEN):");
            String t = JOptionPane.showInputDialog("อาจารย์ (ตัวอย่าง: PORAWAT):");
            String tm = JOptionPane.showInputDialog("เวลาเรียน (ตัวอย่าง: MON 12:00):");
            if (c != null && !c.isEmpty()) {
                subjectList.add(new Subject(c.toUpperCase().trim(), n.toUpperCase().trim(), t.toUpperCase().trim(), tm.toUpperCase().trim()));
                FileManager.saveSubjects(subjectList);
                refreshDisplay();
                JOptionPane.showMessageDialog(this, "บันทึกข้อมูลวิชาเรียนเรียบร้อยแล้วครับศิษย์พี่ใหญ่!", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        btnDel.addActionListener(e -> {
            String code = JOptionPane.showInputDialog("ระบุรหัสวิชาที่ต้องการลบ (ตัวอย่าง: HUM-102):");
            if (code != null && !code.trim().isEmpty()) {
                boolean found = subjectList.removeIf(s -> s.getCode().equalsIgnoreCase(code.trim()));
                if (found) {
                    FileManager.saveSubjects(subjectList);
                    refreshDisplay();
                    JOptionPane.showMessageDialog(this, "ลบข้อมูลวิชา " + code.toUpperCase() + " สำเร็จ!", "Deleted", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "ไม่พบรหัสวิชา: " + code.toUpperCase() + " ในระบบ", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnBack.addActionListener(e -> cardLayout.show(cardPanel, "Main"));
        bp.add(btnAdd); bp.add(btnDel); bp.add(btnBack);
        panel.add(bp, BorderLayout.SOUTH);
        return panel;
    }

    // --- [3] หน้าจัดการการบ้าน ---
    private JPanel createHomeworkPanel() {
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBackground(bgBlue);
        panel.setBorder(new EmptyBorder(15, 15, 15, 15));

        panel.add(new JScrollPane(new JTable(homeworkModel)), BorderLayout.CENTER);

        JPanel bp = new JPanel();
        bp.setBackground(bgBlue);
        JButton btnAdd = createStyledButton("+ เพิ่มการบ้าน");
        JButton btnDel = createStyledButton("- ลบการบ้าน");
        JButton btnBack = createStyledButton("< กลับหน้าหลัก");

        btnAdd.addActionListener(e -> {
            String s = JOptionPane.showInputDialog("วิชา (ตัวอย่าง: INT-108):");
            String t = JOptionPane.showInputDialog("งาน (ตัวอย่าง: LAB 05):");
            String d = JOptionPane.showInputDialog("กำหนดส่ง (ตัวอย่าง: 15 MAR):");
            if (s != null && !s.isEmpty()) {
                homeworkList.add(new Homework(s.toUpperCase().trim(), t.toUpperCase().trim(), d.toUpperCase().trim(), "PENDING"));
                FileManager.saveHomework(homeworkList);
                refreshDisplay();
                JOptionPane.showMessageDialog(this, "เพิ่มรายการการบ้านใหม่เข้าสู่ระบบแล้ว!", "Success", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        btnDel.addActionListener(e -> {
            String target = JOptionPane.showInputDialog("ระบุชื่อวิชาที่ต้องการลบการบ้าน (ตัวอย่าง: HUM-102):");
            if (target != null && !target.trim().isEmpty()) {
                boolean found = homeworkList.removeIf(h -> h.getSubject().equalsIgnoreCase(target.trim()));
                if (found) {
                    FileManager.saveHomework(homeworkList);
                    refreshDisplay();
                    JOptionPane.showMessageDialog(this, "ลบรายการการบ้านของวิชา " + target.toUpperCase() + " แล้ว", "Deleted", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "ไม่พบข้อมูลการบ้านของวิชา: " + target.toUpperCase(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnBack.addActionListener(e -> cardLayout.show(cardPanel, "Main"));
        bp.add(btnAdd); bp.add(btnDel); bp.add(btnBack);
        panel.add(bp, BorderLayout.SOUTH);
        return panel;
    }

    // --- [4] หน้าคำนวณเกรด ---
    private JPanel createGradePanel() {
        JPanel panel = new JPanel(new BorderLayout(15, 15));
        panel.setBackground(bgBlue);
        panel.setBorder(new EmptyBorder(20, 20, 20, 20));

        double[] savedGrades = FileManager.loadBaseGrade();

        JPanel inputTop = new JPanel(new GridLayout(2, 2, 10, 10));
        inputTop.setBackground(Color.WHITE);
        inputTop.setBorder(new TitledBorder("1. ข้อมูลเกรดสะสม (GPAX ปัจจุบัน)"));

        JTextField txtCurGPA = new JTextField(String.valueOf(savedGrades[0]));
        JTextField txtCurCRD = new JTextField(String.valueOf((int)savedGrades[1]));
        inputTop.add(new JLabel(" GPAX สะสมปัจจุบัน:")); inputTop.add(txtCurGPA);
        inputTop.add(new JLabel(" หน่วยกิตสะสมรวม:")); inputTop.add(txtCurCRD);

        JPanel midPanel = new JPanel(new BorderLayout());
        midPanel.setBorder(new TitledBorder("2. รายวิชาที่จำลองในเทอมนี้"));
        midPanel.add(new JScrollPane(new JTable(gradeSimModel)), BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel(new BorderLayout());
        JLabel lblResult = new JLabel("Total GPAX: ---", JLabel.CENTER);
        lblResult.setFont(new Font("Tahoma", Font.BOLD, 26));
        lblResult.setForeground(primaryColor);

        JPanel btnBox = new JPanel();
        btnBox.setBackground(bgBlue);
        JButton btnAddRow = createStyledButton("+ เพิ่มวิชาจำลอง");
        JButton btnDelRow = createStyledButton("- ลบวิชาจำลอง");
        JButton btnCalc = createStyledButton("🧮 คำนวณและบันทึก");
        JButton btnBack = createStyledButton("< กลับ");

        btnAddRow.addActionListener(e -> {
            String name = JOptionPane.showInputDialog("ชื่อวิชาที่จำลอง (ตัวอย่าง: INT-108):");
            if (name != null && !name.trim().isEmpty()) {
                String creditStr = JOptionPane.showInputDialog("หน่วยกิต (ตัวอย่าง: 3):");
                String gradeStr = JOptionPane.showInputDialog("เกรดที่คาดหวัง (A, B+, B...):");
                if (creditStr != null && gradeStr != null) {
                    gradeSimModel.addRow(new Object[]{name.toUpperCase().trim(), creditStr.trim(), gradeStr.toUpperCase().trim()});
                }
            }
        });

        btnDelRow.addActionListener(e -> {
            String target = JOptionPane.showInputDialog("ระบุชื่อวิชาที่ต้องการลบ (ตัวอย่าง: HUM-102):");
            if (target != null && !target.trim().isEmpty()) {
                boolean found = false;
                for (int i = 0; i < gradeSimModel.getRowCount(); i++) {
                    if (gradeSimModel.getValueAt(i, 0).toString().equalsIgnoreCase(target.trim())) {
                        gradeSimModel.removeRow(i);
                        found = true; i--;
                    }
                }
                if (!found) JOptionPane.showMessageDialog(this, "ไม่พบวิชา: " + target.toUpperCase(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        btnCalc.addActionListener(e -> {
            try {
                double curG = Double.parseDouble(txtCurGPA.getText());
                int curC = Integer.parseInt(txtCurCRD.getText());
                FileManager.saveBaseGrade(curG, curC);

                double totalPoints = curG * curC;
                int totalCredits = curC;

                for (int i = 0; i < gradeSimModel.getRowCount(); i++) {
                    int c = Integer.parseInt(gradeSimModel.getValueAt(i, 1).toString());
                    double g = convertGradeToPoint(gradeSimModel.getValueAt(i, 2).toString());
                    totalPoints += (g * c);
                    totalCredits += c;
                }
                lblResult.setText(String.format("Total GPAX: %.2f", (totalPoints / totalCredits)));
                JOptionPane.showMessageDialog(this, "คำนวณและบันทึกข้อมูล GPAX เรียบร้อย!", "Calculated", JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "กรุณากรอกข้อมูลตัวเลขให้ถูกต้อง", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });

        btnBack.addActionListener(e -> cardLayout.show(cardPanel, "Main"));
        btnBox.add(btnAddRow); btnBox.add(btnDelRow); btnBox.add(btnCalc); btnBox.add(btnBack);

        bottomPanel.add(lblResult, BorderLayout.NORTH);
        bottomPanel.add(btnBox, BorderLayout.SOUTH);

        panel.add(inputTop, BorderLayout.NORTH);
        panel.add(midPanel, BorderLayout.CENTER);
        panel.add(bottomPanel, BorderLayout.SOUTH);
        return panel;
    }

    private double convertGradeToPoint(String grade) {
        switch (grade.toUpperCase().trim()) {
            case "A": return 4.0;
            case "B+": return 3.5;
            case "B": return 3.0;
            case "C+": return 2.5;
            case "C": return 2.0;
            case "D+": return 1.5;
            case "D": return 1.0;
            default: return 0.0;
        }
    }

    private void refreshDisplay() {
        scheduleModel.setRowCount(0);
        for (Subject s : subjectList) scheduleModel.addRow(new Object[]{s.getCode(), s.getName(), s.getTeacher(), s.getTime()});

        homeworkModel.setRowCount(0);
        for (Homework h : homeworkList) homeworkModel.addRow(new Object[]{h.getSubject(), h.getTask(), h.getDeadline(), h.getStatus()});

        StringBuilder schTxt = new StringBuilder();
        if (subjectList.isEmpty()) {
            schTxt.append("\n\n          📭 ยังไม่ได้ลงทะเบียนเรียนเลยนะศิษย์พี่ใหญ่!");
        } else {
            schTxt.append("\n");
            for (Subject s : subjectList) {
                schTxt.append("  ▶ [").append(s.getCode()).append("] ").append(s.getName())
                        .append("  |  👨‍🏫 ").append(s.getTeacher())
                        .append("  |  ⏰ ").append(s.getTime()).append("\n");
                schTxt.append("  ").append("-".repeat(85)).append("\n");
            }
        }
        mainScheduleArea.setText(schTxt.toString());

        StringBuilder hwTxt = new StringBuilder();
        if (homeworkList.isEmpty()) {
            hwTxt.append("\n\n          🎉 ไม่มีงานค้างเลย เก่งมากครับศิษย์พี่ใหญ่!");
        } else {
            hwTxt.append("\n");
            for (Homework h : homeworkList) {
                hwTxt.append("  📌 [").append(h.getSubject()).append("] ").append(h.getTask())
                        .append("  |  📅 ส่ง: ").append(h.getDeadline())
                        .append("  |  ⏳ ").append(h.getStatus()).append("\n");
                hwTxt.append("  ").append("-".repeat(85)).append("\n");
            }
        }
        mainHomeworkArea.setText(hwTxt.toString());
    }

    private JButton createStyledButton(String t) {
        JButton b = new JButton(t);
        b.setFont(new Font("Tahoma", Font.BOLD, 13));
        b.setBackground(Color.WHITE);
        return b;
    }

    private JTextArea createStyledTextArea() {
        JTextArea t = new JTextArea(); t.setEditable(false);
        t.setFont(new Font("Tahoma", Font.PLAIN, 15));
        return t;
    }

    private JPanel createCardPanel(String title) {
        JPanel p = new JPanel(new BorderLayout());
        p.setBackground(Color.WHITE);
        p.setBorder(new TitledBorder(new LineBorder(Color.LIGHT_GRAY), title));
        return p;
    }

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            FontUIResource f = new FontUIResource(new Font("Tahoma", Font.PLAIN, 14));
            Enumeration<Object> keys = UIManager.getDefaults().keys();
            while (keys.hasMoreElements()) {
                Object key = keys.nextElement();
                if (UIManager.get(key) instanceof FontUIResource) UIManager.put(key, f);
            }
        } catch (Exception e) { }
        SwingUtilities.invokeLater(() -> new UImain().setVisible(true));
    }
}