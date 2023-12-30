package com.organizerevents.Controllers.SubControllers.ActionHandlers;

import com.organizerevents.Models.Events.Action.Action;

import java.util.Map;

public class ActionsViewHandler {
    protected Map<Integer, IActionHandler> actionHandlerMap = null;

    public void handleAction(Action action){
        IActionHandler handler = actionHandlerMap.get( action.getActionType() );
        if (handler != null) handler.handleAction( action );
    }

    protected void MapLocalActions(){}
}
