package com.nanda.sectionedrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.nanda.sectionedrecyclerview.models.DataModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<DataModel> allSampleData;
    private Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);

        allSampleData = new ArrayList<>();
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            toolbar.setTitle(R.string.app_title);
        }

        populateItems(allSampleData);

        RecyclerView my_recycler_view = (RecyclerView) findViewById(R.id.my_recycler_view);

        RecyclerViewSectionAdapter adapter = new RecyclerViewSectionAdapter(allSampleData);

        my_recycler_view.setLayoutManager(new LinearLayoutManager(this));
        my_recycler_view.setAdapter(adapter);


    }

    private void populateItems(List<DataModel> dataModelList) {
        dataModelList.clear();
        dataModelList.add(setSectionOneItem(3, "Lion"));
        dataModelList.add(setSectionOneItem(5, "Tiger"));
        dataModelList.add(setSectionOneItem(6, "Elephant"));
        dataModelList.add(setSectionOneItem(2, "Eagle"));
    }

    private DataModel setSectionOneItem(int range, String header) {
        List<String> singleItem = new ArrayList<>();
        DataModel dataModel = new DataModel();
        dataModel.setHeaderTitle(header);
        for (int j = 1; j <= range; j++) {

            singleItem.add("Item " + j);
        }
        dataModel.setAllItemsInSection(singleItem);
        return dataModel;
    }
}
