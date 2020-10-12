package collections.carparking;
public class ownerdetails {
        private String owername;
        private String carmodel;
        private String carno;
        private int owermobileno;
        private String oweraddress;

        public ownerdetails(String owername, String carmodel, String carno, int owermobileno, String oweraddress) {
            super();
            this.owername = owername;
            this.carmodel = carmodel;
            this.carno = carno;
            this.owermobileno = owermobileno;
            this.oweraddress = oweraddress;
        }
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((carno == null) ? 0 : carno.hashCode());
            return result;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            ownerdetails other = (ownerdetails) obj;
            if (carno == null) {
                return other.carno == null;
            } else if (!carno.equals(other.carno))
                return false;
            return true;
        }

        public String getowername() {
            return owername;
        }

        public void setowername(String owername) {
            this.owername = owername;
        }

        public String getcarmodel() {
            return carmodel;
        }

        public void setcarmodel(String carmodel) {
            this.carmodel = carmodel;
        }

        public String getcarno() {
            return carno;
        }

        public void setcarno(String carno) {
            this.carno = carno;
        }

        public int getowermobileno() {
            return owermobileno;
        }

        public void setowermobileno(int owermobileno) {
            this.owermobileno = owermobileno;
        }

        public String getoweraddress() {
            return oweraddress;
        }

        public void setoweraddress(String oweraddress) {
            this.oweraddress = oweraddress;
        }
    }