package davis.christin;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("First Name: %s, Last Name: %s", firstName, lastName));
        return builder.toString();
    }
}
