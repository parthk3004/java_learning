package collections;

import java.util.*;
    public class mainn {
        public static void main(String args[]) {
            laptop l1 = new laptop("Dell","xps","windows","core i7");
            laptop l2 = new laptop("Dell","inspiron","windows","core i7");
            laptop l3 = new laptop("HP","notebook","windows","core i3");
            generalset <laptop> laptops = new generalset<laptop>();
            laptops.addObjects(l1);
            laptops.addObjects(l2);
            laptops.addObjects(l3);
            Set <laptop> lapi= laptops.getObjects();
            for(laptop i : lapi) {
                System.out.println(i.getModel()+" " + i.getCompany());
            }
            school s1 = new school("DPS","rau","indore",1);
            school s2 = new school("Emreald heights","indore","indore",2);
            school s3 = new school("Chohitram","indore","indore",3);
            school s4 = new school("NDPS","indore","indore",7);
            listt<school> schools = new listt<school>();
            schools.addObjects(s1);
            schools.addObjects(s2);
            schools.addObjects(s3);
            schools.addObjects(s4);


            List<school> sch = schools.getObject();
            System.out.println("Names of school by list");
            for(school i:sch) {
                System.out.print(i.getName()+ " ");
            }
            car c1 =new car("Audi" , "a4" , 2020,10000000);
            car c2 =new car("Honda" , "city" , 2019,1000000);
            car c3 =new car("Bmw" , "x1" , 2017,300000);

            TreeSet<car> carTreeSet =  new TreeSet<car>();
            carTreeSet.add(c1);
            carTreeSet.add(c2);
            carTreeSet.add(c3);
            System.out.println("\n cars ");
            for(car c: carTreeSet) {
                System.out.print(c.getModel()+" ");
            }
            student st1 = new student("parth" , "Mango");
            student st2 = new student("Nitya" , "Orange");
            student st3 = new student("Arman" , "Banana");
            Map <String , String > stuMap = new HashMap<String , String>();
            stuMap.put(st1.getName(), st1.getFruit());
            stuMap.put(st2.getName(), st2.getFruit());
            stuMap.put(st3.getName(), st3.getFruit());
            System.out.println("\n printing data of map");
            for(Map.Entry m : stuMap.entrySet()){
                System.out.println(m.getKey()+" "+m.getValue());
            }
        }
    }
