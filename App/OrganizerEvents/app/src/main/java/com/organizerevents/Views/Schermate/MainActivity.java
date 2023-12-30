package com.organizerevents.Views.Schermate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;

import com.organizerevents.Controllers.ControlMapper;
import com.organizerevents.Controllers.Controller;
import com.organizerevents.Models.Interfaces.IViewLayout;
import com.organizerevents.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements IViewLayout {
    //SYSTEM
    private static final String TAG = "Fragment_Stats";

    //LAYOUT
    private View                view_fragment;
    private LinearLayout        LinearLayout_Fragment;
    //FUNCTIONAL
    private Controller                  controller;
    private int typeController;
    //DATA

    //OTHER..



    //Deprecato per i telefoni che non hanno il pulsante indietro
    @Override
    public void onBackPressed() {
        Log.d(TAG, "onBackPressed: stack size = " + getSupportFragmentManager().getBackStackEntryCount() );
        if ( getSupportFragmentManager().getBackStackEntryCount() > 1 ) {
            controller.goBack();
        }else{
            super.onBackPressed();
            finish();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PrepareData();
        PrepareLayout();
    }

    @Override
    public void PrepareData() {
        typeController = ControlMapper.IndexControllerMapper.INDEX_TYPE_CONTROLLER_MENU;
    }

    @Override
    public void PrepareLayout() {
        LinkLayout();
        SetActionsOfLayout();
        SetDataOnLayout();
    }

    @Override
    public void LinkLayout() {
        LinearLayout_Fragment = findViewById(R.id.linear_layout_container_fragment);
    }

    @Override
    public void SetActionsOfLayout() {

    }

    @Override
    public void SetDataOnLayout() {
        constructController();
        controller.showMain();
    }


    //FUNCTIONAL
    private void constructController() {
        controller = new Controller(
                this,
                findViewById(R.id.fragment_container_view_home),
                getSupportFragmentManager(),
                typeController
        );
    }
    @Override
    public void StartAnimations() {

    }

    @Override
    public void EndAnimations() {

    }
}