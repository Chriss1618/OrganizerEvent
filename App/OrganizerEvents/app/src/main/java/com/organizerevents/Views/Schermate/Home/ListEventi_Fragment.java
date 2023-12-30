package com.organizerevents.Views.Schermate.Home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.organizerevents.Models.Interfaces.IViewLayout;
import com.organizerevents.R;


public class ListEventi_Fragment extends Fragment implements IViewLayout {



    public ListEventi_Fragment() {

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

        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void PrepareData() {

    }

    @Override
    public void PrepareLayout() {

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

    @Override
    public void StartAnimations() {

    }

    @Override
    public void EndAnimations() {

    }
}