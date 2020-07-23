import java.util.ArrayList;
import java.util.List;

public class Empresa {

    List<Empleado> array=new ArrayList<>();

    public void add(Empleado empleado){
        empleado.setId(array.size()+1);
        array.add(empleado);
    }

    public void printAll(){
        for (Empleado empleado:array) {
            System.out.println(empleado);

        }

    }

    public int size(){
        return array.size();
    }

    public int totalSalary(){
        int total=0;
        for (Empleado empleado:array){
            total+=empleado.getSalary();
        }
        return total;
    }

    public void raiseGlobal(int percentage){
        for (Empleado empleado:array)
            empleado.raiseSalary(percentage);
    }
}
