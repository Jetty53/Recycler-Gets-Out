package com.wheic.recyclergetsout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.wheic.recyclergetsout.RV1.RVOneAdapter;
import com.wheic.recyclergetsout.RV1.RVOneModel;
import com.wheic.recyclergetsout.RV2.RVTwoAdapter;
import com.wheic.recyclergetsout.RV2.RVTwoModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView RVOne; //reference for the Main-List RecyclerView
    private RecyclerView RVTwo; //reference for the Sub-List RecyclerView
    private List<RVOneModel> tutorialList; //Main-list item titles will be stored here
    private List<RVTwoModel> tutorialSubList; //Sub-list item titles will be stored here
    private RVOneAdapter rvOneAdapter; //reference for the RVOneAdapter class
    private RVTwoAdapter rvTwoAdapter; //reference for the RVTwoAdapter class
    private TextView algorithmTitleText; //TextView to show the title of the clicked Main-List item

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Linked up with its respective id used in the activity_main.xml
        RVOne = findViewById(R.id.recyclerViewOne);
        RVTwo = findViewById(R.id.recyclerViewTwo);
        algorithmTitleText = findViewById(R.id.algorithmTitleText);

        //Setting the Main-List RecyclerView horizontally
        RVOne.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.HORIZONTAL, false));

        tutorialList = new ArrayList<>();

        //Static data are stored one by one in the tutorialList arrayList
        tutorialList.add(new RVOneModel("Algorithms", 1));
        tutorialList.add(new RVOneModel("Data Structures", 2));
        tutorialList.add(new RVOneModel("Languages", 3));
        tutorialList.add(new RVOneModel("Interview Corner", 4));
        tutorialList.add(new RVOneModel("GATE", 5));
        tutorialList.add(new RVOneModel("ISRO CS", 6));
        tutorialList.add(new RVOneModel("UGC NET CS", 7));
        tutorialList.add(new RVOneModel("CS Subjects", 8));
        tutorialList.add(new RVOneModel("Web Technologies", 9));

        //The app will show Algorithms Sub-List every time the activity starts
        algorithmTitleText.setText("Algorithms");
        setRVTwoList(1);

        rvOneAdapter = new RVOneAdapter(tutorialList);
        RVOne.setAdapter(rvOneAdapter);

        //Setting up the events that will occur on each Main-List item click
        rvOneAdapter.setWhenClickListener(new RVOneAdapter.OnItemsClickListener() {
            @Override
            public void onItemClick(RVOneModel rvOneModel) {
                algorithmTitleText.setText(rvOneModel.getName());
                setRVTwoList(rvOneModel.getNum());
            }
        });

    }

    private void setRVTwoList(int num){

        //Setting the Sub-List RecyclerView vertically
        RVTwo.setLayoutManager(new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false));

        //Previous tutorialSubList will be deleted and new memory will be allocated
        tutorialSubList = new ArrayList<>();

        //Static data are stored one by one in the tutorialSubList arrayList for each Main-List items
        if (num == 1) {

            tutorialSubList.add(new RVTwoModel("Searching Algorithms"));
            tutorialSubList.add(new RVTwoModel("Sorting Algorithms"));
            tutorialSubList.add(new RVTwoModel("Graph Algorithms"));
            tutorialSubList.add(new RVTwoModel("Pattern Algorithms"));
            tutorialSubList.add(new RVTwoModel("Geometric Algorithms"));
            tutorialSubList.add(new RVTwoModel("Mathematical"));
            tutorialSubList.add(new RVTwoModel("Randomized Algorithms"));
            tutorialSubList.add(new RVTwoModel("Greedy Algorithms"));
            tutorialSubList.add(new RVTwoModel("Dynamic Programming"));
            tutorialSubList.add(new RVTwoModel("Divide and Conquer"));
            tutorialSubList.add(new RVTwoModel("Backtracking"));
            tutorialSubList.add(new RVTwoModel("Branch and Bound"));
            tutorialSubList.add(new RVTwoModel("All Algorithms"));

        } else if (num == 2){

            tutorialSubList.add(new RVTwoModel("Arrays"));
            tutorialSubList.add(new RVTwoModel("Linked List"));
            tutorialSubList.add(new RVTwoModel("Stack"));
            tutorialSubList.add(new RVTwoModel("Queue"));
            tutorialSubList.add(new RVTwoModel("Binary Tree"));
            tutorialSubList.add(new RVTwoModel("Binary Search Tree"));
            tutorialSubList.add(new RVTwoModel("Heap"));
            tutorialSubList.add(new RVTwoModel("Hashing"));
            tutorialSubList.add(new RVTwoModel("Graph"));
            tutorialSubList.add(new RVTwoModel("Advanced Data Structure"));
            tutorialSubList.add(new RVTwoModel("Matrix"));
            tutorialSubList.add(new RVTwoModel("Strings"));
            tutorialSubList.add(new RVTwoModel("All Data Structures"));

        } else if (num == 3){

            tutorialSubList.add(new RVTwoModel("C"));
            tutorialSubList.add(new RVTwoModel("C++"));
            tutorialSubList.add(new RVTwoModel("Java"));
            tutorialSubList.add(new RVTwoModel("Python"));
            tutorialSubList.add(new RVTwoModel("C#"));
            tutorialSubList.add(new RVTwoModel("Javascript"));
            tutorialSubList.add(new RVTwoModel("JQuery"));
            tutorialSubList.add(new RVTwoModel("SQL"));
            tutorialSubList.add(new RVTwoModel("PHP"));
            tutorialSubList.add(new RVTwoModel("Scala"));
            tutorialSubList.add(new RVTwoModel("Perl"));
            tutorialSubList.add(new RVTwoModel("GO Language"));
            tutorialSubList.add(new RVTwoModel("HTML"));
            tutorialSubList.add(new RVTwoModel("CSS"));
            tutorialSubList.add(new RVTwoModel("Kotlin"));

        } else if (num == 4){

            tutorialSubList.add(new RVTwoModel("Company Preparation"));
            tutorialSubList.add(new RVTwoModel("Top Topics"));
            tutorialSubList.add(new RVTwoModel("Practice Company Questions"));
            tutorialSubList.add(new RVTwoModel("Interview Experiences"));
            tutorialSubList.add(new RVTwoModel("Experienced Interviews"));
            tutorialSubList.add(new RVTwoModel("Internship Interviews"));
            tutorialSubList.add(new RVTwoModel("Competitive Programming"));
            tutorialSubList.add(new RVTwoModel("Design Patterns"));
            tutorialSubList.add(new RVTwoModel("Multiple Choice Quizzes"));

        } else if (num == 5){

            tutorialSubList.add(new RVTwoModel("GATE CS Notes 2021"));
            tutorialSubList.add(new RVTwoModel("Last Minute Notes"));
            tutorialSubList.add(new RVTwoModel("GATE CS Solved Papers"));
            tutorialSubList.add(new RVTwoModel("GATE CS Original Papers and Official Keys"));
            tutorialSubList.add(new RVTwoModel("GATE 2021 Dates"));
            tutorialSubList.add(new RVTwoModel("GATE CS 2021 Syllabus"));
            tutorialSubList.add(new RVTwoModel("Important Topics for GATE CS"));
            tutorialSubList.add(new RVTwoModel("Sudo GATE 2021"));

        } else if (num == 6){

            tutorialSubList.add(new RVTwoModel("ISRO CS Solved Papers"));
            tutorialSubList.add(new RVTwoModel("ISRO CS Original Papers and Official Keys"));
            tutorialSubList.add(new RVTwoModel("ISRO CS Syllabus for Scientist/Engineer Exam"));

        } else if (num == 7){
            tutorialSubList.add(new RVTwoModel("UGC NET CS Notes Paper II"));
            tutorialSubList.add(new RVTwoModel("UGC NET CS Notes Paper III"));
            tutorialSubList.add(new RVTwoModel("UGC NET CS Solved Papers"));

        } else if (num == 8){

            tutorialSubList.add(new RVTwoModel("Mathematics"));
            tutorialSubList.add(new RVTwoModel("Operating System"));
            tutorialSubList.add(new RVTwoModel("DBMS"));
            tutorialSubList.add(new RVTwoModel("Computer Networks"));
            tutorialSubList.add(new RVTwoModel("Computer Organization and Architecture"));
            tutorialSubList.add(new RVTwoModel("Theory of Computation"));
            tutorialSubList.add(new RVTwoModel("Compiler Design"));
            tutorialSubList.add(new RVTwoModel("Digital Logic"));
            tutorialSubList.add(new RVTwoModel("Software Engineering"));

        } else if (num == 9){

            tutorialSubList.add(new RVTwoModel("HTML"));
            tutorialSubList.add(new RVTwoModel("CSS"));
            tutorialSubList.add(new RVTwoModel("Javascript"));
            tutorialSubList.add(new RVTwoModel("jQuery"));
            tutorialSubList.add(new RVTwoModel("PHP"));

        }

        rvTwoAdapter = new RVTwoAdapter(tutorialSubList);
        RVTwo.setAdapter(rvTwoAdapter);
    }

}