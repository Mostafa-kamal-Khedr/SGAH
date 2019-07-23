package com.ddg.sgah.data.db;

import com.ddg.sgah.R;
import com.ddg.sgah.data.model.HomeListModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mostafa khedr on 20,يوليو,2019
 */
public class CoursesDb {
    public static List<HomeListModel> getAllCommunicationStudyPlan() {

        //communication
        List<HomeListModel> homeCoursesListModels = new ArrayList<>();


        homeCoursesListModels.add(new HomeListModel(R.string.ElectricalCircuits1, "2", "1810", R.string.computerTech1));
        homeCoursesListModels.add(new HomeListModel(R.string.Math1, "201", "1518", R.string.computerTech2));

        homeCoursesListModels.add(new HomeListModel(R.string.Physics, "210", "2079", R.string.computerTech3));
        //
        homeCoursesListModels.add(new HomeListModel(R.string.DigitalCircuits1, "201", "1524", R.string.computerTech4));
        homeCoursesListModels.add(new HomeListModel(R.string.ElectricalCircuits2, "2", "3420", R.string.computerTech5));
        homeCoursesListModels.add(new HomeListModel(R.string.Electronics1, "501", "2557", R.string.computerTech6));


        //_______________________
        homeCoursesListModels.add(new HomeListModel(R.string.DigitalCircuit2, "205", "2158", R.string.computerTech7));
        homeCoursesListModels.add(new HomeListModel(R.string.ElectronicMeasurement, "502", "2206", R.string.computerTech8));
        homeCoursesListModels.add(new HomeListModel(R.string.Electronics2, "01", "1583", R.string.computerTech9));
        //
        homeCoursesListModels.add(new HomeListModel(R.string.ElectromagneticApplication, "02", "2211", R.string.computerTech10));
        homeCoursesListModels.add(new HomeListModel(R.string.ElectronicsCommunication, "01", "1538", R.string.computerTech11));
        homeCoursesListModels.add(new HomeListModel(R.string.Microprocessor, "201", "1534", R.string.computerTech12));
        //
        homeCoursesListModels.add(new HomeListModel(R.string.Antenna, "502", "2151", R.string.computerTech13));
        homeCoursesListModels.add(new HomeListModel(R.string.FiberOptics, "502", "2175", R.string.computerTech14));
        homeCoursesListModels.add(new HomeListModel(R.string.SelectedTopics, "502", "2158", R.string.computerTech13));


        return homeCoursesListModels;
    }

    public static List<HomeListModel> getsem1CommunicationStudyPlan() {

        //communication
        List<HomeListModel> homeCoursesListModels = new ArrayList<>();
        homeCoursesListModels.add(new HomeListModel(R.string.ElectricalCircuits1, "2", "1810", R.string.computerTech1));
        homeCoursesListModels.add(new HomeListModel(R.string.Math1, "201", "1518", R.string.computerTech2));

        homeCoursesListModels.add(new HomeListModel(R.string.Physics, "210", "2079", R.string.computerTech3));
        return homeCoursesListModels;
    }

    public static List<HomeListModel> getsem2CommunicationStudyPlan() {

        //communication
        List<HomeListModel> homeCoursesListModels = new ArrayList<>();
        homeCoursesListModels.add(new HomeListModel(R.string.DigitalCircuits1, "201", "1524", R.string.computerTech4));
        homeCoursesListModels.add(new HomeListModel(R.string.ElectricalCircuits2, "2", "3420", R.string.computerTech5));
        homeCoursesListModels.add(new HomeListModel(R.string.Electronics1, "501", "2557", R.string.computerTech6));
        return homeCoursesListModels;
    }

    public static List<HomeListModel> getsem3CommunicationStudyPlan() {

        //communication
        List<HomeListModel> homeCoursesListModels = new ArrayList<>();

        homeCoursesListModels.add(new HomeListModel(R.string.DigitalCircuit2, "205", "2158", R.string.computerTech7));
        homeCoursesListModels.add(new HomeListModel(R.string.ElectronicMeasurement, "502", "2206", R.string.computerTech8));
        homeCoursesListModels.add(new HomeListModel(R.string.Electronics2, "01", "1583", R.string.computerTech9));
        return homeCoursesListModels;
    }

    public static List<HomeListModel> getsem4CommunicationStudyPlan() {

        //communication
        List<HomeListModel> homeCoursesListModels = new ArrayList<>();
        homeCoursesListModels.add(new HomeListModel(R.string.ElectromagneticApplication, "02", "2125", R.string.computerTech10));
        homeCoursesListModels.add(new HomeListModel(R.string.ElectronicsCommunication, "502", "2175", R.string.computerTech11));
        homeCoursesListModels.add(new HomeListModel(R.string.Microprocessor, "201", "153", R.string.computerTech12));

        return homeCoursesListModels;
    }

    public static List<HomeListModel> getsem5CommunicationStudyPlan() {

        //communication
        List<HomeListModel> homeCoursesListModels = new ArrayList<>();
        homeCoursesListModels.add(new HomeListModel(R.string.Antenna, "502", "2151", R.string.computerTech13));
        homeCoursesListModels.add(new HomeListModel(R.string.FiberOptics, "502", "2175", R.string.computerTech14));
        homeCoursesListModels.add(new HomeListModel(R.string.SelectedTopics, "502", "2158", R.string.computerTech13));

        return homeCoursesListModels;
    }


