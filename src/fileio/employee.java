package fileio;
import java.io.Serializable;
public class employee implements Serializable{
        private int id;
        private String name;
        private int salary;
        public employee(int id, String name, int salary) {
            super();
            this.id = id;
            this.name = name;
            this.salary = salary;
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
        public int getSalary() {
            return salary;
        }
        public void setSalary(int salary) {
            this.salary = salary;
        }

    }
