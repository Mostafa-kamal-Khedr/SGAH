package com.ddg.sgah.data.db;

import com.ddg.sgah.R;
import com.ddg.sgah.data.model.HomeListModel;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mostafa khedr on 15,يوليو,2019
 */
public class HomeListsData {
    public static boolean courses;

    //courses
    public static List<HomeListModel> getHomeCourses() {

        //communication
        List<HomeListModel> homeCoursesListModels = new ArrayList<>();
        homeCoursesListModels.add(new HomeListModel(R.drawable.group_copy, R.string.ElectricalCircuits1));
        homeCoursesListModels.add(new HomeListModel(R.drawable.group_copy, R.string.Math1));
        homeCoursesListModels.add(new HomeListModel(R.drawable.group_copy, R.string.Physics));
        //
        homeCoursesListModels.add(new HomeListModel(R.drawable.group_copy, R.string.DigitalCircuits1));
        homeCoursesListModels.add(new HomeListModel(R.drawable.group_copy, R.string.ElectricalCircuits2));
        homeCoursesListModels.add(new HomeListModel(R.drawable.group_copy, R.string.Electronics1));
        //
        homeCoursesListModels.add(new HomeListModel(R.drawable.group_copy, R.string.DigitalCircuit2));
        homeCoursesListModels.add(new HomeListModel(R.drawable.group_copy, R.string.ElectronicMeasurement));
        homeCoursesListModels.add(new HomeListModel(R.drawable.group_copy, R.string.Electronics2));
        //
        homeCoursesListModels.add(new HomeListModel(R.drawable.group_copy, R.string.ElectromagneticApplication));
        homeCoursesListModels.add(new HomeListModel(R.drawable.group_copy, R.string.ElectronicsCommunication));
        homeCoursesListModels.add(new HomeListModel(R.drawable.group_copy, R.string.Microprocessor));
        //
        homeCoursesListModels.add(new HomeListModel(R.drawable.group_copy, R.string.Antenna));
        homeCoursesListModels.add(new HomeListModel(R.drawable.group_copy, R.string.FiberOptics));
        homeCoursesListModels.add(new HomeListModel(R.drawable.group_copy, R.string.SelectedTopics));
        //
        /////    computer
        homeCoursesListModels.add(new HomeListModel(R.drawable.group_copy, R.string.ElectricalCircuits1));
        homeCoursesListModels.add(new HomeListModel(R.drawable.group_copy, R.string.Math1));
        homeCoursesListModels.add(new HomeListModel(R.drawable.group_copy, R.string.Physics));
        //
        homeCoursesListModels.add(new HomeListModel(R.drawable.group_copy, R.string.DigitalCircuits1));
        homeCoursesListModels.add(new HomeListModel(R.drawable.group_copy, R.string.ElectricalCircuits2));
        homeCoursesListModels.add(new HomeListModel(R.drawable.group_copy, R.string.Electronics1));
        //

        homeCoursesListModels.add(new HomeListModel(R.drawable.group_copy, R.string.ComputerNetworks1));
        homeCoursesListModels.add(new HomeListModel(R.drawable.group_copy, R.string.DigitalCommunication));
        homeCoursesListModels.add(new HomeListModel(R.drawable.group_copy, R.string.PCMaintenance));
        //
        homeCoursesListModels.add(new HomeListModel(R.drawable.group_copy, R.string.ComputerOperatingSystem));
        homeCoursesListModels.add(new HomeListModel(R.drawable.group_copy, R.string.Microprocessor));
        homeCoursesListModels.add(new HomeListModel(R.drawable.group_copy, R.string.Programming2));
        //
        homeCoursesListModels.add(new HomeListModel(R.drawable.group_copy, R.string.ComputerApplication));
        homeCoursesListModels.add(new HomeListModel(R.drawable.group_copy, R.string.ComputerArchitecture));
        homeCoursesListModels.add(new HomeListModel(R.drawable.group_copy, R.string.DataStructure));


        return homeCoursesListModels;
    }

