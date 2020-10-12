package collections.carparking;

class parkingsLot {


    private String parkingsLot;
    private boolean isoccupied;


    public parkingsLot(String parkingsLot, boolean isoccupied) {
        super();
        this.parkingsLot = parkingsLot;
        this.isoccupied = isoccupied;
    }

    public String getparrkingslot() {
        return parkingsLot;
    }
    public void setparrkingslot(String parkingsLot) {
        this.parkingsLot = parkingsLot;
    }
    public boolean isoccupied() {
        return isoccupied;
    }
    public void setoccupied(boolean isoccupied) {
        this.isoccupied = isoccupied;
    }

}