package com.organizerevents.Controllers.SubControllers;

import android.util.Log;

import com.organizerevents.Controllers.ControlMapper;
import com.organizerevents.Controllers.SubControllers.ActionHandlers.ActionsMenu;
import com.organizerevents.Controllers.SubControllers.ActionHandlers.ActionsViewHandler;
import com.organizerevents.Models.Events.Action.Action;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ManagerActionFactory {
    //SYSTEM
    private static final String TAG = "ManagerActionFactory";

    //FUNCTIONAL
    private static final Map<Integer, Class<? extends ActionsViewHandler>> IndexActionMap = new HashMap<>();
    static {
        //LOGIN
        IndexActionMap.put(ControlMapper.IndexViewMapper.INDEX_MENU_LIST_EVENTI,     ActionsMenu.class);

    }

    public void MapAction(Action action){
        try{
             Objects.requireNonNull( IndexActionMap.get(action.getSourceInfo().getIndex_TypeView()) )
                    .getConstructor()
                    .newInstance().handleAction( action );
        }catch (InvocationTargetException | NoSuchMethodException e ) {
            Log.e(TAG, "createView: ",e );
            throw new IllegalArgumentException("Invalid View type. \n"+e);
        } catch (IllegalAccessException | InstantiationException e) {//No public constructor con Signature specificata per il tipo di View
            Log.e(TAG, "handleAction: ", e);
            throw new RuntimeException("Constructor Not Found : \n"+e);
        }
    }
}
