public class Count {

    private String age;

    public Count(String age){
        this.age = age;
        this.count(age);
    }

    public void count(String age){
        System.out.println("Counting the countless" + age);
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
