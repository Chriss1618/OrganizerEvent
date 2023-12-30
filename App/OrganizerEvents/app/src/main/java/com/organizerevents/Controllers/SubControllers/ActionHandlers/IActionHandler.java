package com.organizerevents.Controllers.SubControllers.ActionHandlers;

import com.organizerevents.Models.Events.Action.Action;

public interface IActionHandler {
    void handleAction(Action action);

}
