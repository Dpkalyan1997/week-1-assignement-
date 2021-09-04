package org.pat.observer;

public interface Subject {

    public void addSubscriber(Observers observer);

    public void removeSubscriber(Observers observer);

    public void notifySubscribers(String tweet);
    
}