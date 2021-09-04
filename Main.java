package org.pat.observer;


public class Main {


    public static void main(String args[]) {

        PublicFiggure bishma = new PublicFiggure("Barack Obama", "bishma");

        PublicFiggure nod = new PublicFiggure("Narendra Modi", "nod");


        Followwer ajay = new Followwer("gnan");

        Followwer vijay = new Followwer("Viek");

        Followwer racheal = new Followwer("Rasal");

        Followwer micheal = new Followwer("Masal");

        Followwer kim = new Followwer("gyanam");


        bishma.addSubscriber(ajay);

        bishma.addSubscriber(vijay);

        bishma.addSubscriber(racheal);

        bishma.addSubscriber(micheal);

        bishma.addSubscriber(kim);


        nod.addSubscriber(ajay);

        nod.addSubscriber(vijay);

        nod.addSubscriber(racheal);

        nod.addSubscriber(micheal);

        nod.addSubscriber(kim);


        bishma.tweet("Hello Friends!");

        nod.tweet("Vande Matram!");

        bishma.removeSubscriber(racheal);

        bishma.tweet("Stay Home! Stay Safe!");

    }

}