    public static List<HomeListModel> getAllCommunicationCourses() {

        //communication
        List<HomeListModel> homeCoursesListModels = new ArrayList<>();

        homeCoursesListModels.add(new HomeListModel(R.string.ElectricalCircuits1, "50"));
        homeCoursesListModels.add(new HomeListModel(R.string.Math1, "90"));

        homeCoursesListModels.add(new HomeListModel(R.string.Physics, "80"));
        //
        homeCoursesListModels.add(new HomeListModel(R.string.DigitalCircuits1, "70"));
        homeCoursesListModels.add(new HomeListModel(R.string.ElectricalCircuits2, "82"));
        homeCoursesListModels.add(new HomeListModel(R.string.Electronics1, "90"));
        //
        homeCoursesListModels.add(new HomeListModel(R.string.DigitalCircuit2, "40"));
        homeCoursesListModels.add(new HomeListModel(R.string.ElectronicMeasurement, "20"));
        homeCoursesListModels.add(new HomeListModel(R.string.Electronics2, "40"));
        //
        homeCoursesListModels.add(new HomeListModel(R.string.ElectromagneticApplication, "70"));
        homeCoursesListModels.add(new HomeListModel(R.string.ElectronicsCommunication, "70"));
        homeCoursesListModels.add(new HomeListModel(R.string.Microprocessor, "66"));
        //
        homeCoursesListModels.add(new HomeListModel(R.string.Antenna, "70"));
        homeCoursesListModels.add(new HomeListModel(R.string.FiberOptics, "80"));
        homeCoursesListModels.add(new HomeListModel(R.string.SelectedTopics, "30"));


        return homeCoursesListModels;
    }

    public static List<HomeListModel> getsem1CommunicationCourses() {

        //communication
        List<HomeListModel> homeCoursesListModels = new ArrayList<>();

        homeCoursesListModels.add(new HomeListModel(R.string.ElectricalCircuits1, "50"));
        homeCoursesListModels.add(new HomeListModel(R.string.Math1, "90"));

        homeCoursesListModels.add(new HomeListModel(R.string.Physics, "80"));
        return homeCoursesListModels;
    }

    public static List<HomeListModel> getsem2CommunicationCourses() {

        //communication
        List<HomeListModel> homeCoursesListModels = new ArrayList<>();

        homeCoursesListModels.add(new HomeListModel(R.string.DigitalCircuits1, "70"));
        homeCoursesListModels.add(new HomeListModel(R.string.ElectricalCircuits2, "82"));
        homeCoursesListModels.add(new HomeListModel(R.string.Electronics1, "90"));
        return homeCoursesListModels;
    }

    public static List<HomeListModel> getsem3CommunicationCourses() {

        //communication
        List<HomeListModel> homeCoursesListModels = new ArrayList<>();

        homeCoursesListModels.add(new HomeListModel(R.string.DigitalCircuit2, "40"));
        homeCoursesListModels.add(new HomeListModel(R.string.ElectronicMeasurement, "20"));
        homeCoursesListModels.add(new HomeListModel(R.string.Electronics2, "40"));
        return homeCoursesListModels;
    }

    public static List<HomeListModel> getsem4CommunicationCourses() {

        //communication
        List<HomeListModel> homeCoursesListModels = new ArrayList<>();
        homeCoursesListModels.add(new HomeListModel(R.string.ElectromagneticApplication, "70"));
        homeCoursesListModels.add(new HomeListModel(R.string.ElectronicsCommunication, "70"));
        homeCoursesListModels.add(new HomeListModel(R.string.Microprocessor, "66"));

        return homeCoursesListModels;
    }

    public static List<HomeListModel> getsem5CommunicationCourses() {

        //communication
        List<HomeListModel> homeCoursesListModels = new ArrayList<>();
        homeCoursesListModels.add(new HomeListModel(R.string.Antenna, "70"));
        homeCoursesListModels.add(new HomeListModel(R.string.FiberOptics, "80"));
        homeCoursesListModels.add(new HomeListModel(R.string.SelectedTopics, "30"));

        return homeCoursesListModels;
    }


