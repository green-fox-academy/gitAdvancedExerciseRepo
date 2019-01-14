public class Count {

    private String age;

    public Count(String age){
        this.age = age;
        this.count();
    }

    public void count(){
        System.out.println(this.age);
    }

}
