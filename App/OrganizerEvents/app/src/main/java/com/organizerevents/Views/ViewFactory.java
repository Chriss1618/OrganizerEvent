package com.organizerevents.Views;

import android.util.Log;


import com.organizerevents.Controllers.ControlMapper;
import com.organizerevents.Controllers.SubControllers.Manager;
import com.organizerevents.Models.Interfaces.IViewFactory;
import com.organizerevents.Models.Interfaces.IViewLayout;
import com.organizerevents.Views.Schermate.Home.MenuViewFactory;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ViewFactory {
    private static final String TAG = "ViewFactory";

    private static final Map<Integer, Class<? extends IViewFactory>> classMap = new HashMap<>();
    static {
        classMap.put(ControlMapper.IndexManagerMapper.INDEX_TYPE_MANAGER_MENU,            MenuViewFactory.class);
    }

    public IViewLayout createView(int typeManager, int typeView, Manager manager)throws IllegalAccessException, InstantiationException{
        try{
            return Objects.requireNonNull(classMap.get(typeManager))
                    .getConstructor()
                    .newInstance().createView(typeView,manager);
        }catch (InvocationTargetException | NoSuchMethodException e ) { //No public constructor con Signature specificata per il tipo di View
            Log.e(TAG, "createView: ",e );
            throw new IllegalArgumentException("Invalid View type. \n"+e);
        }
    }


}
