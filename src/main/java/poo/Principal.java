package poo;

public class Principal {

    public static void main(String[] args) {

        BuzzLightyer Buzz1 = new BuzzLightyer();
        BuzzLightyer Buzz2 = new BuzzLightyer();
        BuzzLightyer Buzz3 = new BuzzLightyer();
        int i = 0;

        do {
            i++;
            System.out.println("Buzz 1: " +Buzz1.pressFrases()+ "\n");
            System.out.println("Buzz 2: "+ Buzz2.pressFrases()+ "\n");
            System.out.println("Buzz 3: "+ Buzz3.pressFrases()+ "\n");


        } while (i != 5);

        Buzz1.pressAsas();
        Buzz2.pressCapacete();
        System.out.println(Buzz3.pressLaser());
        System.out.println(Buzz3.pressBraço());

        System.out.println(Buzz1.asas());
        System.out.println(Buzz2.capacete());


    }

}
