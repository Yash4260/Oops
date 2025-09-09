public class Person {
    private String gender;
    public int age;
    private String state;

    Person(String gender, int age, String state){
        this.gender=gender;
        this.age=age;
        this.state=state;
    }

    void setGender(String gender){
        this.gender=gender;
    }

    String getGender(){
        return gender;
    }

    void setAge(int age){
        this.age=age;
    }

    int getAge(){
        return age;
    }

    void setState(String state){
        this.state=state;
    }

    String getState(){
        return state;
    }

    void printDetails(){
        System.out.println("Gender: "+gender + "\nAge: "+age + "\nState:"+ state);
    }
}

class teacher extends Person{
    public String name;
    protected String subject;

    teacher(String gender, int age, String state, String name, String subject){
        super(gender,age,state);
        this.name=name;
        this.subject=subject;
    }

}

class principal extends teacher{
    public int exp;

    public principal(String gender, int age, String state, String name, String subject, int exp) {
        super(gender, age, state, name, subject);
        this.exp = exp;
    }
    // Method to print all details
    public void printDetails() {
        System.out.println("----- Principal Details -----");
        System.out.println("Name      : " + name);              // From Teacher (public)
        System.out.println("Subject   : " + subject);           // From Teacher (protected)
        System.out.println("Gender    : " + getGender());       // From Person (private + getter)
        System.out.println("State     : " + getState());        // From Person (private + getter)
        System.out.println("Age       : " + getAge());          // From Person (private + getter)
        System.out.println("Experience: " + exp + " years");  // Own variable
    }

}

class Example {
    public static void main(String[] args) {
        // Creating a Principal object
        principal p = new principal("F", 50, "Hyd", "Kristy", "Telugu", 25);

        // Accessing Person variables through getters
        System.out.println("Accessing Person variables:");
        System.out.println("Gender: " + p.getGender());
        System.out.println("State : " + p.getState());
        System.out.println("Age   : " + p.getAge());

        // Accessing Teacher variables directly
        System.out.println("\nAccessing Teacher variables:");
        System.out.println("Name   : " + p.name);     // public
        System.out.println("Subject: " + p.subject);  // protected

        // Accessing Principal variable directly
        System.out.println("\nAccessing Principal variable:");
        System.out.println("Experience: " + p.exp + " years");

        // Calling method to print all details
        System.out.println("\nCalling printDetails() method:");
        p.printDetails();

        teacher t1 = new teacher("M", 25, "TG", "KKK", "BIO");
        t1.printDetails();
    }
}

