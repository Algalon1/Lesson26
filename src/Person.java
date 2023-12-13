public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    private String info(){
        return String.format("%s %s",this.firstName,this.lastName);
    }


}
