package org.pat.observer;


public class Followwer implements Observers {


    protected String name;


    public Followwer(String name) {

        super();

        this.name = name;

    }


    @Override

    public void notification(String handle, String tweet) {

        System.out.printf("'%s' received notification from Handle: '%s', Tweet: '%s'\n", name, handle, tweet);

    }


}
