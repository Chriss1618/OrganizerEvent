package com.organizerevents.Controllers;

import java.util.HashMap;
import java.util.Map;

public class ControlMapper {

    public static class TypeUserMapper{ //TYPE USERS
        //Name
        public static final String NAME_TYPE_USER_ORGANIZZATORE     = "Organizzatore";
        public static final String NAME_TYPE_USER_AMMINISTRATORE    = "Amministratore";
        public static final String NAME_TYPE_USER_MEMBRO            = "Membro";
        //Index
        public static final int INDEX_TYPE_CONTROLLER_ORGANIZZATORE     = 0;
        public static final int INDEX_TYPE_CONTROLLER_AMMINISTRATORE    = 1;
        public static final int INDEX_TYPE_CONTROLLER_MEMBRO            = 2;
    }
    public static class IndexControllerMapper {
        //Index
        public final static int INDEX_TYPE_CONTROLLER_MENU             = 0;
        public final static int INDEX_TYPE_CONTROLLER_EVENTO             = 1;
    }
    public static class IndexManagerMapper {
        //Index
        public final static int INDEX_TYPE_MANAGER_MENU             = 0;
        public final static int INDEX_TYPE_MANAGER_INFO             = 1;
        public final static int INDEX_TYPE_MANAGER_PASSAGGI         = 2;
        public final static int INDEX_TYPE_MANAGER_SONDAGGI         = 3;
        public final static int INDEX_TYPE_MANAGER_SPESE            = 4;
        public final static int INDEX_TYPE_MANAGER_REGALO           = 5;
    }

    public static class IndexViewMapper{
        //MENU
        public static final int INDEX_MENU_LIST_EVENTI              = 0;
        public static final int INDEX_MENU_CREATE_EVENTO            = 1;
        public static final int INDEX_MENU_JOIN_EVENTO              = 2;

        //INFO
        public static final int INDEX_INFO_EVENTO                   = 3;
        public static final int INDEX_INFO_LIST_MEMBRI              = 4;
        public static final int INDEX_INFO_EDIT_INFO                = 5;

        //PASSAGGI
        public static final int INDEX_PASSAGGI_LIST_PASSAGGI        = 6;
        public static final int INDEX_PASSAGGI_CREATE_PASSAGGIO     = 7;
        public static final int INDEX_PASSAGGI_ASK_PASSAGGIO        = 8;

        //SONDAGGI
        public static final int INDEX_SONDAGGI_LIST_SONDAGGI        = 9;
        public static final int INDEX_SONDAGGI_CREATE_SONDAGGIO     = 10;

        //SPESE
        public static final int INDEX_SPESE_LIST_SONDAGGI           = 11;
        public static final int INDEX_SPESE_CREATE_SONDAGGIO        = 12;

        //REGALO
        public static final int INDEX_REGALO_LIST_REGALI            = 13;

    }

    public static class ListIndexUserTabMapper{
        //PAGINATION
        static Integer [] HOME_INDEX = {
                IndexManagerMapper.INDEX_TYPE_MANAGER_MENU
        };
        static Integer [] EVENTO_INDEX = {
                IndexManagerMapper.INDEX_TYPE_MANAGER_MENU,
                IndexManagerMapper.INDEX_TYPE_MANAGER_INFO,
                IndexManagerMapper.INDEX_TYPE_MANAGER_PASSAGGI,
                IndexManagerMapper.INDEX_TYPE_MANAGER_SONDAGGI,
                IndexManagerMapper.INDEX_TYPE_MANAGER_SPESE,
                IndexManagerMapper.INDEX_TYPE_MANAGER_REGALO
        };
    }

    public static class ListIndexTabViewTabMapper{
        //VIEW_PER_PAGINATION
        static Integer [] MENU_INDEX = {
                IndexViewMapper.INDEX_MENU_LIST_EVENTI,
                IndexViewMapper.INDEX_MENU_CREATE_EVENTO,
                IndexViewMapper.INDEX_MENU_JOIN_EVENTO
        };

        static Integer [] INFO_INDEX = {
                IndexViewMapper.INDEX_INFO_EVENTO,
                IndexViewMapper.INDEX_INFO_LIST_MEMBRI,
                IndexViewMapper.INDEX_INFO_EDIT_INFO
        };

        static Integer [] PASSAGGI_INDEX = {
                IndexViewMapper.INDEX_PASSAGGI_LIST_PASSAGGI,
                IndexViewMapper.INDEX_PASSAGGI_CREATE_PASSAGGIO,
                IndexViewMapper.INDEX_PASSAGGI_ASK_PASSAGGIO
        };

        static Integer [] SONDAGGI_INDEX = {
                IndexViewMapper.INDEX_SONDAGGI_LIST_SONDAGGI,
                IndexViewMapper.INDEX_SONDAGGI_CREATE_SONDAGGIO
        };

        static Integer [] SPESE_INDEX = {
                IndexViewMapper.INDEX_SPESE_LIST_SONDAGGI,
                IndexViewMapper.INDEX_SPESE_CREATE_SONDAGGIO
        };
        static Integer [] REGALO_INDEX = {
                IndexViewMapper.INDEX_REGALO_LIST_REGALI
        };

    }

    public static final Map<Integer, Integer[]> classControllerToManager = new HashMap<>();
    static {
        classControllerToManager.put(IndexControllerMapper.INDEX_TYPE_CONTROLLER_MENU,  ListIndexUserTabMapper.HOME_INDEX);
        classControllerToManager.put(IndexControllerMapper.INDEX_TYPE_CONTROLLER_EVENTO,  ListIndexUserTabMapper.EVENTO_INDEX);
    }

    public static final Map<Integer, Integer[]> classManagerToView = new HashMap<>();
    static {
        classManagerToView.put(IndexManagerMapper.INDEX_TYPE_MANAGER_MENU,              ListIndexTabViewTabMapper.MENU_INDEX);
        classManagerToView.put(IndexManagerMapper.INDEX_TYPE_MANAGER_INFO,              ListIndexTabViewTabMapper.INFO_INDEX);
        classManagerToView.put(IndexManagerMapper.INDEX_TYPE_MANAGER_PASSAGGI,          ListIndexTabViewTabMapper.PASSAGGI_INDEX);
        classManagerToView.put(IndexManagerMapper.INDEX_TYPE_MANAGER_SONDAGGI,          ListIndexTabViewTabMapper.SONDAGGI_INDEX);
        classManagerToView.put(IndexManagerMapper.INDEX_TYPE_MANAGER_SPESE,             ListIndexTabViewTabMapper.SPESE_INDEX);
        classManagerToView.put(IndexManagerMapper.INDEX_TYPE_MANAGER_REGALO,            ListIndexTabViewTabMapper.REGALO_INDEX);
    }
}
