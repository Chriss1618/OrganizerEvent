package com.organizerevents.Controllers.SubControllers.ActionHandlers;

import com.organizerevents.Models.Events.Action.Action;

import java.util.HashMap;

public class ActionsMenu extends ActionsViewHandler{
    //SYSTEM
    private static final String TAG = "ActionsMenu";

    //FUNCTIONAL
    public final static int INDEX_ACTION_OPEN_EDIT_ACCOUNT      = 0;
    public final static int INDEX_ACTION_LOGOUT                 = 1;
    public final static int INDEX_ACTION_EDIT_ACCOUNT           = 2;

    public ActionsMenu(){
        MapLocalActions();
    }

    @Override
    protected void MapLocalActions(){
        actionHandlerMap = new HashMap<>();
        actionHandlerMap.put(INDEX_ACTION_OPEN_EDIT_ACCOUNT,    new OpenEditAccount_ActionHandler());
        actionHandlerMap.put(INDEX_ACTION_LOGOUT,               new LogOut_ActionHandler());
    }

    protected static class OpenEditAccount_ActionHandler implements IActionHandler {
        @Override
        public void handleAction(Action action) {
        }
    }

    protected static class LogOut_ActionHandler implements IActionHandler {
        @Override
        public void handleAction(Action action) {
        }



    }


}
