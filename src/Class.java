class Classes {
    private String name;
    private int marks;
    private String grade;
    private int age;
    private String loc;

    Classes(String name, int marks, String grade, int age,String loc) {
        setName(name);
        setMarks(marks);
        this.grade = grade;
        this.age = age;
        this.loc = loc;
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    void setMarks(int marks){
        if (marks >=0 && marks <=100) {
            this.marks = marks;
        }
    }

    int getMarks(){
        return marks;
    }

    String[] getStudentDetails(){
//       System.out.println( name+ " " + marks + " " + grade + " " + age);
        String[] SD = {name,String.valueOf(marks),grade,String.valueOf(age),loc};
        return SD;
//       return  ("Student details: \n Name:"+ name+ " \n Marks: " + String.valueOf(marks) + " \n Grade:  " + grade + " \n Age:  " + age);

    }
}

public class Class {
    public static void main (String[] args){

        Classes Details = new Classes ("Yash",500,"9th",14, "Aus");

//        System.out.println(Details.getName());
//        System.out.println(Details.getMarks());
        String[] MainSD = Details.getStudentDetails();
        for (int i=0;i<= MainSD.length-1;i++) {
            System.out.println(MainSD[i]);
        }

    }
}