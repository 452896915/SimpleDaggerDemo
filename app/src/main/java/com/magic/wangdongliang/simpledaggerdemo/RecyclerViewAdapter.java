package com.magic.wangdongliang.simpledaggerdemo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import javax.inject.Inject;

import thirdpartyutility.ThirdPartyUtility;

/**
 * Created by wangdongliang on 16/8/30.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<String> dataList = new ArrayList<>();

    @Inject
    ThirdPartyUtility thirdPartyUtility;

    @Inject
    Context context;

    @Inject
    public RecyclerViewAdapter() {
    }

    public void setDataList(ArrayList<String> dataList) {
        this.dataList.clear();
        this.dataList.addAll(dataList);
    }

    public ArrayList<String> getDataList() {
        return dataList;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_view, parent, false);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        final String content = dataList.get(position);
        TextView textView = ((ItemViewHolder)holder).textView;

        textView.setText(content);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                thirdPartyUtility.showToast(content);

                Intent intent = new Intent(context, SecondActivity.class);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
