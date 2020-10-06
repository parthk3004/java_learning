package inheritance;

class check {

        int id = (int) ( 10);
        private String name = "parth";
        public int age = 22;
        protected double marks = 770;
        double totalMarks = 1000.00;

        public void disp() {
            System.out.println(name + "'s id is " + id + " and age is " + age + " with a total marks of " + marks + " out of " + totalMarks + ".");
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }
