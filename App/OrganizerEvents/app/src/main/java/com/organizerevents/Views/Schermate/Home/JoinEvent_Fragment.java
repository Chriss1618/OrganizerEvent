package com.organizerevents.Views.Schermate.Home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.organizerevents.Controllers.SubControllers.Manager;
import com.organizerevents.Models.Interfaces.IViewLayout;
import com.organizerevents.R;

public class JoinEvent_Fragment extends Fragment implements IViewLayout {
    //SYSTEM
    private static final String TAG = "JoinEvent_Fragment";
    //FUNCTIONAL
    private Manager     manager;
    private int         a;
    //LAYOUT
    private View Fragment_View;

    public JoinEvent_Fragment(Manager manager, int a) {
        this.manager = manager;
        this.a = a;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) { }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Fragment_View =  inflater.inflate(R.layout.fragment_join_event, container, false);
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

    }

    @Override
    public void SetActionsOfLayout() {

    }

    @Override
    public void SetDataOnLayout() {

    }


    //FUNCTIONAL

    //ACTIONS

    @Override
    public void StartAnimations() {

    }

    @Override
    public void EndAnimations() {

    }
}