    //    ___________________________________
    public static List<HomeListModel> getAllComputersCourses() {
        List<HomeListModel> homeCoursesListModels = new ArrayList<>();
        homeCoursesListModels.add(new HomeListModel(R.string.ElectricalCircuits1, "50"));
        homeCoursesListModels.add(new HomeListModel(R.string.Math1, "90"));

        homeCoursesListModels.add(new HomeListModel(R.string.Physics, "80"));
        //
        homeCoursesListModels.add(new HomeListModel(R.string.DigitalCircuits1, "70"));
        homeCoursesListModels.add(new HomeListModel(R.string.ElectricalCircuits2, "82"));
        homeCoursesListModels.add(new HomeListModel(R.string.Electronics1, "90"));
        //_______________________
        homeCoursesListModels.add(new HomeListModel(R.string.ComputerNetworks1, "40"));
        homeCoursesListModels.add(new HomeListModel(R.string.DigitalCommunication, "20"));
        homeCoursesListModels.add(new HomeListModel(R.string.PCMaintenance, "40"));
        //
        homeCoursesListModels.add(new HomeListModel(R.string.ComputerOperatingSystem, "70"));
        homeCoursesListModels.add(new HomeListModel(R.string.Microprocessor, "70"));
        homeCoursesListModels.add(new HomeListModel(R.string.Programming2, "66"));
        //
        homeCoursesListModels.add(new HomeListModel(R.string.ComputerApplication, "70"));
        homeCoursesListModels.add(new HomeListModel(R.string.ComputerArchitecture, "80"));
        homeCoursesListModels.add(new HomeListModel(R.string.DataStructure, "30"));


        return homeCoursesListModels;
    }


    public static List<HomeListModel> getsem1ComputersCourses() {

        //communication
        List<HomeListModel> homeCoursesListModels = new ArrayList<>();

        homeCoursesListModels.add(new HomeListModel(R.string.ElectricalCircuits1, "50"));
        homeCoursesListModels.add(new HomeListModel(R.string.Math1, "90"));

        homeCoursesListModels.add(new HomeListModel(R.string.Physics, "80"));
        return homeCoursesListModels;
    }

    public static List<HomeListModel> getsem2ComputersCourses() {

        //communication
        List<HomeListModel> homeCoursesListModels = new ArrayList<>();

        homeCoursesListModels.add(new HomeListModel(R.string.DigitalCircuits1, "70"));
        homeCoursesListModels.add(new HomeListModel(R.string.ElectricalCircuits2, "82"));
        homeCoursesListModels.add(new HomeListModel(R.string.Electronics1, "90"));
        return homeCoursesListModels;
    }

    public static List<HomeListModel> getsem3ComputersCourses() {

        //communication
        List<HomeListModel> homeCoursesListModels = new ArrayList<>();

        homeCoursesListModels.add(new HomeListModel(R.string.ComputerNetworks1, "40"));
        homeCoursesListModels.add(new HomeListModel(R.string.DigitalCommunication, "20"));
        homeCoursesListModels.add(new HomeListModel(R.string.PCMaintenance, "40"));
        return homeCoursesListModels;
    }

    public static List<HomeListModel> getsem4ComputersCourses() {

        //communication
        List<HomeListModel> homeCoursesListModels = new ArrayList<>();
        homeCoursesListModels.add(new HomeListModel(R.string.ComputerOperatingSystem, "70"));
        homeCoursesListModels.add(new HomeListModel(R.string.Microprocessor, "70"));
        homeCoursesListModels.add(new HomeListModel(R.string.Programming2, "66"));

        return homeCoursesListModels;
    }

    public static List<HomeListModel> getsem5ComputersCourses() {

        //communication
        List<HomeListModel> homeCoursesListModels = new ArrayList<>();
        homeCoursesListModels.add(new HomeListModel(R.string.ComputerApplication, "70"));
        homeCoursesListModels.add(new HomeListModel(R.string.ComputerArchitecture, "80"));
        homeCoursesListModels.add(new HomeListModel(R.string.DataStructure, "30"));

        return homeCoursesListModels;
    }


