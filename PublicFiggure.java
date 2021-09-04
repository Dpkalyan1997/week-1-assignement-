package org.pat.observer;

import java.util.ArrayList;

import java.util.List;

public class PublicFiggure implements Subject {

    protected List<Observers> observers = new ArrayList<Observers>();

    protected String name;

    protected String handle;


    public PublicFiggure(String name, String handle) {

        super();

        this.name = name;

        this.handle = "#" + handle;

    }


    public String getName() {

        return name;

    }


    public void setName(String name) {

        this.name = name;

    }


    public String getHandle() {

        return handle;

    }


    public void tweet(String tweet) {

        System.out.printf("\nName: %s, Tweet: %s\n", name, tweet);

        notifySubscribers(tweet);

    }


    @Override

    public synchronized void addSubscriber(Observers observer) {

        observers.add(observer);

    }


    @Override

    public synchronized void removeSubscriber(Observers observer) {

        observers.remove(observer);

    }


    @Override

    public void notifySubscribers(String tweet) {

        observers.forEach(observer -> observer.notification(handle, tweet));

    }


}