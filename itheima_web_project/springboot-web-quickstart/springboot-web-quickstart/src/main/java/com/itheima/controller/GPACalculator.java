import java.util.ArrayList;
import java.util.List;

class Course {
    String name;
    double credits;
    double gpa;
    double grade;

    Course(String name, double credits, double gpa, double grade) {
        this.name = name;
        this.credits = credits;
        this.gpa = gpa;
        this.grade = grade;
    }
}

public class GPACalculator {
    public static void main(String[] args) {
        List<Course> courses = new ArrayList<>();
        // 2019-2020-1
        courses.add(new Course("大学语文", 1, 3.4, 84));
        courses.add(new Course("体育与健康Ⅰ", 1, 2.6, 76));
        courses.add(new Course("中国近现代史纲要", 3, 3.5, 85));
        courses.add(new Course("大学外语Ⅰ", 3, 1.4, 64));
        courses.add(new Course("军事理论教育（实践+理论）", 2, 3.1, 81));
        courses.add(new Course("大学生心理健康教育", 2, 3.1, 81));
        courses.add(new Course("高等数学A类（上）", 4, 2.8, 78));
        courses.add(new Course("线性代数A类", 3, 2.7, 77));
        courses.add(new Course("Web前端设计", 3, 3.5, 85));
        courses.add(new Course("计算思维", 2, 3, 80));
        courses.add(new Course("Web前端设计技能实训", 1, 3.8, 88));
        courses.add(new Course("计算机基本技能", 1, 4.1, 91));

        // 2019-2020-2
        courses.add(new Course("体育与健康Ⅱ", 1, 3.3, 83));
        courses.add(new Course("思想道德修养与法律基础", 3, 4.1, 91));
        courses.add(new Course("形势与政策Ⅰ", 1, 2.5, 75));
        courses.add(new Course("大学外语Ⅱ", 3, 3.2, 82));
        courses.add(new Course("职业生涯规划与就业指导Ⅰ", 0.5, 4.8, 98.42));
        courses.add(new Course("大学生创新创业", 1, 3.5, 85));
        courses.add(new Course("高等数学A类（下）", 6, 3.1, 81));
        courses.add(new Course("大学物理", 5, 2, 70));
        courses.add(new Course("电子技术基础", 3, 2.8, 78));
        courses.add(new Course("高级语言程序设计（C语言）", 4, 2.8, 78));
        courses.add(new Course("离散数学", 4, 2.9, 79));
        courses.add(new Course("程序设计技能实训I", 1, 3.6, 86));
        courses.add(new Course("航空与航天", 2, 4.1, 91.54));
        courses.add(new Course("舌尖上的营养学", 2, 3.6, 86.68));

        // 2020-2021-1
        courses.add(new Course("大学外语Ⅲ", 3, 2.3, 73));
        courses.add(new Course("计算机组成原理", 5, 1.8, 68));
        courses.add(new Course("数据结构", 4, 2.8, 78));
        courses.add(new Course("数据库设计", 2, 3, 80));
        courses.add(new Course("数据库系统原理", 4, 2.3, 73));
        courses.add(new Course("程序设计技能实训Ⅱ", 1, 4.3, 93));
        courses.add(new Course("概率论与数理统计A类", 4, 4.3, 93));
        courses.add(new Course("Java面向对象程序设计", 3, 1.1, 61));
        courses.add(new Course("毛泽东思想和中国特色社会主义理论体系概论", 3, 3.6, 86));

        // 2020-2021-2
        courses.add(new Course("体育与健康Ⅲ", 1, 4.5, 95));
        courses.add(new Course("马克思主义基本原理概论", 3, 2.7, 77));
        courses.add(new Course("形势与政策Ⅱ", 1, 3.6, 86));
        courses.add(new Course("大学外语Ⅳ", 3, 2.7, 77));
        courses.add(new Course("文献检索", 1, 3.9, 89));
        courses.add(new Course("Java Web应用开发", 3, 3.5, 85));
        courses.add(new Course("XML基础", 3, 2.2, 72));
        courses.add(new Course("计算机网络原理", 3, 4.1, 91));
        courses.add(new Course("面向对象分析与设计", 2, 2.4, 74));
        courses.add(new Course("Java Web应用开发技能实训", 1, 4.1, 91));

        // 其他学期
        courses.add(new Course("职业生涯规划与就业指导Ⅱ", 0.5, 4.7, 97));
        courses.add(new Course("JAVA EE企业级应用开发", 4, 2.9, 79));
        courses.add(new Course("大数据基础", 3, 2.6, 76));
        courses.add(new Course("计算机操作系统", 4, 3.1, 81));
        courses.add(new Course("软件过程与项目管理", 3, 1.4, 64));
        courses.add(new Course("算法分析与设计", 3, 2.1, 71));
        courses.add(new Course("企业级应用开发技能实训", 1, 3.8, 88));
        courses.add(new Course("Python数据分析与可视化", 2, 4.4, 94));

        double totalCredits = 0;
        double totalPoints = 0;

        for (Course course : courses) {
            totalCredits += course.credits;
            totalPoints += course.credits * course.gpa;
        }

        double gpa = totalPoints / totalCredits;
        System.out.printf("GPA: %.2f\n", gpa);
    }
}
