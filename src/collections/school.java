package collections;


public class school implements Comparable<school>{
    private String name;
    private String city;
    private String schoolDistrict;
    private int greatschoolRanking;
    public school(String name, String city, String schoolDistrict, int greatschoolRanking) {
        super();
        this.name = name;
        this.city = city;
        this.schoolDistrict = schoolDistrict;
        this.greatschoolRanking = greatschoolRanking;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((city == null) ? 0 : city.hashCode());
        result = prime * result + greatschoolRanking;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((schoolDistrict == null) ? 0 : schoolDistrict.hashCode());
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
        school other = (school) obj;
        if (city == null) {
            if (other.city != null)
                return false;
        } else if (!city.equals(other.city))
            return false;
        if (greatschoolRanking != other.greatschoolRanking)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (schoolDistrict == null) {
            if (other.schoolDistrict != null)
                return false;
        } else if (!schoolDistrict.equals(other.schoolDistrict))
            return false;
        return true;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getschoolDistrict() {
        return schoolDistrict;
    }
    public void setschoolDistrict(String schoolDistrict) {
        this.schoolDistrict = schoolDistrict;
    }
    public int getGreatschoolRanking() {
        return greatschoolRanking;
    }
    public void setGreatschoolRanking(int greatschoolRanking) {
        this.greatschoolRanking = greatschoolRanking;
    }
    public int compareTo(school arg0) {
        // TODO Auto-generated method stub
        return 0;
    }

}
