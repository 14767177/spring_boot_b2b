package com.casic.observer;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by LRN on 2018/2/24.
 */
@Service
public class ServerManager extends Observable {

    private int data = 0;

    public int getData(){
        return data;
    }

    public void setData(int i){
        if(this.data != i){
            this.data = i;
            setChanged();
        }
        notifyObservers();  //只有在setChange()被调用后，notifyObservers()才会去调用update()，否则什么都不干。  } }
    }


    public void registerObservers(List<Observer> observers){
        for(Observer o:observers){
            this.addObserver(o);
        }
    }

}
