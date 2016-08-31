package com.magic.wangdongliang.simpledaggerdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(R.id.recycler_view)
    RecyclerView mRecyclerView;

    private RecyclerViewAdapter viewAdapter;

    private ArrayList<String> dateList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        viewAdapter = new RecyclerViewAdapter(this);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false){});
        mRecyclerView.setAdapter(viewAdapter);

        fillData();
    }

    private void fillData() {
        dateList.add("速度与激情");
        dateList.add("谍影重重");
        dateList.add("谍中谍");
        dateList.add("惊天大盗");
        dateList.add("勇闯夺命岛");
        dateList.add("拯救大兵瑞恩");
        dateList.add("罪与罚");

        viewAdapter.setDataList(dateList);
        viewAdapter.notifyDataSetChanged();
    }
}
