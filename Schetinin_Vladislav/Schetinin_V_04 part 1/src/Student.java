class Student {
    private String name;
    private int age;
    private String major;

    // Конструктор
    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    // Геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    // Метод для вывода информации о студенте
    public void displayInfo() {
        System.out.println("Имя: " + name + ", Возраст: " + age + ", Специальность: " + major);
    }

    // Метод для нахождения самого старшего студента
    public static Student findOldestStudent(Student[] students) {
        Student oldest = students[0];
        for (Student student : students) {
            if (student.getAge() > oldest.getAge()) {
                oldest = student;
            }
        }
        return oldest;
    }

    public static void main(String[] args) {
        // Создание массива объектов класса Student
        Student[] students = {
                new Student("Иван", 21, "Компьютерные науки"),
                new Student("Анна", 22, "Экономика"),
                new Student("Сергей", 23, "Физика")
        };

        // Вывод информации о каждом студенте
        for (Student student : students) {
            student.displayInfo();
        }

        // Нахождение и вывод самого старшего студента
        Student oldestStudent = findOldestStudent(students);
        System.out.println("Самый старший студент: " + oldestStudent.getName() + ", Возраст: " + oldestStudent.getAge());
    }
}