    //                      ____________________
    //files
    public static List<HomeListModel> getFilesCourses() {
        List<HomeListModel> homeFilesListModels = new ArrayList<>();


        homeFilesListModels.add(new HomeListModel(R.drawable.word, R.string.ElectricalCircuits1));
        homeFilesListModels.add(new HomeListModel(R.drawable.pdf, R.string.Math1));
        homeFilesListModels.add(new HomeListModel(R.drawable.word, R.string.Physics));
        homeFilesListModels.add(new HomeListModel(R.drawable.pdf, R.string.DigitalCircuits1));
        homeFilesListModels.add(new HomeListModel(R.drawable.word, R.string.ElectricalCircuits2));
        homeFilesListModels.add(new HomeListModel(R.drawable.pdf, R.string.Electronics1));
        homeFilesListModels.add(new HomeListModel(R.drawable.word, R.string.ComputerNetworks1));
        homeFilesListModels.add(new HomeListModel(R.drawable.pdf, R.string.DigitalCommunication));
        homeFilesListModels.add(new HomeListModel(R.drawable.word, R.string.PCMaintenance));
        homeFilesListModels.add(new HomeListModel(R.drawable.pdf, R.string.ComputerOperatingSystem));
        homeFilesListModels.add(new HomeListModel(R.drawable.word, R.string.Microprocessor));
        homeFilesListModels.add(new HomeListModel(R.drawable.pdf, R.string.Programming2));
        homeFilesListModels.add(new HomeListModel(R.drawable.word, R.string.ComputerApplication));
        homeFilesListModels.add(new HomeListModel(R.drawable.pdf, R.string.ComputerArchitecture));
        homeFilesListModels.add(new HomeListModel(R.drawable.word, R.string.DataStructure));



        homeFilesListModels.add(new HomeListModel(R.drawable.word, R.string.ElectricalCircuits1));
        homeFilesListModels.add(new HomeListModel(R.drawable.pdf, R.string.Math1));
        homeFilesListModels.add(new HomeListModel(R.drawable.word, R.string.Physics));
        homeFilesListModels.add(new HomeListModel(R.drawable.pdf, R.string.DigitalCircuits1));
        homeFilesListModels.add(new HomeListModel(R.drawable.word, R.string.ElectricalCircuits2));
        homeFilesListModels.add(new HomeListModel(R.drawable.pdf, R.string.Electronics1));


        homeFilesListModels.add(new HomeListModel(R.drawable.word, R.string.DigitalCircuit2));
        homeFilesListModels.add(new HomeListModel(R.drawable.pdf, R.string.ElectronicMeasurement));
        homeFilesListModels.add(new HomeListModel(R.drawable.word, R.string.Electronics2));

        homeFilesListModels.add(new HomeListModel(R.drawable.pdf, R.string.ElectromagneticApplication));
        homeFilesListModels.add(new HomeListModel(R.drawable.word, R.string.ElectronicsCommunication));
        homeFilesListModels.add(new HomeListModel(R.drawable.pdf, R.string.Microprocessor));


        homeFilesListModels.add(new HomeListModel(R.drawable.word, R.string.Antenna));
        homeFilesListModels.add(new HomeListModel(R.drawable.pdf, R.string.FiberOptics));
        homeFilesListModels.add(new HomeListModel(R.drawable.word, R.string.SelectedTopics));



        return homeFilesListModels;
    }


