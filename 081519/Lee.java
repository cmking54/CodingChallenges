//imcomplete
class Lee {
    public static void main(String[] args) {
        Student[] students = new Student[]{new UndergraduateStudent(),
                                            new GraduateStudent(),
                                            new UndergraduateStudent()};
        int id = 0;
        for (Student s: students) {
            s.generateId(id++);
            System.out.println(s.getId());
        }
    }
}
    class Student {
        protected String id = "";
        void generateID(int id) { this.id = String.valueOf(id); }
        String getID() { return this.id; }
    }
    class GraduateStudent extends Student {
        void generateID(int id) { this.id = "g" + String.valueOf(id); }
    }
    class UndergraduateStudent extends Student {
        void generateID(int id) { this.id = "u" + String.valueOf(id); }
    }
