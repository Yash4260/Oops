class Calculations {
    private String name;
    private double basicSalary;
    private double bonus;
    private double taxPercent;

    Calculations (String name, double basicSalary, double bonus, double taxPercent){
        setName(name);
        setBasicSalary(basicSalary);
        setBonus(bonus);
        setTaxPercent(taxPercent);
    }
    void setName (String name){
        this.name = name;
    }
//
//    String getName(){
//        return name;
//    }

    void setBasicSalary(double basicSalary){
        if (basicSalary>0){
            this.basicSalary=basicSalary;
        }
    }

    double getBasicSalary(){
        return basicSalary;
    }

    void setBonus(double bonus){
        if ((bonus>=0) && (bonus<=(0.5*basicSalary))){
            this.bonus= bonus;
        }
    }

    void setTaxPercent(double taxPercent){
        if (taxPercent>=0 && taxPercent<=0.3) {
            this.taxPercent = taxPercent;
        }
    }

    double calculateNetSalary(){
        double tax = (basicSalary+bonus) * taxPercent;
        return basicSalary + bonus - tax;
    }

    String[] displayDetails(){
        String[] EmpSalary = {name,String.valueOf(calculateNetSalary())};
//        System.out.println(EmpSalary);
        return EmpSalary;
    }
}

public class Calculation {
    public static void main (String[] args) {

        Calculations Emp1 = new Calculations("Yash",100000,2500,0.2);
        Calculations Emp2 = new Calculations("Monica", 100000,5000,0.3);
        String[] displayDetails = Emp1.displayDetails();
        String[] displayDetails1 = Emp2.displayDetails();

        System.out.println("Employee " + displayDetails[0] + " Net Salary: " + displayDetails[1]);
        //System.out.println("Net Salary: " + displayDetails[1]);

        System.out.println("Employee " + displayDetails1[0] + " Net Salary: " + displayDetails1[1]);
       // System.out.println();

    }
}