    public static List<HomeListModel> getComputersFilesCourses() {
        List<HomeListModel> homeFilesListModels = new ArrayList<>();


        homeFilesListModels.add(new HomeListModel(R.drawable.word, R.string.ElectricalCircuits1));
        homeFilesListModels.add(new HomeListModel(R.drawable.pdf, R.string.Math1));
        homeFilesListModels.add(new HomeListModel(R.drawable.word, R.string.Physics));
        homeFilesListModels.add(new HomeListModel(R.drawable.pdf, R.string.DigitalCircuits1));
        homeFilesListModels.add(new HomeListModel(R.drawable.word, R.string.ElectricalCircuits2));
        homeFilesListModels.add(new HomeListModel(R.drawable.pdf, R.string.Electronics1));
        homeFilesListModels.add(new HomeListModel(R.drawable.word, R.string.ComputerNetworks1));
        homeFilesListModels.add(new HomeListModel(R.drawable.pdf, R.string.DigitalCommunication));
        homeFilesListModels.add(new HomeListModel(R.drawable.word, R.string.PCMaintenance));
        homeFilesListModels.add(new HomeListModel(R.drawable.pdf, R.string.ComputerOperatingSystem));
        homeFilesListModels.add(new HomeListModel(R.drawable.word, R.string.Microprocessor));
        homeFilesListModels.add(new HomeListModel(R.drawable.pdf, R.string.Programming2));
        homeFilesListModels.add(new HomeListModel(R.drawable.word, R.string.ComputerApplication));
        homeFilesListModels.add(new HomeListModel(R.drawable.pdf, R.string.ComputerArchitecture));
        homeFilesListModels.add(new HomeListModel(R.drawable.word, R.string.DataStructure));

        return homeFilesListModels;
    }

    public static List<HomeListModel> getCommunicationFilesCourses() {
        List<HomeListModel> homeFilesListModels = new ArrayList<>();

        homeFilesListModels.add(new HomeListModel(R.drawable.word, R.string.ElectricalCircuits1));
        homeFilesListModels.add(new HomeListModel(R.drawable.pdf, R.string.Math1));
        homeFilesListModels.add(new HomeListModel(R.drawable.word, R.string.Physics));
        homeFilesListModels.add(new HomeListModel(R.drawable.pdf, R.string.DigitalCircuits1));
        homeFilesListModels.add(new HomeListModel(R.drawable.word, R.string.ElectricalCircuits2));
        homeFilesListModels.add(new HomeListModel(R.drawable.pdf, R.string.Electronics1));


        homeFilesListModels.add(new HomeListModel(R.drawable.word, R.string.DigitalCircuit2));
        homeFilesListModels.add(new HomeListModel(R.drawable.pdf, R.string.ElectronicMeasurement));
        homeFilesListModels.add(new HomeListModel(R.drawable.word, R.string.Electronics2));

        homeFilesListModels.add(new HomeListModel(R.drawable.pdf, R.string.ElectromagneticApplication));
        homeFilesListModels.add(new HomeListModel(R.drawable.word, R.string.ElectronicsCommunication));
        homeFilesListModels.add(new HomeListModel(R.drawable.pdf, R.string.Microprocessor));


        homeFilesListModels.add(new HomeListModel(R.drawable.word, R.string.Antenna));
        homeFilesListModels.add(new HomeListModel(R.drawable.pdf, R.string.FiberOptics));
        homeFilesListModels.add(new HomeListModel(R.drawable.word, R.string.SelectedTopics));


        return homeFilesListModels;
    }

    public static List<HomeListModel> getsem1FilesCourses() {
        List<HomeListModel> homeFilesListModels = new ArrayList<>();

        homeFilesListModels.add(new HomeListModel(R.drawable.pdf, R.string.ElectricalCircuits1));
        homeFilesListModels.add(new HomeListModel(R.drawable.pdf, R.string.Math1));
        homeFilesListModels.add(new HomeListModel(R.drawable.pdf, R.string.Physics));


        return homeFilesListModels;
    }


    //news
    public static List<HomeListModel> getNews() {

        List<HomeListModel> homeListsData = new ArrayList<>();


        homeListsData.add(new HomeListModel(R.drawable.news, R.string.news1));
        homeListsData.add(new HomeListModel(R.drawable.news, R.string.news2));
        homeListsData.add(new HomeListModel(R.drawable.news, R.string.news3));
        homeListsData.add(new HomeListModel(R.drawable.news, R.string.news4));
        homeListsData.add(new HomeListModel(R.drawable.news, R.string.news5));
        homeListsData.add(new HomeListModel(R.drawable.news, R.string.news6));
        homeListsData.add(new HomeListModel(R.drawable.news, R.string.news7));


        return homeListsData;

    }
}
