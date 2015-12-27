package com.example.kimhuang.recycleview;


import android.content.ClipData;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Kimhuang on 27/12/2558.
 */
public class ItemAdapter extends RecyclerView.Adapter<ItemAdapter.ItemsHolder> {
    private List<Items> itemsList;
    public ItemAdapter(List<Items> list) {
        this.itemsList = list;
    }

    @Override
    public ItemsHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardview_item_row,parent,false);

        return new ItemsHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemsHolder holder, int position) {
        Items items = itemsList.get(position);

        holder.tvItem.setText(items.getItem().toString());
    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    public class ItemsHolder extends RecyclerView.ViewHolder{

        TextView tvItem;

        public ItemsHolder(View itemView) {
            super(itemView);

            tvItem = (TextView)itemView.findViewById(R.id.tvItem);
        }
    }
}
