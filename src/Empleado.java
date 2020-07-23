public class Empleado {
        /*Crear una clase Empleado que tenga:
        - Constructor (id: int, firstName, lastName, salary)
        - setters y getters
        - getAnnualSalary() (salary * 12)
        - raiseSalary(percent: int) (% sobre su salario)
        - toString() ["Employee[id=?,name=firstName, lastName....]"]*/

    private int id;
    private String name;
    private String lastName;
    private int salary;

    public Empleado(int id, String name, String lastName,int salary){
        this.id=id;
        this.name=name;
        this.lastName=lastName;
        this.salary=salary;
    }

    public int getAnnualSalary(){
        int salaryAnnual=salary*12;
        return salaryAnnual;
    }

    public int raiseSalary(int percent){
        salary=salary*percent/100+salary;
        return salary;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
