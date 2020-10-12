package collections.carparking;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class parkedcar {
        private Map<ownerdetails,parkingsLot> carsparked;
        private ArrayList<parkingsLot> slots=setSlots();

        public parkedcar() {
            carsparked=new HashMap<ownerdetails,parkingsLot>();
        }

        public void addCar(ownerdetails car) {
            parkingsLot slot=getSlot();
            carsparked.put(car, slot);
        }

        public void removeCar(ownerdetails car) {
            carsparked.get(car).setoccupied(false);
            carsparked.remove(car);
        }

        public void display() {
            for(ownerdetails car:carsparked.keySet()) {
                System.out.println("Owner"+car.getowername()+"car"+car.getcarmodel()+":"+"parkingsLot"+carsparked.get(car).getparrkingslot()+"isoccupied"+carsparked.get(car).isoccupied());
            }
        }

        public String getParkedLocation(ownerdetails car) {
            return carsparked.get(car).getparrkingslot();
        }
        public Map<ownerdetails,parkingsLot> getCars(){
            return carsparked;
        }
        public ArrayList<parkingsLot> setSlots(){
            ArrayList<parkingsLot> slot=new ArrayList<parkingsLot>();
            for(int i=1;i<=3;i++) {
                for(int j=1;j<=4;j++) {
                    for(int k=1;k<=20;k++) {
                        parkingsLot s=new parkingsLot(i+"F"+j+"S"+k,false);
                        slot.add(s);
                    }
                }
            }
            return slot;
        }


        public parkingsLot getSlot() {

            for(int i=0;i<slots.size();i++) {
                if(slots.get(i).isoccupied()== false) {
                    slots.get(i).setoccupied(true);;
                    return slots.get(i);
                }
            }
            return null;
        }
    }