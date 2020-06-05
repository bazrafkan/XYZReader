package com.example.xyzreader.ui;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.xyzreader.R;

class BodyTextAdapter extends RecyclerView.Adapter<BodyTextAdapter.BodyTestViewHolder> {
    private String[] mData;

    public static class BodyTestViewHolder extends RecyclerView.ViewHolder {
        public TextView textView;

        public BodyTestViewHolder(TextView v) {
            super(v);
            textView = v;
        }
    }

    public BodyTextAdapter(String[] mData) {
        this.mData = mData;
    }

    @NonNull
    @Override
    public BodyTextAdapter.BodyTestViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        TextView v = (TextView) LayoutInflater.from(parent.getContext())
                .inflate(R.layout.body_text_item, parent, false);
        BodyTestViewHolder bodyTestViewHolder = new BodyTestViewHolder(v);
        return bodyTestViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BodyTextAdapter.BodyTestViewHolder holder, int position) {
        holder.textView.setText(mData[position]);
    }

    @Override
    public int getItemCount() {
        return mData.length;
    }
}
