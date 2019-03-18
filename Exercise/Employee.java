class Employee{
    private String name;
    private int StartYear;
    private double Salary;
    Employee(String name,int StartYear,double Salary){
        this.name=name;
        this.StartYear=StartYear;
        this.Salary=Salary;

    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return Salary;
    }
    public int getStartYear(){
        return StartYear;
    }

}
class Salesman extends Employee{
    private double sale;
    private double commRate;
    Salesman(String name,int StartYear,double Salary,double sale,double commRate){
        super(name, StartYear, Salary);
        this.sale=sale;
        this.commRate=commRate;
    }
    public double getSalary(){
        return super.getSalary()+(commRate*sale);
    }

}
class Secretary extends Employee{
    private int typing;
    Secretary(String name,int StartYear,double Salary,int typing){
        super(name ,StartYear,Salary);
        this.typing=typing;
    }
    public int getTyping(){
        return typing;
    }
}