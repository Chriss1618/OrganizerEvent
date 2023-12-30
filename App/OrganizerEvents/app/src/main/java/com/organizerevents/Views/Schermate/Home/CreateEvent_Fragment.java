package com.organizerevents.Views.Schermate.Home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.organizerevents.Controllers.SubControllers.Manager;
import com.organizerevents.Models.Interfaces.IViewLayout;
import com.organizerevents.R;

public class CreateEvent_Fragment extends Fragment implements IViewLayout {
    //SYSTEM
    private static final String TAG = "CreateEvent_Fragment";

    //FUNCTIONAL
    private Manager manager;
    private int a;

    //LAYOUT
    private View Fragment_View;

    public CreateEvent_Fragment(Manager manager, int a ) {
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Fragment_View = inflater.inflate(R.layout.fragment_create_event_, container, false);
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

    //FUNCTIONAL

    //ACTIONS

    @Override
    public void SetDataOnLayout() {

    }

    @Override
    public void StartAnimations() {

    }

    @Override
    public void EndAnimations() {

    }
}