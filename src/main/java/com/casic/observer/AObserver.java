package com.casic.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by LRN on 2018/2/24.
 */

@Service
public class AObserver implements Observer {

    @Autowired
    private ServerManager serverManager;

    public AObserver( ServerManager  serverManager){
        serverManager.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {

    System.out.println("---------------------------"+((ServerManager) o).getData());

    }
}
