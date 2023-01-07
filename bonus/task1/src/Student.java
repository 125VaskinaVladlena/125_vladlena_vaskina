public class Student {
    private String name;
    private int age;
    private String group;
    private double meanScore;

    public Student(String name, int age, String group, double meanScore) {
        this.name = name;
        this.age = age;
        this.group = group;
        this.meanScore = meanScore;
    }

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

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public double getMeanScore() {
        return meanScore;
    }

    public void setMeanScore(double meanScore) {
        this.meanScore = meanScore;
    }
}
