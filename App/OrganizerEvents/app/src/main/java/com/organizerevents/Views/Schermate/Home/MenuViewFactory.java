package com.organizerevents.Views.Schermate.Home;


import android.util.Log;

import com.organizerevents.Controllers.ControlMapper;
import com.organizerevents.Controllers.SubControllers.Manager;
import com.organizerevents.Models.Interfaces.IViewFactory;
import com.organizerevents.Models.Interfaces.IViewLayout;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MenuViewFactory implements IViewFactory {
    private static final String TAG = "MenuViewFactory";

    private static final Map<Integer, Class<? extends IViewLayout>> classMap = new HashMap<>();
    static {
        classMap.put(ControlMapper.IndexViewMapper.INDEX_MENU_LIST_EVENTI,      ListEventi_Fragment.class);
        classMap.put(ControlMapper.IndexViewMapper.INDEX_MENU_CREATE_EVENTO,    CreateEvent_Fragment.class);
        classMap.put(ControlMapper.IndexViewMapper.INDEX_MENU_JOIN_EVENTO,      JoinEvent_Fragment.class);
    }

    @Override
    public IViewLayout createView(int typeView, Manager manager)throws IllegalAccessException, InstantiationException{
        try{
            return Objects.requireNonNull(classMap.get(typeView))
                    .getConstructor(Manager.class,int.class)
                    .newInstance(manager,2);
        }catch (InvocationTargetException | NoSuchMethodException e ) { //No public constructor con Signature specificata per il tipo di View

            Log.e(TAG, "createView: ",e );
            throw new IllegalArgumentException("Invalid View type. \n"+e);
        }
    }
}

