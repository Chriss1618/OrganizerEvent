package com.organizerevents.Controllers;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import android.view.View;

import androidx.fragment.app.FragmentManager;

import com.organizerevents.Controllers.SubControllers.Manager;
import com.organizerevents.Models.Events.SourceInfo;
import com.organizerevents.Models.Interfaces.IController;
import com.organizerevents.Models.Interfaces.ISubController;

import java.util.ArrayList;

public class Controller implements IController {

    //SYSTEM ------------------------------------------------------------------------------- //
    private static final String TAG = "Controller_Amministratore";

    //FUNCTIONAL --------------------------------------------------------------------------- //
    public int          typeController;
    static Integer[]    LIST_INDEX_MANAGERS = {};

    private static final int            MAIN_MANAGER = 0;
    public int                          managerOnMain;
    private final FragmentManager       fragmentManager;
    private final ArrayList<ISubController> Managers;

    //LAYOUT ------------------------------------------------------------------------------ //
    private Context     context;
    private View        View;

    public Controller(Context context, View view, FragmentManager fragmentManager , int typeController) {
        Managers = new ArrayList<>();

        this.context            = context;
        this.View               = view;
        this.fragmentManager    = fragmentManager;
        this.typeController     = typeController;

        LIST_INDEX_MANAGERS = ControlMapper.classControllerToManager.get(typeController);

        Log.d(TAG, "Controller: Arrivato ");
        Log.d(TAG, "Index typeController: " + typeController);
        assert LIST_INDEX_MANAGERS != null;
        for (int indexManager : LIST_INDEX_MANAGERS ) {
            Log.d(TAG, "Index Manager: " + indexManager);
            Managers.add(new Manager(
                            new SourceInfo(indexManager,typeController),
                            context,
                            view,
                            fragmentManager
                    )
            );
        }
    }

    public int getNumberManagers(){
        return LIST_INDEX_MANAGERS.length;
    }

    //Show Pages --------------------------------------------------------------------------- //
    @Override
    public void showMain(){
        showOnMain(MAIN_MANAGER);
    }

    @Override
    public void changeOnMain(int indexMain) {
        closeView();
        final Handler handler = new Handler();
        handler.postDelayed(()-> showOnMain(indexMain),300);
    }

    private void showOnMain(int indexMain){
        clearBackStackPackage();
        Log.d(TAG, "showManagerOnMain: index->"+indexMain);
        managerOnMain = indexMain;
        Managers.get(managerOnMain).showMain();
    }

    @Override
    public void closeView(){
        Managers.get(managerOnMain).goBack();
    }

    @Override
    public void goBack() {
        Managers.get(managerOnMain).goBack();
    }

    private void clearBackStackPackage(){
        for(int j  = fragmentManager.getBackStackEntryCount() ; j >0; j-- ){
            fragmentManager.popBackStack();
        }
    }
}
