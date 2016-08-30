package com.magic.wangdongliang.simpledaggerdemo;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by wangdongliang on 16/8/30.
 */
public class ItemViewHolder extends RecyclerView.ViewHolder {
    TextView textView;

    public ItemViewHolder(View itemView) {
        super(itemView);

        textView = (TextView) itemView.findViewById(R.id.content_tv);
    }
}
