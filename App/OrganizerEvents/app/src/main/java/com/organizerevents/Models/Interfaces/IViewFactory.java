package com.organizerevents.Models.Interfaces;

import com.organizerevents.Controllers.SubControllers.Manager;

public interface IViewFactory {
    IViewLayout createView(int typeView, Manager managerFragments )throws IllegalAccessException, InstantiationException;

}
