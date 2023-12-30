package com.organizerevents.Controllers.SubControllers;

import com.organizerevents.Controllers.SubControllers.RequestHandlers.RequestEventi;
import com.organizerevents.Controllers.SubControllers.RequestHandlers.RequestHandler;
import com.organizerevents.Models.Events.Request.Request;

import java.util.HashMap;
import java.util.Map;

public class ManagerRequestFactory {
    //FUNCTIONAL
    public final static int INDEX_REQUEST_EVENTI      = 0;

    public Map<Integer, RequestHandler> requestHandlerMap ;

    public ManagerRequestFactory() {
        MapLocalRequests();
    }

    private void MapLocalRequests(){
        requestHandlerMap = new HashMap<>();
        requestHandlerMap.put(INDEX_REQUEST_EVENTI,       new RequestEventi());
    }

    public void MapRequest(Request request) {
        RequestHandler handler = requestHandlerMap.get(request.getTypeRequest());
        if (handler != null)  handler.handleRequest(request);
    }
}
