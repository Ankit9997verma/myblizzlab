package objectOPS;

import java.util.*;

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }
}

class DepartmentU {
    String deptName;

    DepartmentU(String deptName) {
        this.deptName = deptName;
    }
}

class University {
    String name;
    ArrayList<DepartmentU> departments = new ArrayList<>();
    ArrayList<Faculty> faculties = new ArrayList<>();

    University(String name) {
        this.name = name;
    }

    void addDepartment(DepartmentU d) {
        departments.add(d);
    }

    void addFaculty(Faculty f) {
        faculties.add(f);
    }

    void showUniversity() {
        System.out.println("University: " + name);
        System.out.println("Departments:");
        for (DepartmentU d : departments) {
            System.out.println("  " + d.deptName);
        }
        System.out.println("Faculties:");
        for (Faculty f : faculties) {
            System.out.println("  " + f.name);
        }
    }
}

public class problem5 {
    public static void main(String[] args) {
        University uni = new University("MIT");

        DepartmentU d1 = new DepartmentU("Computer Science");
        DepartmentU d2 = new DepartmentU("Physics");

        Faculty f1 = new Faculty("Dr. Alice");
        Faculty f2 = new Faculty("Dr. Bob");

        uni.addDepartment(d1);
        uni.addDepartment(d2);

        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.showUniversity();
    }
}
