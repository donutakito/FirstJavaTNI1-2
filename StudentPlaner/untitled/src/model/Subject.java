package model;

public class Subject {

        // 1. Attributes (ข้อมูลที่เราต้องการเก็บ)
        private String code;   // รหัสวิชา
        private String name;   // ชื่อวิชา
        private String teacher;  // อาจารย์ผู้สอน
        private String time;   // วัน/เวลาเรียน

        // 2. Constructor
        public Subject(String code, String name, String teacher, String time) {
            this.code = code;
            this.name = name;
            this.teacher = teacher;
            this.time = time;
        }

        public String getCode() { return code; }
        public String getName() { return name; }
        public String getTeacher() { return teacher; }
        public String getTime() { return time; }


        public void setCode(String code) { this.code = code; }
        public void setName(String name) { this.name = name; }
        public void setTeacher(String teacher) { this.teacher = teacher; }
        public void setTime(String time) { this.time = time; }
    }

