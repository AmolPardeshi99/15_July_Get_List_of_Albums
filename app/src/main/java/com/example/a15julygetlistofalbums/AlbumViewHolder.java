package com.example.a15julygetlistofalbums;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AlbumViewHolder extends RecyclerView.ViewHolder {
    TextView mTvId, mTVName;
    public AlbumViewHolder(@NonNull  View itemView) {
        super(itemView);
        mTvId = itemView.findViewById(R.id.tvId);
        mTVName = itemView.findViewById(R.id.tvName);
    }

    public void setData(ResponseModel  responseModel){
        mTvId.setText(responseModel.getUserId()+"");
        mTVName.setText(responseModel.getTitle());
    }
}
