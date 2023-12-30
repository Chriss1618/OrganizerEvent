package com.organizerevents.Views.Schermate.Home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.organizerevents.Controllers.ControlMapper;
import com.organizerevents.Controllers.Controller;
import com.organizerevents.Controllers.SubControllers.Manager;
import com.organizerevents.Models.Interfaces.IViewLayout;
import com.organizerevents.R;


public class ListEventi_Fragment extends Fragment implements IViewLayout {
    //SYSTEM
    private static final String TAG = "ListEventi_Fragment";

    //FUNCTIONAL
    private Manager manager;
    private int a;

    //LAYOUT
    private View Fragment_View;
    private Button CraeteEvent_Button;
    private Button JoinEvent_Button;

    public ListEventi_Fragment(Manager manager, int a) {
        this.manager = manager;
        this.a = a;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView: Started");
        Fragment_View = inflater.inflate(R.layout.fragment_home, container, false);
        PrepareData();
        PrepareLayout();
        return Fragment_View;
    }

    @Override
    public void PrepareData() {

    }

    @Override
    public void PrepareLayout() {
        LinkLayout();
        SetActionsOfLayout();
        SetDataOnLayout();
    }

    @Override
    public void LinkLayout() {
        CraeteEvent_Button  = Fragment_View.findViewById(R.id.button_create);
        JoinEvent_Button    = Fragment_View.findViewById(R.id.button_join);
    }

    @Override
    public void SetActionsOfLayout() {
        CraeteEvent_Button  .setOnClickListener((v)-> onClickCreateEvent());
        JoinEvent_Button    .setOnClickListener((v)-> onClickJoinEvent());
    }

    @Override
    public void SetDataOnLayout() {

    }

    //ACTIONS
    private void sendAction(){

    }

    private void onClickCreateEvent(){
        manager.changeOnMain(ControlMapper.IndexViewMapper.INDEX_MENU_CREATE_EVENTO,null);
    }
    private void onClickJoinEvent(){
        manager.changeOnMain(ControlMapper.IndexViewMapper.INDEX_MENU_JOIN_EVENTO,null);
    }


    @Override
    public void StartAnimations() {

    }

    @Override
    public void EndAnimations() {

    }
}