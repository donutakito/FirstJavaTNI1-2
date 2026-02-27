package model;

import java.io.Serializable;

public class Homework {
    private String subject;   // วิชา
    private String task;      // งานที่ต้องทำ
    private String deadline;  // โน้ตกำหนดส่ง
    private String status;

    // 2. Constructor
    public Homework(String subject, String task, String deadline, String status) {
        this.subject = subject;
        this.task = task;
        this.deadline = deadline;
        this.status = status;
    }

    // 3. Getter Methods
    public String getSubject() { return subject; }
    public String getTask() { return task; }
    public String getDeadline() { return deadline; }
    public String getStatus() { return status; }

    // 4. Setter Methods
    public void setSubject(String subject) { this.subject = subject; }
    public void setTask(String task) { this.task = task; }
    public void setDeadline(String deadline) { this.deadline = deadline; }
    public void setStatus(String status) { this.status = status; }
}