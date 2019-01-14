public class Count {

    private String age;

    public Count(String age){
        this.age = age;
        this.count(age, "much wow");
    }

    public void count(String age, String other_stuff){
        System.out.println(age + " " + other_stuff);
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {    
        this.age = age;
    }
}
