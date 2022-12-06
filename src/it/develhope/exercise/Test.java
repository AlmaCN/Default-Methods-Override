package it.develhope.exercise;

public class Test {

    public static void main(String[] args) {

        SmartphonePrice price1 = new SmartphonePrice("Producer Price", 850);
        SmartphonePrice price2 = new SmartphonePrice("Retail Price", 900);
        SmartphonePrice price3 = new SmartphonePrice("Producer Price", 250);
        SmartphonePrice price4 = new SmartphonePrice("Retail Price", 300);

        Smartphone smart1 = new Smartphone("Apple", "11 Pro Max", 2000, price1, price2);

        Smartphone smart2 = new Smartphone("Xiaomi", "Redmi Note Pro 10", 5000, price3, price4);


        boolean out = smart1.equals(smart2);
        System.out.println("Is smart1 equal to smart2? " + out);

        try {
            Smartphone clonedSmart2 = (Smartphone) smart2.clone();
            clonedSmart2.brandName = "Samsung";
            clonedSmart2.modelName = "S3";
            clonedSmart2.batterymAh = 1500;
            clonedSmart2.producerPrice = price3;
            clonedSmart2.retailPrice = price4;
            System.out.println(clonedSmart2);
            boolean out2 = smart2.equals(clonedSmart2);
            System.out.println("Is smart2 equal to clonedSmart2? " + out2);
        } catch (Exception exception){
            exception.printStackTrace();
            System.out.println("Error");
        }


    }
}
