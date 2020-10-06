package collections;

public class cellphone {
        private String company;
        private String model;
        private String description;
        private String operatingSystem;
        private String price;
        public cellphone(String company, String model, String description, String operatingSystem, String price) {
            super();
            this.company = company;
            this.model = model;
            this.description = description;
            this.operatingSystem = operatingSystem;
            this.price = price;
        }
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((company == null) ? 0 : company.hashCode());
            result = prime * result + ((model == null) ? 0 : model.hashCode());
            result = prime * result + ((operatingSystem == null) ? 0 : operatingSystem.hashCode());
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
            cellphone other = (cellphone) obj;
            if (company == null) {
                if (other.company != null)
                    return false;
            } else if (!company.equals(other.company))
                return false;
            if (model == null) {
                if (other.model != null)
                    return false;
            } else if (!model.equals(other.model))
                return false;
            if (operatingSystem == null) {
                if (other.operatingSystem != null)
                    return false;
            } else if (!operatingSystem.equals(other.operatingSystem))
                return false;
            return true;
        }
        public String getCompany() {
            return company;
        }
        public void setCompany(String company) {
            this.company = company;
        }
        public String getModel() {
            return model;
        }
        public void setModel(String model) {
            this.model = model;
        }
        public String getDescription() {
            return description;
        }
        public void setDescription(String description) {
            this.description = description;
        }
        public String getOperatingSystem() {
            return operatingSystem;
        }
        public void setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
        }
        public String getPrice() {
            return price;
        }
        public void setPrice(String price) {
            this.price = price;
        }
    }