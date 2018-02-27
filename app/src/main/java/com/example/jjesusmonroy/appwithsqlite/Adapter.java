package com.example.jjesusmonroy.appwithsqlite;

import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by jjesusmonroy on 27/02/18.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.RecyclerViewHolder> {
    private List<DataProvider> list;

    public Adapter(List<DataProvider> list) {
        this.list = list;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        DataProvider provider = list.get(position);

        holder.nombre.setText(provider.getNombre());
        holder.nocontrol.setText(provider.getNocontrol());
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView nombre,nocontrol;
        public RecyclerViewHolder(View itemView) {
            super(itemView);
            nombre=itemView.findViewById(R.id.nombre);
            nocontrol=itemView.findViewById(R.id.nocontrol);
        }
    }
}
