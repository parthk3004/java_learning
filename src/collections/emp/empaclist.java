package collections.emp;
import java.util.*;
public class empaclist {
private Map<emp,MMASavingAcc> list;

        public empaclist() {
            list=new HashMap<emp,MMASavingAcc>();
        }

        public void addEmpSavAcc(emp emp,MMASavingAcc save) {
            list.put(emp, save);
        }

        public Map<emp,MMASavingAcc> getList(){
            return list;
        }
    public int getSize() {
        return list.size();
    }
        public void display() {
            for(emp emp:list.keySet()) {
                System.out.println("emp details of "+emp.getemployeename());
                System.out.println("ID: "+emp.getempid()+", Desig: "+emp.getemployeedesignation());
                System.out.println("Account details of emp "+emp.getemployeename());
                System.out.println("ID: "+list.get(emp).getaccid()+", Balance: "+list.get(emp).getaccbalance());
            }
        }
    }