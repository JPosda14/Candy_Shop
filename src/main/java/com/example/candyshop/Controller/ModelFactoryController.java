package com.example.candyshop.Controller;

import com.example.candyshop.service.ModelfactoryService;
import com.example.candyshop.service.impl.Sweety;

public class ModelFactoryController implements ModelfactoryService {
    private Sweety sweety;
    private static class SingletonHolder{
        private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
    }

    public  static ModelFactoryController getInstance(){ return SingletonHolder.eINSTANCE;}
    public Sweety getSweety(){ return sweety;}
    public ModelFactoryController(){sweety= new Sweety();}
    public void setSweety (Sweety sweety){this.sweety= sweety;}

    @Override
    public void createClient(String name, String password) {

    }
}
