import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Empleado Paco=new Empleado(1,"Paco","Porras",1000);

        Paco.raiseSalary(12);

        System.out.println(Paco.toString());



        List<Empleado> array=new ArrayList<>();

        Empresa company=new Empresa();
        company.add(Paco);


    }
}