    public static List<HomeListModel> getAllComputersStudyPlan() {
        List<HomeListModel> homeCoursesListModels = new ArrayList<>();


        homeCoursesListModels.add(new HomeListModel(R.string.ElectricalCircuits1, "2", "1810", R.string.computerTech1));
        homeCoursesListModels.add(new HomeListModel(R.string.Math1, "201", "1518", R.string.computerTech2));

        homeCoursesListModels.add(new HomeListModel(R.string.Physics, "210", "2079", R.string.computerTech3));
        //
        homeCoursesListModels.add(new HomeListModel(R.string.DigitalCircuits1, "201", "1524", R.string.computerTech4));
        homeCoursesListModels.add(new HomeListModel(R.string.ElectricalCircuits2, "2", "3420", R.string.computerTech5));
        homeCoursesListModels.add(new HomeListModel(R.string.Electronics1, "501", "2557", R.string.computerTech6));
        //_______________________
        homeCoursesListModels.add(new HomeListModel(R.string.ComputerNetworks1, "205", "2158", R.string.computerTech7));
        homeCoursesListModels.add(new HomeListModel(R.string.DigitalCommunication, "502", "2206", R.string.computerTech8));
        homeCoursesListModels.add(new HomeListModel(R.string.PCMaintenance, "01", "1583", R.string.computerTech9));
        //
        homeCoursesListModels.add(new HomeListModel(R.string.ComputerOperatingSystem, "02", "2211", R.string.computerTech10));
        homeCoursesListModels.add(new HomeListModel(R.string.Microprocessor, "01", "1538", R.string.computerTech11));
        homeCoursesListModels.add(new HomeListModel(R.string.Programming2, "201", "1534", R.string.computerTech12));
        //
        homeCoursesListModels.add(new HomeListModel(R.string.ComputerApplication, "502", "2151", R.string.computerTech13));
        homeCoursesListModels.add(new HomeListModel(R.string.ComputerArchitecture, "502", "2175", R.string.computerTech14));
        homeCoursesListModels.add(new HomeListModel(R.string.DataStructure, "502", "2158", R.string.computerTech13));


        return homeCoursesListModels;
    }


    public static List<HomeListModel> getsem1ComputersStudyPlan() {

        //communication
        List<HomeListModel> homeCoursesListModels = new ArrayList<>();

        homeCoursesListModels.add(new HomeListModel(R.string.ElectricalCircuits1, "2", "1810", R.string.computerTech1));
        homeCoursesListModels.add(new HomeListModel(R.string.Math1, "201", "1518", R.string.computerTech2));

        homeCoursesListModels.add(new HomeListModel(R.string.Physics, "210", "2079", R.string.computerTech3));
        return homeCoursesListModels;
    }

    public static List<HomeListModel> getsem2ComputersStudyPlan() {

        //communication
        List<HomeListModel> homeCoursesListModels = new ArrayList<>();

        homeCoursesListModels.add(new HomeListModel(R.string.DigitalCircuits1, "201", "1524", R.string.computerTech4));
        homeCoursesListModels.add(new HomeListModel(R.string.ElectricalCircuits2, "2", "3420", R.string.computerTech5));
        homeCoursesListModels.add(new HomeListModel(R.string.Electronics1, "501", "2557", R.string.computerTech6));
        return homeCoursesListModels;
    }

    public static List<HomeListModel> getsem3ComputersStudyPlan() {

        //communication
        List<HomeListModel> homeCoursesListModels = new ArrayList<>();

        homeCoursesListModels.add(new HomeListModel(R.string.ComputerNetworks1, "205", "2158", R.string.computerTech7));
        homeCoursesListModels.add(new HomeListModel(R.string.DigitalCommunication, "502", "2206", R.string.computerTech8));
        homeCoursesListModels.add(new HomeListModel(R.string.PCMaintenance, "01", "1583", R.string.computerTech9));
        return homeCoursesListModels;
    }

    public static List<HomeListModel> getsem4ComputersStudyPlan() {

        //communication
        List<HomeListModel> homeCoursesListModels = new ArrayList<>();
        homeCoursesListModels.add(new HomeListModel(R.string.ComputerOperatingSystem, "02", "2211", R.string.computerTech10));
        homeCoursesListModels.add(new HomeListModel(R.string.Microprocessor, "01", "1538", R.string.computerTech11));
        homeCoursesListModels.add(new HomeListModel(R.string.Programming2, "201", "1534", R.string.computerTech12));

        return homeCoursesListModels;
    }

    public static List<HomeListModel> getsem5ComputersStudyPlan() {

        //communication
        List<HomeListModel> homeCoursesListModels = new ArrayList<>();
        homeCoursesListModels.add(new HomeListModel(R.string.ComputerApplication, "502", "2151", R.string.computerTech13));
        homeCoursesListModels.add(new HomeListModel(R.string.ComputerArchitecture, "502", "2175", R.string.computerTech14));
        homeCoursesListModels.add(new HomeListModel(R.string.DataStructure, "502", "2158", R.string.computerTech13));

        return homeCoursesListModels;
    }


}
